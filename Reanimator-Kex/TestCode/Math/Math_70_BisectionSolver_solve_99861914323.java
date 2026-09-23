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
import java.lang.NullPointerException;
import static org.apache.commons.math.analysis.solvers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class BisectionSolver_solve_99861914323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6059;

    public BisectionSolver_solve_99861914323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6059 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver"));
        setField(term6059, term6059.getClass(), "f", null);
        setIntField(term6059, term6059.getClass(), "iterationCount", 0);
        setBooleanField(term6059, term6059.getClass(), "resultComputed", false);
        setIntField(term6059, term6059.getClass(), "maximalIterationCount", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BisectionSolver");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = -7.107401324232868E-192;
        args[1] = -4.921321194160346E-260;
        args[2] = 0.0;
        try {
            callMethod(klass, "solve", argTypes, term6059, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


