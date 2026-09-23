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

public class Fraction_reduce_335503525379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101896;
     Object term102002;
     Object term101999;

    public Fraction_reduce_335503525379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101896 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term101896, term101896.getClass(), "numerator", -1811201902);
        setIntField(term101896, term101896.getClass(), "denominator", 2013338111);
        term102002 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term102002, term102002.getClass(), "numerator", -1811201902);
        setIntField(term102002, term102002.getClass(), "denominator", 2013338111);
        setField(term102002, term102002.getClass(), "toString", null);
        setField(term102002, term102002.getClass(), "toProperString", null);
        term101999 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term101999, term101999.getClass(), "numerator", -1811201902);
        setIntField(term101999, term101999.getClass(), "denominator", 2013338111);
        setField(term101999, term101999.getClass(), "toString", null);
        setField(term101999, term101999.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term101896, args);
        assertTrue(recursiveEquals(term101896, term102002));
        assertTrue(recursiveEquals(retValue, term101999));
    }

};


