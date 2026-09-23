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

public class SimplexSolver_isOptimal_142937146021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19139;
     Object term19261;
     Object term19644;
     Object term19645;

    public SimplexSolver_isOptimal_142937146021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term19139 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        term19261 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setIntField(term19261, term19261.getClass(), "numArtificialVariables", 1);
        term19644 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setDoubleField(term19644, term19644.getClass(), "epsilon", 0.0);
        setIntField(term19644, term19644.getClass(), "maxIterations", 0);
        setIntField(term19644, term19644.getClass(), "iterations", 0);
        setField(term19644, term19644.getClass(), "f", null);
        setField(term19644, term19644.getClass(), "constraints", null);
        setField(term19644, term19644.getClass(), "goalType", null);
        setBooleanField(term19644, term19644.getClass(), "restrictToNonNegative", false);
        term19645 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term19645, term19645.getClass(), "f", null);
        setField(term19645, term19645.getClass(), "constraints", null);
        setBooleanField(term19645, term19645.getClass(), "restrictToNonNegative", false);
        setField(term19645, term19645.getClass(), "tableau", null);
        setIntField(term19645, term19645.getClass(), "numDecisionVariables", 0);
        setIntField(term19645, term19645.getClass(), "numSlackVariables", 0);
        setIntField(term19645, term19645.getClass(), "numArtificialVariables", 1);
        setDoubleField(term19645, term19645.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term19261;
        Object retValue = callMethod(klass, "isOptimal", argTypes, term19139, args);
        assertTrue(recursiveEquals(term19139, term19644));
        assertTrue(recursiveEquals(term19261, term19645));
        assertTrue(recursiveEquals(retValue, false));
    }

};


