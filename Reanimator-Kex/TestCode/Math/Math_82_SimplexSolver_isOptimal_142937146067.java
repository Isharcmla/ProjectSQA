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

public class SimplexSolver_isOptimal_142937146067 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35232;
     Object term35354;
     Object term35785;
     Object term35786;

    public SimplexSolver_isOptimal_142937146067() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35232 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        term35354 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term35456 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setIntField(term35354, term35354.getClass(), "numArtificialVariables", 0);
        setField(term35354, term35354.getClass(), "tableau", term35456);
        term35785 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setDoubleField(term35785, term35785.getClass(), "epsilon", 0.0);
        setIntField(term35785, term35785.getClass(), "maxIterations", 0);
        setIntField(term35785, term35785.getClass(), "iterations", 0);
        setField(term35785, term35785.getClass(), "f", null);
        setField(term35785, term35785.getClass(), "constraints", null);
        setField(term35785, term35785.getClass(), "goalType", null);
        setBooleanField(term35785, term35785.getClass(), "restrictToNonNegative", false);
        term35786 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term35787 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(term35786, term35786.getClass(), "f", null);
        setField(term35786, term35786.getClass(), "constraints", null);
        setBooleanField(term35786, term35786.getClass(), "restrictToNonNegative", false);
        setIntField(term35787, term35787.getClass(), "rowDimension", 0);
        setIntField(term35787, term35787.getClass(), "columnDimension", 0);
        setField(term35787, term35787.getClass(), "entries", null);
        setField(term35787, term35787.getClass(), "lu", null);
        setField(term35786, term35786.getClass(), "tableau", term35787);
        setIntField(term35786, term35786.getClass(), "numDecisionVariables", 0);
        setIntField(term35786, term35786.getClass(), "numSlackVariables", 0);
        setIntField(term35786, term35786.getClass(), "numArtificialVariables", 0);
        setDoubleField(term35786, term35786.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term35354;
        Object retValue = callMethod(klass, "isOptimal", argTypes, term35232, args);
        assertTrue(recursiveEquals(term35232, term35785));
        assertTrue(recursiveEquals(term35354, term35786));
        assertTrue(recursiveEquals(retValue, true));
    }

};


