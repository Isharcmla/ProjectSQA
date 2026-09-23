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

public class Fraction_reduce_335503525343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90824;
     Object term90931;
     Object term90928;

    public Fraction_reduce_335503525343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90824 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term90824, term90824.getClass(), "numerator", -985597870);
        setIntField(term90824, term90824.getClass(), "denominator", 1711373231);
        term90931 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term90931, term90931.getClass(), "numerator", -985597870);
        setIntField(term90931, term90931.getClass(), "denominator", 1711373231);
        setField(term90931, term90931.getClass(), "toString", null);
        setField(term90931, term90931.getClass(), "toProperString", null);
        term90928 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term90928, term90928.getClass(), "numerator", -985597870);
        setIntField(term90928, term90928.getClass(), "denominator", 1711373231);
        setField(term90928, term90928.getClass(), "toString", null);
        setField(term90928, term90928.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term90824, args);
        assertTrue(recursiveEquals(term90824, term90931));
        assertTrue(recursiveEquals(retValue, term90928));
    }

};


