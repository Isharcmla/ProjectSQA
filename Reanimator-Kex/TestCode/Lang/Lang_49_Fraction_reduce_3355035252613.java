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

public class Fraction_reduce_3355035252613 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term779843;
     Object term780477;
     Object term780471;

    public Fraction_reduce_3355035252613() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term779843 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term779843, term779843.getClass(), "numerator", -1590414306);
        setIntField(term779843, term779843.getClass(), "denominator", 838097817);
        term780477 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term780477, term780477.getClass(), "numerator", -1590414306);
        setIntField(term780477, term780477.getClass(), "denominator", 838097817);
        setField(term780477, term780477.getClass(), "toString", null);
        setField(term780477, term780477.getClass(), "toProperString", null);
        term780471 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term780471, term780471.getClass(), "numerator", -530138102);
        setIntField(term780471, term780471.getClass(), "denominator", 279365939);
        setField(term780471, term780471.getClass(), "toString", null);
        setField(term780471, term780471.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term779843, args);
        assertTrue(recursiveEquals(term779843, term780477));
        assertTrue(recursiveEquals(retValue, term780471));
    }

};


