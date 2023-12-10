package org.ddd.shared.domain.valueobject.test;

import java.util.Date;

public class DateMother {

  public static Date random() {
    return MotherCreator.random().date().birthday();
  }
}
