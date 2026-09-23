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

public class Fraction_multiplyBy_16360464551202 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term350188;
     Object term350268;

    public Fraction_multiplyBy_16360464551202() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term350188 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term350188, term350188.getClass(), "numerator", 525365122);
        term350268 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term350268, term350268.getClass(), "numerator", 469766018);
        setIntField(term350268, term350268.getClass(), "denominator", 545652765);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term350268;
        try {
            callMethod(klass, "multiplyBy", argTypes, term350188, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


