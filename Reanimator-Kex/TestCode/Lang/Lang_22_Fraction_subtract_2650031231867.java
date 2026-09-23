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

public class Fraction_subtract_2650031231867 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term609792;
     Object term609874;

    public Fraction_subtract_2650031231867() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term609792 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term609792, term609792.getClass(), "numerator", 262144);
        setIntField(term609792, term609792.getClass(), "denominator", -1880233784);
        term609874 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term609874, term609874.getClass(), "numerator", 65536);
        setIntField(term609874, term609874.getClass(), "denominator", 1208946052);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term609874;
        try {
            callMethod(klass, "subtract", argTypes, term609792, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


