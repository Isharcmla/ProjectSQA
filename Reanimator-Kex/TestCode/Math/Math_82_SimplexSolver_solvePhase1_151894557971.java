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
import org.apache.commons.math.linear.MatrixIndexException;
import static org.apache.commons.math.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SimplexSolver_solvePhase1_151894557971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35937;
     Object term36059;

    public SimplexSolver_solvePhase1_151894557971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35937 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        term36059 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term36161 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setIntField(term36059, term36059.getClass(), "numArtificialVariables", 8192);
        setIntField(term36161, term36161.getClass(), "columnDimension", 4);
        setField(term36059, term36059.getClass(), "tableau", term36161);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term36059;
        try {
            callMethod(klass, "solvePhase1", argTypes, term35937, args);
            assertTrue(false);
        }
        catch (MatrixIndexException e) {
        }

    }

};


