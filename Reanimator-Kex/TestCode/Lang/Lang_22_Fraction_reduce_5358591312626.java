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

public class Fraction_reduce_5358591312626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term859425;
     Object term860054;
     Object term860051;

    public Fraction_reduce_5358591312626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term859425 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term859425, term859425.getClass(), "numerator", -10386314);
        setIntField(term859425, term859425.getClass(), "denominator", 1990426653);
        term860054 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term860054, term860054.getClass(), "numerator", -10386314);
        setIntField(term860054, term860054.getClass(), "denominator", 1990426653);
        setField(term860054, term860054.getClass(), "toString", null);
        setField(term860054, term860054.getClass(), "toProperString", null);
        term860051 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term860051, term860051.getClass(), "numerator", -10386314);
        setIntField(term860051, term860051.getClass(), "denominator", 1990426653);
        setField(term860051, term860051.getClass(), "toString", null);
        setField(term860051, term860051.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term859425, args);
        assertTrue(recursiveEquals(term859425, term860054));
        assertTrue(recursiveEquals(retValue, term860051));
    }

};


