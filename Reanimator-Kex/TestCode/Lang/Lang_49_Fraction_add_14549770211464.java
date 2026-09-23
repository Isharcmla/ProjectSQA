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

public class Fraction_add_14549770211464 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term428319;
     Object term428399;

    public Fraction_add_14549770211464() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term428319 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term428319, term428319.getClass(), "numerator", 1073741824);
        setIntField(term428319, term428319.getClass(), "denominator", 1384076908);
        term428399 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term428399, term428399.getClass(), "numerator", 2048);
        setIntField(term428399, term428399.getClass(), "denominator", -1364328986);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term428399;
        try {
            callMethod(klass, "add", argTypes, term428319, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


