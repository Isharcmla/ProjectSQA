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

public class Fraction_reduce_3355035252118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term623052;
     Object term623778;
     Object term623772;

    public Fraction_reduce_3355035252118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term623052 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term623052, term623052.getClass(), "numerator", 243420114);
        setIntField(term623052, term623052.getClass(), "denominator", 193013009);
        term623778 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term623778, term623778.getClass(), "numerator", 243420114);
        setIntField(term623778, term623778.getClass(), "denominator", 193013009);
        setField(term623778, term623778.getClass(), "toString", null);
        setField(term623778, term623778.getClass(), "toProperString", null);
        term623772 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term623772, term623772.getClass(), "numerator", 34774302);
        setIntField(term623772, term623772.getClass(), "denominator", 27573287);
        setField(term623772, term623772.getClass(), "toString", null);
        setField(term623772, term623772.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term623052, args);
        assertTrue(recursiveEquals(term623052, term623778));
        assertTrue(recursiveEquals(retValue, term623772));
    }

};


