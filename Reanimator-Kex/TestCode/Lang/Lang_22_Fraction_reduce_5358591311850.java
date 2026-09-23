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

public class Fraction_reduce_5358591311850 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term604273;
     Object term604916;
     Object term604913;

    public Fraction_reduce_5358591311850() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term604273 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term604273, term604273.getClass(), "numerator", 1576525822);
        setIntField(term604273, term604273.getClass(), "denominator", 2105507815);
        term604916 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term604916, term604916.getClass(), "numerator", 1576525822);
        setIntField(term604916, term604916.getClass(), "denominator", 2105507815);
        setField(term604916, term604916.getClass(), "toString", null);
        setField(term604916, term604916.getClass(), "toProperString", null);
        term604913 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term604913, term604913.getClass(), "numerator", 1576525822);
        setIntField(term604913, term604913.getClass(), "denominator", 2105507815);
        setField(term604913, term604913.getClass(), "toString", null);
        setField(term604913, term604913.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term604273, args);
        assertTrue(recursiveEquals(term604273, term604916));
        assertTrue(recursiveEquals(retValue, term604913));
    }

};


