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

public class Fraction_reduce_3355035252778 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term830161;
     Object term830492;
     Object term830486;

    public Fraction_reduce_3355035252778() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term830161 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term830161, term830161.getClass(), "numerator", 495771826);
        setIntField(term830161, term830161.getClass(), "denominator", 1885743233);
        term830492 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term830492, term830492.getClass(), "numerator", 495771826);
        setIntField(term830492, term830492.getClass(), "denominator", 1885743233);
        setField(term830492, term830492.getClass(), "toString", null);
        setField(term830492, term830492.getClass(), "toProperString", null);
        term830486 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term830486, term830486.getClass(), "numerator", 45070166);
        setIntField(term830486, term830486.getClass(), "denominator", 171431203);
        setField(term830486, term830486.getClass(), "toString", null);
        setField(term830486, term830486.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term830161, args);
        assertTrue(recursiveEquals(term830161, term830492));
        assertTrue(recursiveEquals(retValue, term830486));
    }

};


