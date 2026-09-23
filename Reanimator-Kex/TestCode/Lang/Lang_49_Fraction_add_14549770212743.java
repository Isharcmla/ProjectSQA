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

public class Fraction_add_14549770212743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term817280;
     Object term817360;

    public Fraction_add_14549770212743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term817280 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term817280, term817280.getClass(), "numerator", 262144);
        setIntField(term817280, term817280.getClass(), "denominator", 1644331140);
        term817360 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term817360, term817360.getClass(), "numerator", 32);
        setIntField(term817360, term817360.getClass(), "denominator", -1783327534);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term817360;
        try {
            callMethod(klass, "add", argTypes, term817280, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


