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
import java.lang.NullPointerException;
import static org.apache.commons.math3.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class SimplexSolver_getPivotRow_122981797214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8251;
     Object term8257;

    public SimplexSolver_getPivotRow_122981797214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8251 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        setDoubleField(term8251, term8251.getClass(), "epsilon", 0.0);
        setIntField(term8251, term8251.getClass(), "maxUlps", 0);
        setField(term8251, term8251.getClass(), "function", null);
        setField(term8251, term8251.getClass(), "linearConstraints", null);
        setField(term8251, term8251.getClass(), "goal", null);
        setBooleanField(term8251, term8251.getClass(), "nonNegative", false);
        setIntField(term8251, term8251.getClass(), "maxIterations", 0);
        setIntField(term8251, term8251.getClass(), "iterations", 0);
        term8257 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term8257;
        try {
            callMethod(klass, "getPivotRow", argTypes, term8251, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


