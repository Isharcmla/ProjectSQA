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

public class Fraction_multiplyBy_16360464551577 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term462526;
     Object term462606;

    public Fraction_multiplyBy_16360464551577() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term462526 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term462526, term462526.getClass(), "numerator", 279267346);
        setIntField(term462526, term462526.getClass(), "denominator", 1073741824);
        term462606 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term462606, term462606.getClass(), "numerator", 3);
        setIntField(term462606, term462606.getClass(), "denominator", 1915044357);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term462606;
        try {
            callMethod(klass, "multiplyBy", argTypes, term462526, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


