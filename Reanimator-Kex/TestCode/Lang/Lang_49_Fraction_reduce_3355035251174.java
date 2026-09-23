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

public class Fraction_reduce_3355035251174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term342312;
     Object term342688;
     Object term342685;

    public Fraction_reduce_3355035251174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term342312 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term342312, term342312.getClass(), "numerator", 608136850);
        setIntField(term342312, term342312.getClass(), "denominator", 767051857);
        term342688 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term342688, term342688.getClass(), "numerator", 608136850);
        setIntField(term342688, term342688.getClass(), "denominator", 767051857);
        setField(term342688, term342688.getClass(), "toString", null);
        setField(term342688, term342688.getClass(), "toProperString", null);
        term342685 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term342685, term342685.getClass(), "numerator", 608136850);
        setIntField(term342685, term342685.getClass(), "denominator", 767051857);
        setField(term342685, term342685.getClass(), "toString", null);
        setField(term342685, term342685.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term342312, args);
        assertTrue(recursiveEquals(term342312, term342688));
        assertTrue(recursiveEquals(retValue, term342685));
    }

};


