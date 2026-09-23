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

public class Fraction_multiplyBy_1636046455916 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term261017;
     Object term261097;

    public Fraction_multiplyBy_1636046455916() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term261017 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term261017, term261017.getClass(), "numerator", 1571287058);
        term261097 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term261097, term261097.getClass(), "numerator", 1571287058);
        setIntField(term261097, term261097.getClass(), "denominator", 1277467605);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term261097;
        try {
            callMethod(klass, "multiplyBy", argTypes, term261017, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


