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

public class Fraction_reduce_3355035251023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293768;
     Object term294249;
     Object term294243;

    public Fraction_reduce_3355035251023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term293768 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term293768, term293768.getClass(), "numerator", 75555402);
        setIntField(term293768, term293768.getClass(), "denominator", 1581654763);
        term294249 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term294249, term294249.getClass(), "numerator", 75555402);
        setIntField(term294249, term294249.getClass(), "denominator", 1581654763);
        setField(term294249, term294249.getClass(), "toString", null);
        setField(term294249, term294249.getClass(), "toProperString", null);
        term294243 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term294243, term294243.getClass(), "numerator", 5811954);
        setIntField(term294243, term294243.getClass(), "denominator", 121665751);
        setField(term294243, term294243.getClass(), "toString", null);
        setField(term294243, term294243.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term293768, args);
        assertTrue(recursiveEquals(term293768, term294249));
        assertTrue(recursiveEquals(retValue, term294243));
    }

};


