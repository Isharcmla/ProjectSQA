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

public class Fraction_reduce_3355035252471 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term735325;
     Object term735935;
     Object term735932;

    public Fraction_reduce_3355035252471() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term735325 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term735325, term735325.getClass(), "numerator", -1619936514);
        setIntField(term735325, term735325.getClass(), "denominator", 1065411817);
        term735935 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term735935, term735935.getClass(), "numerator", -1619936514);
        setIntField(term735935, term735935.getClass(), "denominator", 1065411817);
        setField(term735935, term735935.getClass(), "toString", null);
        setField(term735935, term735935.getClass(), "toProperString", null);
        term735932 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term735932, term735932.getClass(), "numerator", -1619936514);
        setIntField(term735932, term735932.getClass(), "denominator", 1065411817);
        setField(term735932, term735932.getClass(), "toString", null);
        setField(term735932, term735932.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term735325, args);
        assertTrue(recursiveEquals(term735325, term735935));
        assertTrue(recursiveEquals(retValue, term735932));
    }

};


