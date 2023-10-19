package by.toukach.api;

import by.toukach.core.Utils;

public class App {

  public static void main(String[] args) {
    try {
      System.out.println(Utils.isAllPositiveNumbers("12", "79"));
    } catch (RuntimeException e) {
      System.err.println(e.getMessage());
    }
  }
}
