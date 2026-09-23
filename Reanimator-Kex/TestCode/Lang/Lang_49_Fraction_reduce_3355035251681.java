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

public class Fraction_reduce_3355035251681 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term494186;
     Object term494663;
     Object term494660;

    public Fraction_reduce_3355035251681() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term494186 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term494186, term494186.getClass(), "numerator", 18759682);
        setIntField(term494186, term494186.getClass(), "denominator", 2072026025);
        term494663 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term494663, term494663.getClass(), "numerator", 18759682);
        setIntField(term494663, term494663.getClass(), "denominator", 2072026025);
        setField(term494663, term494663.getClass(), "toString", null);
        setField(term494663, term494663.getClass(), "toProperString", null);
        term494660 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term494660, term494660.getClass(), "numerator", 18759682);
        setIntField(term494660, term494660.getClass(), "denominator", 2072026025);
        setField(term494660, term494660.getClass(), "toString", null);
        setField(term494660, term494660.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term494186, args);
        assertTrue(recursiveEquals(term494186, term494663));
        assertTrue(recursiveEquals(retValue, term494660));
    }

};


