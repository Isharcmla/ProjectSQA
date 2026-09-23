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

public class Fraction_reduce_3355035251737 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term508615;
     Object term509089;
     Object term509086;

    public Fraction_reduce_3355035251737() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term508615 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term508615, term508615.getClass(), "numerator", 1624516738);
        setIntField(term508615, term508615.getClass(), "denominator", 1033631385);
        term509089 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term509089, term509089.getClass(), "numerator", 1624516738);
        setIntField(term509089, term509089.getClass(), "denominator", 1033631385);
        setField(term509089, term509089.getClass(), "toString", null);
        setField(term509089, term509089.getClass(), "toProperString", null);
        term509086 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term509086, term509086.getClass(), "numerator", 1624516738);
        setIntField(term509086, term509086.getClass(), "denominator", 1033631385);
        setField(term509086, term509086.getClass(), "toString", null);
        setField(term509086, term509086.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term508615, args);
        assertTrue(recursiveEquals(term508615, term509089));
        assertTrue(recursiveEquals(retValue, term509086));
    }

};


