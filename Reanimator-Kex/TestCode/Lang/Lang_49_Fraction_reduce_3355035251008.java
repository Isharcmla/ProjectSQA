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

public class Fraction_reduce_3355035251008 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term290186;
     Object term290489;
     Object term290486;

    public Fraction_reduce_3355035251008() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term290186 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term290186, term290186.getClass(), "numerator", 337641826);
        setIntField(term290186, term290186.getClass(), "denominator", 1712323753);
        term290489 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term290489, term290489.getClass(), "numerator", 337641826);
        setIntField(term290489, term290489.getClass(), "denominator", 1712323753);
        setField(term290489, term290489.getClass(), "toString", null);
        setField(term290489, term290489.getClass(), "toProperString", null);
        term290486 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term290486, term290486.getClass(), "numerator", 337641826);
        setIntField(term290486, term290486.getClass(), "denominator", 1712323753);
        setField(term290486, term290486.getClass(), "toString", null);
        setField(term290486, term290486.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term290186, args);
        assertTrue(recursiveEquals(term290186, term290489));
        assertTrue(recursiveEquals(retValue, term290486));
    }

};


