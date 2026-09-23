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

public class Fraction_multiplyBy_457422138366 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104629;
     Object term104711;

    public Fraction_multiplyBy_457422138366() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104629 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term104629, term104629.getClass(), "numerator", 1011883490);
        setIntField(term104629, term104629.getClass(), "denominator", 16);
        term104711 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term104711, term104711.getClass(), "numerator", 268435458);
        setIntField(term104711, term104711.getClass(), "denominator", 1848119165);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term104711;
        try {
            callMethod(klass, "multiplyBy", argTypes, term104629, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


