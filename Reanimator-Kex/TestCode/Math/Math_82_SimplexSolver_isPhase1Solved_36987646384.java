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
import static org.apache.commons.math.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.optimization.linear.EqualityUtils.*;
import java.lang.Object;

public class SimplexSolver_isPhase1Solved_36987646384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40216;
     Object term40338;
     Object term42128;
     Object term42129;

    public SimplexSolver_isPhase1Solved_36987646384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40216 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        term40338 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term40436 = newInstance(Class.forName("org.apache.commons.math.linear.BlockRealMatrix"));
        setIntField(term40338, term40338.getClass(), "numArtificialVariables", -2147483648);
        setField(term40338, term40338.getClass(), "tableau", term40436);
        term42128 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setDoubleField(term42128, term42128.getClass(), "epsilon", 0.0);
        setIntField(term42128, term42128.getClass(), "maxIterations", 0);
        setIntField(term42128, term42128.getClass(), "iterations", 0);
        setField(term42128, term42128.getClass(), "f", null);
        setField(term42128, term42128.getClass(), "constraints", null);
        setField(term42128, term42128.getClass(), "goalType", null);
        setBooleanField(term42128, term42128.getClass(), "restrictToNonNegative", false);
        term42129 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term42130 = newInstance(Class.forName("org.apache.commons.math.linear.BlockRealMatrix"));
        setField(term42129, term42129.getClass(), "f", null);
        setField(term42129, term42129.getClass(), "constraints", null);
        setBooleanField(term42129, term42129.getClass(), "restrictToNonNegative", false);
        setField(term42130, term42130.getClass(), "blocks", null);
        setIntField(term42130, term42130.getClass(), "rows", 0);
        setIntField(term42130, term42130.getClass(), "columns", 0);
        setIntField(term42130, term42130.getClass(), "blockRows", 0);
        setIntField(term42130, term42130.getClass(), "blockColumns", 0);
        setField(term42130, term42130.getClass(), "lu", null);
        setField(term42129, term42129.getClass(), "tableau", term42130);
        setIntField(term42129, term42129.getClass(), "numDecisionVariables", 0);
        setIntField(term42129, term42129.getClass(), "numSlackVariables", 0);
        setIntField(term42129, term42129.getClass(), "numArtificialVariables", -2147483648);
        setDoubleField(term42129, term42129.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term40338;
        Object retValue = callMethod(klass, "isPhase1Solved", argTypes, term40216, args);
        assertTrue(recursiveEquals(term40216, term42128));
        assertTrue(recursiveEquals(term40338, term42129));
        assertTrue(recursiveEquals(retValue, true));
    }

};


