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

public class BrentSolver_solve_24021448943 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11825;

    public BrentSolver_solve_24021448943() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11825 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver"));
        Object term11929 = newInstance(Class.forName("org.apache.commons.math.analysis.BinaryFunction$7"));
        setField(term11825, term11825.getClass(), "f", term11929);
        setIntField(term11825, term11825.getClass(), "iterationCount", 0);
        setBooleanField(term11825, term11825.getClass(), "resultComputed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = -2.032791148715703;
        args[1] = -2.2654342256001113E-308;
        try {
            callMethod(klass, "solve", argTypes, term11825, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


