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
import static org.apache.commons.math3.optim.nonlinear.scalar.noderiv.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.optim.nonlinear.scalar.noderiv.EqualityUtils.*;
import java.lang.Object;

public class SimplexOptimizer_parseOptimizationData_93696086555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24968;
     Object term24710;
     Object term25171;
     Object term25172;

    public SimplexOptimizer_parseOptimizationData_93696086555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24968 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        setField(term24968, term24968.getClass(), "start", null);
        term24710 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 6);
        Object term25096 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.ModelFunction"));
        setElement(term24710, 0, term25096);
        setElement(term24710, 1, term25096);
        setElement(term24710, 2, term25096);
        setElement(term24710, 3, term25096);
        setElement(term24710, 4, term25096);
        setElement(term24710, 5, term25096);
        term25171 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        setField(term25171, term25171.getClass(), "simplex", null);
        setField(term25171, term25171.getClass(), "function", null);
        setField(term25171, term25171.getClass(), "goal", null);
        setField(term25171, term25171.getClass(), "start", null);
        setField(term25171, term25171.getClass(), "lowerBound", null);
        setField(term25171, term25171.getClass(), "upperBound", null);
        setField(term25171, term25171.getClass(), "evaluations", null);
        setField(term25171, term25171.getClass(), "iterations", null);
        setField(term25171, term25171.getClass(), "checker", null);
        term25172 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 6);
        Object term25173 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.ModelFunction"));
        setField(term25173, term25173.getClass(), "model", null);
        setElement(term25172, 0, term25173);
        setElement(term25172, 1, term25173);
        setElement(term25172, 2, term25173);
        setElement(term25172, 3, term25173);
        setElement(term25172, 4, term25173);
        setElement(term25172, 5, term25173);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math3.optim.OptimizationData"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term24710;
        callMethod(klass, "parseOptimizationData", argTypes, term24968, args);
        assertTrue(recursiveEquals(term24968, term25171));
        assertTrue(recursiveEquals(term24710, term25172));
    }

};


