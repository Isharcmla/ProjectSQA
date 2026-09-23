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

public class Fraction_reduce_335503525751 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209243;
     Object term209695;
     Object term209692;

    public Fraction_reduce_335503525751() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term209243 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term209243, term209243.getClass(), "numerator", 1548161618);
        setIntField(term209243, term209243.getClass(), "denominator", 774080801);
        term209695 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term209695, term209695.getClass(), "numerator", 1548161618);
        setIntField(term209695, term209695.getClass(), "denominator", 774080801);
        setField(term209695, term209695.getClass(), "toString", null);
        setField(term209695, term209695.getClass(), "toProperString", null);
        term209692 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term209692, term209692.getClass(), "numerator", 1548161618);
        setIntField(term209692, term209692.getClass(), "denominator", 774080801);
        setField(term209692, term209692.getClass(), "toString", null);
        setField(term209692, term209692.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term209243, args);
        assertTrue(recursiveEquals(term209243, term209695));
        assertTrue(recursiveEquals(retValue, term209692));
    }

};


