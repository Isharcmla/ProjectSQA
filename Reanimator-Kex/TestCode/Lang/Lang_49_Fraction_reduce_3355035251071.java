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

public class Fraction_reduce_3355035251071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term309414;
     Object term310257;
     Object term310254;

    public Fraction_reduce_3355035251071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term309414 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term309414, term309414.getClass(), "numerator", -45216250);
        setIntField(term309414, term309414.getClass(), "denominator", 2129467141);
        term310257 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term310257, term310257.getClass(), "numerator", -45216250);
        setIntField(term310257, term310257.getClass(), "denominator", 2129467141);
        setField(term310257, term310257.getClass(), "toString", null);
        setField(term310257, term310257.getClass(), "toProperString", null);
        term310254 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term310254, term310254.getClass(), "numerator", -45216250);
        setIntField(term310254, term310254.getClass(), "denominator", 2129467141);
        setField(term310254, term310254.getClass(), "toString", null);
        setField(term310254, term310254.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term309414, args);
        assertTrue(recursiveEquals(term309414, term310257));
        assertTrue(recursiveEquals(retValue, term310254));
    }

};


