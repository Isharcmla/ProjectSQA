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

public class Fraction_reduce_5358591311513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term491283;
     Object term492611;
     Object term492608;

    public Fraction_reduce_5358591311513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term491283 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term491283, term491283.getClass(), "numerator", -935698166);
        setIntField(term491283, term491283.getClass(), "denominator", 562894115);
        term492611 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term492611, term492611.getClass(), "numerator", -935698166);
        setIntField(term492611, term492611.getClass(), "denominator", 562894115);
        setField(term492611, term492611.getClass(), "toString", null);
        setField(term492611, term492611.getClass(), "toProperString", null);
        term492608 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term492608, term492608.getClass(), "numerator", -935698166);
        setIntField(term492608, term492608.getClass(), "denominator", 562894115);
        setField(term492608, term492608.getClass(), "toString", null);
        setField(term492608, term492608.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term491283, args);
        assertTrue(recursiveEquals(term491283, term492611));
        assertTrue(recursiveEquals(retValue, term492608));
    }

};


