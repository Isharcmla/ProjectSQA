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

public class Fraction_reduce_3355035251374 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term401359;
     Object term402222;
     Object term402216;

    public Fraction_reduce_3355035251374() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term401359 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term401359, term401359.getClass(), "numerator", 1632589842);
        setIntField(term401359, term401359.getClass(), "denominator", 195386577);
        term402222 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term402222, term402222.getClass(), "numerator", 1632589842);
        setIntField(term402222, term402222.getClass(), "denominator", 195386577);
        setField(term402222, term402222.getClass(), "toString", null);
        setField(term402222, term402222.getClass(), "toProperString", null);
        term402216 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term402216, term402216.getClass(), "numerator", 544196614);
        setIntField(term402216, term402216.getClass(), "denominator", 65128859);
        setField(term402216, term402216.getClass(), "toString", null);
        setField(term402216, term402216.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term401359, args);
        assertTrue(recursiveEquals(term401359, term402222));
        assertTrue(recursiveEquals(retValue, term402216));
    }

};


