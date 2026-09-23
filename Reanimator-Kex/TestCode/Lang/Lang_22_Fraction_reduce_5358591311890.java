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

public class Fraction_reduce_5358591311890 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term617229;
     Object term618148;
     Object term618145;

    public Fraction_reduce_5358591311890() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term617229 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term617229, term617229.getClass(), "numerator", -491739674);
        setIntField(term617229, term617229.getClass(), "denominator", 598742373);
        term618148 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term618148, term618148.getClass(), "numerator", -491739674);
        setIntField(term618148, term618148.getClass(), "denominator", 598742373);
        setField(term618148, term618148.getClass(), "toString", null);
        setField(term618148, term618148.getClass(), "toProperString", null);
        term618145 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term618145, term618145.getClass(), "numerator", -491739674);
        setIntField(term618145, term618145.getClass(), "denominator", 598742373);
        setField(term618145, term618145.getClass(), "toString", null);
        setField(term618145, term618145.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term617229, args);
        assertTrue(recursiveEquals(term617229, term618148));
        assertTrue(recursiveEquals(retValue, term618145));
    }

};


