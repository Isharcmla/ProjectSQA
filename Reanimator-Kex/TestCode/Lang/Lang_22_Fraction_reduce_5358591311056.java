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

public class Fraction_reduce_5358591311056 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term339867;
     Object term340283;
     Object term340280;

    public Fraction_reduce_5358591311056() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term339867 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term339867, term339867.getClass(), "numerator", -2147221454);
        setIntField(term339867, term339867.getClass(), "denominator", 1501596479);
        term340283 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term340283, term340283.getClass(), "numerator", -2147221454);
        setIntField(term340283, term340283.getClass(), "denominator", 1501596479);
        setField(term340283, term340283.getClass(), "toString", null);
        setField(term340283, term340283.getClass(), "toProperString", null);
        term340280 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term340280, term340280.getClass(), "numerator", -2147221454);
        setIntField(term340280, term340280.getClass(), "denominator", 1501596479);
        setField(term340280, term340280.getClass(), "toString", null);
        setField(term340280, term340280.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term339867, args);
        assertTrue(recursiveEquals(term339867, term340283));
        assertTrue(recursiveEquals(retValue, term340280));
    }

};


