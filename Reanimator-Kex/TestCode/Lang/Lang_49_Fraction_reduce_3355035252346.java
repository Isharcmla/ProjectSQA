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

public class Fraction_reduce_3355035252346 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term694641;
     Object term695215;
     Object term695212;

    public Fraction_reduce_3355035252346() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term694641 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term694641, term694641.getClass(), "numerator", 95574130);
        setIntField(term694641, term694641.getClass(), "denominator", 1926835249);
        term695215 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term695215, term695215.getClass(), "numerator", 95574130);
        setIntField(term695215, term695215.getClass(), "denominator", 1926835249);
        setField(term695215, term695215.getClass(), "toString", null);
        setField(term695215, term695215.getClass(), "toProperString", null);
        term695212 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term695212, term695212.getClass(), "numerator", 95574130);
        setIntField(term695212, term695212.getClass(), "denominator", 1926835249);
        setField(term695212, term695212.getClass(), "toString", null);
        setField(term695212, term695212.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term694641, args);
        assertTrue(recursiveEquals(term694641, term695215));
        assertTrue(recursiveEquals(retValue, term695212));
    }

};


