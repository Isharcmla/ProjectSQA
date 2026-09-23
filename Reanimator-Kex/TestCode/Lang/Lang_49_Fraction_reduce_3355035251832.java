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

public class Fraction_reduce_3355035251832 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term536399;
     Object term537353;
     Object term537350;

    public Fraction_reduce_3355035251832() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term536399 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term536399, term536399.getClass(), "numerator", -1038682062);
        setIntField(term536399, term536399.getClass(), "denominator", 58534543);
        term537353 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term537353, term537353.getClass(), "numerator", -1038682062);
        setIntField(term537353, term537353.getClass(), "denominator", 58534543);
        setField(term537353, term537353.getClass(), "toString", null);
        setField(term537353, term537353.getClass(), "toProperString", null);
        term537350 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term537350, term537350.getClass(), "numerator", -1038682062);
        setIntField(term537350, term537350.getClass(), "denominator", 58534543);
        setField(term537350, term537350.getClass(), "toString", null);
        setField(term537350, term537350.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term536399, args);
        assertTrue(recursiveEquals(term536399, term537353));
        assertTrue(recursiveEquals(retValue, term537350));
    }

};


