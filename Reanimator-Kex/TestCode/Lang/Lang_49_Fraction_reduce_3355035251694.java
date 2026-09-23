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

public class Fraction_reduce_3355035251694 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term497374;
     Object term498257;
     Object term498254;

    public Fraction_reduce_3355035251694() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term497374 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term497374, term497374.getClass(), "numerator", 1103175346);
        setIntField(term497374, term497374.getClass(), "denominator", 1596015665);
        term498257 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term498257, term498257.getClass(), "numerator", 1103175346);
        setIntField(term498257, term498257.getClass(), "denominator", 1596015665);
        setField(term498257, term498257.getClass(), "toString", null);
        setField(term498257, term498257.getClass(), "toProperString", null);
        term498254 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term498254, term498254.getClass(), "numerator", 1103175346);
        setIntField(term498254, term498254.getClass(), "denominator", 1596015665);
        setField(term498254, term498254.getClass(), "toString", null);
        setField(term498254, term498254.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term497374, args);
        assertTrue(recursiveEquals(term497374, term498257));
        assertTrue(recursiveEquals(retValue, term498254));
    }

};


