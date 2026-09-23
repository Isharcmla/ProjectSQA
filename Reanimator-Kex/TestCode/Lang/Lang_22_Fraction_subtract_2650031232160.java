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

public class Fraction_subtract_2650031232160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term703860;
     Object term703942;

    public Fraction_subtract_2650031232160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term703860 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term703860, term703860.getClass(), "numerator", 67108864);
        setIntField(term703860, term703860.getClass(), "denominator", -1115685576);
        term703942 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term703942, term703942.getClass(), "numerator", 262144);
        setIntField(term703942, term703942.getClass(), "denominator", 591762812);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term703942;
        try {
            callMethod(klass, "subtract", argTypes, term703860, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


