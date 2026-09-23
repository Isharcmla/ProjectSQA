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

public class Fraction_reduce_3355035251810 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term529964;
     Object term530750;
     Object term530744;

    public Fraction_reduce_3355035251810() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term529964 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term529964, term529964.getClass(), "numerator", 620831250);
        setIntField(term529964, term529964.getClass(), "denominator", 2102864385);
        term530750 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term530750, term530750.getClass(), "numerator", 620831250);
        setIntField(term530750, term530750.getClass(), "denominator", 2102864385);
        setField(term530750, term530750.getClass(), "toString", null);
        setField(term530750, term530750.getClass(), "toProperString", null);
        term530744 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term530744, term530744.getClass(), "numerator", 41388750);
        setIntField(term530744, term530744.getClass(), "denominator", 140190959);
        setField(term530744, term530744.getClass(), "toString", null);
        setField(term530744, term530744.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term529964, args);
        assertTrue(recursiveEquals(term529964, term530750));
        assertTrue(recursiveEquals(retValue, term530744));
    }

};


