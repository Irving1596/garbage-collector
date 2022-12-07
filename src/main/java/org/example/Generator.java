package org.example;

public class Generator {

  public static String generateB() {
    return "-";
  }

  public static String generateKB() {
    return "-".repeat(1000);
  }

  public static String generateMB() {
    return "-".repeat(1000000);
  }

  public static String generateGB() {
    return "-".repeat(1000000000);
  }

}
