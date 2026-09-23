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

public class Fraction_reduce_335503525158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35330;
     Object term36324;
     Object term36318;

    public Fraction_reduce_335503525158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35330 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term35330, term35330.getClass(), "numerator", 29986);
        setIntField(term35330, term35330.getClass(), "denominator", 402638665);
        term36324 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term36324, term36324.getClass(), "numerator", 29986);
        setIntField(term36324, term36324.getClass(), "denominator", 402638665);
        setField(term36324, term36324.getClass(), "toString", null);
        setField(term36324, term36324.getClass(), "toProperString", null);
        term36318 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term36318, term36318.getClass(), "numerator", 2726);
        setIntField(term36318, term36318.getClass(), "denominator", 36603515);
        setField(term36318, term36318.getClass(), "toString", null);
        setField(term36318, term36318.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term35330, args);
        assertTrue(recursiveEquals(term35330, term36324));
        assertTrue(recursiveEquals(retValue, term36318));
    }

};


