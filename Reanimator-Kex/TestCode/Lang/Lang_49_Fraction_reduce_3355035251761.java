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

public class Fraction_reduce_3355035251761 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term515653;
     Object term516099;
     Object term516096;

    public Fraction_reduce_3355035251761() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term515653 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term515653, term515653.getClass(), "numerator", -278576334);
        setIntField(term515653, term515653.getClass(), "denominator", 139288079);
        term516099 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term516099, term516099.getClass(), "numerator", -278576334);
        setIntField(term516099, term516099.getClass(), "denominator", 139288079);
        setField(term516099, term516099.getClass(), "toString", null);
        setField(term516099, term516099.getClass(), "toProperString", null);
        term516096 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term516096, term516096.getClass(), "numerator", -278576334);
        setIntField(term516096, term516096.getClass(), "denominator", 139288079);
        setField(term516096, term516096.getClass(), "toString", null);
        setField(term516096, term516096.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term515653, args);
        assertTrue(recursiveEquals(term515653, term516099));
        assertTrue(recursiveEquals(retValue, term516096));
    }

};


