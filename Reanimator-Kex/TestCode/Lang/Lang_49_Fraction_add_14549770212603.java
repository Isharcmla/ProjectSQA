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

public class Fraction_add_14549770212603 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term776582;
     Object term776662;

    public Fraction_add_14549770212603() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term776582 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term776582, term776582.getClass(), "numerator", 128);
        setIntField(term776582, term776582.getClass(), "denominator", 998455628);
        term776662 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term776662, term776662.getClass(), "numerator", 1024);
        setIntField(term776662, term776662.getClass(), "denominator", -1397696810);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term776662;
        try {
            callMethod(klass, "add", argTypes, term776582, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


