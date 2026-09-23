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

public class Fraction_reduce_3355035252555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term761790;
     Object term762263;
     Object term762260;

    public Fraction_reduce_3355035252555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term761790 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term761790, term761790.getClass(), "numerator", 1030512994);
        setIntField(term761790, term761790.getClass(), "denominator", 1682229033);
        term762263 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term762263, term762263.getClass(), "numerator", 1030512994);
        setIntField(term762263, term762263.getClass(), "denominator", 1682229033);
        setField(term762263, term762263.getClass(), "toString", null);
        setField(term762263, term762263.getClass(), "toProperString", null);
        term762260 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term762260, term762260.getClass(), "numerator", 1030512994);
        setIntField(term762260, term762260.getClass(), "denominator", 1682229033);
        setField(term762260, term762260.getClass(), "toString", null);
        setField(term762260, term762260.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term761790, args);
        assertTrue(recursiveEquals(term761790, term762263));
        assertTrue(recursiveEquals(retValue, term762260));
    }

};


