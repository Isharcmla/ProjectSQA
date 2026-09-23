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

public class Fraction_reduce_335503525554 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152836;
     Object term153345;
     Object term153342;

    public Fraction_reduce_335503525554() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term152836 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term152836, term152836.getClass(), "numerator", 8224850);
        setIntField(term152836, term152836.getClass(), "denominator", 876611169);
        term153345 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term153345, term153345.getClass(), "numerator", 8224850);
        setIntField(term153345, term153345.getClass(), "denominator", 876611169);
        setField(term153345, term153345.getClass(), "toString", null);
        setField(term153345, term153345.getClass(), "toProperString", null);
        term153342 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term153342, term153342.getClass(), "numerator", 8224850);
        setIntField(term153342, term153342.getClass(), "denominator", 876611169);
        setField(term153342, term153342.getClass(), "toString", null);
        setField(term153342, term153342.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term152836, args);
        assertTrue(recursiveEquals(term152836, term153345));
        assertTrue(recursiveEquals(retValue, term153342));
    }

};


