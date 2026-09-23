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

public class Fraction_reduce_335503525672 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term186117;
     Object term186986;
     Object term186983;

    public Fraction_reduce_335503525672() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term186117 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term186117, term186117.getClass(), "numerator", 2105358);
        setIntField(term186117, term186117.getClass(), "denominator", 299235343);
        term186986 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term186986, term186986.getClass(), "numerator", 2105358);
        setIntField(term186986, term186986.getClass(), "denominator", 299235343);
        setField(term186986, term186986.getClass(), "toString", null);
        setField(term186986, term186986.getClass(), "toProperString", null);
        term186983 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term186983, term186983.getClass(), "numerator", 2105358);
        setIntField(term186983, term186983.getClass(), "denominator", 299235343);
        setField(term186983, term186983.getClass(), "toString", null);
        setField(term186983, term186983.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term186117, args);
        assertTrue(recursiveEquals(term186117, term186986));
        assertTrue(recursiveEquals(retValue, term186983));
    }

};


