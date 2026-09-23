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

public class Fraction_reduce_3355035252194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term647334;
     Object term647780;
     Object term647777;

    public Fraction_reduce_3355035252194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term647334 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term647334, term647334.getClass(), "numerator", -195951862);
        setIntField(term647334, term647334.getClass(), "denominator", 2146881683);
        term647780 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term647780, term647780.getClass(), "numerator", -195951862);
        setIntField(term647780, term647780.getClass(), "denominator", 2146881683);
        setField(term647780, term647780.getClass(), "toString", null);
        setField(term647780, term647780.getClass(), "toProperString", null);
        term647777 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term647777, term647777.getClass(), "numerator", -195951862);
        setIntField(term647777, term647777.getClass(), "denominator", 2146881683);
        setField(term647777, term647777.getClass(), "toString", null);
        setField(term647777, term647777.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term647334, args);
        assertTrue(recursiveEquals(term647334, term647780));
        assertTrue(recursiveEquals(retValue, term647777));
    }

};


