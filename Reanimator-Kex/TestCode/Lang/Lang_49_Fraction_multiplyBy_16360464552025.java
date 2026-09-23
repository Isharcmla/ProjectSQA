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

public class Fraction_multiplyBy_16360464552025 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term594572;
     Object term594652;

    public Fraction_multiplyBy_16360464552025() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term594572 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term594572, term594572.getClass(), "numerator", 1073754154);
        setIntField(term594572, term594572.getClass(), "denominator", -2147483640);
        term594652 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term594652, term594652.getClass(), "numerator", 268435464);
        setIntField(term594652, term594652.getClass(), "denominator", 1073747993);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term594652;
        try {
            callMethod(klass, "multiplyBy", argTypes, term594572, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


