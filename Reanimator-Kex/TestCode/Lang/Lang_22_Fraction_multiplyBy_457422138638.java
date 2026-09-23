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

public class Fraction_multiplyBy_457422138638 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term199347;
     Object term199429;

    public Fraction_multiplyBy_457422138638() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term199347 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term199347, term199347.getClass(), "numerator", 52306874);
        term199429 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term199429, term199429.getClass(), "numerator", 16916666);
        setIntField(term199429, term199429.getClass(), "denominator", 403706665);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term199429;
        try {
            callMethod(klass, "multiplyBy", argTypes, term199347, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


