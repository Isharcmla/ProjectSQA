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
import java.lang.Object;

public class BisectionSolver_solve_121565828101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34479;

    public BisectionSolver_solve_121565828101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34479 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        Object term34593 = newInstance(Class.forName("org.apache.commons.math.analysis.ComposableFunction$20"));
        setField(term34479, term34479.getClass(), "f", term34593);
        setIntField(term34479, term34479.getClass(), "iterationCount", 0);
        setBooleanField(term34479, term34479.getClass(), "resultComputed", false);
        setIntField(term34479, term34479.getClass(), "maximalIterationCount", 2);
        setDoubleField(term34479, term34479.getClass(), "absoluteAccuracy", 9.3808637414991334E17);
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
        args[1] = -1.0043362776618689E59;
        args[2] = 1.7890094335445865E59;
        args[3] = 0.0;
        try {
            callMethod(klass, "solve", argTypes, term34479, args);
            assertTrue(false);
        }
        catch (MaxIterationsExceededException e) {
        }

    }

};


