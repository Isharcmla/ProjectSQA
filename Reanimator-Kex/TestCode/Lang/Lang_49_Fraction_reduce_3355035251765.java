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

public class Fraction_reduce_3355035251765 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term516751;
     Object term517235;
     Object term517232;

    public Fraction_reduce_3355035251765() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term516751 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term516751, term516751.getClass(), "numerator", 14);
        setIntField(term516751, term516751.getClass(), "denominator", 2147482879);
        term517235 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term517235, term517235.getClass(), "numerator", 14);
        setIntField(term517235, term517235.getClass(), "denominator", 2147482879);
        setField(term517235, term517235.getClass(), "toString", null);
        setField(term517235, term517235.getClass(), "toProperString", null);
        term517232 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term517232, term517232.getClass(), "numerator", 14);
        setIntField(term517232, term517232.getClass(), "denominator", 2147482879);
        setField(term517232, term517232.getClass(), "toString", null);
        setField(term517232, term517232.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term516751, args);
        assertTrue(recursiveEquals(term516751, term517235));
        assertTrue(recursiveEquals(retValue, term517232));
    }

};


