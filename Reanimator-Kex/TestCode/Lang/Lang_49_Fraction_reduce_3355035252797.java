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

public class Fraction_reduce_3355035252797 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term835733;
     Object term836325;
     Object term836322;

    public Fraction_reduce_3355035252797() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term835733 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term835733, term835733.getClass(), "numerator", 14220658);
        setIntField(term835733, term835733.getClass(), "denominator", 2098004017);
        term836325 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term836325, term836325.getClass(), "numerator", 14220658);
        setIntField(term836325, term836325.getClass(), "denominator", 2098004017);
        setField(term836325, term836325.getClass(), "toString", null);
        setField(term836325, term836325.getClass(), "toProperString", null);
        term836322 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term836322, term836322.getClass(), "numerator", 14220658);
        setIntField(term836322, term836322.getClass(), "denominator", 2098004017);
        setField(term836322, term836322.getClass(), "toString", null);
        setField(term836322, term836322.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term835733, args);
        assertTrue(recursiveEquals(term835733, term836325));
        assertTrue(recursiveEquals(retValue, term836322));
    }

};


