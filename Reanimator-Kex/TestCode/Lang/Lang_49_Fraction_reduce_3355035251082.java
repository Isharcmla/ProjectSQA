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

public class Fraction_reduce_3355035251082 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term312007;
     Object term312911;
     Object term312908;

    public Fraction_reduce_3355035251082() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term312007 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term312007, term312007.getClass(), "numerator", -2075132678);
        setIntField(term312007, term312007.getClass(), "denominator", 15728619);
        term312911 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term312911, term312911.getClass(), "numerator", -2075132678);
        setIntField(term312911, term312911.getClass(), "denominator", 15728619);
        setField(term312911, term312911.getClass(), "toString", null);
        setField(term312911, term312911.getClass(), "toProperString", null);
        term312908 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term312908, term312908.getClass(), "numerator", -2075132678);
        setIntField(term312908, term312908.getClass(), "denominator", 15728619);
        setField(term312908, term312908.getClass(), "toString", null);
        setField(term312908, term312908.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term312007, args);
        assertTrue(recursiveEquals(term312007, term312911));
        assertTrue(recursiveEquals(retValue, term312908));
    }

};


