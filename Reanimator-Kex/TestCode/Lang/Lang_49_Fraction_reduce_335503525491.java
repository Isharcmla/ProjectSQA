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

public class Fraction_reduce_335503525491 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term135482;
     Object term135688;
     Object term135685;

    public Fraction_reduce_335503525491() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term135482 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term135482, term135482.getClass(), "numerator", 338205810);
        setIntField(term135482, term135482.getClass(), "denominator", 739901729);
        term135688 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term135688, term135688.getClass(), "numerator", 338205810);
        setIntField(term135688, term135688.getClass(), "denominator", 739901729);
        setField(term135688, term135688.getClass(), "toString", null);
        setField(term135688, term135688.getClass(), "toProperString", null);
        term135685 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term135685, term135685.getClass(), "numerator", 338205810);
        setIntField(term135685, term135685.getClass(), "denominator", 739901729);
        setField(term135685, term135685.getClass(), "toString", null);
        setField(term135685, term135685.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term135482, args);
        assertTrue(recursiveEquals(term135482, term135688));
        assertTrue(recursiveEquals(retValue, term135685));
    }

};


