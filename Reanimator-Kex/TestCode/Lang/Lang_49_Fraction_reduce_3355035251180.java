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

public class Fraction_reduce_3355035251180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term343875;
     Object term344433;
     Object term344430;

    public Fraction_reduce_3355035251180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term343875 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term343875, term343875.getClass(), "numerator", 134218146);
        setIntField(term343875, term343875.getClass(), "denominator", 872021353);
        term344433 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term344433, term344433.getClass(), "numerator", 134218146);
        setIntField(term344433, term344433.getClass(), "denominator", 872021353);
        setField(term344433, term344433.getClass(), "toString", null);
        setField(term344433, term344433.getClass(), "toProperString", null);
        term344430 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term344430, term344430.getClass(), "numerator", 134218146);
        setIntField(term344430, term344430.getClass(), "denominator", 872021353);
        setField(term344430, term344430.getClass(), "toString", null);
        setField(term344430, term344430.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term343875, args);
        assertTrue(recursiveEquals(term343875, term344433));
        assertTrue(recursiveEquals(retValue, term344430));
    }

};


