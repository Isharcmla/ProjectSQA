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

public class Fraction_addSub_17792944761029 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term503842;
     Object term503932;

    public Fraction_addSub_17792944761029() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term503842 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term503842, term503842.getClass(), "numerator", 1073741824);
        setIntField(term503842, term503842.getClass(), "denominator", -2046475327);
        term503932 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term503932, term503932.getClass(), "numerator", -268435456);
        setIntField(term503932, term503932.getClass(), "denominator", -536870911);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term503932;
        args[1] = false;
        try {
            callMethod(klass, "addSub", argTypes, term503842, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


