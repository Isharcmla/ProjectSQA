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

public class Fraction_reduce_3355035252723 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term811558;
     Object term812060;
     Object term812057;

    public Fraction_reduce_3355035252723() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term811558 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term811558, term811558.getClass(), "numerator", 983661890);
        setIntField(term811558, term811558.getClass(), "denominator", 816301769);
        term812060 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term812060, term812060.getClass(), "numerator", 983661890);
        setIntField(term812060, term812060.getClass(), "denominator", 816301769);
        setField(term812060, term812060.getClass(), "toString", null);
        setField(term812060, term812060.getClass(), "toProperString", null);
        term812057 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term812057, term812057.getClass(), "numerator", 983661890);
        setIntField(term812057, term812057.getClass(), "denominator", 816301769);
        setField(term812057, term812057.getClass(), "toString", null);
        setField(term812057, term812057.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term811558, args);
        assertTrue(recursiveEquals(term811558, term812060));
        assertTrue(recursiveEquals(retValue, term812057));
    }

};


