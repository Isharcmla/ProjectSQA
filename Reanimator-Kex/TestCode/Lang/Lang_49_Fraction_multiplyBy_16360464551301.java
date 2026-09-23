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

public class Fraction_multiplyBy_16360464551301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term380344;
     Object term380424;

    public Fraction_multiplyBy_16360464551301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term380344 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term380344, term380344.getClass(), "numerator", 675559158);
        setIntField(term380344, term380344.getClass(), "denominator", 1013338729);
        term380424 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term380424, term380424.getClass(), "numerator", 675559158);
        setIntField(term380424, term380424.getClass(), "denominator", 1356705527);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term380424;
        try {
            callMethod(klass, "multiplyBy", argTypes, term380344, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


