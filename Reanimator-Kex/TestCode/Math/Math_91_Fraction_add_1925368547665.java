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

public class Fraction_add_1925368547665 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term250831;
     Object term250919;

    public Fraction_add_1925368547665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term250831 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term250831, term250831.getClass(), "numerator", -2147483648);
        setIntField(term250831, term250831.getClass(), "denominator", -561990641);
        term250919 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term250919, term250919.getClass(), "numerator", 256);
        setIntField(term250919, term250919.getClass(), "denominator", 2120499395);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term250919;
        try {
            callMethod(klass, "add", argTypes, term250831, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


