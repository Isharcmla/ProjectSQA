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

public class Fraction_reduce_3355035251294 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term378765;
     Object term379285;
     Object term379282;

    public Fraction_reduce_3355035251294() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term378765 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term378765, term378765.getClass(), "numerator", 2147360786);
        setIntField(term378765, term378765.getClass(), "denominator", 2035697);
        term379285 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term379285, term379285.getClass(), "numerator", 2147360786);
        setIntField(term379285, term379285.getClass(), "denominator", 2035697);
        setField(term379285, term379285.getClass(), "toString", null);
        setField(term379285, term379285.getClass(), "toProperString", null);
        term379282 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term379282, term379282.getClass(), "numerator", 2147360786);
        setIntField(term379282, term379282.getClass(), "denominator", 2035697);
        setField(term379282, term379282.getClass(), "toString", null);
        setField(term379282, term379282.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term378765, args);
        assertTrue(recursiveEquals(term378765, term379285));
        assertTrue(recursiveEquals(retValue, term379282));
    }

};


