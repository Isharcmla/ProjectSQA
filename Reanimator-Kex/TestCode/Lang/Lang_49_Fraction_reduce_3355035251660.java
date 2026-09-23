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

public class Fraction_reduce_3355035251660 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term488722;
     Object term489111;
     Object term489108;

    public Fraction_reduce_3355035251660() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term488722 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term488722, term488722.getClass(), "numerator", -1664870066);
        setIntField(term488722, term488722.getClass(), "denominator", 1288796801);
        term489111 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term489111, term489111.getClass(), "numerator", -1664870066);
        setIntField(term489111, term489111.getClass(), "denominator", 1288796801);
        setField(term489111, term489111.getClass(), "toString", null);
        setField(term489111, term489111.getClass(), "toProperString", null);
        term489108 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term489108, term489108.getClass(), "numerator", -1664870066);
        setIntField(term489108, term489108.getClass(), "denominator", 1288796801);
        setField(term489108, term489108.getClass(), "toString", null);
        setField(term489108, term489108.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term488722, args);
        assertTrue(recursiveEquals(term488722, term489111));
        assertTrue(recursiveEquals(retValue, term489108));
    }

};


