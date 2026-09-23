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

public class Fraction_reduce_3355035252670 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term796449;
     Object term797590;
     Object term797587;

    public Fraction_reduce_3355035252670() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term796449 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term796449, term796449.getClass(), "numerator", 1342177294);
        setIntField(term796449, term796449.getClass(), "denominator", 268431103);
        term797590 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term797590, term797590.getClass(), "numerator", 1342177294);
        setIntField(term797590, term797590.getClass(), "denominator", 268431103);
        setField(term797590, term797590.getClass(), "toString", null);
        setField(term797590, term797590.getClass(), "toProperString", null);
        term797587 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term797587, term797587.getClass(), "numerator", 1342177294);
        setIntField(term797587, term797587.getClass(), "denominator", 268431103);
        setField(term797587, term797587.getClass(), "toString", null);
        setField(term797587, term797587.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term796449, args);
        assertTrue(recursiveEquals(term796449, term797590));
        assertTrue(recursiveEquals(retValue, term797587));
    }

};


