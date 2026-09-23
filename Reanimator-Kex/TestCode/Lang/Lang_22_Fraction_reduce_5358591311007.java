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

public class Fraction_reduce_5358591311007 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term322674;
     Object term323544;
     Object term323541;

    public Fraction_reduce_5358591311007() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term322674 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term322674, term322674.getClass(), "numerator", -2009602914);
        setIntField(term322674, term322674.getClass(), "denominator", 1594199417);
        term323544 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term323544, term323544.getClass(), "numerator", -2009602914);
        setIntField(term323544, term323544.getClass(), "denominator", 1594199417);
        setField(term323544, term323544.getClass(), "toString", null);
        setField(term323544, term323544.getClass(), "toProperString", null);
        term323541 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term323541, term323541.getClass(), "numerator", -2009602914);
        setIntField(term323541, term323541.getClass(), "denominator", 1594199417);
        setField(term323541, term323541.getClass(), "toString", null);
        setField(term323541, term323541.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term322674, args);
        assertTrue(recursiveEquals(term322674, term323544));
        assertTrue(recursiveEquals(retValue, term323541));
    }

};


