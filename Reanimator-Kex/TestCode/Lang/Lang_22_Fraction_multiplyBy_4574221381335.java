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

public class Fraction_multiplyBy_4574221381335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term434557;
     Object term434639;

    public Fraction_multiplyBy_4574221381335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term434557 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term434557, term434557.getClass(), "numerator", 718013978);
        setIntField(term434557, term434557.getClass(), "denominator", 16);
        term434639 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term434639, term434639.getClass(), "numerator", 2);
        setIntField(term434639, term434639.getClass(), "denominator", 1778975105);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term434639;
        try {
            callMethod(klass, "multiplyBy", argTypes, term434557, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


