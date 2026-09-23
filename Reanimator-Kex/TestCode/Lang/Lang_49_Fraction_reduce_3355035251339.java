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

public class Fraction_reduce_3355035251339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term391756;
     Object term392249;
     Object term392246;

    public Fraction_reduce_3355035251339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term391756 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term391756, term391756.getClass(), "numerator", 923488858);
        setIntField(term391756, term391756.getClass(), "denominator", 1397690389);
        term392249 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term392249, term392249.getClass(), "numerator", 923488858);
        setIntField(term392249, term392249.getClass(), "denominator", 1397690389);
        setField(term392249, term392249.getClass(), "toString", null);
        setField(term392249, term392249.getClass(), "toProperString", null);
        term392246 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term392246, term392246.getClass(), "numerator", 923488858);
        setIntField(term392246, term392246.getClass(), "denominator", 1397690389);
        setField(term392246, term392246.getClass(), "toString", null);
        setField(term392246, term392246.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term391756, args);
        assertTrue(recursiveEquals(term391756, term392249));
        assertTrue(recursiveEquals(retValue, term392246));
    }

};


