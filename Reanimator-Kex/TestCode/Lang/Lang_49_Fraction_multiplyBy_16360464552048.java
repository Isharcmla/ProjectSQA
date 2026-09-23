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

public class Fraction_multiplyBy_16360464552048 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term601042;
     Object term601122;

    public Fraction_multiplyBy_16360464552048() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term601042 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term601042, term601042.getClass(), "numerator", 1313889790);
        setIntField(term601042, term601042.getClass(), "denominator", 671100891);
        term601122 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term601122, term601122.getClass(), "numerator", 1);
        setIntField(term601122, term601122.getClass(), "denominator", 671100891);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term601122;
        try {
            callMethod(klass, "multiplyBy", argTypes, term601042, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


