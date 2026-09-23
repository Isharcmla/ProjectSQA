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

public class Fraction_reduce_3355035251420 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term414285;
     Object term414985;
     Object term414979;

    public Fraction_reduce_3355035251420() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term414285 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term414285, term414285.getClass(), "numerator", 1428848754);
        setIntField(term414285, term414285.getClass(), "denominator", 1146025857);
        term414985 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term414985, term414985.getClass(), "numerator", 1428848754);
        setIntField(term414985, term414985.getClass(), "denominator", 1146025857);
        setField(term414985, term414985.getClass(), "toString", null);
        setField(term414985, term414985.getClass(), "toProperString", null);
        term414979 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term414979, term414979.getClass(), "numerator", 476282918);
        setIntField(term414979, term414979.getClass(), "denominator", 382008619);
        setField(term414979, term414979.getClass(), "toString", null);
        setField(term414979, term414979.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term414285, args);
        assertTrue(recursiveEquals(term414285, term414985));
        assertTrue(recursiveEquals(retValue, term414979));
    }

};


