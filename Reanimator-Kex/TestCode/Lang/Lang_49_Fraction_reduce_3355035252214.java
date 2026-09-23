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

public class Fraction_reduce_3355035252214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term653925;
     Object term654511;
     Object term654508;

    public Fraction_reduce_3355035252214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term653925 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term653925, term653925.getClass(), "numerator", 205966306);
        setIntField(term653925, term653925.getClass(), "denominator", 2100310665);
        term654511 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term654511, term654511.getClass(), "numerator", 205966306);
        setIntField(term654511, term654511.getClass(), "denominator", 2100310665);
        setField(term654511, term654511.getClass(), "toString", null);
        setField(term654511, term654511.getClass(), "toProperString", null);
        term654508 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term654508, term654508.getClass(), "numerator", 205966306);
        setIntField(term654508, term654508.getClass(), "denominator", 2100310665);
        setField(term654508, term654508.getClass(), "toString", null);
        setField(term654508, term654508.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term653925, args);
        assertTrue(recursiveEquals(term653925, term654511));
        assertTrue(recursiveEquals(retValue, term654508));
    }

};


