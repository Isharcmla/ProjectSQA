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
import org.apache.commons.math3.exception.NumberIsTooSmallException;
import static org.apache.commons.math3.optim.nonlinear.scalar.noderiv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class PowellOptimizer_init_143884793519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7480;

    public PowellOptimizer_init_143884793519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term7334 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer"));
        setField(term7334, term7334.getClass(), "checker", null);
        setField(term7334, term7334.getClass(), "evaluations", null);
        setField(term7334, term7334.getClass(), "iterations", null);
        term7480 = newInstance(Class.forName("org.apache.commons.math3.optim.univariate.SimpleUnivariateValueChecker"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.PowellOptimizer");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        argTypes[3] = double.class;
        argTypes[4] = Class.forName("org.apache.commons.math3.optim.ConvergenceChecker");
        Object[] args = new Object[5];
        args[0] = -4.450147750170587E-308;
        args[1] = -2.225073858507202E-308;
        args[2] = 0.0;
        args[3] = 0.0;
        args[4] = term7480;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NumberIsTooSmallException e) {
        }

    }

};


