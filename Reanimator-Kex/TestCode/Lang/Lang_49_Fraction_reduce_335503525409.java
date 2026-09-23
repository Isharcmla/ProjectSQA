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

public class Fraction_reduce_335503525409 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term111897;
     Object term112001;
     Object term111998;

    public Fraction_reduce_335503525409() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term111897 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term111897, term111897.getClass(), "numerator", 33773698);
        setIntField(term111897, term111897.getClass(), "denominator", 1883089977);
        term112001 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term112001, term112001.getClass(), "numerator", 33773698);
        setIntField(term112001, term112001.getClass(), "denominator", 1883089977);
        setField(term112001, term112001.getClass(), "toString", null);
        setField(term112001, term112001.getClass(), "toProperString", null);
        term111998 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term111998, term111998.getClass(), "numerator", 33773698);
        setIntField(term111998, term111998.getClass(), "denominator", 1883089977);
        setField(term111998, term111998.getClass(), "toString", null);
        setField(term111998, term111998.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term111897, args);
        assertTrue(recursiveEquals(term111897, term112001));
        assertTrue(recursiveEquals(retValue, term111998));
    }

};


