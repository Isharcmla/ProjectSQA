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

public class SimplexSolver_solvePhase1_57539847512 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3606;
     Object term3636;

    public SimplexSolver_solvePhase1_57539847512() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term10644 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term10643 = ((Class) term10644).getDeclaredField((String) "LEQ");
        ((Field) term10643).setAccessible(true);
        Object enum26 = ((Field) term10643).get((Object) null);
        Object term3613 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term3613, term3613.getClass(), "coefficients", null);
        setField(term3613, term3613.getClass(), "relationship", enum26);
        setDoubleField(term3613, term3613.getClass(), "value", 0.6300849762307866);
        Object term3617 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term3617, term3617.getClass(), "coefficients", null);
        setField(term3617, term3617.getClass(), "relationship", enum26);
        setDoubleField(term3617, term3617.getClass(), "value", 0.9737083944266686);
        ArrayList term3611 = new ArrayList();
        ((ArrayList) term3611).add(term3613);
        ((ArrayList) term3611).add(term3617);
        Class<? extends Object> term10945 = Class.forName((String) "org.apache.commons.math3.optimization.GoalType");
        Field term10944 = ((Class) term10945).getDeclaredField((String) "MAXIMIZE");
        ((Field) term10944).setAccessible(true);
        Object enum27 = ((Field) term10944).get((Object) null);
        term3606 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        Object term3609 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        setDoubleField(term3606, term3606.getClass(), "epsilon", 1.0E-6);
        setIntField(term3606, term3606.getClass(), "maxUlps", 10);
        setField(term3609, term3609.getClass(), "coefficients", null);
        setDoubleField(term3609, term3609.getClass(), "constantTerm", 0.2852810965221698);
        setField(term3606, term3606.getClass(), "function", term3609);
        setField(term3606, term3606.getClass(), "linearConstraints", term3611);
        setField(term3606, term3606.getClass(), "goal", enum27);
        setBooleanField(term3606, term3606.getClass(), "nonNegative", true);
        setIntField(term3606, term3606.getClass(), "maxIterations", 100);
        setIntField(term3606, term3606.getClass(), "iterations", -883034806);
        Class<? extends Object> term11206 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term11205 = ((Class) term11206).getDeclaredField((String) "LEQ");
        ((Field) term11205).setAccessible(true);
        Object enum28 = ((Field) term11205).get((Object) null);
        Object term3641 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term3641, term3641.getClass(), "coefficients", null);
        setField(term3641, term3641.getClass(), "relationship", enum28);
        setDoubleField(term3641, term3641.getClass(), "value", 0.3587267442738795);
        Object term3645 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term3645, term3645.getClass(), "coefficients", null);
        setField(term3645, term3645.getClass(), "relationship", enum28);
        setDoubleField(term3645, term3645.getClass(), "value", 0.07802449704920456);
        Object term3647 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term3647, term3647.getClass(), "coefficients", null);
        setField(term3647, term3647.getClass(), "relationship", enum28);
        setDoubleField(term3647, term3647.getClass(), "value", 0.5279279537140873);
        ArrayList term3639 = new ArrayList();
        ((ArrayList) term3639).add(term3641);
        ((ArrayList) term3639).add(term3645);
        ((ArrayList) term3639).add(term3647);
        ArrayList term3652 = new ArrayList();
        ((ArrayList) term3652).add("hRNSzYYIrc");
        term3636 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term3637 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        setField(term3637, term3637.getClass(), "coefficients", null);
        setDoubleField(term3637, term3637.getClass(), "constantTerm", 0.0668892744806211);
        setField(term3636, term3636.getClass(), "f", term3637);
        setField(term3636, term3636.getClass(), "constraints", term3639);
        setBooleanField(term3636, term3636.getClass(), "restrictToNonNegative", true);
        setField(term3636, term3636.getClass(), "columnLabels", term3652);
        setField(term3636, term3636.getClass(), "tableau", null);
        setIntField(term3636, term3636.getClass(), "numDecisionVariables", 1585847225);
        setIntField(term3636, term3636.getClass(), "numSlackVariables", 597278769);
        setIntField(term3636, term3636.getClass(), "numArtificialVariables", -1685132342);
        setDoubleField(term3636, term3636.getClass(), "epsilon", 0.3202192021706908);
        setIntField(term3636, term3636.getClass(), "maxUlps", -1456670397);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term3636;
        try {
            callMethod(klass, "solvePhase1", argTypes, term3606, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


