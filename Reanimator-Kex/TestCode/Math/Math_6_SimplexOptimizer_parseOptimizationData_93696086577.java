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

public class SimplexOptimizer_parseOptimizationData_93696086577 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term39797;
     Object term39546;

    public SimplexOptimizer_parseOptimizationData_93696086577() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term39797 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        term39546 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 6);
        Object term39879 = newInstance(Class.forName("org.apache.commons.math3.optim.MaxIter"));
        Object term39971 = newInstance(Class.forName("org.apache.commons.math3.optim.InitialGuess"));
        setElement(term39546, 0, term39879);
        setElement(term39546, 1, term39879);
        setElement(term39546, 2, term39879);
        setElement(term39546, 3, term39879);
        setElement(term39546, 4, term39879);
        setElement(term39546, 5, term39971);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math3.optim.OptimizationData"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term39546;
        try {
            callMethod(klass, "parseOptimizationData", argTypes, term39797, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


