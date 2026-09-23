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

public class SimplexOptimizer_parseOptimizationData_93696086562 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29538;
     Object term29315;

    public SimplexOptimizer_parseOptimizationData_93696086562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29538 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        term29315 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 6);
        Object term29682 = newInstance(Class.forName("org.apache.commons.math3.optim.univariate.UnivariateObjectiveFunction"));
        Object term29774 = newInstance(Class.forName("org.apache.commons.math3.optim.InitialGuess"));
        setElement(term29315, 0, term29682);
        setElement(term29315, 1, term29774);
        setElement(term29315, 2, term29682);
        setElement(term29315, 3, term29682);
        setElement(term29315, 4, term29682);
        setElement(term29315, 5, term29682);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math3.optim.OptimizationData"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term29315;
        try {
            callMethod(klass, "parseOptimizationData", argTypes, term29538, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


