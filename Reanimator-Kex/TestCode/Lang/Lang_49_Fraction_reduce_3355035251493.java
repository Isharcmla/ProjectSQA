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

public class Fraction_reduce_3355035251493 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term438836;
     Object term440166;
     Object term440163;

    public Fraction_reduce_3355035251493() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term438836 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term438836, term438836.getClass(), "numerator", -1571981682);
        setIntField(term438836, term438836.getClass(), "denominator", 1065169025);
        term440166 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term440166, term440166.getClass(), "numerator", -1571981682);
        setIntField(term440166, term440166.getClass(), "denominator", 1065169025);
        setField(term440166, term440166.getClass(), "toString", null);
        setField(term440166, term440166.getClass(), "toProperString", null);
        term440163 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term440163, term440163.getClass(), "numerator", -1571981682);
        setIntField(term440163, term440163.getClass(), "denominator", 1065169025);
        setField(term440163, term440163.getClass(), "toString", null);
        setField(term440163, term440163.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term438836, args);
        assertTrue(recursiveEquals(term438836, term440166));
        assertTrue(recursiveEquals(retValue, term440163));
    }

};


