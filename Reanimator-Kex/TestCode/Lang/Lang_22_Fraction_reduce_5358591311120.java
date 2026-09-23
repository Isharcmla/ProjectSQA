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

public class Fraction_reduce_5358591311120 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term360383;
     Object term360813;
     Object term360810;

    public Fraction_reduce_5358591311120() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term360383 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term360383, term360383.getClass(), "numerator", -1402142026);
        setIntField(term360383, term360383.getClass(), "denominator", 873010989);
        term360813 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term360813, term360813.getClass(), "numerator", -1402142026);
        setIntField(term360813, term360813.getClass(), "denominator", 873010989);
        setField(term360813, term360813.getClass(), "toString", null);
        setField(term360813, term360813.getClass(), "toProperString", null);
        term360810 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term360810, term360810.getClass(), "numerator", -1402142026);
        setIntField(term360810, term360810.getClass(), "denominator", 873010989);
        setField(term360810, term360810.getClass(), "toString", null);
        setField(term360810, term360810.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term360383, args);
        assertTrue(recursiveEquals(term360383, term360813));
        assertTrue(recursiveEquals(retValue, term360810));
    }

};


