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

public class Fraction_multiplyBy_16360464552696 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term804211;
     Object term804291;

    public Fraction_multiplyBy_16360464552696() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term804211 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term804211, term804211.getClass(), "numerator", 198585282);
        setIntField(term804211, term804211.getClass(), "denominator", 1073741824);
        term804291 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term804291, term804291.getClass(), "numerator", 8388608);
        setIntField(term804291, term804291.getClass(), "denominator", 996250005);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term804291;
        try {
            callMethod(klass, "multiplyBy", argTypes, term804211, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


