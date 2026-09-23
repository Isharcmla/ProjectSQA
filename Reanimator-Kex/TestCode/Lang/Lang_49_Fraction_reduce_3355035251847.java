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

public class Fraction_reduce_3355035251847 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term541490;
     Object term541681;
     Object term541678;

    public Fraction_reduce_3355035251847() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term541490 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term541490, term541490.getClass(), "numerator", 1477525578);
        setIntField(term541490, term541490.getClass(), "denominator", 470325857);
        term541681 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term541681, term541681.getClass(), "numerator", 1477525578);
        setIntField(term541681, term541681.getClass(), "denominator", 470325857);
        setField(term541681, term541681.getClass(), "toString", null);
        setField(term541681, term541681.getClass(), "toProperString", null);
        term541678 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term541678, term541678.getClass(), "numerator", 1477525578);
        setIntField(term541678, term541678.getClass(), "denominator", 470325857);
        setField(term541678, term541678.getClass(), "toString", null);
        setField(term541678, term541678.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term541490, args);
        assertTrue(recursiveEquals(term541490, term541681));
        assertTrue(recursiveEquals(retValue, term541678));
    }

};


