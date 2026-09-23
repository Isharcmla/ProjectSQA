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

public class Fraction_reduce_3355035252044 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term600132;
     Object term600532;
     Object term600529;

    public Fraction_reduce_3355035252044() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term600132 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term600132, term600132.getClass(), "numerator", -1526728310);
        setIntField(term600132, term600132.getClass(), "denominator", 394263783);
        term600532 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term600532, term600532.getClass(), "numerator", -1526728310);
        setIntField(term600532, term600532.getClass(), "denominator", 394263783);
        setField(term600532, term600532.getClass(), "toString", null);
        setField(term600532, term600532.getClass(), "toProperString", null);
        term600529 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term600529, term600529.getClass(), "numerator", -1526728310);
        setIntField(term600529, term600529.getClass(), "denominator", 394263783);
        setField(term600529, term600529.getClass(), "toString", null);
        setField(term600529, term600529.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term600132, args);
        assertTrue(recursiveEquals(term600132, term600532));
        assertTrue(recursiveEquals(retValue, term600529));
    }

};


