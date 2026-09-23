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

public class Fraction_reduce_335503525210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49561;
     Object term50542;
     Object term50539;

    public Fraction_reduce_335503525210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49561 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term49561, term49561.getClass(), "numerator", 469762050);
        setIntField(term49561, term49561.getClass(), "denominator", 234881017);
        term50542 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term50542, term50542.getClass(), "numerator", 469762050);
        setIntField(term50542, term50542.getClass(), "denominator", 234881017);
        setField(term50542, term50542.getClass(), "toString", null);
        setField(term50542, term50542.getClass(), "toProperString", null);
        term50539 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term50539, term50539.getClass(), "numerator", 469762050);
        setIntField(term50539, term50539.getClass(), "denominator", 234881017);
        setField(term50539, term50539.getClass(), "toString", null);
        setField(term50539, term50539.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term49561, args);
        assertTrue(recursiveEquals(term49561, term50542));
        assertTrue(recursiveEquals(retValue, term50539));
    }

};


