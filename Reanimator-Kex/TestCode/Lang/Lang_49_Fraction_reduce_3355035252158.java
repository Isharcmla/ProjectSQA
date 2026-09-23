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

public class Fraction_reduce_3355035252158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term637309;
     Object term637948;
     Object term637945;

    public Fraction_reduce_3355035252158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term637309 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term637309, term637309.getClass(), "numerator", -126375186);
        setIntField(term637309, term637309.getClass(), "denominator", 2017710097);
        term637948 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term637948, term637948.getClass(), "numerator", -126375186);
        setIntField(term637948, term637948.getClass(), "denominator", 2017710097);
        setField(term637948, term637948.getClass(), "toString", null);
        setField(term637948, term637948.getClass(), "toProperString", null);
        term637945 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term637945, term637945.getClass(), "numerator", -126375186);
        setIntField(term637945, term637945.getClass(), "denominator", 2017710097);
        setField(term637945, term637945.getClass(), "toString", null);
        setField(term637945, term637945.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term637309, args);
        assertTrue(recursiveEquals(term637309, term637948));
        assertTrue(recursiveEquals(retValue, term637945));
    }

};


