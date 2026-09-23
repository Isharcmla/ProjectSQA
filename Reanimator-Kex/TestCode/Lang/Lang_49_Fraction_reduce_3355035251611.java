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

public class Fraction_reduce_3355035251611 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term473036;
     Object term473892;
     Object term473886;

    public Fraction_reduce_3355035251611() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term473036 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term473036, term473036.getClass(), "numerator", -1868664402);
        setIntField(term473036, term473036.getClass(), "denominator", 1888951361);
        term473892 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term473892, term473892.getClass(), "numerator", -1868664402);
        setIntField(term473892, term473892.getClass(), "denominator", 1888951361);
        setField(term473892, term473892.getClass(), "toString", null);
        setField(term473892, term473892.getClass(), "toProperString", null);
        term473886 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term473886, term473886.getClass(), "numerator", -169878582);
        setIntField(term473886, term473886.getClass(), "denominator", 171722851);
        setField(term473886, term473886.getClass(), "toString", null);
        setField(term473886, term473886.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term473036, args);
        assertTrue(recursiveEquals(term473036, term473892));
        assertTrue(recursiveEquals(retValue, term473886));
    }

};


