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

public class Fraction_reduce_335503525316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82926;
     Object term83340;
     Object term83337;

    public Fraction_reduce_335503525316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82926 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term82926, term82926.getClass(), "numerator", -273087698);
        setIntField(term82926, term82926.getClass(), "denominator", 136405153);
        term83340 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term83340, term83340.getClass(), "numerator", -273087698);
        setIntField(term83340, term83340.getClass(), "denominator", 136405153);
        setField(term83340, term83340.getClass(), "toString", null);
        setField(term83340, term83340.getClass(), "toProperString", null);
        term83337 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term83337, term83337.getClass(), "numerator", -273087698);
        setIntField(term83337, term83337.getClass(), "denominator", 136405153);
        setField(term83337, term83337.getClass(), "toString", null);
        setField(term83337, term83337.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term82926, args);
        assertTrue(recursiveEquals(term82926, term83340));
        assertTrue(recursiveEquals(retValue, term83337));
    }

};


