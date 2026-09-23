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

public class Fraction_multiplyBy_457422138981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term314520;
     Object term314602;

    public Fraction_multiplyBy_457422138981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term314520 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term314520, term314520.getClass(), "numerator", 786970602);
        setIntField(term314520, term314520.getClass(), "denominator", 1995676801);
        term314602 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term314602, term314602.getClass(), "numerator", -2147483648);
        setIntField(term314602, term314602.getClass(), "denominator", 1995676801);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term314602;
        try {
            callMethod(klass, "multiplyBy", argTypes, term314520, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


