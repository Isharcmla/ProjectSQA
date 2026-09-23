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

public class Fraction_reduce_3355035251456 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term425893;
     Object term426354;
     Object term426348;

    public Fraction_reduce_3355035251456() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term425893 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term425893, term425893.getClass(), "numerator", -1556344030);
        setIntField(term425893, term425893.getClass(), "denominator", 1729988615);
        term426354 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term426354, term426354.getClass(), "numerator", -1556344030);
        setIntField(term426354, term426354.getClass(), "denominator", 1729988615);
        setField(term426354, term426354.getClass(), "toString", null);
        setField(term426354, term426354.getClass(), "toProperString", null);
        term426348 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term426348, term426348.getClass(), "numerator", -311268806);
        setIntField(term426348, term426348.getClass(), "denominator", 345997723);
        setField(term426348, term426348.getClass(), "toString", null);
        setField(term426348, term426348.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term425893, args);
        assertTrue(recursiveEquals(term425893, term426354));
        assertTrue(recursiveEquals(retValue, term426348));
    }

};


