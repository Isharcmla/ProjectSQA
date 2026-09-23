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

public class Fraction_multiplyBy_1636046455540 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148847;
     Object term148927;

    public Fraction_multiplyBy_1636046455540() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148847 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term148847, term148847.getClass(), "numerator", 1378719994);
        term148927 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term148927, term148927.getClass(), "numerator", 1378719994);
        setIntField(term148927, term148927.getClass(), "denominator", 1583948929);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term148927;
        try {
            callMethod(klass, "multiplyBy", argTypes, term148847, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


