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

public class Fraction_add_1925368547315 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106552;
     Object term106640;

    public Fraction_add_1925368547315() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106552 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term106552, term106552.getClass(), "numerator", 1073741824);
        setIntField(term106552, term106552.getClass(), "denominator", -133643719);
        term106640 = newInstance(Class.forName("org.apache.commons.math.fraction.Fraction"));
        setIntField(term106640, term106640.getClass(), "numerator", 65536);
        setIntField(term106640, term106640.getClass(), "denominator", 969134181);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term106640;
        try {
            callMethod(klass, "add", argTypes, term106552, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


