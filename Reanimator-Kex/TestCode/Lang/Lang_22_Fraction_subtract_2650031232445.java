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

public class Fraction_subtract_2650031232445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term799585;
     Object term799667;

    public Fraction_subtract_2650031232445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term799585 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term799585, term799585.getClass(), "numerator", 1073741824);
        setIntField(term799585, term799585.getClass(), "denominator", -402653192);
        term799667 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term799667, term799667.getClass(), "numerator", 1073741824);
        setIntField(term799667, term799667.getClass(), "denominator", 335544284);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term799667;
        try {
            callMethod(klass, "subtract", argTypes, term799585, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


