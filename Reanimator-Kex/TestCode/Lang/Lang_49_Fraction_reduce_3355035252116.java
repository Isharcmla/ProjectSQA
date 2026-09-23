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

public class Fraction_reduce_3355035252116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term622635;
     Object term623164;
     Object term623158;

    public Fraction_reduce_3355035252116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term622635 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term622635, term622635.getClass(), "numerator", 2000602002);
        setIntField(term622635, term622635.getClass(), "denominator", 1209011217);
        term623164 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term623164, term623164.getClass(), "numerator", 2000602002);
        setIntField(term623164, term623164.getClass(), "denominator", 1209011217);
        setField(term623164, term623164.getClass(), "toString", null);
        setField(term623164, term623164.getClass(), "toProperString", null);
        term623158 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term623158, term623158.getClass(), "numerator", 666867334);
        setIntField(term623158, term623158.getClass(), "denominator", 403003739);
        setField(term623158, term623158.getClass(), "toString", null);
        setField(term623158, term623158.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term622635, args);
        assertTrue(recursiveEquals(term622635, term623164));
        assertTrue(recursiveEquals(retValue, term623158));
    }

};


