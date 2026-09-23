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

public class Fraction_add_14549770212683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term800659;
     Object term800739;

    public Fraction_add_14549770212683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term800659 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term800659, term800659.getClass(), "numerator", 64);
        setIntField(term800659, term800659.getClass(), "denominator", 1208797844);
        term800739 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term800739, term800739.getClass(), "numerator", 32);
        setIntField(term800739, term800739.getClass(), "denominator", -1275965286);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term800739;
        try {
            callMethod(klass, "add", argTypes, term800659, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


