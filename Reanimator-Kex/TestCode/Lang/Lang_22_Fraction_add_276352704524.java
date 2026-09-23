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

public class Fraction_add_276352704524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160142;
     Object term160224;

    public Fraction_add_276352704524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term160142 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term160142, term160142.getClass(), "numerator", 8192);
        setIntField(term160142, term160142.getClass(), "denominator", 1694859228);
        term160224 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term160224, term160224.getClass(), "numerator", 134217728);
        setIntField(term160224, term160224.getClass(), "denominator", -2139372834);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term160224;
        try {
            callMethod(klass, "add", argTypes, term160142, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


