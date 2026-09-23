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

public class Fraction_reduce_3355035251935 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term568325;
     Object term568906;
     Object term568903;

    public Fraction_reduce_3355035251935() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term568325 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term568325, term568325.getClass(), "numerator", 765161026);
        setIntField(term568325, term568325.getClass(), "denominator", 1419299033);
        term568906 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term568906, term568906.getClass(), "numerator", 765161026);
        setIntField(term568906, term568906.getClass(), "denominator", 1419299033);
        setField(term568906, term568906.getClass(), "toString", null);
        setField(term568906, term568906.getClass(), "toProperString", null);
        term568903 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term568903, term568903.getClass(), "numerator", 765161026);
        setIntField(term568903, term568903.getClass(), "denominator", 1419299033);
        setField(term568903, term568903.getClass(), "toString", null);
        setField(term568903, term568903.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term568325, args);
        assertTrue(recursiveEquals(term568325, term568906));
        assertTrue(recursiveEquals(retValue, term568903));
    }

};


