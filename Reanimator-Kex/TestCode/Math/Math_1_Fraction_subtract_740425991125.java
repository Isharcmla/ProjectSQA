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

public class Fraction_subtract_740425991125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42091;
     Object term42181;

    public Fraction_subtract_740425991125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42091 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term42091, term42091.getClass(), "numerator", 1073741824);
        setIntField(term42091, term42091.getClass(), "denominator", 25167816);
        term42181 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term42181, term42181.getClass(), "numerator", 1073741824);
        setIntField(term42181, term42181.getClass(), "denominator", -1879262464);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term42181;
        try {
            callMethod(klass, "subtract", argTypes, term42091, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};
