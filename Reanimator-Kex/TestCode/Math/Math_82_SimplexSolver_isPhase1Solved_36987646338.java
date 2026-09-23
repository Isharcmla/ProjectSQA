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

public class SimplexSolver_isPhase1Solved_36987646338 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23831;
     Object term23953;
     Object term24704;
     Object term24705;

    public SimplexSolver_isPhase1Solved_36987646338() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23831 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        term23953 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term24049 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        setIntField(term23953, term23953.getClass(), "numArtificialVariables", -2147483648);
        setField(term23953, term23953.getClass(), "tableau", term24049);
        term24704 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        setDoubleField(term24704, term24704.getClass(), "epsilon", 0.0);
        setIntField(term24704, term24704.getClass(), "maxIterations", 0);
        setIntField(term24704, term24704.getClass(), "iterations", 0);
        setField(term24704, term24704.getClass(), "f", null);
        setField(term24704, term24704.getClass(), "constraints", null);
        setField(term24704, term24704.getClass(), "goalType", null);
        setBooleanField(term24704, term24704.getClass(), "restrictToNonNegative", false);
        term24705 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term24706 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        setField(term24705, term24705.getClass(), "f", null);
        setField(term24705, term24705.getClass(), "constraints", null);
        setBooleanField(term24705, term24705.getClass(), "restrictToNonNegative", false);
        setField(term24706, term24706.getClass(), "data", null);
        setField(term24706, term24706.getClass(), "lu", null);
        setField(term24705, term24705.getClass(), "tableau", term24706);
        setIntField(term24705, term24705.getClass(), "numDecisionVariables", 0);
        setIntField(term24705, term24705.getClass(), "numSlackVariables", 0);
        setIntField(term24705, term24705.getClass(), "numArtificialVariables", -2147483648);
        setDoubleField(term24705, term24705.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term23953;
        Object retValue = callMethod(klass, "isPhase1Solved", argTypes, term23831, args);
        assertTrue(recursiveEquals(term23831, term24704));
        assertTrue(recursiveEquals(term23953, term24705));
        assertTrue(recursiveEquals(retValue, true));
    }

};


