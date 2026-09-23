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

public class Fraction_multiplyBy_16360464551372 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term401028;
     Object term401108;

    public Fraction_multiplyBy_16360464551372() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term401028 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term401028, term401028.getClass(), "numerator", 1809411330);
        term401108 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term401108, term401108.getClass(), "numerator", 1073743106);
        setIntField(term401108, term401108.getClass(), "denominator", 2065569837);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term401108;
        try {
            callMethod(klass, "multiplyBy", argTypes, term401028, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


