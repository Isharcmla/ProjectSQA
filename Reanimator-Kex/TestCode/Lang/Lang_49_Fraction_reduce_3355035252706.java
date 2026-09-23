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

public class Fraction_reduce_3355035252706 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term807104;
     Object term807901;
     Object term807898;

    public Fraction_reduce_3355035252706() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term807104 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term807104, term807104.getClass(), "numerator", 1522273198);
        setIntField(term807104, term807104.getClass(), "denominator", 1186865455);
        term807901 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term807901, term807901.getClass(), "numerator", 1522273198);
        setIntField(term807901, term807901.getClass(), "denominator", 1186865455);
        setField(term807901, term807901.getClass(), "toString", null);
        setField(term807901, term807901.getClass(), "toProperString", null);
        term807898 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term807898, term807898.getClass(), "numerator", 1522273198);
        setIntField(term807898, term807898.getClass(), "denominator", 1186865455);
        setField(term807898, term807898.getClass(), "toString", null);
        setField(term807898, term807898.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term807104, args);
        assertTrue(recursiveEquals(term807104, term807901));
        assertTrue(recursiveEquals(retValue, term807898));
    }

};


