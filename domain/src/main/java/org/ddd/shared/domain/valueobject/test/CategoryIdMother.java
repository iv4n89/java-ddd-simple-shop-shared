package org.ddd.shared.domain.valueobject.test;

import org.ddd.shared.domain.valueobject.CategoryId;

import java.util.UUID;

public class CategoryIdMother {

  public static CategoryId create(UUID value) {
    return new CategoryId(value);
  }

  public static CategoryId random() {
    return create(UUID.fromString(UUIDMother.random()));
  }
}
