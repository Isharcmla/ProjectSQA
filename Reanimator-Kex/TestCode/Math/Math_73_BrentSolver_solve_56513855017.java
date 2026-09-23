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

public class BrentSolver_solve_56513855017 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4316;

    public BrentSolver_solve_56513855017() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4316 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver"));
        setField(term4316, term4316.getClass(), "f", null);
        setIntField(term4316, term4316.getClass(), "iterationCount", 0);
        setBooleanField(term4316, term4316.getClass(), "resultComputed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = -8.82030009182543E19;
        args[1] = -4.862488635932467E-154;
        args[2] = -2.7061249883853466E-153;
        try {
            callMethod(klass, "solve", argTypes, term4316, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


