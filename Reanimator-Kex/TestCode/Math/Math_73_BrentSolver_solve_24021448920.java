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

public class BrentSolver_solve_24021448920 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4716;

    public BrentSolver_solve_24021448920() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4716 = newInstance(Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver"));
        setField(term4716, term4716.getClass(), "f", null);
        setIntField(term4716, term4716.getClass(), "iterationCount", 0);
        setBooleanField(term4716, term4716.getClass(), "resultComputed", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.analysis.solvers.BrentSolver");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = double.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = -7.68986676435475E38;
        args[1] = -3.378952081073199E-308;
        try {
            callMethod(klass, "solve", argTypes, term4716, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


