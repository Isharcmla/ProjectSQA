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

public class Fraction_add_1454977021173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39402;
     Object term39482;

    public Fraction_add_1454977021173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39402 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term39402, term39402.getClass(), "numerator", 64);
        setIntField(term39402, term39402.getClass(), "denominator", 1522210284);
        term39482 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term39482, term39482.getClass(), "numerator", 2097152);
        setIntField(term39482, term39482.getClass(), "denominator", -2131865434);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term39482;
        try {
            callMethod(klass, "add", argTypes, term39402, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


