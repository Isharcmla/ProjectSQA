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

public class Fraction_reduce_3355035251016 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291792;
     Object term292088;
     Object term292085;

    public Fraction_reduce_3355035251016() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291792 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term291792, term291792.getClass(), "numerator", 186258);
        setIntField(term291792, term291792.getClass(), "denominator", 2146079297);
        term292088 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term292088, term292088.getClass(), "numerator", 186258);
        setIntField(term292088, term292088.getClass(), "denominator", 2146079297);
        setField(term292088, term292088.getClass(), "toString", null);
        setField(term292088, term292088.getClass(), "toProperString", null);
        term292085 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term292085, term292085.getClass(), "numerator", 186258);
        setIntField(term292085, term292085.getClass(), "denominator", 2146079297);
        setField(term292085, term292085.getClass(), "toString", null);
        setField(term292085, term292085.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term291792, args);
        assertTrue(recursiveEquals(term291792, term292088));
        assertTrue(recursiveEquals(retValue, term292085));
    }

};


