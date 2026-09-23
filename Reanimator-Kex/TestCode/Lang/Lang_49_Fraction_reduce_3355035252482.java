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

public class Fraction_reduce_3355035252482 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term739130;
     Object term740066;
     Object term740063;

    public Fraction_reduce_3355035252482() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term739130 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term739130, term739130.getClass(), "numerator", 266567462);
        setIntField(term739130, term739130.getClass(), "denominator", 2012332253);
        term740066 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term740066, term740066.getClass(), "numerator", 266567462);
        setIntField(term740066, term740066.getClass(), "denominator", 2012332253);
        setField(term740066, term740066.getClass(), "toString", null);
        setField(term740066, term740066.getClass(), "toProperString", null);
        term740063 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term740063, term740063.getClass(), "numerator", 266567462);
        setIntField(term740063, term740063.getClass(), "denominator", 2012332253);
        setField(term740063, term740063.getClass(), "toString", null);
        setField(term740063, term740063.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term739130, args);
        assertTrue(recursiveEquals(term739130, term740066));
        assertTrue(recursiveEquals(retValue, term740063));
    }

};


