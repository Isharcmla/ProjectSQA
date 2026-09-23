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

public class SimplexOptimizer_optimize_806232468133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103911;
     Object term102698;

    public SimplexOptimizer_optimize_806232468133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103911 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        double[] term102700 = (double[]) newDoubleArray(489);
        setDoubleElement(term102700, 0, 2.0);
        setDoubleElement(term102700, 1, 2.0);
        setDoubleElement(term102700, 2, 2.0);
        setDoubleElement(term102700, 3, 2.0);
        setDoubleElement(term102700, 4, 2.0);
        setField(term103911, term103911.getClass(), "start", term102700);
        setField(term103911, term103911.getClass(), "lowerBound", null);
        term102698 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 4);
        Object term104087 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.CMAESOptimizer$PopulationSize"));
        setElement(term102698, 0, term104087);
        setElement(term102698, 1, term104087);
        setElement(term102698, 2, term104087);
        setElement(term102698, 3, term104087);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math3.optim.OptimizationData"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term102698;
        try {
            callMethod(klass, "optimize", argTypes, term103911, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


