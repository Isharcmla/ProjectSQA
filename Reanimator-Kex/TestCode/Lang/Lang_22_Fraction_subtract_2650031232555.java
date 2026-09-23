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

public class Fraction_subtract_2650031232555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term838572;
     Object term838654;

    public Fraction_subtract_2650031232555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term838572 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term838572, term838572.getClass(), "numerator", 2097152);
        setIntField(term838572, term838572.getClass(), "denominator", -1077400);
        term838654 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term838654, term838654.getClass(), "numerator", 134217728);
        setIntField(term838654, term838654.getClass(), "denominator", 854612);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term838654;
        try {
            callMethod(klass, "subtract", argTypes, term838572, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


