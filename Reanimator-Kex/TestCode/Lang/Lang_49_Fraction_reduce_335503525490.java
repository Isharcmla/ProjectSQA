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

public class Fraction_reduce_335503525490 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135245;
     Object term135588;
     Object term135585;

    public Fraction_reduce_335503525490() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135245 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term135245, term135245.getClass(), "numerator", 1501534378);
        setIntField(term135245, term135245.getClass(), "denominator", 1882305933);
        term135588 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term135588, term135588.getClass(), "numerator", 1501534378);
        setIntField(term135588, term135588.getClass(), "denominator", 1882305933);
        setField(term135588, term135588.getClass(), "toString", null);
        setField(term135588, term135588.getClass(), "toProperString", null);
        term135585 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term135585, term135585.getClass(), "numerator", 1501534378);
        setIntField(term135585, term135585.getClass(), "denominator", 1882305933);
        setField(term135585, term135585.getClass(), "toString", null);
        setField(term135585, term135585.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term135245, args);
        assertTrue(recursiveEquals(term135245, term135588));
        assertTrue(recursiveEquals(retValue, term135585));
    }

};


