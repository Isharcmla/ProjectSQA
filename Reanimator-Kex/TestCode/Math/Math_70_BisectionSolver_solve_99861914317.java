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

public class BisectionSolver_solve_99861914317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2864;

    public BisectionSolver_solve_99861914317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2864 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        setField(term2864, term2864.getClass(), "f", null);
        setIntField(term2864, term2864.getClass(), "iterationCount", 0);
        setBooleanField(term2864, term2864.getClass(), "resultComputed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = -7.68986676435475E38;
        args[1] = -3.378952081073199E-308;
        args[2] = 0.0;
        try {
            callMethod(klass, "solve", argTypes, term2864, args);
            assertTrue(false);
        }
        catch (MaxIterationsExceededException e) {
        }

    }

};


