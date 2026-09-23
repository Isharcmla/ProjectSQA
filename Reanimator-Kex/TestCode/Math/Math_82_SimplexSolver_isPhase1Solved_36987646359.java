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

public class SimplexSolver_isPhase1Solved_36987646359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33680;
     Object term33802;
     Object term33930;
     Object term33931;

    public SimplexSolver_isPhase1Solved_36987646359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33680 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        term33802 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term33904 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setIntField(term33802, term33802.getClass(), "numArtificialVariables", -2147483648);
        setField(term33802, term33802.getClass(), "tableau", term33904);
        term33930 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setDoubleField(term33930, term33930.getClass(), "epsilon", 0.0);
        setIntField(term33930, term33930.getClass(), "maxIterations", 0);
        setIntField(term33930, term33930.getClass(), "iterations", 0);
        setField(term33930, term33930.getClass(), "f", null);
        setField(term33930, term33930.getClass(), "constraints", null);
        setField(term33930, term33930.getClass(), "goalType", null);
        setBooleanField(term33930, term33930.getClass(), "restrictToNonNegative", false);
        term33931 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term33932 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(term33931, term33931.getClass(), "f", null);
        setField(term33931, term33931.getClass(), "constraints", null);
        setBooleanField(term33931, term33931.getClass(), "restrictToNonNegative", false);
        setIntField(term33932, term33932.getClass(), "rowDimension", 0);
        setIntField(term33932, term33932.getClass(), "columnDimension", 0);
        setField(term33932, term33932.getClass(), "entries", null);
        setField(term33932, term33932.getClass(), "lu", null);
        setField(term33931, term33931.getClass(), "tableau", term33932);
        setIntField(term33931, term33931.getClass(), "numDecisionVariables", 0);
        setIntField(term33931, term33931.getClass(), "numSlackVariables", 0);
        setIntField(term33931, term33931.getClass(), "numArtificialVariables", -2147483648);
        setDoubleField(term33931, term33931.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term33802;
        Object retValue = callMethod(klass, "isPhase1Solved", argTypes, term33680, args);
        assertTrue(recursiveEquals(term33680, term33930));
        assertTrue(recursiveEquals(term33802, term33931));
        assertTrue(recursiveEquals(retValue, true));
    }

};


