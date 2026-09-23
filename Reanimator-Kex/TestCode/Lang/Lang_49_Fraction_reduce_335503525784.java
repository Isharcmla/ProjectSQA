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

public class Fraction_reduce_335503525784 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219251;
     Object term220086;
     Object term220083;

    public Fraction_reduce_335503525784() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term219251 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term219251, term219251.getClass(), "numerator", 302);
        setIntField(term219251, term219251.getClass(), "denominator", 1962933759);
        term220086 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term220086, term220086.getClass(), "numerator", 302);
        setIntField(term220086, term220086.getClass(), "denominator", 1962933759);
        setField(term220086, term220086.getClass(), "toString", null);
        setField(term220086, term220086.getClass(), "toProperString", null);
        term220083 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term220083, term220083.getClass(), "numerator", 302);
        setIntField(term220083, term220083.getClass(), "denominator", 1962933759);
        setField(term220083, term220083.getClass(), "toString", null);
        setField(term220083, term220083.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term219251, args);
        assertTrue(recursiveEquals(term219251, term220086));
        assertTrue(recursiveEquals(retValue, term220083));
    }

};


