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

public class Fraction_reduce_5358591312635 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term861915;
     Object term862019;
     Object term862016;

    public Fraction_reduce_5358591312635() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term861915 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term861915, term861915.getClass(), "numerator", -865074970);
        setIntField(term861915, term861915.getClass(), "denominator", 1304857541);
        term862019 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term862019, term862019.getClass(), "numerator", -865074970);
        setIntField(term862019, term862019.getClass(), "denominator", 1304857541);
        setField(term862019, term862019.getClass(), "toString", null);
        setField(term862019, term862019.getClass(), "toProperString", null);
        term862016 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term862016, term862016.getClass(), "numerator", -865074970);
        setIntField(term862016, term862016.getClass(), "denominator", 1304857541);
        setField(term862016, term862016.getClass(), "toString", null);
        setField(term862016, term862016.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term861915, args);
        assertTrue(recursiveEquals(term861915, term862019));
        assertTrue(recursiveEquals(retValue, term862016));
    }

};


