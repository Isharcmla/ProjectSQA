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

public class Fraction_reduce_3355035251710 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term501445;
     Object term501994;
     Object term501991;

    public Fraction_reduce_3355035251710() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term501445 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term501445, term501445.getClass(), "numerator", 1454305762);
        setIntField(term501445, term501445.getClass(), "denominator", 2139543801);
        term501994 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term501994, term501994.getClass(), "numerator", 1454305762);
        setIntField(term501994, term501994.getClass(), "denominator", 2139543801);
        setField(term501994, term501994.getClass(), "toString", null);
        setField(term501994, term501994.getClass(), "toProperString", null);
        term501991 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term501991, term501991.getClass(), "numerator", 1454305762);
        setIntField(term501991, term501991.getClass(), "denominator", 2139543801);
        setField(term501991, term501991.getClass(), "toString", null);
        setField(term501991, term501991.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term501445, args);
        assertTrue(recursiveEquals(term501445, term501994));
        assertTrue(recursiveEquals(retValue, term501991));
    }

};


