package org.ddd.shared.domain.valueobject.test;

import java.util.UUID;

public class UUIDMother {

  public static String random() {
    return UUID.randomUUID().toString();
  }
}
