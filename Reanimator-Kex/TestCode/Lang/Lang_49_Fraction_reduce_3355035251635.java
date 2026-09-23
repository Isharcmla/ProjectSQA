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

public class Fraction_reduce_3355035251635 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term479363;
     Object term480361;
     Object term480358;

    public Fraction_reduce_3355035251635() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term479363 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term479363, term479363.getClass(), "numerator", 727213010);
        setIntField(term479363, term479363.getClass(), "denominator", 1222051969);
        term480361 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term480361, term480361.getClass(), "numerator", 727213010);
        setIntField(term480361, term480361.getClass(), "denominator", 1222051969);
        setField(term480361, term480361.getClass(), "toString", null);
        setField(term480361, term480361.getClass(), "toProperString", null);
        term480358 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term480358, term480358.getClass(), "numerator", 727213010);
        setIntField(term480358, term480358.getClass(), "denominator", 1222051969);
        setField(term480358, term480358.getClass(), "toString", null);
        setField(term480358, term480358.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term479363, args);
        assertTrue(recursiveEquals(term479363, term480361));
        assertTrue(recursiveEquals(retValue, term480358));
    }

};


