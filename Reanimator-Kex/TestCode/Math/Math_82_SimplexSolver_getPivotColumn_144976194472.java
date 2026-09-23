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

public class SimplexSolver_getPivotColumn_144976194472 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36308;
     Object term36430;
     Object term38211;
     Object term38212;

    public SimplexSolver_getPivotColumn_144976194472() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36308 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        term36430 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term36538 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        Object[] term36166 = (Object[]) newArray("[D", 1);
        setIntField(term36430, term36430.getClass(), "numArtificialVariables", 0);
        setField(term36538, term36538.getClass(), "data", term36166);
        setField(term36430, term36430.getClass(), "tableau", term36538);
        term38211 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setDoubleField(term38211, term38211.getClass(), "epsilon", 0.0);
        setIntField(term38211, term38211.getClass(), "maxIterations", 0);
        setIntField(term38211, term38211.getClass(), "iterations", 0);
        setField(term38211, term38211.getClass(), "f", null);
        setField(term38211, term38211.getClass(), "constraints", null);
        setField(term38211, term38211.getClass(), "goalType", null);
        setBooleanField(term38211, term38211.getClass(), "restrictToNonNegative", false);
        term38212 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term38213 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        Object[] term38214 = (Object[]) newArray("[D", 1);
        setField(term38212, term38212.getClass(), "f", null);
        setField(term38212, term38212.getClass(), "constraints", null);
        setBooleanField(term38212, term38212.getClass(), "restrictToNonNegative", false);
        setField(term38213, term38213.getClass(), "data", term38214);
        setField(term38213, term38213.getClass(), "lu", null);
        setField(term38212, term38212.getClass(), "tableau", term38213);
        setIntField(term38212, term38212.getClass(), "numDecisionVariables", 0);
        setIntField(term38212, term38212.getClass(), "numSlackVariables", 0);
        setIntField(term38212, term38212.getClass(), "numArtificialVariables", 0);
        setDoubleField(term38212, term38212.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term36430;
        Object retValue = callMethod(klass, "getPivotColumn", argTypes, term36308, args);
        assertTrue(recursiveEquals(term36308, term38211));
        assertTrue(recursiveEquals(term36430, term38212));
        assertTrue(recursiveEquals(retValue, null));
    }

};


