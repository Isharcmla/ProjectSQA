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
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class SimplexSolver_doOptimize_48661028513 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4543;

    public SimplexSolver_doOptimize_48661028513() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term12256 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term12255 = ((Class) term12256).getDeclaredField((String) "GEQ");
        ((Field) term12255).setAccessible(true);
        Object enum30 = ((Field) term12255).get((Object) null);
        Object term4550 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term4550, term4550.getClass(), "coefficients", null);
        setField(term4550, term4550.getClass(), "relationship", enum30);
        setDoubleField(term4550, term4550.getClass(), "value", 0.8878841294187743);
        Class<? extends Object> term12557 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term12556 = ((Class) term12557).getDeclaredField((String) "LEQ");
        ((Field) term12556).setAccessible(true);
        Object enum31 = ((Field) term12556).get((Object) null);
        Object term4554 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term4554, term4554.getClass(), "coefficients", null);
        setField(term4554, term4554.getClass(), "relationship", enum31);
        setDoubleField(term4554, term4554.getClass(), "value", 0.6588948704887806);
        ArrayList term4548 = new ArrayList();
        ((ArrayList) term4548).add(term4550);
        ((ArrayList) term4548).add(term4554);
        Class<? extends Object> term12858 = Class.forName((String) "org.apache.commons.math3.optimization.GoalType");
        Field term12857 = ((Class) term12858).getDeclaredField((String) "MINIMIZE");
        ((Field) term12857).setAccessible(true);
        Object enum32 = ((Field) term12857).get((Object) null);
        term4543 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        Object term4546 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        setDoubleField(term4543, term4543.getClass(), "epsilon", 1.0E-6);
        setIntField(term4543, term4543.getClass(), "maxUlps", 10);
        setField(term4546, term4546.getClass(), "coefficients", null);
        setDoubleField(term4546, term4546.getClass(), "constantTerm", 0.22651340641904605);
        setField(term4543, term4543.getClass(), "function", term4546);
        setField(term4543, term4543.getClass(), "linearConstraints", term4548);
        setField(term4543, term4543.getClass(), "goal", enum32);
        setBooleanField(term4543, term4543.getClass(), "nonNegative", false);
        setIntField(term4543, term4543.getClass(), "maxIterations", 100);
        setIntField(term4543, term4543.getClass(), "iterations", 1622346318);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "doOptimize", argTypes, term4543, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


