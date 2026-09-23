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

public class Fraction_reduce_535859131122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24662;
     Object term26343;
     Object term26340;

    public Fraction_reduce_535859131122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24662 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term24662, term24662.getClass(), "numerator", -2);
        setIntField(term24662, term24662.getClass(), "denominator", 1890024057);
        term26343 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term26343, term26343.getClass(), "numerator", -2);
        setIntField(term26343, term26343.getClass(), "denominator", 1890024057);
        setField(term26343, term26343.getClass(), "toString", null);
        setField(term26343, term26343.getClass(), "toProperString", null);
        term26340 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term26340, term26340.getClass(), "numerator", -2);
        setIntField(term26340, term26340.getClass(), "denominator", 1890024057);
        setField(term26340, term26340.getClass(), "toString", null);
        setField(term26340, term26340.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term24662, args);
        assertTrue(recursiveEquals(term24662, term26343));
        assertTrue(recursiveEquals(retValue, term26340));
    }

};


