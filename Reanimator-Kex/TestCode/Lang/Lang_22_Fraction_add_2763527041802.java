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

public class Fraction_add_2763527041802 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term586884;
     Object term586966;

    public Fraction_add_2763527041802() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term586884 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term586884, term586884.getClass(), "numerator", 268435456);
        setIntField(term586884, term586884.getClass(), "denominator", 1219246124);
        term586966 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term586966, term586966.getClass(), "numerator", 67108864);
        setIntField(term586966, term586966.getClass(), "denominator", -2063374634);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term586966;
        try {
            callMethod(klass, "add", argTypes, term586884, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


