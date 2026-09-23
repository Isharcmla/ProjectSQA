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

public class Fraction_reduce_5358591311901 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term620898;
     Object term621397;
     Object term621394;

    public Fraction_reduce_5358591311901() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term620898 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term620898, term620898.getClass(), "numerator", -642403714);
        setIntField(term620898, term620898.getClass(), "denominator", 759792393);
        term621397 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term621397, term621397.getClass(), "numerator", -642403714);
        setIntField(term621397, term621397.getClass(), "denominator", 759792393);
        setField(term621397, term621397.getClass(), "toString", null);
        setField(term621397, term621397.getClass(), "toProperString", null);
        term621394 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term621394, term621394.getClass(), "numerator", -642403714);
        setIntField(term621394, term621394.getClass(), "denominator", 759792393);
        setField(term621394, term621394.getClass(), "toString", null);
        setField(term621394, term621394.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term620898, args);
        assertTrue(recursiveEquals(term620898, term621397));
        assertTrue(recursiveEquals(retValue, term621394));
    }

};


