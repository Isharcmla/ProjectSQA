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
import java.lang.Double;

public class BisectionSolver_solve_99526650399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33543;
     Object term33657;

    public BisectionSolver_solve_99526650399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33543 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        setIntField(term33543, term33543.getClass(), "iterationCount", 0);
        setBooleanField(term33543, term33543.getClass(), "resultComputed", false);
        setIntField(term33543, term33543.getClass(), "maximalIterationCount", 2);
        setDoubleField(term33543, term33543.getClass(), "absoluteAccuracy", -8.0720958622783242E18);
        term33657 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$12"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.apache.commons.math.analysis.UnivariateRealFunction");
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term33657;
        args[1] = Double.NEGATIVE_INFINITY;
        args[2] = 2.0979985196959317E154;
        try {
            callMethod(klass, "solve", argTypes, term33543, args);
            assertTrue(false);
        }
        catch (MaxIterationsExceededException e) {
        }

    }

};


