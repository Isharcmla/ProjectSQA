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

public class Fraction_reduce_3355035251266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term371272;
     Object term371605;
     Object term371602;

    public Fraction_reduce_3355035251266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term371272 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term371272, term371272.getClass(), "numerator", 205379842);
        setIntField(term371272, term371272.getClass(), "denominator", 421580265);
        term371605 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term371605, term371605.getClass(), "numerator", 205379842);
        setIntField(term371605, term371605.getClass(), "denominator", 421580265);
        setField(term371605, term371605.getClass(), "toString", null);
        setField(term371605, term371605.getClass(), "toProperString", null);
        term371602 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term371602, term371602.getClass(), "numerator", 205379842);
        setIntField(term371602, term371602.getClass(), "denominator", 421580265);
        setField(term371602, term371602.getClass(), "toString", null);
        setField(term371602, term371602.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term371272, args);
        assertTrue(recursiveEquals(term371272, term371605));
        assertTrue(recursiveEquals(retValue, term371602));
    }

};


