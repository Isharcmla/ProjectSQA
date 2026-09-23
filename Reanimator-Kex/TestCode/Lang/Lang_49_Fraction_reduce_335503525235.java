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

public class Fraction_reduce_335503525235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58003;
     Object term59275;
     Object term59272;

    public Fraction_reduce_335503525235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58003 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term58003, term58003.getClass(), "numerator", -357524662);
        setIntField(term58003, term58003.getClass(), "denominator", 2076187219);
        term59275 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term59275, term59275.getClass(), "numerator", -357524662);
        setIntField(term59275, term59275.getClass(), "denominator", 2076187219);
        setField(term59275, term59275.getClass(), "toString", null);
        setField(term59275, term59275.getClass(), "toProperString", null);
        term59272 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term59272, term59272.getClass(), "numerator", -357524662);
        setIntField(term59272, term59272.getClass(), "denominator", 2076187219);
        setField(term59272, term59272.getClass(), "toString", null);
        setField(term59272, term59272.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term58003, args);
        assertTrue(recursiveEquals(term58003, term59275));
        assertTrue(recursiveEquals(retValue, term59272));
    }

};


