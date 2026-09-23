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

public class Fraction_reduce_335503525404 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110237;
     Object term110826;
     Object term110823;

    public Fraction_reduce_335503525404() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term110237 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term110237, term110237.getClass(), "numerator", -1935813122);
        setIntField(term110237, term110237.getClass(), "denominator", 644626625);
        term110826 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term110826, term110826.getClass(), "numerator", -1935813122);
        setIntField(term110826, term110826.getClass(), "denominator", 644626625);
        setField(term110826, term110826.getClass(), "toString", null);
        setField(term110826, term110826.getClass(), "toProperString", null);
        term110823 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term110823, term110823.getClass(), "numerator", -1935813122);
        setIntField(term110823, term110823.getClass(), "denominator", 644626625);
        setField(term110823, term110823.getClass(), "toString", null);
        setField(term110823, term110823.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term110237, args);
        assertTrue(recursiveEquals(term110237, term110826));
        assertTrue(recursiveEquals(retValue, term110823));
    }

};


