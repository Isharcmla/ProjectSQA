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
import static org.apache.commons.math.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.optimization.linear.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class SimplexTableau_getNumArtificialVariables_167961526658 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15116;
     Object term49646;

    public SimplexTableau_getNumArtificialVariables_167961526658() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term49660 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term49659 = ((Class) term49660).getDeclaredField((String) "GEQ");
        ((Field) term49659).setAccessible(true);
        Object enum115 = ((Field) term49659).get((Object) null);
        Object term15121 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term15121, term15121.getClass(), "coefficients", null);
        setField(term15121, term15121.getClass(), "relationship", enum115);
        setDoubleField(term15121, term15121.getClass(), "value", 0.9276995636844321);
        Object term15125 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term15125, term15125.getClass(), "coefficients", null);
        setField(term15125, term15125.getClass(), "relationship", enum115);
        setDoubleField(term15125, term15125.getClass(), "value", 0.7636130748477434);
        ArrayList term15119 = new ArrayList();
        ((ArrayList) term15119).add(term15121);
        ((ArrayList) term15119).add(term15125);
        ArrayList term15130 = new ArrayList();
        ((ArrayList) term15130).add("cAPeiZHKGJ");
        ((ArrayList) term15130).add("LvJFtLBaxj");
        term15116 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term15117 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term15117, term15117.getClass(), "coefficients", null);
        setDoubleField(term15117, term15117.getClass(), "constantTerm", 0.29172553321356776);
        setField(term15116, term15116.getClass(), "f", term15117);
        setField(term15116, term15116.getClass(), "constraints", term15119);
        setBooleanField(term15116, term15116.getClass(), "restrictToNonNegative", true);
        setField(term15116, term15116.getClass(), "columnLabels", term15130);
        setField(term15116, term15116.getClass(), "tableau", null);
        setIntField(term15116, term15116.getClass(), "numDecisionVariables", -505439934);
        setIntField(term15116, term15116.getClass(), "numSlackVariables", -344842608);
        setIntField(term15116, term15116.getClass(), "numArtificialVariables", 941650513);
        setDoubleField(term15116, term15116.getClass(), "epsilon", 0.07901636960861558);
        setIntField(term15116, term15116.getClass(), "maxUlps", 444029505);
        Class<? extends Object> term50222 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term50220 = ((Class) term50222).getDeclaredField((String) "EQ");
        ((Field) term50220).setAccessible(true);
        Object enum117 = ((Field) term50220).get((Object) null);
        Object term49650 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term49650, term49650.getClass(), "coefficients", null);
        setField(term49650, term49650.getClass(), "relationship", enum117);
        setDoubleField(term49650, term49650.getClass(), "value", 0.9276995636844321);
        Object term49652 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term49652, term49652.getClass(), "coefficients", null);
        setField(term49652, term49652.getClass(), "relationship", enum117);
        setDoubleField(term49652, term49652.getClass(), "value", 0.7636130748477434);
        ArrayList term49648 = new ArrayList();
        ((ArrayList) term49648).add(term49650);
        ((ArrayList) term49648).add(term49652);
        ArrayList term49653 = new ArrayList();
        ((ArrayList) term49653).add("cAPeiZHKGJ");
        ((ArrayList) term49653).add("LvJFtLBaxj");
        term49646 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term49647 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term49647, term49647.getClass(), "coefficients", null);
        setDoubleField(term49647, term49647.getClass(), "constantTerm", 0.29172553321356776);
        setField(term49646, term49646.getClass(), "f", term49647);
        setField(term49646, term49646.getClass(), "constraints", term49648);
        setBooleanField(term49646, term49646.getClass(), "restrictToNonNegative", true);
        setField(term49646, term49646.getClass(), "columnLabels", term49653);
        setField(term49646, term49646.getClass(), "tableau", null);
        setIntField(term49646, term49646.getClass(), "numDecisionVariables", -505439934);
        setIntField(term49646, term49646.getClass(), "numSlackVariables", -344842608);
        setIntField(term49646, term49646.getClass(), "numArtificialVariables", 941650513);
        setDoubleField(term49646, term49646.getClass(), "epsilon", 0.07901636960861558);
        setIntField(term49646, term49646.getClass(), "maxUlps", 444029505);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNumArtificialVariables", argTypes, term15116, args);
        assertTrue(recursiveEquals(term15116, term49646));
        assertTrue(recursiveEquals(retValue, 941650513));
    }

};


