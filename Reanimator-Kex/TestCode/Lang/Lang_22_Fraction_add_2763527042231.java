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

public class Fraction_add_2763527042231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term726329;
     Object term726411;

    public Fraction_add_2763527042231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term726329 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term726329, term726329.getClass(), "numerator", 2097152);
        setIntField(term726329, term726329.getClass(), "denominator", 1247146012);
        term726411 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term726411, term726411.getClass(), "numerator", 16777216);
        setIntField(term726411, term726411.getClass(), "denominator", -1798242306);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term726411;
        try {
            callMethod(klass, "add", argTypes, term726329, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


