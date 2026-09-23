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

public class SimplexSolver_isOptimal_142937146077 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38745;
     Object term38867;
     Object term39316;
     Object term39317;

    public SimplexSolver_isOptimal_142937146077() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38745 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        term38867 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term38975 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        Object[] term38604 = (Object[]) newArray("[D", 1);
        setIntField(term38867, term38867.getClass(), "numArtificialVariables", 0);
        setField(term38975, term38975.getClass(), "data", term38604);
        setField(term38867, term38867.getClass(), "tableau", term38975);
        term39316 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setDoubleField(term39316, term39316.getClass(), "epsilon", 0.0);
        setIntField(term39316, term39316.getClass(), "maxIterations", 0);
        setIntField(term39316, term39316.getClass(), "iterations", 0);
        setField(term39316, term39316.getClass(), "f", null);
        setField(term39316, term39316.getClass(), "constraints", null);
        setField(term39316, term39316.getClass(), "goalType", null);
        setBooleanField(term39316, term39316.getClass(), "restrictToNonNegative", false);
        term39317 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term39318 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        Object[] term39319 = (Object[]) newArray("[D", 1);
        setField(term39317, term39317.getClass(), "f", null);
        setField(term39317, term39317.getClass(), "constraints", null);
        setBooleanField(term39317, term39317.getClass(), "restrictToNonNegative", false);
        setField(term39318, term39318.getClass(), "data", term39319);
        setField(term39318, term39318.getClass(), "lu", null);
        setField(term39317, term39317.getClass(), "tableau", term39318);
        setIntField(term39317, term39317.getClass(), "numDecisionVariables", 0);
        setIntField(term39317, term39317.getClass(), "numSlackVariables", 0);
        setIntField(term39317, term39317.getClass(), "numArtificialVariables", 0);
        setDoubleField(term39317, term39317.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term38867;
        Object retValue = callMethod(klass, "isOptimal", argTypes, term38745, args);
        assertTrue(recursiveEquals(term38745, term39316));
        assertTrue(recursiveEquals(term38867, term39317));
        assertTrue(recursiveEquals(retValue, true));
    }

};


