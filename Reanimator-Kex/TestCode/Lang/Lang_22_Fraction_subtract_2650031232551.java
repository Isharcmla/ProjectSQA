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

public class Fraction_subtract_2650031232551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term836980;
     Object term837062;

    public Fraction_subtract_2650031232551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term836980 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term836980, term836980.getClass(), "numerator", 16384);
        setIntField(term836980, term836980.getClass(), "denominator", -2120810168);
        term837062 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term837062, term837062.getClass(), "numerator", 64);
        setIntField(term837062, term837062.getClass(), "denominator", 1066762180);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term837062;
        try {
            callMethod(klass, "subtract", argTypes, term836980, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


