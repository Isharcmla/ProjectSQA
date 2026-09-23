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

public class Fraction_reduce_3355035251706 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term500409;
     Object term501169;
     Object term501166;

    public Fraction_reduce_3355035251706() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term500409 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term500409, term500409.getClass(), "numerator", -905603070);
        setIntField(term500409, term500409.getClass(), "denominator", 1729511543);
        term501169 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term501169, term501169.getClass(), "numerator", -905603070);
        setIntField(term501169, term501169.getClass(), "denominator", 1729511543);
        setField(term501169, term501169.getClass(), "toString", null);
        setField(term501169, term501169.getClass(), "toProperString", null);
        term501166 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term501166, term501166.getClass(), "numerator", -905603070);
        setIntField(term501166, term501166.getClass(), "denominator", 1729511543);
        setField(term501166, term501166.getClass(), "toString", null);
        setField(term501166, term501166.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term500409, args);
        assertTrue(recursiveEquals(term500409, term501169));
        assertTrue(recursiveEquals(retValue, term501166));
    }

};


