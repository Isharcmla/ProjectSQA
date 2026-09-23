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

public class SimplexOptimizer_parseOptimizationData_93696086534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15879;
     Object term15686;
     Object term16360;
     Object term16362;

    public SimplexOptimizer_parseOptimizationData_93696086534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15879 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        term15686 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 4);
        Object term16031 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex"));
        setElement(term15686, 0, term16031);
        setElement(term15686, 1, term16031);
        setElement(term15686, 2, term16031);
        setElement(term15686, 3, term16031);
        term16360 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        Object term16361 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex"));
        setDoubleField(term16361, term16361.getClass(), "rho", 0.0);
        setDoubleField(term16361, term16361.getClass(), "khi", 0.0);
        setDoubleField(term16361, term16361.getClass(), "gamma", 0.0);
        setDoubleField(term16361, term16361.getClass(), "sigma", 0.0);
        setField(term16361, term16361.getClass(), "simplex", null);
        setField(term16361, term16361.getClass(), "startConfiguration", null);
        setIntField(term16361, term16361.getClass(), "dimension", 0);
        setField(term16360, term16360.getClass(), "simplex", term16361);
        setField(term16360, term16360.getClass(), "function", null);
        setField(term16360, term16360.getClass(), "goal", null);
        setField(term16360, term16360.getClass(), "start", null);
        setField(term16360, term16360.getClass(), "lowerBound", null);
        setField(term16360, term16360.getClass(), "upperBound", null);
        setField(term16360, term16360.getClass(), "evaluations", null);
        setField(term16360, term16360.getClass(), "iterations", null);
        setField(term16360, term16360.getClass(), "checker", null);
        term16362 = (Object[]) newArray("org.apache.commons.math3.optim.OptimizationData", 4);
        Object term16363 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex"));
        setDoubleField(term16363, term16363.getClass(), "rho", 0.0);
        setDoubleField(term16363, term16363.getClass(), "khi", 0.0);
        setDoubleField(term16363, term16363.getClass(), "gamma", 0.0);
        setDoubleField(term16363, term16363.getClass(), "sigma", 0.0);
        setField(term16363, term16363.getClass(), "simplex", null);
        setField(term16363, term16363.getClass(), "startConfiguration", null);
        setIntField(term16363, term16363.getClass(), "dimension", 0);
        setElement(term16362, 0, term16363);
        setElement(term16362, 1, term16363);
        setElement(term16362, 2, term16363);
        setElement(term16362, 3, term16363);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("org.apache.commons.math3.optim.OptimizationData"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term15686;
        callMethod(klass, "parseOptimizationData", argTypes, term15879, args);
        assertTrue(recursiveEquals(term15879, term16360));
        assertTrue(recursiveEquals(term15686, term16362));
    }

};


