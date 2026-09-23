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

public class Fraction_reduce_3355035251743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term510649;
     Object term510844;
     Object term510841;

    public Fraction_reduce_3355035251743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term510649 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term510649, term510649.getClass(), "numerator", 89131090);
        setIntField(term510649, term510649.getClass(), "denominator", 2118370049);
        term510844 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term510844, term510844.getClass(), "numerator", 89131090);
        setIntField(term510844, term510844.getClass(), "denominator", 2118370049);
        setField(term510844, term510844.getClass(), "toString", null);
        setField(term510844, term510844.getClass(), "toProperString", null);
        term510841 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term510841, term510841.getClass(), "numerator", 89131090);
        setIntField(term510841, term510841.getClass(), "denominator", 2118370049);
        setField(term510841, term510841.getClass(), "toString", null);
        setField(term510841, term510841.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term510649, args);
        assertTrue(recursiveEquals(term510649, term510844));
        assertTrue(recursiveEquals(retValue, term510841));
    }

};


