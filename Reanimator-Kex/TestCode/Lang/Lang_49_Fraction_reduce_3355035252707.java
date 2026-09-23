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

public class Fraction_reduce_3355035252707 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term807792;
     Object term807989;
     Object term807986;

    public Fraction_reduce_3355035252707() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term807792 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term807792, term807792.getClass(), "numerator", 536879122);
        setIntField(term807792, term807792.getClass(), "denominator", 268365569);
        term807989 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term807989, term807989.getClass(), "numerator", 536879122);
        setIntField(term807989, term807989.getClass(), "denominator", 268365569);
        setField(term807989, term807989.getClass(), "toString", null);
        setField(term807989, term807989.getClass(), "toProperString", null);
        term807986 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term807986, term807986.getClass(), "numerator", 536879122);
        setIntField(term807986, term807986.getClass(), "denominator", 268365569);
        setField(term807986, term807986.getClass(), "toString", null);
        setField(term807986, term807986.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term807792, args);
        assertTrue(recursiveEquals(term807792, term807989));
        assertTrue(recursiveEquals(retValue, term807986));
    }

};


