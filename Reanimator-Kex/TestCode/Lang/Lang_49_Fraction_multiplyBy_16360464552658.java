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

public class Fraction_multiplyBy_16360464552658 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term792850;
     Object term792930;

    public Fraction_multiplyBy_16360464552658() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term792850 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term792850, term792850.getClass(), "numerator", 392706);
        term792930 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term792930, term792930.getClass(), "numerator", 524544);
        setIntField(term792930, term792930.getClass(), "denominator", 1711275789);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term792930;
        try {
            callMethod(klass, "multiplyBy", argTypes, term792850, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


