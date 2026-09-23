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

public class Fraction_reduce_3355035251549 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term455402;
     Object term456001;
     Object term455998;

    public Fraction_reduce_3355035251549() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term455402 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term455402, term455402.getClass(), "numerator", 140248066);
        setIntField(term455402, term455402.getClass(), "denominator", 201981769);
        term456001 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term456001, term456001.getClass(), "numerator", 140248066);
        setIntField(term456001, term456001.getClass(), "denominator", 201981769);
        setField(term456001, term456001.getClass(), "toString", null);
        setField(term456001, term456001.getClass(), "toProperString", null);
        term455998 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term455998, term455998.getClass(), "numerator", 140248066);
        setIntField(term455998, term455998.getClass(), "denominator", 201981769);
        setField(term455998, term455998.getClass(), "toString", null);
        setField(term455998, term455998.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term455402, args);
        assertTrue(recursiveEquals(term455402, term456001));
        assertTrue(recursiveEquals(retValue, term455998));
    }

};


