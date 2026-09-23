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

public class Fraction_multiplyBy_16360464552832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term846359;
     Object term846439;

    public Fraction_multiplyBy_16360464552832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term846359 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term846359, term846359.getClass(), "numerator", 537704638);
        setIntField(term846359, term846359.getClass(), "denominator", 1378542629);
        term846439 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term846439, term846439.getClass(), "numerator", 397903334);
        setIntField(term846439, term846439.getClass(), "denominator", 1304779323);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term846439;
        try {
            callMethod(klass, "multiplyBy", argTypes, term846359, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


