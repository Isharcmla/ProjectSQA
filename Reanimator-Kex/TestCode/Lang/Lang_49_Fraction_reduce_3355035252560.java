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

public class Fraction_reduce_3355035252560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term763299;
     Object term764306;
     Object term764303;

    public Fraction_reduce_3355035252560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term763299 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term763299, term763299.getClass(), "numerator", 2080778886);
        setIntField(term763299, term763299.getClass(), "denominator", 1092178091);
        term764306 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term764306, term764306.getClass(), "numerator", 2080778886);
        setIntField(term764306, term764306.getClass(), "denominator", 1092178091);
        setField(term764306, term764306.getClass(), "toString", null);
        setField(term764306, term764306.getClass(), "toProperString", null);
        term764303 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term764303, term764303.getClass(), "numerator", 2080778886);
        setIntField(term764303, term764303.getClass(), "denominator", 1092178091);
        setField(term764303, term764303.getClass(), "toString", null);
        setField(term764303, term764303.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term763299, args);
        assertTrue(recursiveEquals(term763299, term764306));
        assertTrue(recursiveEquals(retValue, term764303));
    }

};


