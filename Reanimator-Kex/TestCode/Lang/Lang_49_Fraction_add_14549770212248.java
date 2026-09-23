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

public class Fraction_add_14549770212248 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term665193;
     Object term665273;

    public Fraction_add_14549770212248() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term665193 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term665193, term665193.getClass(), "numerator", 1073741824);
        setIntField(term665193, term665193.getClass(), "denominator", 1200200036);
        term665273 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term665273, term665273.getClass(), "numerator", 1048576);
        setIntField(term665273, term665273.getClass(), "denominator", -1768220734);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term665273;
        try {
            callMethod(klass, "add", argTypes, term665193, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


