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

public class Fraction_reduce_5358591311154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term372695;
     Object term373530;
     Object term373527;

    public Fraction_reduce_5358591311154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term372695 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term372695, term372695.getClass(), "numerator", -2138045742);
        setIntField(term372695, term372695.getClass(), "denominator", 1238073679);
        term373530 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term373530, term373530.getClass(), "numerator", -2138045742);
        setIntField(term373530, term373530.getClass(), "denominator", 1238073679);
        setField(term373530, term373530.getClass(), "toString", null);
        setField(term373530, term373530.getClass(), "toProperString", null);
        term373527 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term373527, term373527.getClass(), "numerator", -2138045742);
        setIntField(term373527, term373527.getClass(), "denominator", 1238073679);
        setField(term373527, term373527.getClass(), "toString", null);
        setField(term373527, term373527.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term372695, args);
        assertTrue(recursiveEquals(term372695, term373530));
        assertTrue(recursiveEquals(retValue, term373527));
    }

};


