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

public class Fraction_reduce_335503525544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term150029;
     Object term150681;
     Object term150678;

    public Fraction_reduce_335503525544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term150029 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term150029, term150029.getClass(), "numerator", -1923681890);
        setIntField(term150029, term150029.getClass(), "denominator", 786567497);
        term150681 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term150681, term150681.getClass(), "numerator", -1923681890);
        setIntField(term150681, term150681.getClass(), "denominator", 786567497);
        setField(term150681, term150681.getClass(), "toString", null);
        setField(term150681, term150681.getClass(), "toProperString", null);
        term150678 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term150678, term150678.getClass(), "numerator", -1923681890);
        setIntField(term150678, term150678.getClass(), "denominator", 786567497);
        setField(term150678, term150678.getClass(), "toString", null);
        setField(term150678, term150678.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term150029, args);
        assertTrue(recursiveEquals(term150029, term150681));
        assertTrue(recursiveEquals(retValue, term150678));
    }

};


