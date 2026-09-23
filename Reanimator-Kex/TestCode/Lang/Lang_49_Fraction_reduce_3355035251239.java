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

public class Fraction_reduce_3355035251239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term362014;
     Object term362886;
     Object term362883;

    public Fraction_reduce_3355035251239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term362014 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term362014, term362014.getClass(), "numerator", 1210685986);
        setIntField(term362014, term362014.getClass(), "denominator", 466861257);
        term362886 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term362886, term362886.getClass(), "numerator", 1210685986);
        setIntField(term362886, term362886.getClass(), "denominator", 466861257);
        setField(term362886, term362886.getClass(), "toString", null);
        setField(term362886, term362886.getClass(), "toProperString", null);
        term362883 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term362883, term362883.getClass(), "numerator", 1210685986);
        setIntField(term362883, term362883.getClass(), "denominator", 466861257);
        setField(term362883, term362883.getClass(), "toString", null);
        setField(term362883, term362883.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term362014, args);
        assertTrue(recursiveEquals(term362014, term362886));
        assertTrue(recursiveEquals(retValue, term362883));
    }

};


