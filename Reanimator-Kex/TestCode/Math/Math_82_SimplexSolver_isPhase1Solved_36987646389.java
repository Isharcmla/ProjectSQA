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

public class SimplexSolver_isPhase1Solved_36987646389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43012;
     Object term43134;
     Object term43550;
     Object term43551;

    public SimplexSolver_isPhase1Solved_36987646389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43012 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        term43134 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term43242 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setIntField(term43134, term43134.getClass(), "numArtificialVariables", -2147483648);
        setField(term43134, term43134.getClass(), "tableau", term43242);
        term43550 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setDoubleField(term43550, term43550.getClass(), "epsilon", 0.0);
        setIntField(term43550, term43550.getClass(), "maxIterations", 0);
        setIntField(term43550, term43550.getClass(), "iterations", 0);
        setField(term43550, term43550.getClass(), "f", null);
        setField(term43550, term43550.getClass(), "constraints", null);
        setField(term43550, term43550.getClass(), "goalType", null);
        setBooleanField(term43550, term43550.getClass(), "restrictToNonNegative", false);
        term43551 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term43552 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(term43551, term43551.getClass(), "f", null);
        setField(term43551, term43551.getClass(), "constraints", null);
        setBooleanField(term43551, term43551.getClass(), "restrictToNonNegative", false);
        setField(term43552, term43552.getClass(), "data", null);
        setField(term43552, term43552.getClass(), "lu", null);
        setField(term43551, term43551.getClass(), "tableau", term43552);
        setIntField(term43551, term43551.getClass(), "numDecisionVariables", 0);
        setIntField(term43551, term43551.getClass(), "numSlackVariables", 0);
        setIntField(term43551, term43551.getClass(), "numArtificialVariables", -2147483648);
        setDoubleField(term43551, term43551.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term43134;
        Object retValue = callMethod(klass, "isPhase1Solved", argTypes, term43012, args);
        assertTrue(recursiveEquals(term43012, term43550));
        assertTrue(recursiveEquals(term43134, term43551));
        assertTrue(recursiveEquals(retValue, true));
    }

};


