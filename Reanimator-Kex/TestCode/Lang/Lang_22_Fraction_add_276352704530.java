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

public class Fraction_add_276352704530 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term162182;
     Object term162264;

    public Fraction_add_276352704530() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term162182 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term162182, term162182.getClass(), "numerator", 1073741824);
        setIntField(term162182, term162182.getClass(), "denominator", 1540365388);
        term162264 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term162264, term162264.getClass(), "numerator", 1073741824);
        setIntField(term162264, term162264.getClass(), "denominator", -1881645610);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term162264;
        try {
            callMethod(klass, "add", argTypes, term162182, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


