package org.apache.commons.lang3.math;

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
import static org.apache.commons.lang3.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.math.EqualityUtils.*;

public class Fraction_reduce_53585913181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10369;
     Object term10916;
     Object term10913;

    public Fraction_reduce_53585913181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10369 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term10369, term10369.getClass(), "numerator", -88080374);
        setIntField(term10369, term10369.getClass(), "denominator", 2121248115);
        term10916 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term10916, term10916.getClass(), "numerator", -88080374);
        setIntField(term10916, term10916.getClass(), "denominator", 2121248115);
        setField(term10916, term10916.getClass(), "toString", null);
        setField(term10916, term10916.getClass(), "toProperString", null);
        term10913 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term10913, term10913.getClass(), "numerator", -88080374);
        setIntField(term10913, term10913.getClass(), "denominator", 2121248115);
        setField(term10913, term10913.getClass(), "toString", null);
        setField(term10913, term10913.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term10369, args);
        assertTrue(recursiveEquals(term10369, term10916));
        assertTrue(recursiveEquals(retValue, term10913));
    }

};


