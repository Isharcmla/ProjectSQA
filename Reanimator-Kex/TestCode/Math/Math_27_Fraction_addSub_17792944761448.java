package org.apache.commons.math3.fraction;

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
import org.apache.commons.math3.exception.MathArithmeticException;
import static org.apache.commons.math3.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Fraction_addSub_17792944761448 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term604271;
     Object term604361;

    public Fraction_addSub_17792944761448() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term604271 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term604271, term604271.getClass(), "numerator", 67108864);
        setIntField(term604271, term604271.getClass(), "denominator", -2143452671);
        term604361 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term604361, term604361.getClass(), "numerator", 67108864);
        setIntField(term604361, term604361.getClass(), "denominator", -85717567);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term604361;
        args[1] = false;
        try {
            callMethod(klass, "addSub", argTypes, term604271, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


