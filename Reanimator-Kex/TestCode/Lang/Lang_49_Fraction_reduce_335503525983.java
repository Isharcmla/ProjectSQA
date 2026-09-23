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

public class Fraction_reduce_335503525983 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term282463;
     Object term282570;
     Object term282567;

    public Fraction_reduce_335503525983() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term282463 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term282463, term282463.getClass(), "numerator", 353812850);
        setIntField(term282463, term282463.getClass(), "denominator", 1763953729);
        term282570 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term282570, term282570.getClass(), "numerator", 353812850);
        setIntField(term282570, term282570.getClass(), "denominator", 1763953729);
        setField(term282570, term282570.getClass(), "toString", null);
        setField(term282570, term282570.getClass(), "toProperString", null);
        term282567 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term282567, term282567.getClass(), "numerator", 353812850);
        setIntField(term282567, term282567.getClass(), "denominator", 1763953729);
        setField(term282567, term282567.getClass(), "toString", null);
        setField(term282567, term282567.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term282463, args);
        assertTrue(recursiveEquals(term282463, term282570));
        assertTrue(recursiveEquals(retValue, term282567));
    }

};


