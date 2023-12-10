package org.ddd.shared.domain.valueobject.test;

public class EmailMother {

    public static String random() {
        return MotherCreator.random().internet().emailAddress();
    }
}
