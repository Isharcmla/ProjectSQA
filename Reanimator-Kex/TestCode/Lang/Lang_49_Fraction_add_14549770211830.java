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

public class Fraction_add_14549770211830 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term536057;
     Object term536137;

    public Fraction_add_14549770211830() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term536057 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term536057, term536057.getClass(), "numerator", 16384);
        setIntField(term536057, term536057.getClass(), "denominator", 1112559748);
        term536137 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term536137, term536137.getClass(), "numerator", 33554432);
        setIntField(term536137, term536137.getClass(), "denominator", -961229486);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term536137;
        try {
            callMethod(klass, "add", argTypes, term536057, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


