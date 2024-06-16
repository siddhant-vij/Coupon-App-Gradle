package com.couponapp;

import java.io.IOException;
import java.util.Map;
import java.util.Random;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/coupon")
public class CouponServlet extends HttpServlet {
  private Map<String, Double> mapOfCoupons = Map.of(
      "SUPERSALE", 0.5,
      "WELCOME", 0.25,
      "FESTIVAL", 0.15,
      "HOLIDAY", 0.10);
  private Random random = new Random();

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String randomChoice = mapOfCoupons.keySet()
        .stream()
        .skip(random.nextInt(mapOfCoupons.size()))
        .findFirst()
        .get();
    response.getWriter().print(randomChoice);
  }

  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String couponCode = request.getParameter("coupon");
    Double discount = mapOfCoupons.get(couponCode);
    request.setAttribute("discount", String.format("Discount for coupon %s is %.0f%%", couponCode, discount * 100));
    request.getRequestDispatcher("response.jsp").forward(request, response);
  }
}
