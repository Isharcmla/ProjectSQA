package org.apache.commons.math.fraction;

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
import static org.apache.commons.math.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_subtract_1936718128640 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term242211;
     Object term242299;

    public Fraction_subtract_1936718128640() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term242211 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term242211, term242211.getClass(), "numerator", -2147483648);
        setIntField(term242211, term242211.getClass(), "denominator", -2147483647);
        term242299 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term242299, term242299.getClass(), "numerator", -2147483648);
        setIntField(term242299, term242299.getClass(), "denominator", -1295650926);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term242299;
        try {
            callMethod(klass, "subtract", argTypes, term242211, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


