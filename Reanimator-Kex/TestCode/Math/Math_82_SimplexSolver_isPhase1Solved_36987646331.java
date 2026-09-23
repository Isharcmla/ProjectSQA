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

public class SimplexSolver_isPhase1Solved_36987646331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20542;
     Object term20664;
     Object term23137;
     Object term23138;

    public SimplexSolver_isPhase1Solved_36987646331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20542 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        term20664 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setIntField(term20664, term20664.getClass(), "numArtificialVariables", 0);
        term23137 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setDoubleField(term23137, term23137.getClass(), "epsilon", 0.0);
        setIntField(term23137, term23137.getClass(), "maxIterations", 0);
        setIntField(term23137, term23137.getClass(), "iterations", 0);
        setField(term23137, term23137.getClass(), "f", null);
        setField(term23137, term23137.getClass(), "constraints", null);
        setField(term23137, term23137.getClass(), "goalType", null);
        setBooleanField(term23137, term23137.getClass(), "restrictToNonNegative", false);
        term23138 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term23138, term23138.getClass(), "f", null);
        setField(term23138, term23138.getClass(), "constraints", null);
        setBooleanField(term23138, term23138.getClass(), "restrictToNonNegative", false);
        setField(term23138, term23138.getClass(), "tableau", null);
        setIntField(term23138, term23138.getClass(), "numDecisionVariables", 0);
        setIntField(term23138, term23138.getClass(), "numSlackVariables", 0);
        setIntField(term23138, term23138.getClass(), "numArtificialVariables", 0);
        setDoubleField(term23138, term23138.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term20664;
        Object retValue = callMethod(klass, "isPhase1Solved", argTypes, term20542, args);
        assertTrue(recursiveEquals(term20542, term23137));
        assertTrue(recursiveEquals(term20664, term23138));
        assertTrue(recursiveEquals(retValue, true));
    }

};


