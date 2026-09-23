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

public class Fraction_add_14549770212423 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term720081;
     Object term720161;

    public Fraction_add_14549770212423() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term720081 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term720081, term720081.getClass(), "numerator", -2147483648);
        setIntField(term720081, term720081.getClass(), "denominator", 899699740);
        term720161 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term720161, term720161.getClass(), "numerator", -2147483648);
        setIntField(term720161, term720161.getClass(), "denominator", -1347420162);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term720161;
        try {
            callMethod(klass, "add", argTypes, term720081, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


