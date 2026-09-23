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

public class Fraction_reduce_335503525704 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194696;
     Object term195491;
     Object term195485;

    public Fraction_reduce_335503525704() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term194696 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term194696, term194696.getClass(), "numerator", -394186782);
        setIntField(term194696, term194696.getClass(), "denominator", 1983121911);
        term195491 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term195491, term195491.getClass(), "numerator", -394186782);
        setIntField(term195491, term195491.getClass(), "denominator", 1983121911);
        setField(term195491, term195491.getClass(), "toString", null);
        setField(term195491, term195491.getClass(), "toProperString", null);
        term195485 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term195485, term195485.getClass(), "numerator", -131395594);
        setIntField(term195485, term195485.getClass(), "denominator", 661040637);
        setField(term195485, term195485.getClass(), "toString", null);
        setField(term195485, term195485.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term194696, args);
        assertTrue(recursiveEquals(term194696, term195491));
        assertTrue(recursiveEquals(retValue, term195485));
    }

};


