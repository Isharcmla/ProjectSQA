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
import static org.apache.commons.math3.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.fraction.EqualityUtils.*;

public class Fraction_subtract_740425991815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term334597;
     Object term336522;
     Object term336523;
     Object term336519;

    public Fraction_subtract_740425991815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term334597 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term334597, term334597.getClass(), "numerator", -2147483648);
        setIntField(term334597, term334597.getClass(), "denominator", 2);
        term336522 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term336522, term336522.getClass(), "denominator", 2);
        setIntField(term336522, term336522.getClass(), "numerator", -2147483648);
        term336523 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term336523, term336523.getClass(), "denominator", 2);
        setIntField(term336523, term336523.getClass(), "numerator", -2147483648);
        term336519 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term336519, term336519.getClass(), "denominator", 1);
        setIntField(term336519, term336519.getClass(), "numerator", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Object[] args = new Object[1];
        args[0] = term334597;
        Object retValue = callMethod(klass, "subtract", argTypes, term334597, args);
        assertTrue(recursiveEquals(term334597, term336522));
        assertTrue(recursiveEquals(term334597, term336523));
        assertTrue(recursiveEquals(retValue, term336519));
    }

};


