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

public class Fraction_reduce_3355035252328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term689527;
     Object term690033;
     Object term690030;

    public Fraction_reduce_3355035252328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term689527 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term689527, term689527.getClass(), "numerator", 8458378);
        setIntField(term689527, term689527.getClass(), "denominator", 4219961);
        term690033 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term690033, term690033.getClass(), "numerator", 8458378);
        setIntField(term690033, term690033.getClass(), "denominator", 4219961);
        setField(term690033, term690033.getClass(), "toString", null);
        setField(term690033, term690033.getClass(), "toProperString", null);
        term690030 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term690030, term690030.getClass(), "numerator", 8458378);
        setIntField(term690030, term690030.getClass(), "denominator", 4219961);
        setField(term690030, term690030.getClass(), "toString", null);
        setField(term690030, term690030.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term689527, args);
        assertTrue(recursiveEquals(term689527, term690033));
        assertTrue(recursiveEquals(retValue, term690030));
    }

};


