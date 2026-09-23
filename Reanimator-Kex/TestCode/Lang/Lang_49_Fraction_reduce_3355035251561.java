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

public class Fraction_reduce_3355035251561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term458900;
     Object term459108;
     Object term459105;

    public Fraction_reduce_3355035251561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term458900 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term458900, term458900.getClass(), "numerator", 22807762);
        setIntField(term458900, term458900.getClass(), "denominator", 2142338065);
        term459108 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term459108, term459108.getClass(), "numerator", 22807762);
        setIntField(term459108, term459108.getClass(), "denominator", 2142338065);
        setField(term459108, term459108.getClass(), "toString", null);
        setField(term459108, term459108.getClass(), "toProperString", null);
        term459105 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term459105, term459105.getClass(), "numerator", 22807762);
        setIntField(term459105, term459105.getClass(), "denominator", 2142338065);
        setField(term459105, term459105.getClass(), "toString", null);
        setField(term459105, term459105.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term458900, args);
        assertTrue(recursiveEquals(term458900, term459108));
        assertTrue(recursiveEquals(retValue, term459105));
    }

};


