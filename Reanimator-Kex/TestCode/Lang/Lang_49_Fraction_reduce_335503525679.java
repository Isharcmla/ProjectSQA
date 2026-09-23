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

public class Fraction_reduce_335503525679 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term188063;
     Object term188166;
     Object term188163;

    public Fraction_reduce_335503525679() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term188063 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term188063, term188063.getClass(), "numerator", 1609064398);
        setIntField(term188063, term188063.getClass(), "denominator", 805306383);
        term188166 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term188166, term188166.getClass(), "numerator", 1609064398);
        setIntField(term188166, term188166.getClass(), "denominator", 805306383);
        setField(term188166, term188166.getClass(), "toString", null);
        setField(term188166, term188166.getClass(), "toProperString", null);
        term188163 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term188163, term188163.getClass(), "numerator", 1609064398);
        setIntField(term188163, term188163.getClass(), "denominator", 805306383);
        setField(term188163, term188163.getClass(), "toString", null);
        setField(term188163, term188163.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term188063, args);
        assertTrue(recursiveEquals(term188063, term188166));
        assertTrue(recursiveEquals(retValue, term188163));
    }

};


