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

public class Fraction_reduce_3355035252442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term726641;
     Object term727648;
     Object term727645;

    public Fraction_reduce_3355035252442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term726641 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term726641, term726641.getClass(), "numerator", 42922114);
        setIntField(term726641, term726641.getClass(), "denominator", 2136705561);
        term727648 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term727648, term727648.getClass(), "numerator", 42922114);
        setIntField(term727648, term727648.getClass(), "denominator", 2136705561);
        setField(term727648, term727648.getClass(), "toString", null);
        setField(term727648, term727648.getClass(), "toProperString", null);
        term727645 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term727645, term727645.getClass(), "numerator", 42922114);
        setIntField(term727645, term727645.getClass(), "denominator", 2136705561);
        setField(term727645, term727645.getClass(), "toString", null);
        setField(term727645, term727645.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term726641, args);
        assertTrue(recursiveEquals(term726641, term727648));
        assertTrue(recursiveEquals(retValue, term727645));
    }

};


