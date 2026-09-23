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

public class Fraction_reduce_5358591312133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term694182;
     Object term694681;
     Object term694678;

    public Fraction_reduce_5358591312133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term694182 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term694182, term694182.getClass(), "numerator", -1960299518);
        setIntField(term694182, term694182.getClass(), "denominator", 2108172055);
        term694681 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term694681, term694681.getClass(), "numerator", -1960299518);
        setIntField(term694681, term694681.getClass(), "denominator", 2108172055);
        setField(term694681, term694681.getClass(), "toString", null);
        setField(term694681, term694681.getClass(), "toProperString", null);
        term694678 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term694678, term694678.getClass(), "numerator", -1960299518);
        setIntField(term694678, term694678.getClass(), "denominator", 2108172055);
        setField(term694678, term694678.getClass(), "toString", null);
        setField(term694678, term694678.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term694182, args);
        assertTrue(recursiveEquals(term694182, term694681));
        assertTrue(recursiveEquals(retValue, term694678));
    }

};


