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

public class Fraction_reduce_335503525878 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term249007;
     Object term249914;
     Object term249911;

    public Fraction_reduce_335503525878() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term249007 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term249007, term249007.getClass(), "numerator", 1090257954);
        setIntField(term249007, term249007.getClass(), "denominator", 2139111049);
        term249914 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term249914, term249914.getClass(), "numerator", 1090257954);
        setIntField(term249914, term249914.getClass(), "denominator", 2139111049);
        setField(term249914, term249914.getClass(), "toString", null);
        setField(term249914, term249914.getClass(), "toProperString", null);
        term249911 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term249911, term249911.getClass(), "numerator", 1090257954);
        setIntField(term249911, term249911.getClass(), "denominator", 2139111049);
        setField(term249911, term249911.getClass(), "toString", null);
        setField(term249911, term249911.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term249007, args);
        assertTrue(recursiveEquals(term249007, term249914));
        assertTrue(recursiveEquals(retValue, term249911));
    }

};


