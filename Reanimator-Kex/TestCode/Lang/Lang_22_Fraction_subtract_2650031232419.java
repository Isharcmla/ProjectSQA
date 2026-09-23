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

public class Fraction_subtract_2650031232419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term790516;
     Object term790598;

    public Fraction_subtract_2650031232419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term790516 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term790516, term790516.getClass(), "numerator", 1048576);
        setIntField(term790516, term790516.getClass(), "denominator", -2223720);
        term790598 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term790598, term790598.getClass(), "numerator", 16777216);
        setIntField(term790598, term790598.getClass(), "denominator", 1740332);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term790598;
        try {
            callMethod(klass, "subtract", argTypes, term790516, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


