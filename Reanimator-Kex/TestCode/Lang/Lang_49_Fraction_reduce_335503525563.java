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

public class Fraction_reduce_335503525563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155254;
     Object term155459;
     Object term155456;

    public Fraction_reduce_335503525563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155254 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term155254, term155254.getClass(), "numerator", 2088979310);
        setIntField(term155254, term155254.getClass(), "denominator", 1979413263);
        term155459 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term155459, term155459.getClass(), "numerator", 2088979310);
        setIntField(term155459, term155459.getClass(), "denominator", 1979413263);
        setField(term155459, term155459.getClass(), "toString", null);
        setField(term155459, term155459.getClass(), "toProperString", null);
        term155456 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term155456, term155456.getClass(), "numerator", 2088979310);
        setIntField(term155456, term155456.getClass(), "denominator", 1979413263);
        setField(term155456, term155456.getClass(), "toString", null);
        setField(term155456, term155456.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term155254, args);
        assertTrue(recursiveEquals(term155254, term155459));
        assertTrue(recursiveEquals(retValue, term155456));
    }

};


