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

public class Fraction_multiplyBy_457422138279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76525;
     Object term76607;

    public Fraction_multiplyBy_457422138279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76525 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term76525, term76525.getClass(), "numerator", 87053450);
        setIntField(term76525, term76525.getClass(), "denominator", 552374407);
        term76607 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term76607, term76607.getClass(), "numerator", 385026922);
        setIntField(term76607, term76607.getClass(), "denominator", 1895966657);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term76607;
        try {
            callMethod(klass, "multiplyBy", argTypes, term76525, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


