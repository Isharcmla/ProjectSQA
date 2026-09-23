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

public class SimplexOptimizer_checkParameters_99767672716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9073;
     Object term9935;

    public SimplexOptimizer_checkParameters_99767672716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9073 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        Object term9225 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex"));
        setField(term9073, term9073.getClass(), "simplex", term9225);
        term9935 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer"));
        Object term9936 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.NelderMeadSimplex"));
        setDoubleField(term9936, term9936.getClass(), "rho", 0.0);
        setDoubleField(term9936, term9936.getClass(), "khi", 0.0);
        setDoubleField(term9936, term9936.getClass(), "gamma", 0.0);
        setDoubleField(term9936, term9936.getClass(), "sigma", 0.0);
        setField(term9936, term9936.getClass(), "simplex", null);
        setField(term9936, term9936.getClass(), "startConfiguration", null);
        setIntField(term9936, term9936.getClass(), "dimension", 0);
        setField(term9935, term9935.getClass(), "simplex", term9936);
        setField(term9935, term9935.getClass(), "function", null);
        setField(term9935, term9935.getClass(), "goal", null);
        setField(term9935, term9935.getClass(), "start", null);
        setField(term9935, term9935.getClass(), "lowerBound", null);
        setField(term9935, term9935.getClass(), "upperBound", null);
        setField(term9935, term9935.getClass(), "evaluations", null);
        setField(term9935, term9935.getClass(), "iterations", null);
        setField(term9935, term9935.getClass(), "checker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.scalar.noderiv.SimplexOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "checkParameters", argTypes, term9073, args);
        assertTrue(recursiveEquals(term9073, term9935));
    }

};


