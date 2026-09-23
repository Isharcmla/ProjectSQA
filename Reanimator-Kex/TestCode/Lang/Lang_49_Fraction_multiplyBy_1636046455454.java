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

public class Fraction_multiplyBy_1636046455454 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123746;
     Object term123826;

    public Fraction_multiplyBy_1636046455454() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123746 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term123746, term123746.getClass(), "numerator", 536552354);
        term123826 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term123826, term123826.getClass(), "numerator", 536028066);
        setIntField(term123826, term123826.getClass(), "denominator", 1644220181);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term123826;
        try {
            callMethod(klass, "multiplyBy", argTypes, term123746, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


