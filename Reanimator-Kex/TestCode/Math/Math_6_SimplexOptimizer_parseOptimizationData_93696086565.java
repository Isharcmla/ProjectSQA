package org.apache.commons.math3.optim.nonlinear.scalar.noderiv;

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
import java.lang.NullPointerException;
import static org.apache.commons.math3.optim.nonlinear.scalar.noderiv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SimplexOptimizer_parseOptimizationData_93696086565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31944;
     Object term31726;

    public SimplexOptimizer_parseOptimizationData_93696086565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31944 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        term31726 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 6);
        Object term32036 = newInstance(Class.forName("org.apache.commons.math3.optim.SimpleBounds"));
        Object term32212 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer$PopulationSize"));
        setElement(term31726, 0, term32036);
        setElement(term31726, 1, term32212);
        setElement(term31726, 2, term32212);
        setElement(term31726, 3, term32212);
        setElement(term31726, 4, term32212);
        setElement(term31726, 5, term32212);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math3.optim.OptimizationData"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term31726;
        try {
            callMethod(klass, "parseOptimizationData", argTypes, term31944, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


