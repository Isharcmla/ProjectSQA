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

public class Fraction_reduce_335503525659 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183762;
     Object term183865;
     Object term183862;

    public Fraction_reduce_335503525659() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term183762 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term183762, term183762.getClass(), "numerator", 90908114);
        setIntField(term183762, term183762.getClass(), "denominator", 2069848065);
        term183865 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term183865, term183865.getClass(), "numerator", 90908114);
        setIntField(term183865, term183865.getClass(), "denominator", 2069848065);
        setField(term183865, term183865.getClass(), "toString", null);
        setField(term183865, term183865.getClass(), "toProperString", null);
        term183862 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term183862, term183862.getClass(), "numerator", 90908114);
        setIntField(term183862, term183862.getClass(), "denominator", 2069848065);
        setField(term183862, term183862.getClass(), "toString", null);
        setField(term183862, term183862.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term183762, args);
        assertTrue(recursiveEquals(term183762, term183865));
        assertTrue(recursiveEquals(retValue, term183862));
    }

};


