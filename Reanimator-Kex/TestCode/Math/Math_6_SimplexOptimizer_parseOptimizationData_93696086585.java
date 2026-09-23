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

public class SimplexOptimizer_parseOptimizationData_93696086585 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45276;
     Object term45086;

    public SimplexOptimizer_parseOptimizationData_93696086585() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45276 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        term45086 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 2);
        Object term45368 = newInstance(Class.forName("org.apache.commons.math3.optim.SimpleBounds"));
        Object term45496 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.ModelFunction"));
        setElement(term45086, 0, term45368);
        setElement(term45086, 1, term45496);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math3.optim.OptimizationData"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term45086;
        try {
            callMethod(klass, "parseOptimizationData", argTypes, term45276, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


