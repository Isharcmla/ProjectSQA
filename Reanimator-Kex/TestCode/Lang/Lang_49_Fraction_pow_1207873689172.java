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

public class Fraction_pow_1207873689172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39126;
     Object term39492;
     Object term39485;

    public Fraction_pow_1207873689172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39126 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        term39492 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term39492, term39492.getClass(), "numerator", 0);
        setIntField(term39492, term39492.getClass(), "denominator", 0);
        setField(term39492, term39492.getClass(), "toString", null);
        setField(term39492, term39492.getClass(), "toProperString", null);
        term39485 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term39485, term39485.getClass(), "numerator", 1);
        setIntField(term39485, term39485.getClass(), "denominator", 1);
        setField(term39485, term39485.getClass(), "toString", null);
        setField(term39485, term39485.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = 0;
        Object retValue = callMethod(klass, "pow", argTypes, term39126, args);
        assertTrue(recursiveEquals(term39126, term39492));
        assertTrue(recursiveEquals(retValue, term39485));
    }

};


