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

public class Fraction_reduce_3355035252014 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term590873;
     Object term591339;
     Object term591336;

    public Fraction_reduce_3355035252014() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term590873 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term590873, term590873.getClass(), "numerator", -212508738);
        setIntField(term590873, term590873.getClass(), "denominator", 1900955593);
        term591339 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term591339, term591339.getClass(), "numerator", -212508738);
        setIntField(term591339, term591339.getClass(), "denominator", 1900955593);
        setField(term591339, term591339.getClass(), "toString", null);
        setField(term591339, term591339.getClass(), "toProperString", null);
        term591336 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term591336, term591336.getClass(), "numerator", -212508738);
        setIntField(term591336, term591336.getClass(), "denominator", 1900955593);
        setField(term591336, term591336.getClass(), "toString", null);
        setField(term591336, term591336.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term590873, args);
        assertTrue(recursiveEquals(term590873, term591339));
        assertTrue(recursiveEquals(retValue, term591336));
    }

};


