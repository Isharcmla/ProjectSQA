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

public class Fraction_add_2763527042336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term762817;
     Object term762899;

    public Fraction_add_2763527042336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term762817 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term762817, term762817.getClass(), "numerator", 262144);
        setIntField(term762817, term762817.getClass(), "denominator", 236316);
        term762899 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term762899, term762899.getClass(), "numerator", 8388608);
        setIntField(term762899, term762899.getClass(), "denominator", -262146);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term762899;
        try {
            callMethod(klass, "add", argTypes, term762817, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


