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

public class Fraction_reduce_3355035251414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term412407;
     Object term413165;
     Object term413159;

    public Fraction_reduce_3355035251414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term412407 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term412407, term412407.getClass(), "numerator", -979545462);
        setIntField(term412407, term412407.getClass(), "denominator", 2018250003);
        term413165 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term413165, term413165.getClass(), "numerator", -979545462);
        setIntField(term413165, term413165.getClass(), "denominator", 2018250003);
        setField(term413165, term413165.getClass(), "toString", null);
        setField(term413165, term413165.getClass(), "toProperString", null);
        term413159 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term413159, term413159.getClass(), "numerator", -46645022);
        setIntField(term413159, term413159.getClass(), "denominator", 96107143);
        setField(term413159, term413159.getClass(), "toString", null);
        setField(term413159, term413159.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term412407, args);
        assertTrue(recursiveEquals(term412407, term413165));
        assertTrue(recursiveEquals(retValue, term413159));
    }

};


