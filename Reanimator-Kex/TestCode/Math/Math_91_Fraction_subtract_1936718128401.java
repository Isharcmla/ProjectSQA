package org.apache.commons.math.fraction;

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
import static org.apache.commons.math.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_subtract_1936718128401 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term140490;
     Object term140578;

    public Fraction_subtract_1936718128401() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term140490 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term140490, term140490.getClass(), "numerator", 2097152);
        setIntField(term140490, term140490.getClass(), "denominator", -2147483647);
        term140578 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term140578, term140578.getClass(), "numerator", 2097152);
        setIntField(term140578, term140578.getClass(), "denominator", -2147483646);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term140578;
        try {
            callMethod(klass, "subtract", argTypes, term140490, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


