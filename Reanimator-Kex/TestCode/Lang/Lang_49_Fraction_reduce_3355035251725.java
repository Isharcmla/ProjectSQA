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

public class Fraction_reduce_3355035251725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term505415;
     Object term505893;
     Object term505890;

    public Fraction_reduce_3355035251725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term505415 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term505415, term505415.getClass(), "numerator", 2118207898);
        setIntField(term505415, term505415.getClass(), "denominator", 1621901573);
        term505893 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term505893, term505893.getClass(), "numerator", 2118207898);
        setIntField(term505893, term505893.getClass(), "denominator", 1621901573);
        setField(term505893, term505893.getClass(), "toString", null);
        setField(term505893, term505893.getClass(), "toProperString", null);
        term505890 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term505890, term505890.getClass(), "numerator", 2118207898);
        setIntField(term505890, term505890.getClass(), "denominator", 1621901573);
        setField(term505890, term505890.getClass(), "toString", null);
        setField(term505890, term505890.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term505415, args);
        assertTrue(recursiveEquals(term505415, term505893));
        assertTrue(recursiveEquals(retValue, term505890));
    }

};


