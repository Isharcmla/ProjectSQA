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

public class Fraction_reduce_535859131316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term88279;
     Object term89208;
     Object term89205;

    public Fraction_reduce_535859131316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term88279 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term88279, term88279.getClass(), "numerator", 1002895506);
        setIntField(term88279, term88279.getClass(), "denominator", 503676961);
        term89208 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term89208, term89208.getClass(), "numerator", 1002895506);
        setIntField(term89208, term89208.getClass(), "denominator", 503676961);
        setField(term89208, term89208.getClass(), "toString", null);
        setField(term89208, term89208.getClass(), "toProperString", null);
        term89205 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term89205, term89205.getClass(), "numerator", 1002895506);
        setIntField(term89205, term89205.getClass(), "denominator", 503676961);
        setField(term89205, term89205.getClass(), "toString", null);
        setField(term89205, term89205.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term88279, args);
        assertTrue(recursiveEquals(term88279, term89208));
        assertTrue(recursiveEquals(retValue, term89205));
    }

};


