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

public class Fraction_reduce_3355035251017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term291990;
     Object term292187;
     Object term292184;

    public Fraction_reduce_3355035251017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term291990 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term291990, term291990.getClass(), "numerator", -92077466);
        setIntField(term291990, term291990.getClass(), "denominator", 565315445);
        term292187 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term292187, term292187.getClass(), "numerator", -92077466);
        setIntField(term292187, term292187.getClass(), "denominator", 565315445);
        setField(term292187, term292187.getClass(), "toString", null);
        setField(term292187, term292187.getClass(), "toProperString", null);
        term292184 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term292184, term292184.getClass(), "numerator", -92077466);
        setIntField(term292184, term292184.getClass(), "denominator", 565315445);
        setField(term292184, term292184.getClass(), "toString", null);
        setField(term292184, term292184.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term291990, args);
        assertTrue(recursiveEquals(term291990, term292187));
        assertTrue(recursiveEquals(retValue, term292184));
    }

};


