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

public class Fraction_reduce_335503525980 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term281554;
     Object term282161;
     Object term282155;

    public Fraction_reduce_335503525980() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term281554 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term281554, term281554.getClass(), "numerator", 1601957630);
        setIntField(term281554, term281554.getClass(), "denominator", 2113400295);
        term282161 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term282161, term282161.getClass(), "numerator", 1601957630);
        setIntField(term282161, term282161.getClass(), "denominator", 2113400295);
        setField(term282161, term282161.getClass(), "toString", null);
        setField(term282161, term282161.getClass(), "toProperString", null);
        term282155 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term282155, term282155.getClass(), "numerator", 320391526);
        setIntField(term282155, term282155.getClass(), "denominator", 422680059);
        setField(term282155, term282155.getClass(), "toString", null);
        setField(term282155, term282155.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term281554, args);
        assertTrue(recursiveEquals(term281554, term282161));
        assertTrue(recursiveEquals(retValue, term282155));
    }

};


