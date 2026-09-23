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

public class Fraction_reduce_3355035251560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term458454;
     Object term459006;
     Object term459003;

    public Fraction_reduce_3355035251560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term458454 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term458454, term458454.getClass(), "numerator", 1595157226);
        setIntField(term458454, term458454.getClass(), "denominator", 1081537133);
        term459006 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term459006, term459006.getClass(), "numerator", 1595157226);
        setIntField(term459006, term459006.getClass(), "denominator", 1081537133);
        setField(term459006, term459006.getClass(), "toString", null);
        setField(term459006, term459006.getClass(), "toProperString", null);
        term459003 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term459003, term459003.getClass(), "numerator", 1595157226);
        setIntField(term459003, term459003.getClass(), "denominator", 1081537133);
        setField(term459003, term459003.getClass(), "toString", null);
        setField(term459003, term459003.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term458454, args);
        assertTrue(recursiveEquals(term458454, term459006));
        assertTrue(recursiveEquals(retValue, term459003));
    }

};


