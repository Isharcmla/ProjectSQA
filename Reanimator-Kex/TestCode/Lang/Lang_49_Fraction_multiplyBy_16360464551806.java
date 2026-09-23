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

public class Fraction_multiplyBy_16360464551806 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term528303;
     Object term528383;

    public Fraction_multiplyBy_16360464551806() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term528303 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term528303, term528303.getClass(), "numerator", 726723082);
        setIntField(term528303, term528303.getClass(), "denominator", 2028150239);
        term528383 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term528383, term528383.getClass(), "numerator", 1118769618);
        setIntField(term528383, term528383.getClass(), "denominator", 1778960305);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term528383;
        try {
            callMethod(klass, "multiplyBy", argTypes, term528303, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


