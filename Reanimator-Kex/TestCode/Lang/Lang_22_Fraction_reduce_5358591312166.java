package org.apache.commons.lang3.math;

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
import static org.apache.commons.lang3.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.math.EqualityUtils.*;

public class Fraction_reduce_5358591312166 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term706095;
     Object term706681;
     Object term706678;

    public Fraction_reduce_5358591312166() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term706095 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term706095, term706095.getClass(), "numerator", 3037570);
        setIntField(term706095, term706095.getClass(), "denominator", 2144043289);
        term706681 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term706681, term706681.getClass(), "numerator", 3037570);
        setIntField(term706681, term706681.getClass(), "denominator", 2144043289);
        setField(term706681, term706681.getClass(), "toString", null);
        setField(term706681, term706681.getClass(), "toProperString", null);
        term706678 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term706678, term706678.getClass(), "numerator", 3037570);
        setIntField(term706678, term706678.getClass(), "denominator", 2144043289);
        setField(term706678, term706678.getClass(), "toString", null);
        setField(term706678, term706678.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term706095, args);
        assertTrue(recursiveEquals(term706095, term706681));
        assertTrue(recursiveEquals(retValue, term706678));
    }

};


