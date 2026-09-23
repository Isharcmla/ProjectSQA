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

public class Fraction_add_276352704177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42116;
     Object term42198;

    public Fraction_add_276352704177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42116 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term42116, term42116.getClass(), "numerator", 4096);
        setIntField(term42116, term42116.getClass(), "denominator", 280093772);
        term42198 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term42198, term42198.getClass(), "numerator", 1048576);
        setIntField(term42198, term42198.getClass(), "denominator", -352486698);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term42198;
        try {
            callMethod(klass, "add", argTypes, term42116, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


