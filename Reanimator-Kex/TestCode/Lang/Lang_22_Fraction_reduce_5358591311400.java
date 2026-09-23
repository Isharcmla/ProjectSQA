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

public class Fraction_reduce_5358591311400 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term456173;
     Object term456946;
     Object term456943;

    public Fraction_reduce_5358591311400() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term456173 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term456173, term456173.getClass(), "numerator", -2008528382);
        setIntField(term456173, term456173.getClass(), "denominator", 1145619911);
        term456946 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term456946, term456946.getClass(), "numerator", -2008528382);
        setIntField(term456946, term456946.getClass(), "denominator", 1145619911);
        setField(term456946, term456946.getClass(), "toString", null);
        setField(term456946, term456946.getClass(), "toProperString", null);
        term456943 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term456943, term456943.getClass(), "numerator", -2008528382);
        setIntField(term456943, term456943.getClass(), "denominator", 1145619911);
        setField(term456943, term456943.getClass(), "toString", null);
        setField(term456943, term456943.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term456173, args);
        assertTrue(recursiveEquals(term456173, term456946));
        assertTrue(recursiveEquals(retValue, term456943));
    }

};


