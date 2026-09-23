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

public class Fraction_multiplyBy_1636046455948 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term271902;
     Object term271982;

    public Fraction_multiplyBy_1636046455948() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term271902 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term271902, term271902.getClass(), "numerator", 418068594);
        setIntField(term271902, term271902.getClass(), "denominator", 1947582501);
        term271982 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term271982, term271982.getClass(), "numerator", -1);
        setIntField(term271982, term271982.getClass(), "denominator", 1947582501);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term271982;
        try {
            callMethod(klass, "multiplyBy", argTypes, term271902, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


