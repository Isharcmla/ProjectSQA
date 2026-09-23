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

public class Fraction_multiplyBy_16360464551962 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term575441;
     Object term575521;

    public Fraction_multiplyBy_16360464551962() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term575441 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term575441, term575441.getClass(), "numerator", 728766242);
        setIntField(term575441, term575441.getClass(), "denominator", 1073741824);
        term575521 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term575521, term575521.getClass(), "numerator", 1073741825);
        setIntField(term575521, term575521.getClass(), "denominator", 537089053);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term575521;
        try {
            callMethod(klass, "multiplyBy", argTypes, term575441, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


