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

public class Fraction_subtract_14436274401110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term320854;
     Object term320934;

    public Fraction_subtract_14436274401110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term320854 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term320854, term320854.getClass(), "numerator", 1073741824);
        setIntField(term320854, term320854.getClass(), "denominator", -464949544);
        term320934 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term320934, term320934.getClass(), "numerator", 1073741824);
        setIntField(term320934, term320934.getClass(), "denominator", 695802316);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term320934;
        try {
            callMethod(klass, "subtract", argTypes, term320854, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


