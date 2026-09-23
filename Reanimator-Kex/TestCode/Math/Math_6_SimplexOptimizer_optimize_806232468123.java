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

public class SimplexOptimizer_optimize_806232468123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84717;
     Object term84041;

    public SimplexOptimizer_optimize_806232468123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84717 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        term84041 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 1);
        Object term84809 = newInstance(Class.forName("org.apache.commons.math3.optim.SimpleBounds"));
        double[] term84043 = (double[]) newDoubleArray(489);
        setDoubleElement(term84043, 0, 2.0);
        setDoubleElement(term84043, 1, 2.0);
        setField(term84809, term84809.getClass(), "lower", term84043);
        setElement(term84041, 0, term84809);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math3.optim.OptimizationData"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term84041;
        try {
            callMethod(klass, "optimize", argTypes, term84717, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


