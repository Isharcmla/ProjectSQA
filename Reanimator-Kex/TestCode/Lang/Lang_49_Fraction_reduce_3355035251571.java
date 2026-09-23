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

public class Fraction_reduce_3355035251571 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term461040;
     Object term461137;
     Object term461134;

    public Fraction_reduce_3355035251571() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term461040 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term461040, term461040.getClass(), "numerator", 262193906);
        setIntField(term461040, term461040.getClass(), "denominator", 1104680977);
        term461137 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term461137, term461137.getClass(), "numerator", 262193906);
        setIntField(term461137, term461137.getClass(), "denominator", 1104680977);
        setField(term461137, term461137.getClass(), "toString", null);
        setField(term461137, term461137.getClass(), "toProperString", null);
        term461134 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term461134, term461134.getClass(), "numerator", 262193906);
        setIntField(term461134, term461134.getClass(), "denominator", 1104680977);
        setField(term461134, term461134.getClass(), "toString", null);
        setField(term461134, term461134.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term461040, args);
        assertTrue(recursiveEquals(term461040, term461137));
        assertTrue(recursiveEquals(retValue, term461134));
    }

};


