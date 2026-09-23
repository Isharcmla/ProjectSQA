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

public class Fraction_reduce_3355035252009 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term590019;
     Object term590127;
     Object term590121;

    public Fraction_reduce_3355035252009() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term590019 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term590019, term590019.getClass(), "numerator", 1344514054);
        setIntField(term590019, term590019.getClass(), "denominator", 1892663499);
        term590127 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term590127, term590127.getClass(), "numerator", 1344514054);
        setIntField(term590127, term590127.getClass(), "denominator", 1892663499);
        setField(term590127, term590127.getClass(), "toString", null);
        setField(term590127, term590127.getClass(), "toProperString", null);
        term590121 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term590121, term590121.getClass(), "numerator", 79089062);
        setIntField(term590121, term590121.getClass(), "denominator", 111333147);
        setField(term590121, term590121.getClass(), "toString", null);
        setField(term590121, term590121.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term590019, args);
        assertTrue(recursiveEquals(term590019, term590127));
        assertTrue(recursiveEquals(retValue, term590121));
    }

};


