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

public class SimplexSolver_isPhase1Solved_36987646363 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34472;
     Object term34594;
     Object term34722;
     Object term34723;

    public SimplexSolver_isPhase1Solved_36987646363() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34472 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        term34594 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term34696 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setIntField(term34594, term34594.getClass(), "numArtificialVariables", 8192);
        setField(term34594, term34594.getClass(), "tableau", term34696);
        term34722 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setDoubleField(term34722, term34722.getClass(), "epsilon", 0.0);
        setIntField(term34722, term34722.getClass(), "maxIterations", 0);
        setIntField(term34722, term34722.getClass(), "iterations", 0);
        setField(term34722, term34722.getClass(), "f", null);
        setField(term34722, term34722.getClass(), "constraints", null);
        setField(term34722, term34722.getClass(), "goalType", null);
        setBooleanField(term34722, term34722.getClass(), "restrictToNonNegative", false);
        term34723 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term34724 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(term34723, term34723.getClass(), "f", null);
        setField(term34723, term34723.getClass(), "constraints", null);
        setBooleanField(term34723, term34723.getClass(), "restrictToNonNegative", false);
        setIntField(term34724, term34724.getClass(), "rowDimension", 0);
        setIntField(term34724, term34724.getClass(), "columnDimension", 0);
        setField(term34724, term34724.getClass(), "entries", null);
        setField(term34724, term34724.getClass(), "lu", null);
        setField(term34723, term34723.getClass(), "tableau", term34724);
        setIntField(term34723, term34723.getClass(), "numDecisionVariables", 0);
        setIntField(term34723, term34723.getClass(), "numSlackVariables", 0);
        setIntField(term34723, term34723.getClass(), "numArtificialVariables", 8192);
        setDoubleField(term34723, term34723.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term34594;
        Object retValue = callMethod(klass, "isPhase1Solved", argTypes, term34472, args);
        assertTrue(recursiveEquals(term34472, term34722));
        assertTrue(recursiveEquals(term34594, term34723));
        assertTrue(recursiveEquals(retValue, true));
    }

};


