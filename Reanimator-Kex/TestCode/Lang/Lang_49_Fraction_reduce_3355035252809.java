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

public class Fraction_reduce_3355035252809 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term839704;
     Object term840200;
     Object term840194;

    public Fraction_reduce_3355035252809() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term839704 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term839704, term839704.getClass(), "numerator", 67614);
        setIntField(term839704, term839704.getClass(), "denominator", 2147450343);
        term840200 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term840200, term840200.getClass(), "numerator", 67614);
        setIntField(term840200, term840200.getClass(), "denominator", 2147450343);
        setField(term840200, term840200.getClass(), "toString", null);
        setField(term840200, term840200.getClass(), "toProperString", null);
        term840194 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term840194, term840194.getClass(), "numerator", 22538);
        setIntField(term840194, term840194.getClass(), "denominator", 715816781);
        setField(term840194, term840194.getClass(), "toString", null);
        setField(term840194, term840194.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term839704, args);
        assertTrue(recursiveEquals(term839704, term840200));
        assertTrue(recursiveEquals(retValue, term840194));
    }

};


