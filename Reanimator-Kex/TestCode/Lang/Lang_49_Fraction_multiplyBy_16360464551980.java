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

public class Fraction_multiplyBy_16360464551980 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term581803;
     Object term581883;

    public Fraction_multiplyBy_16360464551980() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term581803 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term581803, term581803.getClass(), "numerator", 1610087930);
        term581883 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term581883, term581883.getClass(), "numerator", 536870913);
        setIntField(term581883, term581883.getClass(), "denominator", 2145385969);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term581883;
        try {
            callMethod(klass, "multiplyBy", argTypes, term581803, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


