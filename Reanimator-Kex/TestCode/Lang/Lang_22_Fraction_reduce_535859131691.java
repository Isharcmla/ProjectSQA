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

public class Fraction_reduce_535859131691 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term218810;
     Object term219340;
     Object term219337;

    public Fraction_reduce_535859131691() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term218810 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term218810, term218810.getClass(), "numerator", 781533554);
        setIntField(term218810, term218810.getClass(), "denominator", 1464505473);
        term219340 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term219340, term219340.getClass(), "numerator", 781533554);
        setIntField(term219340, term219340.getClass(), "denominator", 1464505473);
        setField(term219340, term219340.getClass(), "toString", null);
        setField(term219340, term219340.getClass(), "toProperString", null);
        term219337 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term219337, term219337.getClass(), "numerator", 781533554);
        setIntField(term219337, term219337.getClass(), "denominator", 1464505473);
        setField(term219337, term219337.getClass(), "toString", null);
        setField(term219337, term219337.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term218810, args);
        assertTrue(recursiveEquals(term218810, term219340));
        assertTrue(recursiveEquals(retValue, term219337));
    }

};


