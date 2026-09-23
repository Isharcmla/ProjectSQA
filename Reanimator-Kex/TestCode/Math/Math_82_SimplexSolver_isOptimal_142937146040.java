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

public class SimplexSolver_isOptimal_142937146040 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24451;
     Object term24573;
     Object term24991;
     Object term24992;

    public SimplexSolver_isOptimal_142937146040() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24451 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        term24573 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term24681 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setIntField(term24573, term24573.getClass(), "numArtificialVariables", 0);
        setField(term24573, term24573.getClass(), "tableau", term24681);
        term24991 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setDoubleField(term24991, term24991.getClass(), "epsilon", 0.0);
        setIntField(term24991, term24991.getClass(), "maxIterations", 0);
        setIntField(term24991, term24991.getClass(), "iterations", 0);
        setField(term24991, term24991.getClass(), "f", null);
        setField(term24991, term24991.getClass(), "constraints", null);
        setField(term24991, term24991.getClass(), "goalType", null);
        setBooleanField(term24991, term24991.getClass(), "restrictToNonNegative", false);
        term24992 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term24993 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(term24992, term24992.getClass(), "f", null);
        setField(term24992, term24992.getClass(), "constraints", null);
        setBooleanField(term24992, term24992.getClass(), "restrictToNonNegative", false);
        setField(term24993, term24993.getClass(), "data", null);
        setField(term24993, term24993.getClass(), "lu", null);
        setField(term24992, term24992.getClass(), "tableau", term24993);
        setIntField(term24992, term24992.getClass(), "numDecisionVariables", 0);
        setIntField(term24992, term24992.getClass(), "numSlackVariables", 0);
        setIntField(term24992, term24992.getClass(), "numArtificialVariables", 0);
        setDoubleField(term24992, term24992.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term24573;
        Object retValue = callMethod(klass, "isOptimal", argTypes, term24451, args);
        assertTrue(recursiveEquals(term24451, term24991));
        assertTrue(recursiveEquals(term24573, term24992));
        assertTrue(recursiveEquals(retValue, true));
    }

};


