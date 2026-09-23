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

public class Fraction_reduce_335503525545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150575;
     Object term150772;
     Object term150769;

    public Fraction_reduce_335503525545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150575 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term150575, term150575.getClass(), "numerator", 939737894);
        setIntField(term150575, term150575.getClass(), "denominator", 268409211);
        term150772 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term150772, term150772.getClass(), "numerator", 939737894);
        setIntField(term150772, term150772.getClass(), "denominator", 268409211);
        setField(term150772, term150772.getClass(), "toString", null);
        setField(term150772, term150772.getClass(), "toProperString", null);
        term150769 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term150769, term150769.getClass(), "numerator", 939737894);
        setIntField(term150769, term150769.getClass(), "denominator", 268409211);
        setField(term150769, term150769.getClass(), "toString", null);
        setField(term150769, term150769.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term150575, args);
        assertTrue(recursiveEquals(term150575, term150772));
        assertTrue(recursiveEquals(retValue, term150769));
    }

};


