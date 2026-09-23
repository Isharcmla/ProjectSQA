package org.apache.commons.lang.math;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.lang.ArithmeticException;
import static org.apache.commons.lang.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_multiplyBy_16360464552431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term722920;
     Object term723000;

    public Fraction_multiplyBy_16360464552431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term722920 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term722920, term722920.getClass(), "numerator", 277896726);
        setIntField(term722920, term722920.getClass(), "denominator", 522466843);
        term723000 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term723000, term723000.getClass(), "numerator", 187699098);
        setIntField(term723000, term723000.getClass(), "denominator", 1217765863);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term723000;
        try {
            callMethod(klass, "multiplyBy", argTypes, term722920, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


