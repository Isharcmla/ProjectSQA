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

public class Fraction_multiplyBy_16360464552846 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term851522;
     Object term851602;

    public Fraction_multiplyBy_16360464552846() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term851522 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term851522, term851522.getClass(), "numerator", 670939146);
        setIntField(term851522, term851522.getClass(), "denominator", 209719567);
        term851602 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term851602, term851602.getClass(), "numerator", 140628154);
        setIntField(term851602, term851602.getClass(), "denominator", 1811797953);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term851602;
        try {
            callMethod(klass, "multiplyBy", argTypes, term851522, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


