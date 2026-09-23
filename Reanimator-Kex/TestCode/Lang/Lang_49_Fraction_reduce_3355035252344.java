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

public class Fraction_reduce_3355035252344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term694296;
     Object term694736;
     Object term694733;

    public Fraction_reduce_3355035252344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term694296 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term694296, term694296.getClass(), "numerator", 329335282);
        setIntField(term694296, term694296.getClass(), "denominator", 363134977);
        term694736 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term694736, term694736.getClass(), "numerator", 329335282);
        setIntField(term694736, term694736.getClass(), "denominator", 363134977);
        setField(term694736, term694736.getClass(), "toString", null);
        setField(term694736, term694736.getClass(), "toProperString", null);
        term694733 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term694733, term694733.getClass(), "numerator", 329335282);
        setIntField(term694733, term694733.getClass(), "denominator", 363134977);
        setField(term694733, term694733.getClass(), "toString", null);
        setField(term694733, term694733.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term694296, args);
        assertTrue(recursiveEquals(term694296, term694736));
        assertTrue(recursiveEquals(retValue, term694733));
    }

};


