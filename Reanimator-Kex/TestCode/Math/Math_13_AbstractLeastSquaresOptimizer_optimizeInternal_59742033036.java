package org.apache.commons.math3.optimization.general;

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
import static org.apache.commons.math3.optimization.general.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;
import java.lang.Object;

public class AbstractLeastSquaresOptimizer_optimizeInternal_59742033036 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101;
     Object term103;

    public AbstractLeastSquaresOptimizer_optimizeInternal_59742033036() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101 = new Integer(1484323161);
        term103 = (Object[]) newArray("org.apache.commons.math3.optimization.OptimizationData", 6);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.general.AbstractLeastSquaresOptimizer");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = Class.forName("org.apache.commons.math3.analysis.differentiation.MultivariateDifferentiableVectorFunction");
        argTypes[2] = Array.newInstance(Class.forName("org.apache.commons.math3.optimization.OptimizationData"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = term101;
        args[1] = null;
        args[2] = term103;
        try {
            callMethod(klass, "optimizeInternal", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


