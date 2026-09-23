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

public class Fraction_reduce_3355035251322 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term386435;
     Object term387087;
     Object term387081;

    public Fraction_reduce_3355035251322() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term386435 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term386435, term386435.getClass(), "numerator", 51696650);
        setIntField(term386435, term386435.getClass(), "denominator", 2059254765);
        term387087 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term387087, term387087.getClass(), "numerator", 51696650);
        setIntField(term387087, term387087.getClass(), "denominator", 2059254765);
        setField(term387087, term387087.getClass(), "toString", null);
        setField(term387087, term387087.getClass(), "toProperString", null);
        term387081 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term387081, term387081.getClass(), "numerator", 10339330);
        setIntField(term387081, term387081.getClass(), "denominator", 411850953);
        setField(term387081, term387081.getClass(), "toString", null);
        setField(term387081, term387081.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term386435, args);
        assertTrue(recursiveEquals(term386435, term387087));
        assertTrue(recursiveEquals(retValue, term387081));
    }

};


