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
import org.apache.commons.math.MaxIterationsExceededException;
import static org.apache.commons.math.analysis.solvers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BisectionSolver_solve_12156582815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2726;

    public BisectionSolver_solve_12156582815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2726 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        setField(term2726, term2726.getClass(), "f", null);
        setIntField(term2726, term2726.getClass(), "iterationCount", 0);
        setBooleanField(term2726, term2726.getClass(), "resultComputed", false);
        setIntField(term2726, term2726.getClass(), "maximalIterationCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        argTypes[3] = double.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = -7.107401324232868E-192;
        args[2] = -4.921321194160346E-260;
        args[3] = 0.0;
        try {
            callMethod(klass, "solve", argTypes, term2726, args);
            assertTrue(false);
        }
        catch (MaxIterationsExceededException e) {
        }

    }

};


