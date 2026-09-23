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

public class Fraction_reduce_335503525911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term260438;
     Object term260646;
     Object term260643;

    public Fraction_reduce_335503525911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term260438 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term260438, term260438.getClass(), "numerator", 1476395058);
        setIntField(term260438, term260438.getClass(), "denominator", 1073741857);
        term260646 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term260646, term260646.getClass(), "numerator", 1476395058);
        setIntField(term260646, term260646.getClass(), "denominator", 1073741857);
        setField(term260646, term260646.getClass(), "toString", null);
        setField(term260646, term260646.getClass(), "toProperString", null);
        term260643 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term260643, term260643.getClass(), "numerator", 1476395058);
        setIntField(term260643, term260643.getClass(), "denominator", 1073741857);
        setField(term260643, term260643.getClass(), "toString", null);
        setField(term260643, term260643.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term260438, args);
        assertTrue(recursiveEquals(term260438, term260646));
        assertTrue(recursiveEquals(retValue, term260643));
    }

};


