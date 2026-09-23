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

public class SimplexSolver_getPivotColumn_144976194411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;
     Object term42;

    public SimplexSolver_getPivotColumn_144976194411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7877 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term7876 = ((Class) term7877).getDeclaredField((String) "LEQ");
        ((Field) term7876).setAccessible(true);
        Object enum24 = ((Field) term7876).get((Object) null);
        Object term11 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term11, term11.getClass(), "coefficients", null);
        setField(term11, term11.getClass(), "relationship", enum24);
        setDoubleField(term11, term11.getClass(), "value", 0.5523635872663106);
        Class<? extends Object> term8173 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term8172 = ((Class) term8173).getDeclaredField((String) "LEQ");
        ((Field) term8172).setAccessible(true);
        Object enum25 = ((Field) term8172).get((Object) null);
        Object term15 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term15, term15.getClass(), "coefficients", null);
        setField(term15, term15.getClass(), "relationship", enum25);
        setDoubleField(term15, term15.getClass(), "value", 0.544608645520025);
        Object term19 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term19, term19.getClass(), "coefficients", null);
        setField(term19, term19.getClass(), "relationship", enum24);
        setDoubleField(term19, term19.getClass(), "value", 0.28570734989730284);
        Object term21 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term21, term21.getClass(), "coefficients", null);
        setField(term21, term21.getClass(), "relationship", enum25);
        setDoubleField(term21, term21.getClass(), "value", 0.40176586625454525);
        Class<? extends Object> term8469 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term8468 = ((Class) term8469).getDeclaredField((String) "GEQ");
        ((Field) term8468).setAccessible(true);
        Object enum26 = ((Field) term8468).get((Object) null);
        Object term23 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term23, term23.getClass(), "coefficients", null);
        setField(term23, term23.getClass(), "relationship", enum26);
        setDoubleField(term23, term23.getClass(), "value", 0.2641345529914265);
        ArrayList term9 = new ArrayList();
        ((ArrayList) term9).add(term11);
        ((ArrayList) term9).add(term15);
        ((ArrayList) term9).add(term19);
        ((ArrayList) term9).add(term21);
        ((ArrayList) term9).add(term23);
        Class<? extends Object> term8765 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term8764 = ((Class) term8765).getDeclaredField((String) "MAXIMIZE");
        ((Field) term8764).setAccessible(true);
        Object enum27 = ((Field) term8764).get((Object) null);
        term3 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver"));
        Object term7 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setDoubleField(term3, term3.getClass(), "epsilon", 1.0E-6);
        setIntField(term3, term3.getClass(), "maxIterations", 100);
        setIntField(term3, term3.getClass(), "iterations", 568599855);
        setField(term7, term7.getClass(), "coefficients", null);
        setDoubleField(term7, term7.getClass(), "constantTerm", 0.3455959125047594);
        setField(term3, term3.getClass(), "f", term7);
        setField(term3, term3.getClass(), "constraints", term9);
        setField(term3, term3.getClass(), "goalType", enum27);
        setBooleanField(term3, term3.getClass(), "restrictToNonNegative", false);
        Object term47 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term47, term47.getClass(), "coefficients", null);
        setField(term47, term47.getClass(), "relationship", enum24);
        setDoubleField(term47, term47.getClass(), "value", 0.6076495596892013);
        Object term49 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term49, term49.getClass(), "coefficients", null);
        setField(term49, term49.getClass(), "relationship", enum25);
        setDoubleField(term49, term49.getClass(), "value", 0.37773193782763337);
        Object term51 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term51, term51.getClass(), "coefficients", null);
        setField(term51, term51.getClass(), "relationship", enum26);
        setDoubleField(term51, term51.getClass(), "value", 0.8474802076607362);
        Object term53 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term53, term53.getClass(), "coefficients", null);
        setField(term53, term53.getClass(), "relationship", enum26);
        setDoubleField(term53, term53.getClass(), "value", 0.5183269973490326);
        ArrayList term45 = new ArrayList();
        ((ArrayList) term45).add(term47);
        ((ArrayList) term45).add(term49);
        ((ArrayList) term45).add(term51);
        ((ArrayList) term45).add(term53);
        term42 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term43 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term43, term43.getClass(), "coefficients", null);
        setDoubleField(term43, term43.getClass(), "constantTerm", 0.36923381893433327);
        setField(term42, term42.getClass(), "f", term43);
        setField(term42, term42.getClass(), "constraints", term45);
        setBooleanField(term42, term42.getClass(), "restrictToNonNegative", false);
        setField(term42, term42.getClass(), "tableau", null);
        setIntField(term42, term42.getClass(), "numDecisionVariables", 1162663216);
        setIntField(term42, term42.getClass(), "numSlackVariables", 1484323161);
        setIntField(term42, term42.getClass(), "numArtificialVariables", 391863371);
        setDoubleField(term42, term42.getClass(), "epsilon", 0.7655020693602768);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term42;
        try {
            callMethod(klass, "getPivotColumn", argTypes, term3, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


