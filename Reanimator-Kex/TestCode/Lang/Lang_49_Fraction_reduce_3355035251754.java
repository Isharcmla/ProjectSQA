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

public class Fraction_reduce_3355035251754 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term513171;
     Object term514017;
     Object term514014;

    public Fraction_reduce_3355035251754() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term513171 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term513171, term513171.getClass(), "numerator", -2108678782);
        setIntField(term513171, term513171.getClass(), "denominator", 1560298647);
        term514017 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term514017, term514017.getClass(), "numerator", -2108678782);
        setIntField(term514017, term514017.getClass(), "denominator", 1560298647);
        setField(term514017, term514017.getClass(), "toString", null);
        setField(term514017, term514017.getClass(), "toProperString", null);
        term514014 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term514014, term514014.getClass(), "numerator", -2108678782);
        setIntField(term514014, term514014.getClass(), "denominator", 1560298647);
        setField(term514014, term514014.getClass(), "toString", null);
        setField(term514014, term514014.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term513171, args);
        assertTrue(recursiveEquals(term513171, term514017));
        assertTrue(recursiveEquals(retValue, term514014));
    }

};


