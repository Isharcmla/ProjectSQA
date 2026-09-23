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

public class SimplexTableau_isOptimal_47453976744 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5499;

    public SimplexTableau_isOptimal_47453976744() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term37073 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term37072 = ((Class) term37073).getDeclaredField((String) "GEQ");
        ((Field) term37072).setAccessible(true);
        Object enum85 = ((Field) term37072).get((Object) null);
        Object term5504 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term5504, term5504.getClass(), "coefficients", null);
        setField(term5504, term5504.getClass(), "relationship", enum85);
        setDoubleField(term5504, term5504.getClass(), "value", 0.016575281023182953);
        Object term5508 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term5508, term5508.getClass(), "coefficients", null);
        setField(term5508, term5508.getClass(), "relationship", enum85);
        setDoubleField(term5508, term5508.getClass(), "value", 0.5308350402051779);
        Class<? extends Object> term37369 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term37368 = ((Class) term37369).getDeclaredField((String) "EQ");
        ((Field) term37368).setAccessible(true);
        Object enum86 = ((Field) term37368).get((Object) null);
        Object term5510 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term5510, term5510.getClass(), "coefficients", null);
        setField(term5510, term5510.getClass(), "relationship", enum86);
        setDoubleField(term5510, term5510.getClass(), "value", 0.7154795600170818);
        ArrayList term5502 = new ArrayList();
        ((ArrayList) term5502).add(term5504);
        ((ArrayList) term5502).add(term5508);
        ((ArrayList) term5502).add(term5510);
        ArrayList term5517 = new ArrayList();
        ((ArrayList) term5517).add("IoAlmYsBwc");
        ((ArrayList) term5517).add("TEParAifyi");
        ((ArrayList) term5517).add("OWDIEULEFu");
        ((ArrayList) term5517).add("dWRymuLBtr");
        ((ArrayList) term5517).add("AijpHYOFuy");
        ((ArrayList) term5517).add("SbAoxhfrkn");
        ((ArrayList) term5517).add("kuTXqwMtDB");
        term5499 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term5500 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term5500, term5500.getClass(), "coefficients", null);
        setDoubleField(term5500, term5500.getClass(), "constantTerm", 0.025133051616627267);
        setField(term5499, term5499.getClass(), "f", term5500);
        setField(term5499, term5499.getClass(), "constraints", term5502);
        setBooleanField(term5499, term5499.getClass(), "restrictToNonNegative", false);
        setField(term5499, term5499.getClass(), "columnLabels", term5517);
        setField(term5499, term5499.getClass(), "tableau", null);
        setIntField(term5499, term5499.getClass(), "numDecisionVariables", -226514366);
        setIntField(term5499, term5499.getClass(), "numSlackVariables", 1193880199);
        setIntField(term5499, term5499.getClass(), "numArtificialVariables", -1087774327);
        setDoubleField(term5499, term5499.getClass(), "epsilon", 0.6355029654528058);
        setIntField(term5499, term5499.getClass(), "maxUlps", -1530420153);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "isOptimal", argTypes, term5499, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


