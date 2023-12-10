package org.ddd.shared.domain.valueobject.test;

public class DoubleMother {

        public static Double random() {
            return MotherCreator.random().number().randomDouble(2, 0, 100);
        }
}
