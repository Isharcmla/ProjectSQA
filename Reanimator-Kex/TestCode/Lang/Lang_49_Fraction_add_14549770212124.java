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

public class Fraction_add_14549770212124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term624910;
     Object term624990;

    public Fraction_add_14549770212124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term624910 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term624910, term624910.getClass(), "numerator", 33554432);
        setIntField(term624910, term624910.getClass(), "denominator", 256075916);
        term624990 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term624990, term624990.getClass(), "numerator", 2048);
        setIntField(term624990, term624990.getClass(), "denominator", -237113482);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term624990;
        try {
            callMethod(klass, "add", argTypes, term624910, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


