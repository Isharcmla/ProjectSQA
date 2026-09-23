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

public class Fraction_subtract_1443627440236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58634;
     Object term58714;

    public Fraction_subtract_1443627440236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58634 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term58634, term58634.getClass(), "numerator", 524288);
        setIntField(term58634, term58634.getClass(), "denominator", -1074266568);
        term58714 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term58714, term58714.getClass(), "numerator", 64);
        setIntField(term58714, term58714.getClass(), "denominator", 994975996);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term58714;
        try {
            callMethod(klass, "subtract", argTypes, term58634, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


