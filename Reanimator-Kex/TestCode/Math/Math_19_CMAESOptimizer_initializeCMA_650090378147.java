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

public class CMAESOptimizer_initializeCMA_650090378147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75606;
     Object term74453;

    public CMAESOptimizer_initializeCMA_650090378147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75606 = newInstance(Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        double[] term74949 = (double[]) newDoubleArray(498);
        setIntField(term75606, term75606.getClass(), "lambda", 0);
        setIntField(term75606, term75606.getClass(), "dimension", 0);
        setField(term75606, term75606.getClass(), "boundaries", null);
        setField(term75606, term75606.getClass(), "inputSigma", term74949);
        term74453 = (double[]) newDoubleArray(492);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term74453;
        try {
            callMethod(klass, "initializeCMA", argTypes, term75606, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


