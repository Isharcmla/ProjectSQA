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

public class Fraction_reduce_335503525775 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term215985;
     Object term217046;
     Object term217043;

    public Fraction_reduce_335503525775() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term215985 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term215985, term215985.getClass(), "numerator", 2);
        setIntField(term215985, term215985.getClass(), "denominator", 268435449);
        term217046 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term217046, term217046.getClass(), "numerator", 2);
        setIntField(term217046, term217046.getClass(), "denominator", 268435449);
        setField(term217046, term217046.getClass(), "toString", null);
        setField(term217046, term217046.getClass(), "toProperString", null);
        term217043 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term217043, term217043.getClass(), "numerator", 2);
        setIntField(term217043, term217043.getClass(), "denominator", 268435449);
        setField(term217043, term217043.getClass(), "toString", null);
        setField(term217043, term217043.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term215985, args);
        assertTrue(recursiveEquals(term215985, term217046));
        assertTrue(recursiveEquals(retValue, term217043));
    }

};


