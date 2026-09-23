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

public class Fraction_reduce_335503525358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94560;
     Object term95331;
     Object term95328;

    public Fraction_reduce_335503525358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term94560 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term94560, term94560.getClass(), "numerator", -1443835306);
        setIntField(term94560, term94560.getClass(), "denominator", 719507277);
        term95331 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term95331, term95331.getClass(), "numerator", -1443835306);
        setIntField(term95331, term95331.getClass(), "denominator", 719507277);
        setField(term95331, term95331.getClass(), "toString", null);
        setField(term95331, term95331.getClass(), "toProperString", null);
        term95328 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term95328, term95328.getClass(), "numerator", -1443835306);
        setIntField(term95328, term95328.getClass(), "denominator", 719507277);
        setField(term95328, term95328.getClass(), "toString", null);
        setField(term95328, term95328.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term94560, args);
        assertTrue(recursiveEquals(term94560, term95331));
        assertTrue(recursiveEquals(retValue, term95328));
    }

};


