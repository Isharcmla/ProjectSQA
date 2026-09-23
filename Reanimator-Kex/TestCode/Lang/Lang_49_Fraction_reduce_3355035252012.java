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

public class Fraction_reduce_3355035252012 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term590519;
     Object term590972;
     Object term590969;

    public Fraction_reduce_3355035252012() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term590519 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term590519, term590519.getClass(), "numerator", 79176434);
        setIntField(term590519, term590519.getClass(), "denominator", 1897933041);
        term590972 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term590972, term590972.getClass(), "numerator", 79176434);
        setIntField(term590972, term590972.getClass(), "denominator", 1897933041);
        setField(term590972, term590972.getClass(), "toString", null);
        setField(term590972, term590972.getClass(), "toProperString", null);
        term590969 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term590969, term590969.getClass(), "numerator", 79176434);
        setIntField(term590969, term590969.getClass(), "denominator", 1897933041);
        setField(term590969, term590969.getClass(), "toString", null);
        setField(term590969, term590969.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term590519, args);
        assertTrue(recursiveEquals(term590519, term590972));
        assertTrue(recursiveEquals(retValue, term590969));
    }

};


