package org.apache.commons.lang3.math;

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
import static org.apache.commons.lang3.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_multiplyBy_457422138172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40515;
     Object term40597;

    public Fraction_multiplyBy_457422138172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40515 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term40515, term40515.getClass(), "numerator", 1774645150);
        setIntField(term40515, term40515.getClass(), "denominator", 2063597595);
        term40597 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term40597, term40597.getClass(), "numerator", 1375731746);
        setIntField(term40597, term40597.getClass(), "denominator", 1152479171);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term40597;
        try {
            callMethod(klass, "multiplyBy", argTypes, term40515, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


