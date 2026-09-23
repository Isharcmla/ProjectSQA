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

public class Fraction_reduce_335503525560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154476;
     Object term154903;
     Object term154900;

    public Fraction_reduce_335503525560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154476 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term154476, term154476.getClass(), "numerator", 151060586);
        setIntField(term154476, term154476.getClass(), "denominator", 1635811309);
        term154903 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term154903, term154903.getClass(), "numerator", 151060586);
        setIntField(term154903, term154903.getClass(), "denominator", 1635811309);
        setField(term154903, term154903.getClass(), "toString", null);
        setField(term154903, term154903.getClass(), "toProperString", null);
        term154900 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term154900, term154900.getClass(), "numerator", 151060586);
        setIntField(term154900, term154900.getClass(), "denominator", 1635811309);
        setField(term154900, term154900.getClass(), "toString", null);
        setField(term154900, term154900.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term154476, args);
        assertTrue(recursiveEquals(term154476, term154903));
        assertTrue(recursiveEquals(retValue, term154900));
    }

};


