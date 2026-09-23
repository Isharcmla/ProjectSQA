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

public class Fraction_multiplyBy_457422138946 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term302500;
     Object term302582;

    public Fraction_multiplyBy_457422138946() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term302500 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term302500, term302500.getClass(), "numerator", 664289802);
        term302582 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term302582, term302582.getClass(), "numerator", 34095106);
        setIntField(term302582, term302582.getClass(), "denominator", 1812136577);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term302582;
        try {
            callMethod(klass, "multiplyBy", argTypes, term302500, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


