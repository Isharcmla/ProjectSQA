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

public class Fraction_addSub_17792944761513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term757801;
     Object term757891;

    public Fraction_addSub_17792944761513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term757801 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term757801, term757801.getClass(), "numerator", 1073741824);
        setIntField(term757801, term757801.getClass(), "denominator", -2138961535);
        term757891 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term757891, term757891.getClass(), "numerator", -536870910);
        setIntField(term757891, term757891.getClass(), "denominator", -536870847);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term757891;
        args[1] = false;
        try {
            callMethod(klass, "addSub", argTypes, term757801, args);
            assertTrue(false);
        }
        catch (MathArithmeticException e) {
        }

    }

};


