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

public class Fraction_add_7517755722348 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1169186;
     Object term1169276;

    public Fraction_add_7517755722348() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1169186 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term1169186, term1169186.getClass(), "numerator", 1073741824);
        setIntField(term1169186, term1169186.getClass(), "denominator", -880836606);
        term1169276 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term1169276, term1169276.getClass(), "numerator", 16777216);
        setIntField(term1169276, term1169276.getClass(), "denominator", -1581240595);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term1169276;
        try {
            callMethod(klass, "add", argTypes, term1169186, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


