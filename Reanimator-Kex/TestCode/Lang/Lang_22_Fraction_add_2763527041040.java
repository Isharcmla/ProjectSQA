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

public class Fraction_add_2763527041040 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term334425;
     Object term334507;

    public Fraction_add_2763527041040() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term334425 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term334425, term334425.getClass(), "numerator", -2147483648);
        setIntField(term334425, term334425.getClass(), "denominator", 11799692);
        term334507 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term334507, term334507.getClass(), "numerator", -2147483648);
        setIntField(term334507, term334507.getClass(), "denominator", -17467018);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term334507;
        try {
            callMethod(klass, "add", argTypes, term334425, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


