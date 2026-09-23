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

public class Fraction_multiplyBy_16360464552760 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term823877;
     Object term823957;

    public Fraction_multiplyBy_16360464552760() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term823877 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term823877, term823877.getClass(), "numerator", 593341550);
        setIntField(term823877, term823877.getClass(), "denominator", 1073783845);
        term823957 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term823957, term823957.getClass(), "numerator", 1451432798);
        setIntField(term823957, term823957.getClass(), "denominator", 2106940315);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term823957;
        try {
            callMethod(klass, "multiplyBy", argTypes, term823877, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


