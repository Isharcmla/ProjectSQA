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

public class Fraction_reduce_3355035252813 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term840932;
     Object term841132;
     Object term841129;

    public Fraction_reduce_3355035252813() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term840932 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term840932, term840932.getClass(), "numerator", -3090638);
        setIntField(term840932, term840932.getClass(), "denominator", 974526735);
        term841132 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term841132, term841132.getClass(), "numerator", -3090638);
        setIntField(term841132, term841132.getClass(), "denominator", 974526735);
        setField(term841132, term841132.getClass(), "toString", null);
        setField(term841132, term841132.getClass(), "toProperString", null);
        term841129 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term841129, term841129.getClass(), "numerator", -3090638);
        setIntField(term841129, term841129.getClass(), "denominator", 974526735);
        setField(term841129, term841129.getClass(), "toString", null);
        setField(term841129, term841129.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term840932, args);
        assertTrue(recursiveEquals(term840932, term841132));
        assertTrue(recursiveEquals(retValue, term841129));
    }

};


