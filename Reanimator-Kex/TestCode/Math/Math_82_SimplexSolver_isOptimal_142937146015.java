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

public class SimplexSolver_isOptimal_142937146015 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4552;
     Object term4575;

    public SimplexSolver_isOptimal_142937146015() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4558 = new ArrayList();
        Class<? extends Object> term14798 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term14797 = ((Class) term14798).getDeclaredField((String) "MINIMIZE");
        ((Field) term14797).setAccessible(true);
        Object enum44 = ((Field) term14797).get((Object) null);
        term4552 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        Object term4556 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setDoubleField(term4552, term4552.getClass(), "epsilon", 1.0E-6);
        setIntField(term4552, term4552.getClass(), "maxIterations", 100);
        setIntField(term4552, term4552.getClass(), "iterations", 1585847225);
        setField(term4556, term4556.getClass(), "coefficients", null);
        setDoubleField(term4556, term4556.getClass(), "constantTerm", 0.25937345430928016);
        setField(term4552, term4552.getClass(), "f", term4556);
        setField(term4552, term4552.getClass(), "constraints", term4558);
        setField(term4552, term4552.getClass(), "goalType", enum44);
        setBooleanField(term4552, term4552.getClass(), "restrictToNonNegative", false);
        Class<? extends Object> term15054 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term15053 = ((Class) term15054).getDeclaredField((String) "LEQ");
        ((Field) term15053).setAccessible(true);
        Object enum45 = ((Field) term15053).get((Object) null);
        Object term4580 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term4580, term4580.getClass(), "coefficients", null);
        setField(term4580, term4580.getClass(), "relationship", enum45);
        setDoubleField(term4580, term4580.getClass(), "value", 0.8823181080774973);
        Class<? extends Object> term15350 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term15349 = ((Class) term15350).getDeclaredField((String) "EQ");
        ((Field) term15349).setAccessible(true);
        Object enum46 = ((Field) term15349).get((Object) null);
        Object term4584 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term4584, term4584.getClass(), "coefficients", null);
        setField(term4584, term4584.getClass(), "relationship", enum46);
        setDoubleField(term4584, term4584.getClass(), "value", 0.2192450926212024);
        ArrayList term4578 = new ArrayList();
        ((ArrayList) term4578).add(term4580);
        ((ArrayList) term4578).add(term4584);
        term4575 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term4576 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term4576, term4576.getClass(), "coefficients", null);
        setDoubleField(term4576, term4576.getClass(), "constantTerm", 0.5873228247510078);
        setField(term4575, term4575.getClass(), "f", term4576);
        setField(term4575, term4575.getClass(), "constraints", term4578);
        setBooleanField(term4575, term4575.getClass(), "restrictToNonNegative", true);
        setField(term4575, term4575.getClass(), "tableau", null);
        setIntField(term4575, term4575.getClass(), "numDecisionVariables", 597278769);
        setIntField(term4575, term4575.getClass(), "numSlackVariables", -1685132342);
        setIntField(term4575, term4575.getClass(), "numArtificialVariables", -1456670397);
        setDoubleField(term4575, term4575.getClass(), "epsilon", 0.7591353014991907);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term4575;
        try {
            callMethod(klass, "isOptimal", argTypes, term4552, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


