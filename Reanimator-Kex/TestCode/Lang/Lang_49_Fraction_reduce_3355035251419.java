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

public class Fraction_reduce_3355035251419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term413906;
     Object term414874;
     Object term414871;

    public Fraction_reduce_3355035251419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term413906 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term413906, term413906.getClass(), "numerator", -1465350686);
        setIntField(term413906, term413906.getClass(), "denominator", 1195493063);
        term414874 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term414874, term414874.getClass(), "numerator", -1465350686);
        setIntField(term414874, term414874.getClass(), "denominator", 1195493063);
        setField(term414874, term414874.getClass(), "toString", null);
        setField(term414874, term414874.getClass(), "toProperString", null);
        term414871 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term414871, term414871.getClass(), "numerator", -1465350686);
        setIntField(term414871, term414871.getClass(), "denominator", 1195493063);
        setField(term414871, term414871.getClass(), "toString", null);
        setField(term414871, term414871.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term413906, args);
        assertTrue(recursiveEquals(term413906, term414874));
        assertTrue(recursiveEquals(retValue, term414871));
    }

};


