package org.example.runner;

import org.example.Generator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Parallel {

  public static void run() throws InterruptedException {
    final var lists = new ArrayList<List<String>>();

    for(int i = 0; i < 120000000; i++) {
      lists.add(List.of(Generator.generateB()));
    }

    Collections.fill(lists, null);

    Thread.sleep(5000);

    System.gc();
  }

}
