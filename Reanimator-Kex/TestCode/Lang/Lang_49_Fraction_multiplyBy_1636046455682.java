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

public class Fraction_multiplyBy_1636046455682 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188363;
     Object term188443;

    public Fraction_multiplyBy_1636046455682() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term188363 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term188363, term188363.getClass(), "numerator", 982839634);
        term188443 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term188443, term188443.getClass(), "numerator", 546619714);
        setIntField(term188443, term188443.getClass(), "denominator", 1633816333);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term188443;
        try {
            callMethod(klass, "multiplyBy", argTypes, term188363, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


