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

public class Fraction_multiplyBy_16360464552079 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term612909;
     Object term612989;

    public Fraction_multiplyBy_16360464552079() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term612909 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term612909, term612909.getClass(), "numerator", 478219562);
        setIntField(term612909, term612909.getClass(), "denominator", 1660943047);
        term612989 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term612989, term612989.getClass(), "numerator", 1107295370);
        setIntField(term612989, term612989.getClass(), "denominator", 2097288457);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term612989;
        try {
            callMethod(klass, "multiplyBy", argTypes, term612909, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


