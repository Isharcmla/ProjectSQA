package org.apache.commons.math.analysis.solvers;

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
import static org.apache.commons.math.analysis.solvers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class UnivariateRealSolverUtils_bracket_153984447814 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5713;

    public UnivariateRealSolverUtils_bracket_153984447814() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5713 = newInstance(Class.forName("org.apache.commons.math.optimization.general.NonLinearConjugateGradientOptimizer$LineSearchFunction"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.UnivariateRealSolverUtils");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        argTypes[3] = double.class;
        Object[] args = new Object[4];
        args[0] = term5713;
        args[1] = 0.0;
        args[2] = 0.0;
        args[3] = 0.0;
        callMethod(klass, "bracket", argTypes, null, args);
    }

};


