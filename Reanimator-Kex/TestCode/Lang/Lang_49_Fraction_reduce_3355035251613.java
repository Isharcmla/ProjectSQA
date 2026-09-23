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

public class Fraction_reduce_3355035251613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term473779;
     Object term474387;
     Object term474384;

    public Fraction_reduce_3355035251613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term473779 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term473779, term473779.getClass(), "numerator", 1157837650);
        setIntField(term473779, term473779.getClass(), "denominator", 29463937);
        term474387 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term474387, term474387.getClass(), "numerator", 1157837650);
        setIntField(term474387, term474387.getClass(), "denominator", 29463937);
        setField(term474387, term474387.getClass(), "toString", null);
        setField(term474387, term474387.getClass(), "toProperString", null);
        term474384 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term474384, term474384.getClass(), "numerator", 1157837650);
        setIntField(term474384, term474384.getClass(), "denominator", 29463937);
        setField(term474384, term474384.getClass(), "toString", null);
        setField(term474384, term474384.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term473779, args);
        assertTrue(recursiveEquals(term473779, term474387));
        assertTrue(recursiveEquals(retValue, term474384));
    }

};


