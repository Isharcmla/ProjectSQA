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

public class Fraction_reduce_335503525604 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167341;
     Object term167870;
     Object term167867;

    public Fraction_reduce_335503525604() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term167341 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term167341, term167341.getClass(), "numerator", 431259670);
        setIntField(term167341, term167341.getClass(), "denominator", 369377267);
        term167870 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term167870, term167870.getClass(), "numerator", 431259670);
        setIntField(term167870, term167870.getClass(), "denominator", 369377267);
        setField(term167870, term167870.getClass(), "toString", null);
        setField(term167870, term167870.getClass(), "toProperString", null);
        term167867 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term167867, term167867.getClass(), "numerator", 431259670);
        setIntField(term167867, term167867.getClass(), "denominator", 369377267);
        setField(term167867, term167867.getClass(), "toString", null);
        setField(term167867, term167867.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term167341, args);
        assertTrue(recursiveEquals(term167341, term167870));
        assertTrue(recursiveEquals(retValue, term167867));
    }

};


