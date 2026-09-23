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

public class Fraction_add_276352704450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134265;
     Object term134347;

    public Fraction_add_276352704450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134265 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term134265, term134265.getClass(), "numerator", 536870912);
        setIntField(term134265, term134265.getClass(), "denominator", 939709012);
        term134347 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term134347, term134347.getClass(), "numerator", 16);
        setIntField(term134347, term134347.getClass(), "denominator", -1266813318);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term134347;
        try {
            callMethod(klass, "add", argTypes, term134265, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


