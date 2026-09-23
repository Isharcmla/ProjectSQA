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

public class Fraction_reduce_3355035251746 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term511042;
     Object term511506;
     Object term511503;

    public Fraction_reduce_3355035251746() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term511042 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term511042, term511042.getClass(), "numerator", 40720390);
        setIntField(term511042, term511042.getClass(), "denominator", 2791931);
        term511506 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term511506, term511506.getClass(), "numerator", 40720390);
        setIntField(term511506, term511506.getClass(), "denominator", 2791931);
        setField(term511506, term511506.getClass(), "toString", null);
        setField(term511506, term511506.getClass(), "toProperString", null);
        term511503 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term511503, term511503.getClass(), "numerator", 40720390);
        setIntField(term511503, term511503.getClass(), "denominator", 2791931);
        setField(term511503, term511503.getClass(), "toString", null);
        setField(term511503, term511503.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term511042, args);
        assertTrue(recursiveEquals(term511042, term511506));
        assertTrue(recursiveEquals(retValue, term511503));
    }

};


