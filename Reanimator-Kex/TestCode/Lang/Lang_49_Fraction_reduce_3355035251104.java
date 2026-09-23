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

public class Fraction_reduce_3355035251104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term319185;
     Object term319934;
     Object term319931;

    public Fraction_reduce_3355035251104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term319185 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term319185, term319185.getClass(), "numerator", 957060930);
        setIntField(term319185, term319185.getClass(), "denominator", 1080165449);
        term319934 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term319934, term319934.getClass(), "numerator", 957060930);
        setIntField(term319934, term319934.getClass(), "denominator", 1080165449);
        setField(term319934, term319934.getClass(), "toString", null);
        setField(term319934, term319934.getClass(), "toProperString", null);
        term319931 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term319931, term319931.getClass(), "numerator", 957060930);
        setIntField(term319931, term319931.getClass(), "denominator", 1080165449);
        setField(term319931, term319931.getClass(), "toString", null);
        setField(term319931, term319931.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term319185, args);
        assertTrue(recursiveEquals(term319185, term319934));
        assertTrue(recursiveEquals(retValue, term319931));
    }

};


