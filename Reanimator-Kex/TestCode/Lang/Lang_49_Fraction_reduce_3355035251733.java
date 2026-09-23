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

public class Fraction_reduce_3355035251733 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term507646;
     Object term508114;
     Object term508111;

    public Fraction_reduce_3355035251733() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term507646 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term507646, term507646.getClass(), "numerator", 52457806);
        setIntField(term507646, term507646.getClass(), "denominator", 1815907439);
        term508114 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term508114, term508114.getClass(), "numerator", 52457806);
        setIntField(term508114, term508114.getClass(), "denominator", 1815907439);
        setField(term508114, term508114.getClass(), "toString", null);
        setField(term508114, term508114.getClass(), "toProperString", null);
        term508111 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term508111, term508111.getClass(), "numerator", 52457806);
        setIntField(term508111, term508111.getClass(), "denominator", 1815907439);
        setField(term508111, term508111.getClass(), "toString", null);
        setField(term508111, term508111.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term507646, args);
        assertTrue(recursiveEquals(term507646, term508114));
        assertTrue(recursiveEquals(retValue, term508111));
    }

};


