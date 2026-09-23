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

public class Fraction_reduce_335503525180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41279;
     Object term42424;
     Object term42421;

    public Fraction_reduce_335503525180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41279 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term41279, term41279.getClass(), "numerator", -1551493034);
        setIntField(term41279, term41279.getClass(), "denominator", 1209770189);
        term42424 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term42424, term42424.getClass(), "numerator", -1551493034);
        setIntField(term42424, term42424.getClass(), "denominator", 1209770189);
        setField(term42424, term42424.getClass(), "toString", null);
        setField(term42424, term42424.getClass(), "toProperString", null);
        term42421 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term42421, term42421.getClass(), "numerator", -1551493034);
        setIntField(term42421, term42421.getClass(), "denominator", 1209770189);
        setField(term42421, term42421.getClass(), "toString", null);
        setField(term42421, term42421.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term41279, args);
        assertTrue(recursiveEquals(term41279, term42424));
        assertTrue(recursiveEquals(retValue, term42421));
    }

};


