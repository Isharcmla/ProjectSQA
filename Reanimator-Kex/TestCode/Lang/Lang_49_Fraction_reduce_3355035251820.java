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

public class Fraction_reduce_3355035251820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term533010;
     Object term533529;
     Object term533526;

    public Fraction_reduce_3355035251820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term533010 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term533010, term533010.getClass(), "numerator", 69537826);
        setIntField(term533010, term533010.getClass(), "denominator", 610427273);
        term533529 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term533529, term533529.getClass(), "numerator", 69537826);
        setIntField(term533529, term533529.getClass(), "denominator", 610427273);
        setField(term533529, term533529.getClass(), "toString", null);
        setField(term533529, term533529.getClass(), "toProperString", null);
        term533526 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term533526, term533526.getClass(), "numerator", 69537826);
        setIntField(term533526, term533526.getClass(), "denominator", 610427273);
        setField(term533526, term533526.getClass(), "toString", null);
        setField(term533526, term533526.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term533010, args);
        assertTrue(recursiveEquals(term533010, term533529));
        assertTrue(recursiveEquals(retValue, term533526));
    }

};


