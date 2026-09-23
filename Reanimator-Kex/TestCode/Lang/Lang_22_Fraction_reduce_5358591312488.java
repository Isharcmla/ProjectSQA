package org.apache.commons.lang3.math;

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
import static org.apache.commons.lang3.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.math.EqualityUtils.*;

public class Fraction_reduce_5358591312488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term814462;
     Object term814891;
     Object term814888;

    public Fraction_reduce_5358591312488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term814462 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term814462, term814462.getClass(), "numerator", -374603774);
        setIntField(term814462, term814462.getClass(), "denominator", 2144362631);
        term814891 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term814891, term814891.getClass(), "numerator", -374603774);
        setIntField(term814891, term814891.getClass(), "denominator", 2144362631);
        setField(term814891, term814891.getClass(), "toString", null);
        setField(term814891, term814891.getClass(), "toProperString", null);
        term814888 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term814888, term814888.getClass(), "numerator", -374603774);
        setIntField(term814888, term814888.getClass(), "denominator", 2144362631);
        setField(term814888, term814888.getClass(), "toString", null);
        setField(term814888, term814888.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term814462, args);
        assertTrue(recursiveEquals(term814462, term814891));
        assertTrue(recursiveEquals(retValue, term814888));
    }

};


