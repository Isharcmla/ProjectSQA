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

public class Fraction_reduce_3355035251548 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term455133;
     Object term455903;
     Object term455900;

    public Fraction_reduce_3355035251548() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term455133 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term455133, term455133.getClass(), "numerator", -1521250894);
        setIntField(term455133, term455133.getClass(), "denominator", 760363239);
        term455903 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term455903, term455903.getClass(), "numerator", -1521250894);
        setIntField(term455903, term455903.getClass(), "denominator", 760363239);
        setField(term455903, term455903.getClass(), "toString", null);
        setField(term455903, term455903.getClass(), "toProperString", null);
        term455900 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term455900, term455900.getClass(), "numerator", -1521250894);
        setIntField(term455900, term455900.getClass(), "denominator", 760363239);
        setField(term455900, term455900.getClass(), "toString", null);
        setField(term455900, term455900.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term455133, args);
        assertTrue(recursiveEquals(term455133, term455903));
        assertTrue(recursiveEquals(retValue, term455900));
    }

};


