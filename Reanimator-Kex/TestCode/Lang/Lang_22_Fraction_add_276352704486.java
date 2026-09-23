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

public class Fraction_add_276352704486 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147791;
     Object term147873;

    public Fraction_add_276352704486() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147791 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term147791, term147791.getClass(), "numerator", 1073741824);
        setIntField(term147791, term147791.getClass(), "denominator", 1136500676);
        term147873 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term147873, term147873.getClass(), "numerator", 1073741824);
        setIntField(term147873, term147873.getClass(), "denominator", -1678256014);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term147873;
        try {
            callMethod(klass, "add", argTypes, term147791, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


