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

public class Fraction_reduce_33550352585 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11595;
     Object term12098;
     Object term12095;

    public Fraction_reduce_33550352585() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11595 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term11595, term11595.getClass(), "numerator", 255200274);
        setIntField(term11595, term11595.getClass(), "denominator", 1578181105);
        term12098 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term12098, term12098.getClass(), "numerator", 255200274);
        setIntField(term12098, term12098.getClass(), "denominator", 1578181105);
        setField(term12098, term12098.getClass(), "toString", null);
        setField(term12098, term12098.getClass(), "toProperString", null);
        term12095 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term12095, term12095.getClass(), "numerator", 255200274);
        setIntField(term12095, term12095.getClass(), "denominator", 1578181105);
        setField(term12095, term12095.getClass(), "toString", null);
        setField(term12095, term12095.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term11595, args);
        assertTrue(recursiveEquals(term11595, term12098));
        assertTrue(recursiveEquals(retValue, term12095));
    }

};


