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

public class Fraction_add_14549770212059 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term604801;
     Object term604881;

    public Fraction_add_14549770212059() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term604801 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term604801, term604801.getClass(), "numerator", 268435456);
        setIntField(term604801, term604801.getClass(), "denominator", 5300348);
        term604881 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term604881, term604881.getClass(), "numerator", -2147483648);
        setIntField(term604881, term604881.getClass(), "denominator", -7902802);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term604881;
        try {
            callMethod(klass, "add", argTypes, term604801, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


