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

public class Fraction_add_14549770211227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term358313;
     Object term358393;

    public Fraction_add_14549770211227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term358313 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term358313, term358313.getClass(), "numerator", 262144);
        setIntField(term358313, term358313.getClass(), "denominator", 1422839060);
        term358393 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term358393, term358393.getClass(), "numerator", 8388608);
        setIntField(term358393, term358393.getClass(), "denominator", -2096409894);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term358393;
        try {
            callMethod(klass, "add", argTypes, term358313, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


