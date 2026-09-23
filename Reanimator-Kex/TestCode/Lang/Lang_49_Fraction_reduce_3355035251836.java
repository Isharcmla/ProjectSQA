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

public class Fraction_reduce_3355035251836 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term537998;
     Object term538390;
     Object term538387;

    public Fraction_reduce_3355035251836() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term537998 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term537998, term537998.getClass(), "numerator", 319142);
        setIntField(term537998, term537998.getClass(), "denominator", 525730699);
        term538390 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term538390, term538390.getClass(), "numerator", 319142);
        setIntField(term538390, term538390.getClass(), "denominator", 525730699);
        setField(term538390, term538390.getClass(), "toString", null);
        setField(term538390, term538390.getClass(), "toProperString", null);
        term538387 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term538387, term538387.getClass(), "numerator", 319142);
        setIntField(term538387, term538387.getClass(), "denominator", 525730699);
        setField(term538387, term538387.getClass(), "toString", null);
        setField(term538387, term538387.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term537998, args);
        assertTrue(recursiveEquals(term537998, term538390));
        assertTrue(recursiveEquals(retValue, term538387));
    }

};


