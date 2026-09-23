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
import static org.apache.commons.lang.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.math.EqualityUtils.*;

public class Fraction_reduce_335503525625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173914;
     Object term174125;
     Object term174122;

    public Fraction_reduce_335503525625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173914 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term173914, term173914.getClass(), "numerator", -1400657390);
        setIntField(term173914, term173914.getClass(), "denominator", 1350639311);
        term174125 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term174125, term174125.getClass(), "numerator", -1400657390);
        setIntField(term174125, term174125.getClass(), "denominator", 1350639311);
        setField(term174125, term174125.getClass(), "toString", null);
        setField(term174125, term174125.getClass(), "toProperString", null);
        term174122 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term174122, term174122.getClass(), "numerator", -1400657390);
        setIntField(term174122, term174122.getClass(), "denominator", 1350639311);
        setField(term174122, term174122.getClass(), "toString", null);
        setField(term174122, term174122.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term173914, args);
        assertTrue(recursiveEquals(term173914, term174125));
        assertTrue(recursiveEquals(retValue, term174122));
    }

};


