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

public class Fraction_reduce_335503525743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207171;
     Object term207402;
     Object term207399;

    public Fraction_reduce_335503525743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term207171 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term207171, term207171.getClass(), "numerator", 76813082);
        setIntField(term207171, term207171.getClass(), "denominator", 28444365);
        term207402 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term207402, term207402.getClass(), "numerator", 76813082);
        setIntField(term207402, term207402.getClass(), "denominator", 28444365);
        setField(term207402, term207402.getClass(), "toString", null);
        setField(term207402, term207402.getClass(), "toProperString", null);
        term207399 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term207399, term207399.getClass(), "numerator", 76813082);
        setIntField(term207399, term207399.getClass(), "denominator", 28444365);
        setField(term207399, term207399.getClass(), "toString", null);
        setField(term207399, term207399.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term207171, args);
        assertTrue(recursiveEquals(term207171, term207402));
        assertTrue(recursiveEquals(retValue, term207399));
    }

};


