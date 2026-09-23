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

public class Fraction_reduce_335503525446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121884;
     Object term122297;
     Object term122291;

    public Fraction_reduce_335503525446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121884 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term121884, term121884.getClass(), "numerator", -1070710210);
        setIntField(term121884, term121884.getClass(), "denominator", 1361478505);
        term122297 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term122297, term122297.getClass(), "numerator", -1070710210);
        setIntField(term122297, term122297.getClass(), "denominator", 1361478505);
        setField(term122297, term122297.getClass(), "toString", null);
        setField(term122297, term122297.getClass(), "toProperString", null);
        term122291 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term122291, term122291.getClass(), "numerator", -214142042);
        setIntField(term122291, term122291.getClass(), "denominator", 272295701);
        setField(term122291, term122291.getClass(), "toString", null);
        setField(term122291, term122291.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term121884, args);
        assertTrue(recursiveEquals(term121884, term122297));
        assertTrue(recursiveEquals(retValue, term122291));
    }

};


