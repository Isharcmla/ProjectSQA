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

public class SimplexSolver_getPivotColumn_190165824841 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30863;
     Object term30987;
     Object term31116;
     Object term31117;

    public SimplexSolver_getPivotColumn_190165824841() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30863 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        term30987 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term31087 = newInstance(Class.forName("org.apache.commons.math3.linear.BlockRealMatrix"));
        setIntField(term30987, term30987.getClass(), "numArtificialVariables", 0);
        setField(term30987, term30987.getClass(), "tableau", term31087);
        term31116 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        setDoubleField(term31116, term31116.getClass(), "epsilon", 0.0);
        setIntField(term31116, term31116.getClass(), "maxUlps", 0);
        setField(term31116, term31116.getClass(), "function", null);
        setField(term31116, term31116.getClass(), "linearConstraints", null);
        setField(term31116, term31116.getClass(), "goal", null);
        setBooleanField(term31116, term31116.getClass(), "nonNegative", false);
        setIntField(term31116, term31116.getClass(), "maxIterations", 0);
        setIntField(term31116, term31116.getClass(), "iterations", 0);
        term31117 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term31118 = newInstance(Class.forName("org.apache.commons.math3.linear.BlockRealMatrix"));
        setField(term31117, term31117.getClass(), "f", null);
        setField(term31117, term31117.getClass(), "constraints", null);
        setBooleanField(term31117, term31117.getClass(), "restrictToNonNegative", false);
        setField(term31117, term31117.getClass(), "columnLabels", null);
        setField(term31118, term31118.getClass(), "blocks", null);
        setIntField(term31118, term31118.getClass(), "rows", 0);
        setIntField(term31118, term31118.getClass(), "columns", 0);
        setIntField(term31118, term31118.getClass(), "blockRows", 0);
        setIntField(term31118, term31118.getClass(), "blockColumns", 0);
        setField(term31117, term31117.getClass(), "tableau", term31118);
        setIntField(term31117, term31117.getClass(), "numDecisionVariables", 0);
        setIntField(term31117, term31117.getClass(), "numSlackVariables", 0);
        setIntField(term31117, term31117.getClass(), "numArtificialVariables", 0);
        setDoubleField(term31117, term31117.getClass(), "epsilon", 0.0);
        setIntField(term31117, term31117.getClass(), "maxUlps", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term30987;
        Object retValue = callMethod(klass, "getPivotColumn", argTypes, term30863, args);
        assertTrue(recursiveEquals(term30863, term31116));
        assertTrue(recursiveEquals(term30987, term31117));
        assertTrue(recursiveEquals(retValue, null));
    }

};


