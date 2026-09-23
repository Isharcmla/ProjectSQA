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

public class Fraction_reduce_3355035251507 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term443957;
     Object term444169;
     Object term444163;

    public Fraction_reduce_3355035251507() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term443957 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term443957, term443957.getClass(), "numerator", 1073741838);
        setIntField(term443957, term443957.getClass(), "denominator", 545259519);
        term444169 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term444169, term444169.getClass(), "numerator", 1073741838);
        setIntField(term444169, term444169.getClass(), "denominator", 545259519);
        setField(term444169, term444169.getClass(), "toString", null);
        setField(term444169, term444169.getClass(), "toProperString", null);
        term444163 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term444163, term444163.getClass(), "numerator", 357913946);
        setIntField(term444163, term444163.getClass(), "denominator", 181753173);
        setField(term444163, term444163.getClass(), "toString", null);
        setField(term444163, term444163.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term443957, args);
        assertTrue(recursiveEquals(term443957, term444169));
        assertTrue(recursiveEquals(retValue, term444163));
    }

};


