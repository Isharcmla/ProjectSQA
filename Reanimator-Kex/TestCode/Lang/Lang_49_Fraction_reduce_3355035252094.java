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

public class Fraction_reduce_3355035252094 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term616793;
     Object term617246;
     Object term617243;

    public Fraction_reduce_3355035252094() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term616793 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term616793, term616793.getClass(), "numerator", 294941170);
        setIntField(term616793, term616793.getClass(), "denominator", 384378801);
        term617246 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term617246, term617246.getClass(), "numerator", 294941170);
        setIntField(term617246, term617246.getClass(), "denominator", 384378801);
        setField(term617246, term617246.getClass(), "toString", null);
        setField(term617246, term617246.getClass(), "toProperString", null);
        term617243 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term617243, term617243.getClass(), "numerator", 294941170);
        setIntField(term617243, term617243.getClass(), "denominator", 384378801);
        setField(term617243, term617243.getClass(), "toString", null);
        setField(term617243, term617243.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term616793, args);
        assertTrue(recursiveEquals(term616793, term617246));
        assertTrue(recursiveEquals(retValue, term617243));
    }

};


