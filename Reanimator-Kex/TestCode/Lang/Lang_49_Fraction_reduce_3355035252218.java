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

public class Fraction_reduce_3355035252218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term655078;
     Object term655532;
     Object term655526;

    public Fraction_reduce_3355035252218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term655078 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term655078, term655078.getClass(), "numerator", -790404294);
        setIntField(term655078, term655078.getClass(), "denominator", 2013331755);
        term655532 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term655532, term655532.getClass(), "numerator", -790404294);
        setIntField(term655532, term655532.getClass(), "denominator", 2013331755);
        setField(term655532, term655532.getClass(), "toString", null);
        setField(term655532, term655532.getClass(), "toProperString", null);
        term655526 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term655526, term655526.getClass(), "numerator", -263468098);
        setIntField(term655526, term655526.getClass(), "denominator", 671110585);
        setField(term655526, term655526.getClass(), "toString", null);
        setField(term655526, term655526.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term655078, args);
        assertTrue(recursiveEquals(term655078, term655532));
        assertTrue(recursiveEquals(retValue, term655526));
    }

};


