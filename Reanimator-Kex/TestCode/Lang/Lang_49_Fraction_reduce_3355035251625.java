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

public class Fraction_reduce_3355035251625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term476972;
     Object term477075;
     Object term477069;

    public Fraction_reduce_3355035251625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term476972 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term476972, term476972.getClass(), "numerator", -1178310462);
        setIntField(term476972, term476972.getClass(), "denominator", 520141623);
        term477075 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term477075, term477075.getClass(), "numerator", -1178310462);
        setIntField(term477075, term477075.getClass(), "denominator", 520141623);
        setField(term477075, term477075.getClass(), "toString", null);
        setField(term477075, term477075.getClass(), "toProperString", null);
        term477069 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term477069, term477069.getClass(), "numerator", -392770154);
        setIntField(term477069, term477069.getClass(), "denominator", 173380541);
        setField(term477069, term477069.getClass(), "toString", null);
        setField(term477069, term477069.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term476972, args);
        assertTrue(recursiveEquals(term476972, term477075));
        assertTrue(recursiveEquals(retValue, term477069));
    }

};


