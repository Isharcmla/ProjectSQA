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

public class Fraction_multiplyBy_4574221381891 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term617968;
     Object term618050;

    public Fraction_multiplyBy_4574221381891() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term617968 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term617968, term617968.getClass(), "numerator", 41669518);
        term618050 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term618050, term618050.getClass(), "numerator", 525857282);
        setIntField(term618050, term618050.getClass(), "denominator", 2093023683);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term618050;
        try {
            callMethod(klass, "multiplyBy", argTypes, term617968, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


