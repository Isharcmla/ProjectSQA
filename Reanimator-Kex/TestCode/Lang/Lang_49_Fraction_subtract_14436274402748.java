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

public class Fraction_subtract_14436274402748 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term819623;
     Object term819703;

    public Fraction_subtract_14436274402748() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term819623 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term819623, term819623.getClass(), "numerator", 32);
        setIntField(term819623, term819623.getClass(), "denominator", -680013352);
        term819703 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term819703, term819703.getClass(), "numerator", 268435456);
        setIntField(term819703, term819703.getClass(), "denominator", 574549324);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term819703;
        try {
            callMethod(klass, "subtract", argTypes, term819623, args);
            assertTrue(false);
        }
        catch (ArithmeticException e) {
        }

    }

};


