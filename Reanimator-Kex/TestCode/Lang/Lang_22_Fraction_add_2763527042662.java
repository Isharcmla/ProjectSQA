package org.apache.commons.lang3.math;

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
import static org.apache.commons.lang3.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_add_2763527042662 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term872071;
     Object term872153;

    public Fraction_add_2763527042662() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term872071 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term872071, term872071.getClass(), "numerator", 131072);
        setIntField(term872071, term872071.getClass(), "denominator", 39829772);
        term872153 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term872153, term872153.getClass(), "numerator", 256);
        setIntField(term872153, term872153.getClass(), "denominator", -70778554);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term872153;
        try {
            callMethod(klass, "add", argTypes, term872071, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


