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

public class Fraction_reduce_3355035251618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term475032;
     Object term475850;
     Object term475847;

    public Fraction_reduce_3355035251618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term475032 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term475032, term475032.getClass(), "numerator", 897755362);
        setIntField(term475032, term475032.getClass(), "denominator", 1086939705);
        term475850 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term475850, term475850.getClass(), "numerator", 897755362);
        setIntField(term475850, term475850.getClass(), "denominator", 1086939705);
        setField(term475850, term475850.getClass(), "toString", null);
        setField(term475850, term475850.getClass(), "toProperString", null);
        term475847 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term475847, term475847.getClass(), "numerator", 897755362);
        setIntField(term475847, term475847.getClass(), "denominator", 1086939705);
        setField(term475847, term475847.getClass(), "toString", null);
        setField(term475847, term475847.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term475032, args);
        assertTrue(recursiveEquals(term475032, term475850));
        assertTrue(recursiveEquals(retValue, term475847));
    }

};


