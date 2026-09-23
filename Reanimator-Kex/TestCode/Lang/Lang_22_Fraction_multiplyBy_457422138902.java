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

public class Fraction_multiplyBy_457422138902 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term287362;
     Object term287444;

    public Fraction_multiplyBy_457422138902() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term287362 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term287362, term287362.getClass(), "numerator", 1040187650);
        term287444 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term287444, term287444.getClass(), "numerator", 528384);
        setIntField(term287444, term287444.getClass(), "denominator", 1338964365);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term287444;
        try {
            callMethod(klass, "multiplyBy", argTypes, term287362, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


