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

public class Fraction_addSub_17792944761364 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term679678;
     Object term680284;
     Object term680285;
     Object term680277;

    public Fraction_addSub_17792944761364() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term679678 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term679678, term679678.getClass(), "numerator", -2147483648);
        setIntField(term679678, term679678.getClass(), "denominator", 1073741824);
        term680284 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term680284, term680284.getClass(), "denominator", 1073741824);
        setIntField(term680284, term680284.getClass(), "numerator", -2147483648);
        term680285 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term680285, term680285.getClass(), "denominator", 1073741824);
        setIntField(term680285, term680285.getClass(), "numerator", -2147483648);
        term680277 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term680277, term680277.getClass(), "denominator", 1);
        setIntField(term680277, term680277.getClass(), "numerator", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.fraction.Fraction");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term679678;
        args[1] = false;
        Object retValue = callMethod(klass, "addSub", argTypes, term679678, args);
        assertTrue(recursiveEquals(term679678, term680284));
        assertTrue(recursiveEquals(term679678, term680285));
        assertTrue(recursiveEquals(retValue, term680277));
    }

};


