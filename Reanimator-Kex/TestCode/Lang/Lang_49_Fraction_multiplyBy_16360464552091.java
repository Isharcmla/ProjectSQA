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

public class Fraction_multiplyBy_16360464552091 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term616338;
     Object term616545;
     Object term616546;
     Object term616539;

    public Fraction_multiplyBy_16360464552091() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term616338 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term616338, term616338.getClass(), "numerator", 2);
        setIntField(term616338, term616338.getClass(), "denominator", 5);
        term616545 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term616545, term616545.getClass(), "numerator", 2);
        setIntField(term616545, term616545.getClass(), "denominator", 5);
        setField(term616545, term616545.getClass(), "toString", null);
        setField(term616545, term616545.getClass(), "toProperString", null);
        term616546 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term616546, term616546.getClass(), "numerator", 2);
        setIntField(term616546, term616546.getClass(), "denominator", 5);
        setField(term616546, term616546.getClass(), "toString", null);
        setField(term616546, term616546.getClass(), "toProperString", null);
        term616539 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term616539, term616539.getClass(), "numerator", 4);
        setIntField(term616539, term616539.getClass(), "denominator", 25);
        setField(term616539, term616539.getClass(), "toString", null);
        setField(term616539, term616539.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term616338;
        Object retValue = callMethod(klass, "multiplyBy", argTypes, term616338, args);
        assertTrue(recursiveEquals(term616338, term616545));
        assertTrue(recursiveEquals(term616338, term616546));
        assertTrue(recursiveEquals(retValue, term616539));
    }

};


