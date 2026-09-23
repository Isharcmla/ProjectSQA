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

public class Fraction_reduce_3355035251689 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term496563;
     Object term496695;
     Object term496692;

    public Fraction_reduce_3355035251689() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term496563 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term496563, term496563.getClass(), "numerator", -536870911);
        setIntField(term496563, term496563.getClass(), "denominator", 1073741824);
        term496695 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term496695, term496695.getClass(), "numerator", -536870911);
        setIntField(term496695, term496695.getClass(), "denominator", 1073741824);
        setField(term496695, term496695.getClass(), "toString", null);
        setField(term496695, term496695.getClass(), "toProperString", null);
        term496692 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term496692, term496692.getClass(), "numerator", -536870911);
        setIntField(term496692, term496692.getClass(), "denominator", 1073741824);
        setField(term496692, term496692.getClass(), "toString", null);
        setField(term496692, term496692.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term496563, args);
        assertTrue(recursiveEquals(term496563, term496695));
        assertTrue(recursiveEquals(retValue, term496692));
    }

};


