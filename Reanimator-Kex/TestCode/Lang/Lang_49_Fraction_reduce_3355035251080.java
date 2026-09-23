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

public class Fraction_reduce_3355035251080 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term311665;
     Object term312097;
     Object term312094;

    public Fraction_reduce_3355035251080() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term311665 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term311665, term311665.getClass(), "numerator", -1487933434);
        setIntField(term311665, term311665.getClass(), "denominator", 28637445);
        term312097 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term312097, term312097.getClass(), "numerator", -1487933434);
        setIntField(term312097, term312097.getClass(), "denominator", 28637445);
        setField(term312097, term312097.getClass(), "toString", null);
        setField(term312097, term312097.getClass(), "toProperString", null);
        term312094 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term312094, term312094.getClass(), "numerator", -1487933434);
        setIntField(term312094, term312094.getClass(), "denominator", 28637445);
        setField(term312094, term312094.getClass(), "toString", null);
        setField(term312094, term312094.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term311665, args);
        assertTrue(recursiveEquals(term311665, term312097));
        assertTrue(recursiveEquals(retValue, term312094));
    }

};


