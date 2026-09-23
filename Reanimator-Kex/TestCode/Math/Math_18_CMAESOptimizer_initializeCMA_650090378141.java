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
import java.lang.Object;

public class CMAESOptimizer_initializeCMA_650090378141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81557;
     Object term81327;

    public CMAESOptimizer_initializeCMA_650090378141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81557 = newInstance(Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        Object[] term81332 = (Object[]) newArray("[D", 53);
        double[] term81333 = (double[]) newDoubleArray(12);
        double[] term81346 = (double[]) newDoubleArray(17);
        setIntField(term81557, term81557.getClass(), "lambda", 0);
        setIntField(term81557, term81557.getClass(), "dimension", 0);
        setElement(term81332, 0, term81333);
        setElement(term81332, 1, term81346);
        setField(term81557, term81557.getClass(), "boundaries", term81332);
        term81327 = (double[]) newDoubleArray(1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term81327;
        callMethod(klass, "initializeCMA", argTypes, term81557, args);
    }

};


