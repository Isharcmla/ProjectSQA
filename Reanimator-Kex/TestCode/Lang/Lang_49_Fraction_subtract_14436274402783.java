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

public class Fraction_subtract_14436274402783 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term831192;
     Object term831272;

    public Fraction_subtract_14436274402783() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term831192 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term831192, term831192.getClass(), "numerator", 8);
        setIntField(term831192, term831192.getClass(), "denominator", -1223913240);
        term831272 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term831272, term831272.getClass(), "numerator", 33554432);
        setIntField(term831272, term831272.getClass(), "denominator", 1995619956);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term831272;
        try {
            callMethod(klass, "subtract", argTypes, term831192, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


