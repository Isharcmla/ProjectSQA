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

public class Fraction_add_276352704565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173557;
     Object term173639;

    public Fraction_add_276352704565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173557 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term173557, term173557.getClass(), "numerator", 64);
        setIntField(term173557, term173557.getClass(), "denominator", 1733138844);
        term173639 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term173639, term173639.getClass(), "numerator", 4194304);
        setIntField(term173639, term173639.getClass(), "denominator", -1474881090);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term173639;
        try {
            callMethod(klass, "add", argTypes, term173557, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


