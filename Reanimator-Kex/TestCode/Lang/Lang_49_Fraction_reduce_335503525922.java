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

public class Fraction_reduce_335503525922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term263002;
     Object term263609;
     Object term263606;

    public Fraction_reduce_335503525922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term263002 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term263002, term263002.getClass(), "numerator", 1938023202);
        setIntField(term263002, term263002.getClass(), "denominator", 1092486281);
        term263609 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term263609, term263609.getClass(), "numerator", 1938023202);
        setIntField(term263609, term263609.getClass(), "denominator", 1092486281);
        setField(term263609, term263609.getClass(), "toString", null);
        setField(term263609, term263609.getClass(), "toProperString", null);
        term263606 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term263606, term263606.getClass(), "numerator", 1938023202);
        setIntField(term263606, term263606.getClass(), "denominator", 1092486281);
        setField(term263606, term263606.getClass(), "toString", null);
        setField(term263606, term263606.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term263002, args);
        assertTrue(recursiveEquals(term263002, term263609));
        assertTrue(recursiveEquals(retValue, term263606));
    }

};


