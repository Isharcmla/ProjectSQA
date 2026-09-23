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

public class Fraction_reduce_335503525500 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137401;
     Object term137802;
     Object term137796;

    public Fraction_reduce_335503525500() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137401 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term137401, term137401.getClass(), "numerator", -18365730);
        setIntField(term137401, term137401.getClass(), "denominator", 1940096985);
        term137802 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term137802, term137802.getClass(), "numerator", -18365730);
        setIntField(term137802, term137802.getClass(), "denominator", 1940096985);
        setField(term137802, term137802.getClass(), "toString", null);
        setField(term137802, term137802.getClass(), "toProperString", null);
        term137796 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term137796, term137796.getClass(), "numerator", -1224382);
        setIntField(term137796, term137796.getClass(), "denominator", 129339799);
        setField(term137796, term137796.getClass(), "toString", null);
        setField(term137796, term137796.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term137401, args);
        assertTrue(recursiveEquals(term137401, term137802));
        assertTrue(recursiveEquals(retValue, term137796));
    }

};


