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

public class Fraction_reduce_3355035252804 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term838431;
     Object term838916;
     Object term838913;

    public Fraction_reduce_3355035252804() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term838431 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term838431, term838431.getClass(), "numerator", 189104242);
        setIntField(term838431, term838431.getClass(), "denominator", 2119782385);
        term838916 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term838916, term838916.getClass(), "numerator", 189104242);
        setIntField(term838916, term838916.getClass(), "denominator", 2119782385);
        setField(term838916, term838916.getClass(), "toString", null);
        setField(term838916, term838916.getClass(), "toProperString", null);
        term838913 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term838913, term838913.getClass(), "numerator", 189104242);
        setIntField(term838913, term838913.getClass(), "denominator", 2119782385);
        setField(term838913, term838913.getClass(), "toString", null);
        setField(term838913, term838913.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term838431, args);
        assertTrue(recursiveEquals(term838431, term838916));
        assertTrue(recursiveEquals(retValue, term838913));
    }

};


