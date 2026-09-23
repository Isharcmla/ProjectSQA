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

public class Fraction_reduce_335503525788 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term220347;
     Object term221137;
     Object term221134;

    public Fraction_reduce_335503525788() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term220347 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term220347, term220347.getClass(), "numerator", 34365842);
        setIntField(term220347, term220347.getClass(), "denominator", 12431497);
        term221137 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term221137, term221137.getClass(), "numerator", 34365842);
        setIntField(term221137, term221137.getClass(), "denominator", 12431497);
        setField(term221137, term221137.getClass(), "toString", null);
        setField(term221137, term221137.getClass(), "toProperString", null);
        term221134 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term221134, term221134.getClass(), "numerator", 34365842);
        setIntField(term221134, term221134.getClass(), "denominator", 12431497);
        setField(term221134, term221134.getClass(), "toString", null);
        setField(term221134, term221134.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term220347, args);
        assertTrue(recursiveEquals(term220347, term221137));
        assertTrue(recursiveEquals(retValue, term221134));
    }

};


