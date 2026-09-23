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

public class Fraction_reduce_5358591311588 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term516751;
     Object term517542;
     Object term517539;

    public Fraction_reduce_5358591311588() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term516751 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term516751, term516751.getClass(), "numerator", -2147477638);
        setIntField(term516751, term516751.getClass(), "denominator", 1194081563);
        term517542 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term517542, term517542.getClass(), "numerator", -2147477638);
        setIntField(term517542, term517542.getClass(), "denominator", 1194081563);
        setField(term517542, term517542.getClass(), "toString", null);
        setField(term517542, term517542.getClass(), "toProperString", null);
        term517539 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term517539, term517539.getClass(), "numerator", -2147477638);
        setIntField(term517539, term517539.getClass(), "denominator", 1194081563);
        setField(term517539, term517539.getClass(), "toString", null);
        setField(term517539, term517539.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term516751, args);
        assertTrue(recursiveEquals(term516751, term517542));
        assertTrue(recursiveEquals(retValue, term517539));
    }

};


