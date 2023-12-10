package org.ddd.shared.domain.valueobject.test;

public class IntegerMother {

    public static Integer random() {
        return MotherCreator.random().number().randomDigit();
    }
}
