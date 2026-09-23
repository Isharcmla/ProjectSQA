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

public class Fraction_reduce_3355035251818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term532621;
     Object term533115;
     Object term533112;

    public Fraction_reduce_3355035251818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term532621 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term532621, term532621.getClass(), "numerator", 419512322);
        setIntField(term532621, term532621.getClass(), "denominator", 2052087801);
        term533115 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term533115, term533115.getClass(), "numerator", 419512322);
        setIntField(term533115, term533115.getClass(), "denominator", 2052087801);
        setField(term533115, term533115.getClass(), "toString", null);
        setField(term533115, term533115.getClass(), "toProperString", null);
        term533112 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term533112, term533112.getClass(), "numerator", 419512322);
        setIntField(term533112, term533112.getClass(), "denominator", 2052087801);
        setField(term533112, term533112.getClass(), "toString", null);
        setField(term533112, term533112.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term532621, args);
        assertTrue(recursiveEquals(term532621, term533115));
        assertTrue(recursiveEquals(retValue, term533112));
    }

};


