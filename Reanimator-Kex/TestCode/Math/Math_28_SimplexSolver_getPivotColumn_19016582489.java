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

public class SimplexSolver_getPivotColumn_19016582489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5;
     Object term45;

    public SimplexSolver_getPivotColumn_19016582489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term6141 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term6140 = ((Class) term6141).getDeclaredField((String) "EQ");
        ((Field) term6140).setAccessible(true);
        Object enum17 = ((Field) term6140).get((Object) null);
        Object term12 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term12, term12.getClass(), "coefficients", null);
        setField(term12, term12.getClass(), "relationship", enum17);
        setDoubleField(term12, term12.getClass(), "value", 0.5523635872663106);
        Class<? extends Object> term6439 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term6438 = ((Class) term6439).getDeclaredField((String) "EQ");
        ((Field) term6438).setAccessible(true);
        Object enum18 = ((Field) term6438).get((Object) null);
        Object term16 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term16, term16.getClass(), "coefficients", null);
        setField(term16, term16.getClass(), "relationship", enum18);
        setDoubleField(term16, term16.getClass(), "value", 0.544608645520025);
        Object term20 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term20, term20.getClass(), "coefficients", null);
        setField(term20, term20.getClass(), "relationship", enum17);
        setDoubleField(term20, term20.getClass(), "value", 0.28570734989730284);
        Object term22 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term22, term22.getClass(), "coefficients", null);
        setField(term22, term22.getClass(), "relationship", enum18);
        setDoubleField(term22, term22.getClass(), "value", 0.40176586625454525);
        Class<? extends Object> term6737 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term6736 = ((Class) term6737).getDeclaredField((String) "LEQ");
        ((Field) term6736).setAccessible(true);
        Object enum19 = ((Field) term6736).get((Object) null);
        Object term24 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term24, term24.getClass(), "coefficients", null);
        setField(term24, term24.getClass(), "relationship", enum19);
        setDoubleField(term24, term24.getClass(), "value", 0.2641345529914265);
        ArrayList term10 = new ArrayList();
        ((ArrayList) term10).add(term12);
        ((ArrayList) term10).add(term16);
        ((ArrayList) term10).add(term20);
        ((ArrayList) term10).add(term22);
        ((ArrayList) term10).add(term24);
        Class<? extends Object> term7038 = Class.forName((String) "org.apache.commons.math3.optimization.GoalType");
        Field term7037 = ((Class) term7038).getDeclaredField((String) "MAXIMIZE");
        ((Field) term7037).setAccessible(true);
        Object enum20 = ((Field) term7037).get((Object) null);
        term5 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver"));
        Object term8 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        setDoubleField(term5, term5.getClass(), "epsilon", 1.0E-6);
        setIntField(term5, term5.getClass(), "maxUlps", 10);
        setField(term8, term8.getClass(), "coefficients", null);
        setDoubleField(term8, term8.getClass(), "constantTerm", 0.3455959125047594);
        setField(term5, term5.getClass(), "function", term8);
        setField(term5, term5.getClass(), "linearConstraints", term10);
        setField(term5, term5.getClass(), "goal", enum20);
        setBooleanField(term5, term5.getClass(), "nonNegative", false);
        setIntField(term5, term5.getClass(), "maxIterations", 100);
        setIntField(term5, term5.getClass(), "iterations", 1162663216);
        Object term50 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term50, term50.getClass(), "coefficients", null);
        setField(term50, term50.getClass(), "relationship", enum17);
        setDoubleField(term50, term50.getClass(), "value", 0.6076495596892013);
        Object term52 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term52, term52.getClass(), "coefficients", null);
        setField(term52, term52.getClass(), "relationship", enum18);
        setDoubleField(term52, term52.getClass(), "value", 0.37773193782763337);
        Object term54 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term54, term54.getClass(), "coefficients", null);
        setField(term54, term54.getClass(), "relationship", enum19);
        setDoubleField(term54, term54.getClass(), "value", 0.8474802076607362);
        Object term56 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term56, term56.getClass(), "coefficients", null);
        setField(term56, term56.getClass(), "relationship", enum19);
        setDoubleField(term56, term56.getClass(), "value", 0.5183269973490326);
        ArrayList term48 = new ArrayList();
        ((ArrayList) term48).add(term50);
        ((ArrayList) term48).add(term52);
        ((ArrayList) term48).add(term54);
        ((ArrayList) term48).add(term56);
        ArrayList term61 = new ArrayList();
        ((ArrayList) term61).add("PAEBtnZtTD");
        ((ArrayList) term61).add("sjlJAEtRrb");
        ((ArrayList) term61).add("MuLcgQHgqz");
        term45 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term46 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        setField(term46, term46.getClass(), "coefficients", null);
        setDoubleField(term46, term46.getClass(), "constantTerm", 0.36923381893433327);
        setField(term45, term45.getClass(), "f", term46);
        setField(term45, term45.getClass(), "constraints", term48);
        setBooleanField(term45, term45.getClass(), "restrictToNonNegative", false);
        setField(term45, term45.getClass(), "columnLabels", term61);
        setField(term45, term45.getClass(), "tableau", null);
        setIntField(term45, term45.getClass(), "numDecisionVariables", 1484323161);
        setIntField(term45, term45.getClass(), "numSlackVariables", 391863371);
        setIntField(term45, term45.getClass(), "numArtificialVariables", -1922583790);
        setDoubleField(term45, term45.getClass(), "epsilon", 0.7655020693602768);
        setIntField(term45, term45.getClass(), "maxUlps", -616727354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexSolver");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Object[] args = new Object[1];
        args[0] = term45;
        try {
            callMethod(klass, "getPivotColumn", argTypes, term5, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


