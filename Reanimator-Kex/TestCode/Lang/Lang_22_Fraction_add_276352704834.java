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

public class Fraction_add_276352704834 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term264232;
     Object term264314;

    public Fraction_add_276352704834() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term264232 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term264232, term264232.getClass(), "numerator", 8192);
        setIntField(term264232, term264232.getClass(), "denominator", 1087078228);
        term264314 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term264314, term264314.getClass(), "numerator", 67108864);
        setIntField(term264314, term264314.getClass(), "denominator", -1639173910);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term264314;
        try {
            callMethod(klass, "add", argTypes, term264232, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


