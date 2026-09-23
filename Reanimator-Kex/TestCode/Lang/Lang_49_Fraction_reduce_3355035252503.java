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

public class Fraction_reduce_3355035252503 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term745732;
     Object term745832;
     Object term745829;

    public Fraction_reduce_3355035252503() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term745732 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term745732, term745732.getClass(), "numerator", -1825284082);
        setIntField(term745732, term745732.getClass(), "denominator", 117821057);
        term745832 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term745832, term745832.getClass(), "numerator", -1825284082);
        setIntField(term745832, term745832.getClass(), "denominator", 117821057);
        setField(term745832, term745832.getClass(), "toString", null);
        setField(term745832, term745832.getClass(), "toProperString", null);
        term745829 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term745829, term745829.getClass(), "numerator", -1825284082);
        setIntField(term745829, term745829.getClass(), "denominator", 117821057);
        setField(term745829, term745829.getClass(), "toString", null);
        setField(term745829, term745829.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term745732, args);
        assertTrue(recursiveEquals(term745732, term745832));
        assertTrue(recursiveEquals(retValue, term745829));
    }

};


