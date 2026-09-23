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

public class Fraction_multiplyBy_16360464552639 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term787352;
     Object term787432;

    public Fraction_multiplyBy_16360464552639() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term787352 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term787352, term787352.getClass(), "numerator", 540899826);
        term787432 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term787432, term787432.getClass(), "numerator", 540899826);
        setIntField(term787432, term787432.getClass(), "denominator", 1754598661);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term787432;
        try {
            callMethod(klass, "multiplyBy", argTypes, term787352, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


