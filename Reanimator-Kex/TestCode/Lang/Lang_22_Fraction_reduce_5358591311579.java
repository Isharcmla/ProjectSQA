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

public class Fraction_reduce_5358591311579 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term514595;
     Object term515106;
     Object term515100;

    public Fraction_reduce_5358591311579() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term514595 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term514595, term514595.getClass(), "numerator", 1080037378);
        setIntField(term514595, term514595.getClass(), "denominator", 1879048185);
        term515106 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term515106, term515106.getClass(), "numerator", 1080037378);
        setIntField(term515106, term515106.getClass(), "denominator", 1879048185);
        setField(term515106, term515106.getClass(), "toString", null);
        setField(term515106, term515106.getClass(), "toProperString", null);
        term515100 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term515100, term515100.getClass(), "numerator", 154291054);
        setIntField(term515100, term515100.getClass(), "denominator", 268435455);
        setField(term515100, term515100.getClass(), "toString", null);
        setField(term515100, term515100.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term514595, args);
        assertTrue(recursiveEquals(term514595, term515106));
        assertTrue(recursiveEquals(retValue, term515100));
    }

};


