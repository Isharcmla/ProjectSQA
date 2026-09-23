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

public class SimplexSolver_isPhase1Solved_36987646391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43701;
     Object term43823;
     Object term43957;
     Object term43958;

    public SimplexSolver_isPhase1Solved_36987646391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43701 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        term43823 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term43931 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        Object[] term43558 = (Object[]) newArray("[D", 498);
        setIntField(term43823, term43823.getClass(), "numArtificialVariables", 4194304);
        setField(term43931, term43931.getClass(), "data", term43558);
        setField(term43823, term43823.getClass(), "tableau", term43931);
        term43957 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setDoubleField(term43957, term43957.getClass(), "epsilon", 0.0);
        setIntField(term43957, term43957.getClass(), "maxIterations", 0);
        setIntField(term43957, term43957.getClass(), "iterations", 0);
        setField(term43957, term43957.getClass(), "f", null);
        setField(term43957, term43957.getClass(), "constraints", null);
        setField(term43957, term43957.getClass(), "goalType", null);
        setBooleanField(term43957, term43957.getClass(), "restrictToNonNegative", false);
        term43958 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term43959 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        Object[] term43960 = (Object[]) newArray("[D", 498);
        setField(term43958, term43958.getClass(), "f", null);
        setField(term43958, term43958.getClass(), "constraints", null);
        setBooleanField(term43958, term43958.getClass(), "restrictToNonNegative", false);
        setField(term43959, term43959.getClass(), "data", term43960);
        setField(term43959, term43959.getClass(), "lu", null);
        setField(term43958, term43958.getClass(), "tableau", term43959);
        setIntField(term43958, term43958.getClass(), "numDecisionVariables", 0);
        setIntField(term43958, term43958.getClass(), "numSlackVariables", 0);
        setIntField(term43958, term43958.getClass(), "numArtificialVariables", 4194304);
        setDoubleField(term43958, term43958.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term43823;
        Object retValue = callMethod(klass, "isPhase1Solved", argTypes, term43701, args);
        assertTrue(recursiveEquals(term43701, term43957));
        assertTrue(recursiveEquals(term43823, term43958));
        assertTrue(recursiveEquals(retValue, true));
    }

};


