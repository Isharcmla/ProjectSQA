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

public class Fraction_reduce_3355035251511 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term444733;
     Object term444934;
     Object term444931;

    public Fraction_reduce_3355035251511() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term444733 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term444733, term444733.getClass(), "numerator", 1133512834);
        setIntField(term444733, term444733.getClass(), "denominator", 438567809);
        term444934 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term444934, term444934.getClass(), "numerator", 1133512834);
        setIntField(term444934, term444934.getClass(), "denominator", 438567809);
        setField(term444934, term444934.getClass(), "toString", null);
        setField(term444934, term444934.getClass(), "toProperString", null);
        term444931 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term444931, term444931.getClass(), "numerator", 1133512834);
        setIntField(term444931, term444931.getClass(), "denominator", 438567809);
        setField(term444931, term444931.getClass(), "toString", null);
        setField(term444931, term444931.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term444733, args);
        assertTrue(recursiveEquals(term444733, term444934));
        assertTrue(recursiveEquals(retValue, term444931));
    }

};


