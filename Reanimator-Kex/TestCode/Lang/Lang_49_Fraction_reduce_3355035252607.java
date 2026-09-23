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

public class Fraction_reduce_3355035252607 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term778188;
     Object term778711;
     Object term778708;

    public Fraction_reduce_3355035252607() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term778188 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term778188, term778188.getClass(), "numerator", -2133654530);
        setIntField(term778188, term778188.getClass(), "denominator", 1776713737);
        term778711 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term778711, term778711.getClass(), "numerator", -2133654530);
        setIntField(term778711, term778711.getClass(), "denominator", 1776713737);
        setField(term778711, term778711.getClass(), "toString", null);
        setField(term778711, term778711.getClass(), "toProperString", null);
        term778708 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term778708, term778708.getClass(), "numerator", -2133654530);
        setIntField(term778708, term778708.getClass(), "denominator", 1776713737);
        setField(term778708, term778708.getClass(), "toString", null);
        setField(term778708, term778708.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term778188, args);
        assertTrue(recursiveEquals(term778188, term778711));
        assertTrue(recursiveEquals(retValue, term778708));
    }

};


