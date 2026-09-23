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

public class SimplexSolver_getPivotColumn_144976194433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21070;
     Object term21192;
     Object term23428;
     Object term23429;

    public SimplexSolver_getPivotColumn_144976194433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21070 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        term21192 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term21294 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setIntField(term21192, term21192.getClass(), "numArtificialVariables", 1);
        setField(term21192, term21192.getClass(), "tableau", term21294);
        term23428 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setDoubleField(term23428, term23428.getClass(), "epsilon", 0.0);
        setIntField(term23428, term23428.getClass(), "maxIterations", 0);
        setIntField(term23428, term23428.getClass(), "iterations", 0);
        setField(term23428, term23428.getClass(), "f", null);
        setField(term23428, term23428.getClass(), "constraints", null);
        setField(term23428, term23428.getClass(), "goalType", null);
        setBooleanField(term23428, term23428.getClass(), "restrictToNonNegative", false);
        term23429 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term23430 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(term23429, term23429.getClass(), "f", null);
        setField(term23429, term23429.getClass(), "constraints", null);
        setBooleanField(term23429, term23429.getClass(), "restrictToNonNegative", false);
        setIntField(term23430, term23430.getClass(), "rowDimension", 0);
        setIntField(term23430, term23430.getClass(), "columnDimension", 0);
        setField(term23430, term23430.getClass(), "entries", null);
        setField(term23430, term23430.getClass(), "lu", null);
        setField(term23429, term23429.getClass(), "tableau", term23430);
        setIntField(term23429, term23429.getClass(), "numDecisionVariables", 0);
        setIntField(term23429, term23429.getClass(), "numSlackVariables", 0);
        setIntField(term23429, term23429.getClass(), "numArtificialVariables", 1);
        setDoubleField(term23429, term23429.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term21192;
        Object retValue = callMethod(klass, "getPivotColumn", argTypes, term21070, args);
        assertTrue(recursiveEquals(term21070, term23428));
        assertTrue(recursiveEquals(term21192, term23429));
        assertTrue(recursiveEquals(retValue, null));
    }

};


