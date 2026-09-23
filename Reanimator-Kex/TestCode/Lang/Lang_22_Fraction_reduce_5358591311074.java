package org.apache.commons.lang3.math;

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
import static org.apache.commons.lang3.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.math.EqualityUtils.*;

public class Fraction_reduce_5358591311074 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term345303;
     Object term345816;
     Object term345813;

    public Fraction_reduce_5358591311074() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term345303 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term345303, term345303.getClass(), "numerator", -2080112594);
        setIntField(term345303, term345303.getClass(), "denominator", 2080112593);
        term345816 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term345816, term345816.getClass(), "numerator", -2080112594);
        setIntField(term345816, term345816.getClass(), "denominator", 2080112593);
        setField(term345816, term345816.getClass(), "toString", null);
        setField(term345816, term345816.getClass(), "toProperString", null);
        term345813 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term345813, term345813.getClass(), "numerator", -2080112594);
        setIntField(term345813, term345813.getClass(), "denominator", 2080112593);
        setField(term345813, term345813.getClass(), "toString", null);
        setField(term345813, term345813.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term345303, args);
        assertTrue(recursiveEquals(term345303, term345816));
        assertTrue(recursiveEquals(retValue, term345813));
    }

};


