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

public class Fraction_reduce_5358591311413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term460673;
     Object term461410;
     Object term461407;

    public Fraction_reduce_5358591311413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term460673 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term460673, term460673.getClass(), "numerator", 1782516826);
        setIntField(term460673, term460673.getClass(), "denominator", 1356873733);
        term461410 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term461410, term461410.getClass(), "numerator", 1782516826);
        setIntField(term461410, term461410.getClass(), "denominator", 1356873733);
        setField(term461410, term461410.getClass(), "toString", null);
        setField(term461410, term461410.getClass(), "toProperString", null);
        term461407 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term461407, term461407.getClass(), "numerator", 1782516826);
        setIntField(term461407, term461407.getClass(), "denominator", 1356873733);
        setField(term461407, term461407.getClass(), "toString", null);
        setField(term461407, term461407.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term460673, args);
        assertTrue(recursiveEquals(term460673, term461410));
        assertTrue(recursiveEquals(retValue, term461407));
    }

};


