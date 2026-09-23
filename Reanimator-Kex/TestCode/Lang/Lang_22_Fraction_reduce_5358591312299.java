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

public class Fraction_reduce_5358591312299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term751678;
     Object term751891;
     Object term751888;

    public Fraction_reduce_5358591312299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term751678 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term751678, term751678.getClass(), "numerator", -1991440578);
        setIntField(term751678, term751678.getClass(), "denominator", 1111990537);
        term751891 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term751891, term751891.getClass(), "numerator", -1991440578);
        setIntField(term751891, term751891.getClass(), "denominator", 1111990537);
        setField(term751891, term751891.getClass(), "toString", null);
        setField(term751891, term751891.getClass(), "toProperString", null);
        term751888 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term751888, term751888.getClass(), "numerator", -1991440578);
        setIntField(term751888, term751888.getClass(), "denominator", 1111990537);
        setField(term751888, term751888.getClass(), "toString", null);
        setField(term751888, term751888.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term751678, args);
        assertTrue(recursiveEquals(term751678, term751891));
        assertTrue(recursiveEquals(retValue, term751888));
    }

};


