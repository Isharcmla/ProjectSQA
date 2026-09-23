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

public class Fraction_reduce_3355035252379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term704973;
     Object term705477;
     Object term705474;

    public Fraction_reduce_3355035252379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term704973 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term704973, term704973.getClass(), "numerator", 553697282);
        setIntField(term704973, term704973.getClass(), "denominator", 2139119609);
        term705477 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term705477, term705477.getClass(), "numerator", 553697282);
        setIntField(term705477, term705477.getClass(), "denominator", 2139119609);
        setField(term705477, term705477.getClass(), "toString", null);
        setField(term705477, term705477.getClass(), "toProperString", null);
        term705474 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term705474, term705474.getClass(), "numerator", 553697282);
        setIntField(term705474, term705474.getClass(), "denominator", 2139119609);
        setField(term705474, term705474.getClass(), "toString", null);
        setField(term705474, term705474.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term704973, args);
        assertTrue(recursiveEquals(term704973, term705477));
        assertTrue(recursiveEquals(retValue, term705474));
    }

};


