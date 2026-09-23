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

public class SimplexTableau_isOptimal_130530897444 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5579;

    public SimplexTableau_isOptimal_130530897444() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term38786 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term38785 = ((Class) term38786).getDeclaredField((String) "GEQ");
        ((Field) term38785).setAccessible(true);
        Object enum83 = ((Field) term38785).get((Object) null);
        Object term5584 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term5584, term5584.getClass(), "coefficients", null);
        setField(term5584, term5584.getClass(), "relationship", enum83);
        setDoubleField(term5584, term5584.getClass(), "value", 0.016575281023182953);
        Object term5588 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term5588, term5588.getClass(), "coefficients", null);
        setField(term5588, term5588.getClass(), "relationship", enum83);
        setDoubleField(term5588, term5588.getClass(), "value", 0.5308350402051779);
        Class<? extends Object> term39087 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term39086 = ((Class) term39087).getDeclaredField((String) "EQ");
        ((Field) term39086).setAccessible(true);
        Object enum84 = ((Field) term39086).get((Object) null);
        Object term5590 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term5590, term5590.getClass(), "coefficients", null);
        setField(term5590, term5590.getClass(), "relationship", enum84);
        setDoubleField(term5590, term5590.getClass(), "value", 0.7154795600170818);
        ArrayList term5582 = new ArrayList();
        ((ArrayList) term5582).add(term5584);
        ((ArrayList) term5582).add(term5588);
        ((ArrayList) term5582).add(term5590);
        ArrayList term5597 = new ArrayList();
        ((ArrayList) term5597).add("IoAlmYsBwc");
        ((ArrayList) term5597).add("TEParAifyi");
        ((ArrayList) term5597).add("OWDIEULEFu");
        ((ArrayList) term5597).add("dWRymuLBtr");
        ((ArrayList) term5597).add("AijpHYOFuy");
        ((ArrayList) term5597).add("SbAoxhfrkn");
        ((ArrayList) term5597).add("kuTXqwMtDB");
        term5579 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term5580 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        setField(term5580, term5580.getClass(), "coefficients", null);
        setDoubleField(term5580, term5580.getClass(), "constantTerm", 0.025133051616627267);
        setField(term5579, term5579.getClass(), "f", term5580);
        setField(term5579, term5579.getClass(), "constraints", term5582);
        setBooleanField(term5579, term5579.getClass(), "restrictToNonNegative", false);
        setField(term5579, term5579.getClass(), "columnLabels", term5597);
        setField(term5579, term5579.getClass(), "tableau", null);
        setIntField(term5579, term5579.getClass(), "numDecisionVariables", -226514366);
        setIntField(term5579, term5579.getClass(), "numSlackVariables", 1193880199);
        setIntField(term5579, term5579.getClass(), "numArtificialVariables", -1087774327);
        setDoubleField(term5579, term5579.getClass(), "epsilon", 0.6355029654528058);
        setIntField(term5579, term5579.getClass(), "maxUlps", -1530420153);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "isOptimal", argTypes, term5579, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


