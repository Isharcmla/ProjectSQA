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

public class Fraction_add_2763527042658 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term870101;
     Object term870183;

    public Fraction_add_2763527042658() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term870101 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term870101, term870101.getClass(), "numerator", 67108864);
        setIntField(term870101, term870101.getClass(), "denominator", 1420018156);
        term870183 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term870183, term870183.getClass(), "numerator", 524288);
        setIntField(term870183, term870183.getClass(), "denominator", -2100291290);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term870183;
        try {
            callMethod(klass, "add", argTypes, term870101, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


