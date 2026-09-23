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

public class Fraction_reduce_3355035251695 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term497746;
     Object term498328;
     Object term498325;

    public Fraction_reduce_3355035251695() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term497746 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term497746, term497746.getClass(), "numerator", 30);
        setIntField(term497746, term497746.getClass(), "denominator", 1073741831);
        term498328 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term498328, term498328.getClass(), "numerator", 30);
        setIntField(term498328, term498328.getClass(), "denominator", 1073741831);
        setField(term498328, term498328.getClass(), "toString", null);
        setField(term498328, term498328.getClass(), "toProperString", null);
        term498325 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term498325, term498325.getClass(), "numerator", 30);
        setIntField(term498325, term498325.getClass(), "denominator", 1073741831);
        setField(term498325, term498325.getClass(), "toString", null);
        setField(term498325, term498325.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term497746, args);
        assertTrue(recursiveEquals(term497746, term498328));
        assertTrue(recursiveEquals(retValue, term498325));
    }

};


