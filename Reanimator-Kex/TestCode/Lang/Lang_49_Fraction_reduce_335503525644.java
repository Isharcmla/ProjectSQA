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

public class Fraction_reduce_335503525644 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term179070;
     Object term179755;
     Object term179752;

    public Fraction_reduce_335503525644() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term179070 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term179070, term179070.getClass(), "numerator", 515805314);
        setIntField(term179070, term179070.getClass(), "denominator", 1097417113);
        term179755 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term179755, term179755.getClass(), "numerator", 515805314);
        setIntField(term179755, term179755.getClass(), "denominator", 1097417113);
        setField(term179755, term179755.getClass(), "toString", null);
        setField(term179755, term179755.getClass(), "toProperString", null);
        term179752 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term179752, term179752.getClass(), "numerator", 515805314);
        setIntField(term179752, term179752.getClass(), "denominator", 1097417113);
        setField(term179752, term179752.getClass(), "toString", null);
        setField(term179752, term179752.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term179070, args);
        assertTrue(recursiveEquals(term179070, term179755));
        assertTrue(recursiveEquals(retValue, term179752));
    }

};


