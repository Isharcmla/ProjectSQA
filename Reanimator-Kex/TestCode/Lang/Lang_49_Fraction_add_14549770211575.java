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

public class Fraction_add_14549770211575 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term461437;
     Object term461517;

    public Fraction_add_14549770211575() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term461437 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term461437, term461437.getClass(), "numerator", 1048576);
        setIntField(term461437, term461437.getClass(), "denominator", 831523164);
        term461517 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term461517, term461517.getClass(), "numerator", 134217728);
        setIntField(term461517, term461517.getClass(), "denominator", -1141902562);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term461517;
        try {
            callMethod(klass, "add", argTypes, term461437, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


