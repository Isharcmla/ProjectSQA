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

public class SimplexSolver_solvePhase1_151894557929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19779;
     Object term19901;
     Object term22604;
     Object term22605;

    public SimplexSolver_solvePhase1_151894557929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19779 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        term19901 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setIntField(term19901, term19901.getClass(), "numArtificialVariables", 0);
        term22604 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setDoubleField(term22604, term22604.getClass(), "epsilon", 0.0);
        setIntField(term22604, term22604.getClass(), "maxIterations", 0);
        setIntField(term22604, term22604.getClass(), "iterations", 0);
        setField(term22604, term22604.getClass(), "f", null);
        setField(term22604, term22604.getClass(), "constraints", null);
        setField(term22604, term22604.getClass(), "goalType", null);
        setBooleanField(term22604, term22604.getClass(), "restrictToNonNegative", false);
        term22605 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term22605, term22605.getClass(), "f", null);
        setField(term22605, term22605.getClass(), "constraints", null);
        setBooleanField(term22605, term22605.getClass(), "restrictToNonNegative", false);
        setField(term22605, term22605.getClass(), "tableau", null);
        setIntField(term22605, term22605.getClass(), "numDecisionVariables", 0);
        setIntField(term22605, term22605.getClass(), "numSlackVariables", 0);
        setIntField(term22605, term22605.getClass(), "numArtificialVariables", 0);
        setDoubleField(term22605, term22605.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term19901;
        callMethod(klass, "solvePhase1", argTypes, term19779, args);
        assertTrue(recursiveEquals(term19779, term22604));
        assertTrue(recursiveEquals(term19901, term22605));
    }

};


