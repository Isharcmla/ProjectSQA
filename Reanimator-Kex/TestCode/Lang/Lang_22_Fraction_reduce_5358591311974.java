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

public class Fraction_reduce_5358591311974 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term644288;
     Object term644799;
     Object term644793;

    public Fraction_reduce_5358591311974() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term644288 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term644288, term644288.getClass(), "numerator", 34335042);
        setIntField(term644288, term644288.getClass(), "denominator", 17826681);
        term644799 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term644799, term644799.getClass(), "numerator", 34335042);
        setIntField(term644799, term644799.getClass(), "denominator", 17826681);
        setField(term644799, term644799.getClass(), "toString", null);
        setField(term644799, term644799.getClass(), "toProperString", null);
        term644793 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term644793, term644793.getClass(), "numerator", 11445014);
        setIntField(term644793, term644793.getClass(), "denominator", 5942227);
        setField(term644793, term644793.getClass(), "toString", null);
        setField(term644793, term644793.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term644288, args);
        assertTrue(recursiveEquals(term644288, term644799));
        assertTrue(recursiveEquals(retValue, term644793));
    }

};


