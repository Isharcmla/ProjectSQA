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

public class Fraction_reduce_335503525422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115149;
     Object term115969;
     Object term115963;

    public Fraction_reduce_335503525422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115149 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term115149, term115149.getClass(), "numerator", 1652952514);
        setIntField(term115149, term115149.getClass(), "denominator", 1073741824);
        term115969 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term115969, term115969.getClass(), "numerator", 1652952514);
        setIntField(term115969, term115969.getClass(), "denominator", 1073741824);
        setField(term115969, term115969.getClass(), "toString", null);
        setField(term115969, term115969.getClass(), "toProperString", null);
        term115963 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term115963, term115963.getClass(), "numerator", 826476257);
        setIntField(term115963, term115963.getClass(), "denominator", 536870912);
        setField(term115963, term115963.getClass(), "toString", null);
        setField(term115963, term115963.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term115149, args);
        assertTrue(recursiveEquals(term115149, term115969));
        assertTrue(recursiveEquals(retValue, term115963));
    }

};


