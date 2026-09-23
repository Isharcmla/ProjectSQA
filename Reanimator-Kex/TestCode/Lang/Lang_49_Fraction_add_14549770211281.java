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

public class Fraction_add_14549770211281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term374730;
     Object term374810;

    public Fraction_add_14549770211281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term374730 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term374730, term374730.getClass(), "numerator", 67108864);
        setIntField(term374730, term374730.getClass(), "denominator", 1198528396);
        term374810 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term374810, term374810.getClass(), "numerator", 1);
        setIntField(term374810, term374810.getClass(), "denominator", -1493996554);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term374810;
        try {
            callMethod(klass, "add", argTypes, term374730, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


