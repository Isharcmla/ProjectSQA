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

public class Fraction_reduce_5358591311548 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term503284;
     Object term504169;
     Object term504166;

    public Fraction_reduce_5358591311548() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term503284 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term503284, term503284.getClass(), "numerator", -536061934);
        setIntField(term503284, term503284.getClass(), "denominator", 655080959);
        term504169 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term504169, term504169.getClass(), "numerator", -536061934);
        setIntField(term504169, term504169.getClass(), "denominator", 655080959);
        setField(term504169, term504169.getClass(), "toString", null);
        setField(term504169, term504169.getClass(), "toProperString", null);
        term504166 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term504166, term504166.getClass(), "numerator", -536061934);
        setIntField(term504166, term504166.getClass(), "denominator", 655080959);
        setField(term504166, term504166.getClass(), "toString", null);
        setField(term504166, term504166.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term503284, args);
        assertTrue(recursiveEquals(term503284, term504169));
        assertTrue(recursiveEquals(retValue, term504166));
    }

};


