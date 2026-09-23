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

public class Fraction_add_14549770211827 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term534940;
     Object term535020;

    public Fraction_add_14549770211827() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term534940 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term534940, term534940.getClass(), "numerator", 16777216);
        setIntField(term534940, term534940.getClass(), "denominator", 1084740380);
        term535020 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term535020, term535020.getClass(), "numerator", 4096);
        setIntField(term535020, term535020.getClass(), "denominator", -959820034);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term535020;
        try {
            callMethod(klass, "add", argTypes, term534940, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


