package org.apache.commons.lang3.math;

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
import static org.apache.commons.lang3.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.math.EqualityUtils.*;

public class Fraction_reduce_5358591311173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term378309;
     Object term379541;
     Object term379538;

    public Fraction_reduce_5358591311173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term378309 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term378309, term378309.getClass(), "numerator", -2011954642);
        setIntField(term378309, term378309.getClass(), "denominator", 2145120209);
        term379541 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term379541, term379541.getClass(), "numerator", -2011954642);
        setIntField(term379541, term379541.getClass(), "denominator", 2145120209);
        setField(term379541, term379541.getClass(), "toString", null);
        setField(term379541, term379541.getClass(), "toProperString", null);
        term379538 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term379538, term379538.getClass(), "numerator", -2011954642);
        setIntField(term379538, term379538.getClass(), "denominator", 2145120209);
        setField(term379538, term379538.getClass(), "toString", null);
        setField(term379538, term379538.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term378309, args);
        assertTrue(recursiveEquals(term378309, term379541));
        assertTrue(recursiveEquals(retValue, term379538));
    }

};


