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

public class Fraction_add_2763527041807 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term589084;
     Object term589166;

    public Fraction_add_2763527041807() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term589084 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term589084, term589084.getClass(), "numerator", 4194304);
        setIntField(term589084, term589084.getClass(), "denominator", 1459755972);
        term589166 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term589166, term589166.getClass(), "numerator", 32768);
        setIntField(term589166, term589166.getClass(), "denominator", -2134990862);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term589166;
        try {
            callMethod(klass, "add", argTypes, term589084, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


