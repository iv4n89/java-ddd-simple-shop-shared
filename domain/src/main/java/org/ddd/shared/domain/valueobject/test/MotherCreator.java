package org.ddd.shared.domain.valueobject.test;

import com.github.javafaker.Faker;

public class MotherCreator {

  private static final Faker faker = new Faker();

  public static Faker random() {
    return faker;
  }
}
