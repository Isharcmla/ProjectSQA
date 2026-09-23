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

public class Fraction_add_14549770212635 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term786299;
     Object term786379;

    public Fraction_add_14549770212635() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term786299 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term786299, term786299.getClass(), "numerator", 1073741824);
        setIntField(term786299, term786299.getClass(), "denominator", 1208024668);
        term786379 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term786379, term786379.getClass(), "numerator", 134217728);
        setIntField(term786379, term786379.getClass(), "denominator", -1275166050);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term786379;
        try {
            callMethod(klass, "add", argTypes, term786299, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


