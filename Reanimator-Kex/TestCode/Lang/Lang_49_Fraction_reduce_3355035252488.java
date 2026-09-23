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

public class Fraction_reduce_3355035252488 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term740643;
     Object term741190;
     Object term741187;

    public Fraction_reduce_3355035252488() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term740643 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term740643, term740643.getClass(), "numerator", -445113130);
        setIntField(term740643, term740643.getClass(), "denominator", 1939898637);
        term741190 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term741190, term741190.getClass(), "numerator", -445113130);
        setIntField(term741190, term741190.getClass(), "denominator", 1939898637);
        setField(term741190, term741190.getClass(), "toString", null);
        setField(term741190, term741190.getClass(), "toProperString", null);
        term741187 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term741187, term741187.getClass(), "numerator", -445113130);
        setIntField(term741187, term741187.getClass(), "denominator", 1939898637);
        setField(term741187, term741187.getClass(), "toString", null);
        setField(term741187, term741187.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term740643, args);
        assertTrue(recursiveEquals(term740643, term741190));
        assertTrue(recursiveEquals(retValue, term741187));
    }

};


