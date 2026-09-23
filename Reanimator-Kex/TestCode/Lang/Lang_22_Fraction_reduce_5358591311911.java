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

public class Fraction_reduce_5358591311911 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term623064;
     Object term623917;
     Object term623911;

    public Fraction_reduce_5358591311911() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term623064 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term623064, term623064.getClass(), "numerator", 537389890);
        setIntField(term623064, term623064.getClass(), "denominator", 1212678153);
        term623917 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term623917, term623917.getClass(), "numerator", 537389890);
        setIntField(term623917, term623917.getClass(), "denominator", 1212678153);
        setField(term623917, term623917.getClass(), "toString", null);
        setField(term623917, term623917.getClass(), "toProperString", null);
        term623911 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term623911, term623911.getClass(), "numerator", 31611170);
        setIntField(term623911, term623911.getClass(), "denominator", 71334009);
        setField(term623911, term623911.getClass(), "toString", null);
        setField(term623911, term623911.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term623064, args);
        assertTrue(recursiveEquals(term623064, term623917));
        assertTrue(recursiveEquals(retValue, term623911));
    }

};


