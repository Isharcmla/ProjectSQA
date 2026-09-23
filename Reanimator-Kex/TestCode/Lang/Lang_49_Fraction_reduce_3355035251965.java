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

public class Fraction_reduce_3355035251965 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term577351;
     Object term577447;
     Object term577444;

    public Fraction_reduce_3355035251965() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term577351 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term577351, term577351.getClass(), "numerator", 677419542);
        setIntField(term577351, term577351.getClass(), "denominator", 406253315);
        term577447 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term577447, term577447.getClass(), "numerator", 677419542);
        setIntField(term577447, term577447.getClass(), "denominator", 406253315);
        setField(term577447, term577447.getClass(), "toString", null);
        setField(term577447, term577447.getClass(), "toProperString", null);
        term577444 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term577444, term577444.getClass(), "numerator", 677419542);
        setIntField(term577444, term577444.getClass(), "denominator", 406253315);
        setField(term577444, term577444.getClass(), "toString", null);
        setField(term577444, term577444.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term577351, args);
        assertTrue(recursiveEquals(term577351, term577447));
        assertTrue(recursiveEquals(retValue, term577444));
    }

};


