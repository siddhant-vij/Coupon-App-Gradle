package com.couponapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
  // returns the sum of two positive integers
  @Test void test_sum_of_two_positive_integers() {
    int result = App.sum(3, 4);
    assertEquals(7, result);
  }

  // handles the sum of Integer.MAX_VALUE and a positive integer
  @Test void test_sum_of_max_value_and_positive_integer() {
    int result = App.sum(Integer.MAX_VALUE, 1);
    assertEquals(Integer.MIN_VALUE, result);
  }

  // returns the sum of two negative integers
  @Test void test_sum_of_two_negative_integers() {
    int result = App.sum(-3, -5);
    assertEquals(-8, result);
  }

  // returns the sum of a positive and a negative integer
  @Test void test_sum_of_positive_and_negative_integers() {
    int result = App.sum(3, -5);
    assertEquals(-2, result);
  }

  // returns the sum of zero and any integer
  @Test void test_sum_of_zero_and_any_integer() {
    int result = App.sum(0, 5);
    assertEquals(5, result);
  }

  // returns the sum of two zero values
  @Test void test_sum_of_two_zero_values() {
    int result = App.sum(0, 0);
    assertEquals(0, result);
  }

  // handles the sum of Integer.MAX_VALUE and Integer.MIN_VALUE
  @Test void test_sum_of_max_and_min_values() {
    int result = App.sum(Integer.MAX_VALUE, Integer.MIN_VALUE);
    assertEquals(-1, result);
  }

  // handles the sum of two very large negative integers
  @Test void test_sum_of_two_very_large_negative_integers() {
    int result = App.sum(Integer.MIN_VALUE, Integer.MIN_VALUE);
    assertEquals(0, result);
  }

  // handles the sum of a positive integer and zero
  @Test void test_sum_of_positive_integer_and_zero() {
    int result = App.sum(5, 0);
    assertEquals(5, result);
  }

  // handles the sum of a negative integer and zero
  @Test void test_sum_of_negative_integer_and_zero() {
    int result = App.sum(-3, 0);
    assertEquals(-3, result);
  }

  // handles the sum of Integer.MIN_VALUE and zero
  @Test void test_sum_of_integer_min_value_and_zero() {
    int result = App.sum(Integer.MIN_VALUE, 0);
    assertEquals(Integer.MIN_VALUE, result);
  }

  // handles the sum of Integer.MAX_VALUE and zero
  @Test void test_sum_of_integer_max_value_and_zero() {
    int result = App.sum(Integer.MAX_VALUE, 0);
    assertEquals(Integer.MAX_VALUE, result);
  }

  // handles the sum of the same integer twice
  @Test void test_sum_of_same_integer_twice() {
    int result = App.sum(2, 2);
    assertEquals(4, result);
  }
}
