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

public class Fraction_reduce_3355035252156 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term636901;
     Object term637406;
     Object term637403;

    public Fraction_reduce_3355035252156() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term636901 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term636901, term636901.getClass(), "numerator", -2080588790);
        setIntField(term636901, term636901.getClass(), "denominator", 63445587);
        term637406 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term637406, term637406.getClass(), "numerator", -2080588790);
        setIntField(term637406, term637406.getClass(), "denominator", 63445587);
        setField(term637406, term637406.getClass(), "toString", null);
        setField(term637406, term637406.getClass(), "toProperString", null);
        term637403 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term637403, term637403.getClass(), "numerator", -2080588790);
        setIntField(term637403, term637403.getClass(), "denominator", 63445587);
        setField(term637403, term637403.getClass(), "toString", null);
        setField(term637403, term637403.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term636901, args);
        assertTrue(recursiveEquals(term636901, term637406));
        assertTrue(recursiveEquals(retValue, term637403));
    }

};


