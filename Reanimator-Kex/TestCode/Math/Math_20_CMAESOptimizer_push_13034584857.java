package org.apache.commons.math3.optimization.direct;

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
import static org.apache.commons.math3.optimization.direct.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.optimization.direct.EqualityUtils.*;
import java.lang.Double;

public class CMAESOptimizer_push_13034584857 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14991;
     Object term14997;
     Object term40344;

    public CMAESOptimizer_push_13034584857() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14991 = (double[]) newDoubleArray(5);
        setDoubleElement(term14991, 0, 0.22308265923522352);
        setDoubleElement(term14991, 1, 0.46226950865842764);
        setDoubleElement(term14991, 2, 0.6482086250011448);
        setDoubleElement(term14991, 3, 0.3154346482211354);
        setDoubleElement(term14991, 4, 0.020103660328398276);
        term14997 = new Double(0.6530844366661772);
        term40344 = (double[]) newDoubleArray(5);
        setDoubleElement(term40344, 0, 0.6530844366661772);
        setDoubleElement(term40344, 1, 0.22308265923522352);
        setDoubleElement(term40344, 2, 0.46226950865842764);
        setDoubleElement(term40344, 3, 0.6482086250011448);
        setDoubleElement(term40344, 4, 0.3154346482211354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term14991;
        args[1] = term14997;
        callMethod(klass, "push", argTypes, null, args);
        assertTrue(recursiveEquals(term14991, term40344));
        assertTrue(recursiveEquals(term14997, 0.6530844366661772));
    }

};


