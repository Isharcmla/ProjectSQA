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

public class Fraction_add_14549770212469 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term734458;
     Object term734538;

    public Fraction_add_14549770212469() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term734458 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term734458, term734458.getClass(), "numerator", 1073741824);
        setIntField(term734458, term734458.getClass(), "denominator", 881590772);
        term734538 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term734538, term734538.getClass(), "numerator", 1073741824);
        setIntField(term734538, term734538.getClass(), "denominator", -1309672118);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term734538;
        try {
            callMethod(klass, "add", argTypes, term734458, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


