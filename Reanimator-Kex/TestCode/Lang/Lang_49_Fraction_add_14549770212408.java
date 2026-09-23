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

public class Fraction_add_14549770212408 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term714936;
     Object term715016;

    public Fraction_add_14549770212408() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term714936 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term714936, term714936.getClass(), "numerator", 8388608);
        setIntField(term714936, term714936.getClass(), "denominator", 366698100);
        term715016 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term715016, term715016.getClass(), "numerator", 32);
        setIntField(term715016, term715016.getClass(), "denominator", -502270198);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term715016;
        try {
            callMethod(klass, "add", argTypes, term714936, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


