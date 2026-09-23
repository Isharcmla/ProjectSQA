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

public class SimplexSolver_getPivotColumn_144976194475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36679;
     Object term36801;
     Object term38998;
     Object term38999;

    public SimplexSolver_getPivotColumn_144976194475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36679 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        term36801 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term36903 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setIntField(term36801, term36801.getClass(), "numArtificialVariables", 0);
        setField(term36801, term36801.getClass(), "tableau", term36903);
        term38998 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setDoubleField(term38998, term38998.getClass(), "epsilon", 0.0);
        setIntField(term38998, term38998.getClass(), "maxIterations", 0);
        setIntField(term38998, term38998.getClass(), "iterations", 0);
        setField(term38998, term38998.getClass(), "f", null);
        setField(term38998, term38998.getClass(), "constraints", null);
        setField(term38998, term38998.getClass(), "goalType", null);
        setBooleanField(term38998, term38998.getClass(), "restrictToNonNegative", false);
        term38999 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term39000 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(term38999, term38999.getClass(), "f", null);
        setField(term38999, term38999.getClass(), "constraints", null);
        setBooleanField(term38999, term38999.getClass(), "restrictToNonNegative", false);
        setIntField(term39000, term39000.getClass(), "rowDimension", 0);
        setIntField(term39000, term39000.getClass(), "columnDimension", 0);
        setField(term39000, term39000.getClass(), "entries", null);
        setField(term39000, term39000.getClass(), "lu", null);
        setField(term38999, term38999.getClass(), "tableau", term39000);
        setIntField(term38999, term38999.getClass(), "numDecisionVariables", 0);
        setIntField(term38999, term38999.getClass(), "numSlackVariables", 0);
        setIntField(term38999, term38999.getClass(), "numArtificialVariables", 0);
        setDoubleField(term38999, term38999.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term36801;
        Object retValue = callMethod(klass, "getPivotColumn", argTypes, term36679, args);
        assertTrue(recursiveEquals(term36679, term38998));
        assertTrue(recursiveEquals(term36801, term38999));
        assertTrue(recursiveEquals(retValue, null));
    }

};


