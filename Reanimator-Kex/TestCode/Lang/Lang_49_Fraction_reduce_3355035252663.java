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

public class Fraction_reduce_3355035252663 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term794145;
     Object term794978;
     Object term794975;

    public Fraction_reduce_3355035252663() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term794145 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term794145, term794145.getClass(), "numerator", -1429107846);
        setIntField(term794145, term794145.getClass(), "denominator", 1921796635);
        term794978 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term794978, term794978.getClass(), "numerator", -1429107846);
        setIntField(term794978, term794978.getClass(), "denominator", 1921796635);
        setField(term794978, term794978.getClass(), "toString", null);
        setField(term794978, term794978.getClass(), "toProperString", null);
        term794975 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term794975, term794975.getClass(), "numerator", -1429107846);
        setIntField(term794975, term794975.getClass(), "denominator", 1921796635);
        setField(term794975, term794975.getClass(), "toString", null);
        setField(term794975, term794975.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term794145, args);
        assertTrue(recursiveEquals(term794145, term794978));
        assertTrue(recursiveEquals(retValue, term794975));
    }

};


