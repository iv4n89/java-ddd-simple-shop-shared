package org.ddd.shared.domain.valueobject.test;

public class PasswordMother {

    public static String random() {
        return MotherCreator.random().internet().password();
    }
}
