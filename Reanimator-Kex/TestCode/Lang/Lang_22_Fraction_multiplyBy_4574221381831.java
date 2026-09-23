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

public class Fraction_multiplyBy_4574221381831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term597193;
     Object term597275;

    public Fraction_multiplyBy_4574221381831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term597193 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term597193, term597193.getClass(), "numerator", 55673042);
        term597275 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term597275, term597275.getClass(), "numerator", 32770);
        setIntField(term597275, term597275.getClass(), "denominator", 1624649749);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term597275;
        try {
            callMethod(klass, "multiplyBy", argTypes, term597193, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


