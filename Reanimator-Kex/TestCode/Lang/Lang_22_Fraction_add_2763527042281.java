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

public class Fraction_add_2763527042281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term744912;
     Object term744994;

    public Fraction_add_2763527042281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term744912 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term744912, term744912.getClass(), "numerator", 4194304);
        setIntField(term744912, term744912.getClass(), "denominator", 1171689620);
        term744994 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term744994, term744994.getClass(), "numerator", -2147483648);
        setIntField(term744994, term744994.getClass(), "denominator", -1552009318);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term744994;
        try {
            callMethod(klass, "add", argTypes, term744912, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


