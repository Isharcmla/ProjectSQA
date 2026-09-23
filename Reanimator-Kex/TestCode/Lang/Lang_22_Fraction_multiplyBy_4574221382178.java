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

public class Fraction_multiplyBy_4574221382178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term709328;
     Object term709410;

    public Fraction_multiplyBy_4574221382178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term709328 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term709328, term709328.getClass(), "numerator", 2);
        term709410 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term709410, term709410.getClass(), "numerator", 2);
        setIntField(term709410, term709410.getClass(), "denominator", 461);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term709410;
        try {
            callMethod(klass, "multiplyBy", argTypes, term709328, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


