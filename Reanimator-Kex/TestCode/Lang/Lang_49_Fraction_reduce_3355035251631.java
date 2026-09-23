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

public class Fraction_reduce_3355035251631 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term478475;
     Object term478974;
     Object term478971;

    public Fraction_reduce_3355035251631() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term478475 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term478475, term478475.getClass(), "numerator", 738342018);
        setIntField(term478475, term478475.getClass(), "denominator", 587299273);
        term478974 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term478974, term478974.getClass(), "numerator", 738342018);
        setIntField(term478974, term478974.getClass(), "denominator", 587299273);
        setField(term478974, term478974.getClass(), "toString", null);
        setField(term478974, term478974.getClass(), "toProperString", null);
        term478971 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term478971, term478971.getClass(), "numerator", 738342018);
        setIntField(term478971, term478971.getClass(), "denominator", 587299273);
        setField(term478971, term478971.getClass(), "toString", null);
        setField(term478971, term478971.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term478475, args);
        assertTrue(recursiveEquals(term478475, term478974));
        assertTrue(recursiveEquals(retValue, term478971));
    }

};


