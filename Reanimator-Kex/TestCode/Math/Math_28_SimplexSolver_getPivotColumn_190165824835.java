package org.apache.commons.math3.optimization.linear;

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
import static org.apache.commons.math3.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.optimization.linear.EqualityUtils.*;
import java.lang.Object;

public class SimplexSolver_getPivotColumn_190165824835 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28626;
     Object term28750;
     Object term28879;
     Object term28880;

    public SimplexSolver_getPivotColumn_190165824835() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28626 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        term28750 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term28854 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setIntField(term28750, term28750.getClass(), "numArtificialVariables", 1);
        setField(term28750, term28750.getClass(), "tableau", term28854);
        term28879 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        setDoubleField(term28879, term28879.getClass(), "epsilon", 0.0);
        setIntField(term28879, term28879.getClass(), "maxUlps", 0);
        setField(term28879, term28879.getClass(), "function", null);
        setField(term28879, term28879.getClass(), "linearConstraints", null);
        setField(term28879, term28879.getClass(), "goal", null);
        setBooleanField(term28879, term28879.getClass(), "nonNegative", false);
        setIntField(term28879, term28879.getClass(), "maxIterations", 0);
        setIntField(term28879, term28879.getClass(), "iterations", 0);
        term28880 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term28881 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(term28880, term28880.getClass(), "f", null);
        setField(term28880, term28880.getClass(), "constraints", null);
        setBooleanField(term28880, term28880.getClass(), "restrictToNonNegative", false);
        setField(term28880, term28880.getClass(), "columnLabels", null);
        setIntField(term28881, term28881.getClass(), "rows", 0);
        setIntField(term28881, term28881.getClass(), "columns", 0);
        setField(term28881, term28881.getClass(), "entries", null);
        setField(term28880, term28880.getClass(), "tableau", term28881);
        setIntField(term28880, term28880.getClass(), "numDecisionVariables", 0);
        setIntField(term28880, term28880.getClass(), "numSlackVariables", 0);
        setIntField(term28880, term28880.getClass(), "numArtificialVariables", 1);
        setDoubleField(term28880, term28880.getClass(), "epsilon", 0.0);
        setIntField(term28880, term28880.getClass(), "maxUlps", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term28750;
        Object retValue = callMethod(klass, "getPivotColumn", argTypes, term28626, args);
        assertTrue(recursiveEquals(term28626, term28879));
        assertTrue(recursiveEquals(term28750, term28880));
        assertTrue(recursiveEquals(retValue, null));
    }

};


