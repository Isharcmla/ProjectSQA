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

public class SimplexOptimizer_optimize_80623246823 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13487;
     Object term13271;

    public SimplexOptimizer_optimize_80623246823() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13487 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        term13271 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 4);
        Object term13579 = newInstance(Class.forName("org.apache.commons.math3.optim.InitialGuess"));
        Object term13671 = newInstance(Class.forName("org.apache.commons.math3.optim.InitialGuess"));
        setElement(term13271, 0, term13579);
        setElement(term13271, 1, term13579);
        setElement(term13271, 2, term13671);
        setElement(term13271, 3, term13579);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math3.optim.OptimizationData"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term13271;
        try {
            callMethod(klass, "optimize", argTypes, term13487, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


