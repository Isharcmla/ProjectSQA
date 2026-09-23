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

public class Fraction_reduce_3355035252856 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term855220;
     Object term855807;
     Object term855804;

    public Fraction_reduce_3355035252856() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term855220 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term855220, term855220.getClass(), "numerator", 27264002);
        setIntField(term855220, term855220.getClass(), "denominator", 2075058681);
        term855807 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term855807, term855807.getClass(), "numerator", 27264002);
        setIntField(term855807, term855807.getClass(), "denominator", 2075058681);
        setField(term855807, term855807.getClass(), "toString", null);
        setField(term855807, term855807.getClass(), "toProperString", null);
        term855804 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term855804, term855804.getClass(), "numerator", 27264002);
        setIntField(term855804, term855804.getClass(), "denominator", 2075058681);
        setField(term855804, term855804.getClass(), "toString", null);
        setField(term855804, term855804.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term855220, args);
        assertTrue(recursiveEquals(term855220, term855807));
        assertTrue(recursiveEquals(retValue, term855804));
    }

};


