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

public class Fraction_multiplyBy_4574221382089 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term680301;
     Object term680383;

    public Fraction_multiplyBy_4574221382089() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term680301 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term680301, term680301.getClass(), "numerator", 415347554);
        term680383 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term680383, term680383.getClass(), "numerator", 12866);
        setIntField(term680383, term680383.getClass(), "denominator", 1403454725);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term680383;
        try {
            callMethod(klass, "multiplyBy", argTypes, term680301, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


