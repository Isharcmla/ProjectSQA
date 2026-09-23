package org.apache.commons.math.optimization.linear;

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
import static org.apache.commons.math.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SimplexSolver_getPivotColumn_144976194430 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20035;
     Object term20157;

    public SimplexSolver_getPivotColumn_144976194430() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20035 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        term20157 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setIntField(term20157, term20157.getClass(), "numArtificialVariables", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term20157;
        try {
            callMethod(klass, "getPivotColumn", argTypes, term20035, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


