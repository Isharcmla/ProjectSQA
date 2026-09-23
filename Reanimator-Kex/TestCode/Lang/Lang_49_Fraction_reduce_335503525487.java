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

public class Fraction_reduce_335503525487 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134854;
     Object term135058;
     Object term135055;

    public Fraction_reduce_335503525487() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134854 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term134854, term134854.getClass(), "numerator", 682570818);
        setIntField(term134854, term134854.getClass(), "denominator", 1951306265);
        term135058 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term135058, term135058.getClass(), "numerator", 682570818);
        setIntField(term135058, term135058.getClass(), "denominator", 1951306265);
        setField(term135058, term135058.getClass(), "toString", null);
        setField(term135058, term135058.getClass(), "toProperString", null);
        term135055 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term135055, term135055.getClass(), "numerator", 682570818);
        setIntField(term135055, term135055.getClass(), "denominator", 1951306265);
        setField(term135055, term135055.getClass(), "toString", null);
        setField(term135055, term135055.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term134854, args);
        assertTrue(recursiveEquals(term134854, term135058));
        assertTrue(recursiveEquals(retValue, term135055));
    }

};


