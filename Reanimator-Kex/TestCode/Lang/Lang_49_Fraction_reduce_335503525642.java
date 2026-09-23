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

public class Fraction_reduce_335503525642 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term178813;
     Object term179179;
     Object term179176;

    public Fraction_reduce_335503525642() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term178813 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term178813, term178813.getClass(), "numerator", 2033682338);
        setIntField(term178813, term178813.getClass(), "denominator", 1949565865);
        term179179 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term179179, term179179.getClass(), "numerator", 2033682338);
        setIntField(term179179, term179179.getClass(), "denominator", 1949565865);
        setField(term179179, term179179.getClass(), "toString", null);
        setField(term179179, term179179.getClass(), "toProperString", null);
        term179176 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term179176, term179176.getClass(), "numerator", 2033682338);
        setIntField(term179176, term179176.getClass(), "denominator", 1949565865);
        setField(term179176, term179176.getClass(), "toString", null);
        setField(term179176, term179176.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term178813, args);
        assertTrue(recursiveEquals(term178813, term179179));
        assertTrue(recursiveEquals(retValue, term179176));
    }

};


