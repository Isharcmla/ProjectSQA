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

public class Fraction_reduce_3355035251774 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term519284;
     Object term519993;
     Object term519987;

    public Fraction_reduce_3355035251774() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term519284 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term519284, term519284.getClass(), "numerator", -1874523566);
        setIntField(term519284, term519284.getClass(), "denominator", 1073741824);
        term519993 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term519993, term519993.getClass(), "numerator", -1874523566);
        setIntField(term519993, term519993.getClass(), "denominator", 1073741824);
        setField(term519993, term519993.getClass(), "toString", null);
        setField(term519993, term519993.getClass(), "toProperString", null);
        term519987 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term519987, term519987.getClass(), "numerator", -937261783);
        setIntField(term519987, term519987.getClass(), "denominator", 536870912);
        setField(term519987, term519987.getClass(), "toString", null);
        setField(term519987, term519987.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term519284, args);
        assertTrue(recursiveEquals(term519284, term519993));
        assertTrue(recursiveEquals(retValue, term519987));
    }

};


