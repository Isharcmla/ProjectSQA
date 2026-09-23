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

public class Fraction_reduce_3355035251295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term379190;
     Object term379394;
     Object term379391;

    public Fraction_reduce_3355035251295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term379190 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term379190, term379190.getClass(), "numerator", -1941977558);
        setIntField(term379190, term379190.getClass(), "denominator", 1214243251);
        term379394 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term379394, term379394.getClass(), "numerator", -1941977558);
        setIntField(term379394, term379394.getClass(), "denominator", 1214243251);
        setField(term379394, term379394.getClass(), "toString", null);
        setField(term379394, term379394.getClass(), "toProperString", null);
        term379391 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term379391, term379391.getClass(), "numerator", -1941977558);
        setIntField(term379391, term379391.getClass(), "denominator", 1214243251);
        setField(term379391, term379391.getClass(), "toString", null);
        setField(term379391, term379391.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term379190, args);
        assertTrue(recursiveEquals(term379190, term379394));
        assertTrue(recursiveEquals(retValue, term379391));
    }

};


