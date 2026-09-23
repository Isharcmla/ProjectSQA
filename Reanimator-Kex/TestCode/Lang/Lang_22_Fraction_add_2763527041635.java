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

public class Fraction_add_2763527041635 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term532384;
     Object term532466;

    public Fraction_add_2763527041635() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term532384 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term532384, term532384.getClass(), "numerator", 268435456);
        setIntField(term532384, term532384.getClass(), "denominator", 973060572);
        term532466 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term532466, term532466.getClass(), "numerator", 1073741824);
        setIntField(term532466, term532466.getClass(), "denominator", -1660868946);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term532466;
        try {
            callMethod(klass, "add", argTypes, term532384, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


