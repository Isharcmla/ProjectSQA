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

public class Fraction_reduce_335503525981 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term282051;
     Object term282266;
     Object term282263;

    public Fraction_reduce_335503525981() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term282051 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term282051, term282051.getClass(), "numerator", 1476395042);
        setIntField(term282051, term282051.getClass(), "denominator", 1073741865);
        term282266 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term282266, term282266.getClass(), "numerator", 1476395042);
        setIntField(term282266, term282266.getClass(), "denominator", 1073741865);
        setField(term282266, term282266.getClass(), "toString", null);
        setField(term282266, term282266.getClass(), "toProperString", null);
        term282263 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term282263, term282263.getClass(), "numerator", 1476395042);
        setIntField(term282263, term282263.getClass(), "denominator", 1073741865);
        setField(term282263, term282263.getClass(), "toString", null);
        setField(term282263, term282263.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term282051, args);
        assertTrue(recursiveEquals(term282051, term282266));
        assertTrue(recursiveEquals(retValue, term282263));
    }

};


