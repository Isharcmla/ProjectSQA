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

public class Fraction_add_1454977021392 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106105;
     Object term106185;

    public Fraction_add_1454977021392() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106105 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term106105, term106105.getClass(), "numerator", 32);
        setIntField(term106105, term106105.getClass(), "denominator", 728199964);
        term106185 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term106185, term106185.getClass(), "numerator", 8192);
        setIntField(term106185, term106185.getClass(), "denominator", -1071007874);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term106185;
        try {
            callMethod(klass, "add", argTypes, term106105, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


