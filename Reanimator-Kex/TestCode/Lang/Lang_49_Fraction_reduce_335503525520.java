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

public class Fraction_reduce_335503525520 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142558;
     Object term143417;
     Object term143414;

    public Fraction_reduce_335503525520() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142558 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term142558, term142558.getClass(), "numerator", 1268077970);
        setIntField(term142558, term142558.getClass(), "denominator", 2106358257);
        term143417 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term143417, term143417.getClass(), "numerator", 1268077970);
        setIntField(term143417, term143417.getClass(), "denominator", 2106358257);
        setField(term143417, term143417.getClass(), "toString", null);
        setField(term143417, term143417.getClass(), "toProperString", null);
        term143414 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term143414, term143414.getClass(), "numerator", 1268077970);
        setIntField(term143414, term143414.getClass(), "denominator", 2106358257);
        setField(term143414, term143414.getClass(), "toString", null);
        setField(term143414, term143414.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term142558, args);
        assertTrue(recursiveEquals(term142558, term143417));
        assertTrue(recursiveEquals(retValue, term143414));
    }

};


