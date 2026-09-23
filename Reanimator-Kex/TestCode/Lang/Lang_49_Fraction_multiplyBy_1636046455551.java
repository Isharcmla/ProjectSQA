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

public class Fraction_multiplyBy_1636046455551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152045;
     Object term152125;

    public Fraction_multiplyBy_1636046455551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term152045 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term152045, term152045.getClass(), "numerator", 1891835106);
        term152125 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term152125, term152125.getClass(), "numerator", 1346377954);
        setIntField(term152125, term152125.getClass(), "denominator", 1073832013);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term152125;
        try {
            callMethod(klass, "multiplyBy", argTypes, term152045, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


