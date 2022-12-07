package org.example;

import org.example.runner.Mono;
import org.example.runner.Parallel;

public class Main {

  public static void main(String[] args) throws InterruptedException {

    if(args[0].equals("mono")) {
      System.out.println("Ejecutando modo mono");
      Mono.run();
    } else {
      System.out.println("Ejecutando modo parallel");
      Parallel.run();
    }

    Thread.sleep(10000);
  }

}