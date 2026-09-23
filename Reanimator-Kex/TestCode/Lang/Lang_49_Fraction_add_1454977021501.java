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

public class Fraction_add_1454977021501 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137628;
     Object term137708;

    public Fraction_add_1454977021501() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137628 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term137628, term137628.getClass(), "numerator", 16);
        setIntField(term137628, term137628.getClass(), "denominator", 1572097748);
        term137708 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term137708, term137708.getClass(), "numerator", 64);
        setIntField(term137708, term137708.getClass(), "denominator", -2025125062);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term137708;
        try {
            callMethod(klass, "add", argTypes, term137628, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


