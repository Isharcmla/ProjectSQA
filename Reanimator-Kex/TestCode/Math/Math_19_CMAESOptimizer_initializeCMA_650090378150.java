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

public class CMAESOptimizer_initializeCMA_650090378150 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80372;
     Object term80142;

    public CMAESOptimizer_initializeCMA_650090378150() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80372 = newInstance(Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer"));
        Object[] term80147 = (Object[]) newArray("[D", 53);
        double[] term80148 = (double[]) newDoubleArray(12);
        double[] term80161 = (double[]) newDoubleArray(17);
        setIntField(term80372, term80372.getClass(), "lambda", 0);
        setIntField(term80372, term80372.getClass(), "dimension", 0);
        setElement(term80147, 0, term80148);
        setElement(term80147, 1, term80161);
        setField(term80372, term80372.getClass(), "boundaries", term80147);
        term80142 = (double[]) newDoubleArray(1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.direct.CMAESOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term80142;
        callMethod(klass, "initializeCMA", argTypes, term80372, args);
    }

};


