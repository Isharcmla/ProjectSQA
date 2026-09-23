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
import java.lang.NullPointerException;
import static org.apache.commons.math.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class SimplexSolver_doOptimize_101389412917 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6333;

    public SimplexSolver_doOptimize_101389412917() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17915 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term17914 = ((Class) term17915).getDeclaredField((String) "LEQ");
        ((Field) term17914).setAccessible(true);
        Object enum53 = ((Field) term17914).get((Object) null);
        Object term6341 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term6341, term6341.getClass(), "coefficients", null);
        setField(term6341, term6341.getClass(), "relationship", enum53);
        setDoubleField(term6341, term6341.getClass(), "value", 0.2109867221632754);
        Class<? extends Object> term18211 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term18210 = ((Class) term18211).getDeclaredField((String) "EQ");
        ((Field) term18210).setAccessible(true);
        Object enum54 = ((Field) term18210).get((Object) null);
        Object term6345 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term6345, term6345.getClass(), "coefficients", null);
        setField(term6345, term6345.getClass(), "relationship", enum54);
        setDoubleField(term6345, term6345.getClass(), "value", 0.3227335400819148);
        Object term6349 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term6349, term6349.getClass(), "coefficients", null);
        setField(term6349, term6349.getClass(), "relationship", enum53);
        setDoubleField(term6349, term6349.getClass(), "value", 0.43337207054070237);
        Object term6351 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term6351, term6351.getClass(), "coefficients", null);
        setField(term6351, term6351.getClass(), "relationship", enum53);
        setDoubleField(term6351, term6351.getClass(), "value", 0.13246999699526574);
        ArrayList term6339 = new ArrayList();
        ((ArrayList) term6339).add(term6341);
        ((ArrayList) term6339).add(term6345);
        ((ArrayList) term6339).add(term6349);
        ((ArrayList) term6339).add(term6351);
        Class<? extends Object> term18504 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term18503 = ((Class) term18504).getDeclaredField((String) "MINIMIZE");
        ((Field) term18503).setAccessible(true);
        Object enum55 = ((Field) term18503).get((Object) null);
        term6333 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        Object term6337 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setDoubleField(term6333, term6333.getClass(), "epsilon", 1.0E-6);
        setIntField(term6333, term6333.getClass(), "maxIterations", 100);
        setIntField(term6333, term6333.getClass(), "iterations", -2068769794);
        setField(term6337, term6337.getClass(), "coefficients", null);
        setDoubleField(term6337, term6337.getClass(), "constantTerm", 0.7919370314903882);
        setField(term6333, term6333.getClass(), "f", term6337);
        setField(term6333, term6333.getClass(), "constraints", term6339);
        setField(term6333, term6333.getClass(), "goalType", enum55);
        setBooleanField(term6333, term6333.getClass(), "restrictToNonNegative", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "doOptimize", argTypes, term6333, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


