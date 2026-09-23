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

public class Fraction_multiplyBy_16360464552668 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term796037;
     Object term796117;

    public Fraction_multiplyBy_16360464552668() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term796037 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term796037, term796037.getClass(), "numerator", 1639016610);
        term796117 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term796117, term796117.getClass(), "numerator", 554696706);
        setIntField(term796117, term796117.getClass(), "denominator", 957169685);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term796117;
        try {
            callMethod(klass, "multiplyBy", argTypes, term796037, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


