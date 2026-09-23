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

public class Fraction_reduce_3355035252860 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term856325;
     Object term856797;
     Object term856794;

    public Fraction_reduce_3355035252860() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term856325 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term856325, term856325.getClass(), "numerator", -397950702);
        setIntField(term856325, term856325.getClass(), "denominator", 723592271);
        term856797 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term856797, term856797.getClass(), "numerator", -397950702);
        setIntField(term856797, term856797.getClass(), "denominator", 723592271);
        setField(term856797, term856797.getClass(), "toString", null);
        setField(term856797, term856797.getClass(), "toProperString", null);
        term856794 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term856794, term856794.getClass(), "numerator", -397950702);
        setIntField(term856794, term856794.getClass(), "denominator", 723592271);
        setField(term856794, term856794.getClass(), "toString", null);
        setField(term856794, term856794.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term856325, args);
        assertTrue(recursiveEquals(term856325, term856797));
        assertTrue(recursiveEquals(retValue, term856794));
    }

};


