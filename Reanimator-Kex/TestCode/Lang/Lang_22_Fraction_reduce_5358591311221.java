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

public class Fraction_reduce_5358591311221 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term396348;
     Object term396945;
     Object term396942;

    public Fraction_reduce_5358591311221() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term396348 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term396348, term396348.getClass(), "numerator", -1926212914);
        setIntField(term396348, term396348.getClass(), "denominator", 1778396369);
        term396945 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term396945, term396945.getClass(), "numerator", -1926212914);
        setIntField(term396945, term396945.getClass(), "denominator", 1778396369);
        setField(term396945, term396945.getClass(), "toString", null);
        setField(term396945, term396945.getClass(), "toProperString", null);
        term396942 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term396942, term396942.getClass(), "numerator", -1926212914);
        setIntField(term396942, term396942.getClass(), "denominator", 1778396369);
        setField(term396942, term396942.getClass(), "toString", null);
        setField(term396942, term396942.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term396348, args);
        assertTrue(recursiveEquals(term396348, term396945));
        assertTrue(recursiveEquals(retValue, term396942));
    }

};


