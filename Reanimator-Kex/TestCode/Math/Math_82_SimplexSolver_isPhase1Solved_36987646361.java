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

public class SimplexSolver_isPhase1Solved_36987646361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34081;
     Object term34203;
     Object term34325;
     Object term34326;

    public SimplexSolver_isPhase1Solved_36987646361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34081 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        term34203 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term34299 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term33938 = (Object[]) newArray("[D", 114);
        setIntField(term34203, term34203.getClass(), "numArtificialVariables", -2139095040);
        setField(term34299, term34299.getClass(), "data", term33938);
        setField(term34203, term34203.getClass(), "tableau", term34299);
        term34325 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setDoubleField(term34325, term34325.getClass(), "epsilon", 0.0);
        setIntField(term34325, term34325.getClass(), "maxIterations", 0);
        setIntField(term34325, term34325.getClass(), "iterations", 0);
        setField(term34325, term34325.getClass(), "f", null);
        setField(term34325, term34325.getClass(), "constraints", null);
        setField(term34325, term34325.getClass(), "goalType", null);
        setBooleanField(term34325, term34325.getClass(), "restrictToNonNegative", false);
        term34326 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term34327 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        Object[] term34328 = (Object[]) newArray("[D", 114);
        setField(term34326, term34326.getClass(), "f", null);
        setField(term34326, term34326.getClass(), "constraints", null);
        setBooleanField(term34326, term34326.getClass(), "restrictToNonNegative", false);
        setField(term34327, term34327.getClass(), "data", term34328);
        setField(term34327, term34327.getClass(), "lu", null);
        setField(term34326, term34326.getClass(), "tableau", term34327);
        setIntField(term34326, term34326.getClass(), "numDecisionVariables", 0);
        setIntField(term34326, term34326.getClass(), "numSlackVariables", 0);
        setIntField(term34326, term34326.getClass(), "numArtificialVariables", -2139095040);
        setDoubleField(term34326, term34326.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term34203;
        Object retValue = callMethod(klass, "isPhase1Solved", argTypes, term34081, args);
        assertTrue(recursiveEquals(term34081, term34325));
        assertTrue(recursiveEquals(term34203, term34326));
        assertTrue(recursiveEquals(retValue, true));
    }

};


