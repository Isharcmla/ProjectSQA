package org.apache.commons.lang3.math;

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
import static org.apache.commons.lang3.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.math.EqualityUtils.*;

public class Fraction_reduce_5358591311023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term328115;
     Object term329158;
     Object term329155;

    public Fraction_reduce_5358591311023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term328115 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term328115, term328115.getClass(), "numerator", -1188147582);
        setIntField(term328115, term328115.getClass(), "denominator", 1947221767);
        term329158 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term329158, term329158.getClass(), "numerator", -1188147582);
        setIntField(term329158, term329158.getClass(), "denominator", 1947221767);
        setField(term329158, term329158.getClass(), "toString", null);
        setField(term329158, term329158.getClass(), "toProperString", null);
        term329155 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term329155, term329155.getClass(), "numerator", -1188147582);
        setIntField(term329155, term329155.getClass(), "denominator", 1947221767);
        setField(term329155, term329155.getClass(), "toString", null);
        setField(term329155, term329155.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term328115, args);
        assertTrue(recursiveEquals(term328115, term329158));
        assertTrue(recursiveEquals(retValue, term329155));
    }

};


