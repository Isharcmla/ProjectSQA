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

public class Fraction_reduce_3355035251881 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term551710;
     Object term552186;
     Object term552180;

    public Fraction_reduce_3355035251881() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term551710 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term551710, term551710.getClass(), "numerator", 1572346302);
        setIntField(term551710, term551710.getClass(), "denominator", 1126432007);
        term552186 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term552186, term552186.getClass(), "numerator", 1572346302);
        setIntField(term552186, term552186.getClass(), "denominator", 1126432007);
        setField(term552186, term552186.getClass(), "toString", null);
        setField(term552186, term552186.getClass(), "toProperString", null);
        term552180 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term552180, term552180.getClass(), "numerator", 54218838);
        setIntField(term552180, term552180.getClass(), "denominator", 38842483);
        setField(term552180, term552180.getClass(), "toString", null);
        setField(term552180, term552180.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term551710, args);
        assertTrue(recursiveEquals(term551710, term552186));
        assertTrue(recursiveEquals(retValue, term552180));
    }

};


