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

public class Fraction_reduce_335503525867 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term245290;
     Object term246190;
     Object term246187;

    public Fraction_reduce_335503525867() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term245290 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term245290, term245290.getClass(), "numerator", -177668086);
        setIntField(term245290, term245290.getClass(), "denominator", 1701608693);
        term246190 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term246190, term246190.getClass(), "numerator", -177668086);
        setIntField(term246190, term246190.getClass(), "denominator", 1701608693);
        setField(term246190, term246190.getClass(), "toString", null);
        setField(term246190, term246190.getClass(), "toProperString", null);
        term246187 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term246187, term246187.getClass(), "numerator", -177668086);
        setIntField(term246187, term246187.getClass(), "denominator", 1701608693);
        setField(term246187, term246187.getClass(), "toString", null);
        setField(term246187, term246187.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term245290, args);
        assertTrue(recursiveEquals(term245290, term246190));
        assertTrue(recursiveEquals(retValue, term246187));
    }

};


