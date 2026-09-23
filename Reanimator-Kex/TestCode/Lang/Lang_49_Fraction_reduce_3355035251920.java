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

public class Fraction_reduce_3355035251920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term563913;
     Object term564521;
     Object term564515;

    public Fraction_reduce_3355035251920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term563913 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term563913, term563913.getClass(), "numerator", 150995010);
        setIntField(term563913, term563913.getClass(), "denominator", 295126473);
        term564521 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term564521, term564521.getClass(), "numerator", 150995010);
        setIntField(term564521, term564521.getClass(), "denominator", 295126473);
        setField(term564521, term564521.getClass(), "toString", null);
        setField(term564521, term564521.getClass(), "toProperString", null);
        term564515 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term564515, term564515.getClass(), "numerator", 50331670);
        setIntField(term564515, term564515.getClass(), "denominator", 98375491);
        setField(term564515, term564515.getClass(), "toString", null);
        setField(term564515, term564515.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term563913, args);
        assertTrue(recursiveEquals(term563913, term564521));
        assertTrue(recursiveEquals(retValue, term564515));
    }

};


