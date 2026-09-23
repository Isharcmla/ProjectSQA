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

public class Fraction_add_2763527042509 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term822025;
     Object term822107;

    public Fraction_add_2763527042509() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term822025 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term822025, term822025.getClass(), "numerator", 8192);
        setIntField(term822025, term822025.getClass(), "denominator", 1376041260);
        term822107 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term822107, term822107.getClass(), "numerator", 32);
        setIntField(term822107, term822107.getClass(), "denominator", -1994100922);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term822107;
        try {
            callMethod(klass, "add", argTypes, term822025, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


