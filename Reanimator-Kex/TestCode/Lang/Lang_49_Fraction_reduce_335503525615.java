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

public class Fraction_reduce_335503525615 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171363;
     Object term171868;
     Object term171862;

    public Fraction_reduce_335503525615() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term171363 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term171363, term171363.getClass(), "numerator", 671088910);
        setIntField(term171363, term171363.getClass(), "denominator", 250351615);
        term171868 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term171868, term171868.getClass(), "numerator", 671088910);
        setIntField(term171868, term171868.getClass(), "denominator", 250351615);
        setField(term171868, term171868.getClass(), "toString", null);
        setField(term171868, term171868.getClass(), "toProperString", null);
        term171862 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term171862, term171862.getClass(), "numerator", 134217782);
        setIntField(term171862, term171862.getClass(), "denominator", 50070323);
        setField(term171862, term171862.getClass(), "toString", null);
        setField(term171862, term171862.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term171363, args);
        assertTrue(recursiveEquals(term171363, term171868));
        assertTrue(recursiveEquals(retValue, term171862));
    }

};


