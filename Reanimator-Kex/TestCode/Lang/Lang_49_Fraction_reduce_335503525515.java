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

public class Fraction_reduce_335503525515 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141422;
     Object term141590;
     Object term141587;

    public Fraction_reduce_335503525515() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141422 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term141422, term141422.getClass(), "numerator", -736099918);
        setIntField(term141422, term141422.getClass(), "denominator", 1043349631);
        term141590 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term141590, term141590.getClass(), "numerator", -736099918);
        setIntField(term141590, term141590.getClass(), "denominator", 1043349631);
        setField(term141590, term141590.getClass(), "toString", null);
        setField(term141590, term141590.getClass(), "toProperString", null);
        term141587 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term141587, term141587.getClass(), "numerator", -736099918);
        setIntField(term141587, term141587.getClass(), "denominator", 1043349631);
        setField(term141587, term141587.getClass(), "toString", null);
        setField(term141587, term141587.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term141422, args);
        assertTrue(recursiveEquals(term141422, term141590));
        assertTrue(recursiveEquals(retValue, term141587));
    }

};


