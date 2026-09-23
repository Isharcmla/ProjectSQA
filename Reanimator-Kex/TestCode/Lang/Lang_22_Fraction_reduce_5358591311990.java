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

public class Fraction_reduce_5358591311990 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term649213;
     Object term649694;
     Object term649691;

    public Fraction_reduce_5358591311990() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term649213 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term649213, term649213.getClass(), "numerator", -2136473082);
        setIntField(term649213, term649213.getClass(), "denominator", 2142113045);
        term649694 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term649694, term649694.getClass(), "numerator", -2136473082);
        setIntField(term649694, term649694.getClass(), "denominator", 2142113045);
        setField(term649694, term649694.getClass(), "toString", null);
        setField(term649694, term649694.getClass(), "toProperString", null);
        term649691 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term649691, term649691.getClass(), "numerator", -2136473082);
        setIntField(term649691, term649691.getClass(), "denominator", 2142113045);
        setField(term649691, term649691.getClass(), "toString", null);
        setField(term649691, term649691.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term649213, args);
        assertTrue(recursiveEquals(term649213, term649694));
        assertTrue(recursiveEquals(retValue, term649691));
    }

};


