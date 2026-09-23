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

public class Fraction_reduce_3355035251957 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term574430;
     Object term574612;
     Object term574606;

    public Fraction_reduce_3355035251957() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term574430 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term574430, term574430.getClass(), "numerator", -1584593582);
        setIntField(term574430, term574430.getClass(), "denominator", 2493595);
        term574612 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term574612, term574612.getClass(), "numerator", -1584593582);
        setIntField(term574612, term574612.getClass(), "denominator", 2493595);
        setField(term574612, term574612.getClass(), "toString", null);
        setField(term574612, term574612.getClass(), "toProperString", null);
        term574606 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term574606, term574606.getClass(), "numerator", -121891814);
        setIntField(term574606, term574606.getClass(), "denominator", 191815);
        setField(term574606, term574606.getClass(), "toString", null);
        setField(term574606, term574606.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term574430, args);
        assertTrue(recursiveEquals(term574430, term574612));
        assertTrue(recursiveEquals(retValue, term574606));
    }

};


