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

public class Fraction_reduce_3355035251910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term561050;
     Object term561512;
     Object term561509;

    public Fraction_reduce_3355035251910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term561050 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term561050, term561050.getClass(), "numerator", -1538733842);
        setIntField(term561050, term561050.getClass(), "denominator", 1105435441);
        term561512 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term561512, term561512.getClass(), "numerator", -1538733842);
        setIntField(term561512, term561512.getClass(), "denominator", 1105435441);
        setField(term561512, term561512.getClass(), "toString", null);
        setField(term561512, term561512.getClass(), "toProperString", null);
        term561509 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term561509, term561509.getClass(), "numerator", -1538733842);
        setIntField(term561509, term561509.getClass(), "denominator", 1105435441);
        setField(term561509, term561509.getClass(), "toString", null);
        setField(term561509, term561509.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term561050, args);
        assertTrue(recursiveEquals(term561050, term561512));
        assertTrue(recursiveEquals(retValue, term561509));
    }

};


