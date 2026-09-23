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

public class Fraction_reduce_3355035252473 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term736254;
     Object term736359;
     Object term736356;

    public Fraction_reduce_3355035252473() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term736254 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term736254, term736254.getClass(), "numerator", 2086849010);
        setIntField(term736254, term736254.getClass(), "denominator", 1076248177);
        term736359 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term736359, term736359.getClass(), "numerator", 2086849010);
        setIntField(term736359, term736359.getClass(), "denominator", 1076248177);
        setField(term736359, term736359.getClass(), "toString", null);
        setField(term736359, term736359.getClass(), "toProperString", null);
        term736356 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term736356, term736356.getClass(), "numerator", 2086849010);
        setIntField(term736356, term736356.getClass(), "denominator", 1076248177);
        setField(term736356, term736356.getClass(), "toString", null);
        setField(term736356, term736356.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term736254, args);
        assertTrue(recursiveEquals(term736254, term736359));
        assertTrue(recursiveEquals(retValue, term736356));
    }

};


