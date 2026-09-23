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
import java.lang.Object;

public class BrentSolver_solve_56513855024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5249;

    public BrentSolver_solve_56513855024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5249 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver"));
        Object term5353 = newInstance(Class.forName("org.apache.commons.math.analysis.BinaryFunction$8"));
        setField(term5249, term5249.getClass(), "f", term5353);
        setIntField(term5249, term5249.getClass(), "iterationCount", 0);
        setBooleanField(term5249, term5249.getClass(), "resultComputed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = -4.635732427493495E77;
        args[1] = -4.105162769787572E-289;
        args[2] = -32.01269270759076;
        try {
            callMethod(klass, "solve", argTypes, term5249, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


