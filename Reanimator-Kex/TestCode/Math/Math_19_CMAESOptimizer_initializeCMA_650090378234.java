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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.math3.optimization.direct.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CMAESOptimizer_initializeCMA_650090378234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116496;
     Object term115348;

    public CMAESOptimizer_initializeCMA_650090378234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116496 = newInstance(Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        double[] term115848 = (double[]) newDoubleArray(497);
        setIntField(term116496, term116496.getClass(), "lambda", 1);
        setField(term116496, term116496.getClass(), "boundaries", null);
        setField(term116496, term116496.getClass(), "inputSigma", term115848);
        term115348 = (double[]) newDoubleArray(497);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term115348;
        try {
            callMethod(klass, "initializeCMA", argTypes, term116496, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


