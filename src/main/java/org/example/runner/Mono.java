package org.example.runner;

import org.example.Generator;

public class Mono {

  public static void run() throws InterruptedException {
    var load = Generator.generateGB();

    Thread.sleep(5000);

    load = null;

    System.gc();
  }

}
