package org.apache.commons.lang3.math;

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
import static org.apache.commons.lang3.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.math.EqualityUtils.*;

public class Fraction_reduce_5358591311593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term518597;
     Object term519101;
     Object term519098;

    public Fraction_reduce_5358591311593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term518597 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term518597, term518597.getClass(), "numerator", -299888482);
        setIntField(term518597, term518597.getClass(), "denominator", 2078825209);
        term519101 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term519101, term519101.getClass(), "numerator", -299888482);
        setIntField(term519101, term519101.getClass(), "denominator", 2078825209);
        setField(term519101, term519101.getClass(), "toString", null);
        setField(term519101, term519101.getClass(), "toProperString", null);
        term519098 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term519098, term519098.getClass(), "numerator", -299888482);
        setIntField(term519098, term519098.getClass(), "denominator", 2078825209);
        setField(term519098, term519098.getClass(), "toString", null);
        setField(term519098, term519098.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term518597, args);
        assertTrue(recursiveEquals(term518597, term519101));
        assertTrue(recursiveEquals(retValue, term519098));
    }

};


