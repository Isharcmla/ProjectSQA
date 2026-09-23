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

public class Fraction_reduce_3355035252590 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term772275;
     Object term772956;
     Object term772953;

    public Fraction_reduce_3355035252590() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term772275 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term772275, term772275.getClass(), "numerator", 272118178);
        setIntField(term772275, term772275.getClass(), "denominator", 1954733545);
        term772956 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term772956, term772956.getClass(), "numerator", 272118178);
        setIntField(term772956, term772956.getClass(), "denominator", 1954733545);
        setField(term772956, term772956.getClass(), "toString", null);
        setField(term772956, term772956.getClass(), "toProperString", null);
        term772953 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term772953, term772953.getClass(), "numerator", 272118178);
        setIntField(term772953, term772953.getClass(), "denominator", 1954733545);
        setField(term772953, term772953.getClass(), "toString", null);
        setField(term772953, term772953.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term772275, args);
        assertTrue(recursiveEquals(term772275, term772956));
        assertTrue(recursiveEquals(retValue, term772953));
    }

};


