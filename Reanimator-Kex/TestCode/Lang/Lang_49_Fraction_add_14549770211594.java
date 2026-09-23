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

public class Fraction_add_14549770211594 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term468339;
     Object term468419;

    public Fraction_add_14549770211594() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term468339 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term468339, term468339.getClass(), "numerator", 32);
        setIntField(term468339, term468339.getClass(), "denominator", 1717259988);
        term468419 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term468419, term468419.getClass(), "numerator", 16);
        setIntField(term468419, term468419.getClass(), "denominator", -1836008006);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term468419;
        try {
            callMethod(klass, "add", argTypes, term468339, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


