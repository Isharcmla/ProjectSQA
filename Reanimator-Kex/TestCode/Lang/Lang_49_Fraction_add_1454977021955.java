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

public class Fraction_add_1454977021955 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term274465;
     Object term274545;

    public Fraction_add_1454977021955() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term274465 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term274465, term274465.getClass(), "numerator", 16);
        setIntField(term274465, term274465.getClass(), "denominator", 709794132);
        term274545 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term274545, term274545.getClass(), "numerator", 2048);
        setIntField(term274545, term274545.getClass(), "denominator", -969205126);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term274545;
        try {
            callMethod(klass, "add", argTypes, term274465, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


