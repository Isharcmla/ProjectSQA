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

public class Fraction_reduce_335503525812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227767;
     Object term228880;
     Object term228877;

    public Fraction_reduce_335503525812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term227767 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term227767, term227767.getClass(), "numerator", -972701678);
        setIntField(term227767, term227767.getClass(), "denominator", 2093733007);
        term228880 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term228880, term228880.getClass(), "numerator", -972701678);
        setIntField(term228880, term228880.getClass(), "denominator", 2093733007);
        setField(term228880, term228880.getClass(), "toString", null);
        setField(term228880, term228880.getClass(), "toProperString", null);
        term228877 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term228877, term228877.getClass(), "numerator", -972701678);
        setIntField(term228877, term228877.getClass(), "denominator", 2093733007);
        setField(term228877, term228877.getClass(), "toString", null);
        setField(term228877, term228877.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term227767, args);
        assertTrue(recursiveEquals(term227767, term228880));
        assertTrue(recursiveEquals(retValue, term228877));
    }

};


