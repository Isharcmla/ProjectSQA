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

public class Fraction_multiplyBy_16360464552029 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term595785;
     Object term595865;

    public Fraction_multiplyBy_16360464552029() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term595785 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term595785, term595785.getClass(), "numerator", 247692914);
        term595865 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term595865, term595865.getClass(), "numerator", 247692914);
        setIntField(term595865, term595865.getClass(), "denominator", 600146101);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term595865;
        try {
            callMethod(klass, "multiplyBy", argTypes, term595785, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


