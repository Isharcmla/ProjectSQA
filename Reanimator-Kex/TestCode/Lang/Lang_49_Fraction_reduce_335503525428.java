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

public class Fraction_reduce_335503525428 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116471;
     Object term117130;
     Object term117124;

    public Fraction_reduce_335503525428() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116471 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term116471, term116471.getClass(), "numerator", 1352667426);
        setIntField(term116471, term116471.getClass(), "denominator", 1475977129);
        term117130 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term117130, term117130.getClass(), "numerator", 1352667426);
        setIntField(term117130, term117130.getClass(), "denominator", 1475977129);
        setField(term117130, term117130.getClass(), "toString", null);
        setField(term117130, term117130.getClass(), "toProperString", null);
        term117124 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term117124, term117124.getClass(), "numerator", 122969766);
        setIntField(term117124, term117124.getClass(), "denominator", 134179739);
        setField(term117124, term117124.getClass(), "toString", null);
        setField(term117124, term117124.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term116471, args);
        assertTrue(recursiveEquals(term116471, term117130));
        assertTrue(recursiveEquals(retValue, term117124));
    }

};


