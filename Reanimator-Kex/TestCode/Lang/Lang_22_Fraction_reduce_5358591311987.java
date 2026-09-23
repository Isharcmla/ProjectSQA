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

public class Fraction_reduce_5358591311987 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term648794;
     Object term649004;
     Object term649001;

    public Fraction_reduce_5358591311987() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term648794 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term648794, term648794.getClass(), "numerator", 1696427046);
        setIntField(term648794, term648794.getClass(), "denominator", 961549819);
        term649004 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term649004, term649004.getClass(), "numerator", 1696427046);
        setIntField(term649004, term649004.getClass(), "denominator", 961549819);
        setField(term649004, term649004.getClass(), "toString", null);
        setField(term649004, term649004.getClass(), "toProperString", null);
        term649001 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term649001, term649001.getClass(), "numerator", 1696427046);
        setIntField(term649001, term649001.getClass(), "denominator", 961549819);
        setField(term649001, term649001.getClass(), "toString", null);
        setField(term649001, term649001.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term648794, args);
        assertTrue(recursiveEquals(term648794, term649004));
        assertTrue(recursiveEquals(retValue, term649001));
    }

};


