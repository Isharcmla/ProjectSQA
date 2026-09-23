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

public class Fraction_reduce_3355035252588 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term772000;
     Object term772381;
     Object term772378;

    public Fraction_reduce_3355035252588() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term772000 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term772000, term772000.getClass(), "numerator", 1045062122);
        setIntField(term772000, term772000.getClass(), "denominator", 1612845661);
        term772381 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term772381, term772381.getClass(), "numerator", 1045062122);
        setIntField(term772381, term772381.getClass(), "denominator", 1612845661);
        setField(term772381, term772381.getClass(), "toString", null);
        setField(term772381, term772381.getClass(), "toProperString", null);
        term772378 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term772378, term772378.getClass(), "numerator", 1045062122);
        setIntField(term772378, term772378.getClass(), "denominator", 1612845661);
        setField(term772378, term772378.getClass(), "toString", null);
        setField(term772378, term772378.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term772000, args);
        assertTrue(recursiveEquals(term772000, term772381));
        assertTrue(recursiveEquals(retValue, term772378));
    }

};


