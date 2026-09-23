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
import static org.apache.commons.math3.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.optimization.linear.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class SimplexTableau_getNumArtificialVariables_178458282358 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15331;
     Object term52395;

    public SimplexTableau_getNumArtificialVariables_178458282358() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term52409 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term52408 = ((Class) term52409).getDeclaredField((String) "GEQ");
        ((Field) term52408).setAccessible(true);
        Object enum117 = ((Field) term52408).get((Object) null);
        Object term15336 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term15336, term15336.getClass(), "coefficients", null);
        setField(term15336, term15336.getClass(), "relationship", enum117);
        setDoubleField(term15336, term15336.getClass(), "value", 0.9276995636844321);
        Object term15340 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term15340, term15340.getClass(), "coefficients", null);
        setField(term15340, term15340.getClass(), "relationship", enum117);
        setDoubleField(term15340, term15340.getClass(), "value", 0.7636130748477434);
        ArrayList term15334 = new ArrayList();
        ((ArrayList) term15334).add(term15336);
        ((ArrayList) term15334).add(term15340);
        ArrayList term15345 = new ArrayList();
        ((ArrayList) term15345).add("cAPeiZHKGJ");
        ((ArrayList) term15345).add("LvJFtLBaxj");
        term15331 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term15332 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        setField(term15332, term15332.getClass(), "coefficients", null);
        setDoubleField(term15332, term15332.getClass(), "constantTerm", 0.29172553321356776);
        setField(term15331, term15331.getClass(), "f", term15332);
        setField(term15331, term15331.getClass(), "constraints", term15334);
        setBooleanField(term15331, term15331.getClass(), "restrictToNonNegative", true);
        setField(term15331, term15331.getClass(), "columnLabels", term15345);
        setField(term15331, term15331.getClass(), "tableau", null);
        setIntField(term15331, term15331.getClass(), "numDecisionVariables", -505439934);
        setIntField(term15331, term15331.getClass(), "numSlackVariables", -344842608);
        setIntField(term15331, term15331.getClass(), "numArtificialVariables", 941650513);
        setDoubleField(term15331, term15331.getClass(), "epsilon", 0.07901636960861558);
        setIntField(term15331, term15331.getClass(), "maxUlps", 444029505);
        Class<? extends Object> term52730 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term52729 = ((Class) term52730).getDeclaredField((String) "EQ");
        ((Field) term52729).setAccessible(true);
        Object enum118 = ((Field) term52729).get((Object) null);
        Object term52399 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term52399, term52399.getClass(), "coefficients", null);
        setField(term52399, term52399.getClass(), "relationship", enum118);
        setDoubleField(term52399, term52399.getClass(), "value", 0.9276995636844321);
        Object term52401 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term52401, term52401.getClass(), "coefficients", null);
        setField(term52401, term52401.getClass(), "relationship", enum118);
        setDoubleField(term52401, term52401.getClass(), "value", 0.7636130748477434);
        ArrayList term52397 = new ArrayList();
        ((ArrayList) term52397).add(term52399);
        ((ArrayList) term52397).add(term52401);
        ArrayList term52402 = new ArrayList();
        ((ArrayList) term52402).add("cAPeiZHKGJ");
        ((ArrayList) term52402).add("LvJFtLBaxj");
        term52395 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term52396 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        setField(term52396, term52396.getClass(), "coefficients", null);
        setDoubleField(term52396, term52396.getClass(), "constantTerm", 0.29172553321356776);
        setField(term52395, term52395.getClass(), "f", term52396);
        setField(term52395, term52395.getClass(), "constraints", term52397);
        setBooleanField(term52395, term52395.getClass(), "restrictToNonNegative", true);
        setField(term52395, term52395.getClass(), "columnLabels", term52402);
        setField(term52395, term52395.getClass(), "tableau", null);
        setIntField(term52395, term52395.getClass(), "numDecisionVariables", -505439934);
        setIntField(term52395, term52395.getClass(), "numSlackVariables", -344842608);
        setIntField(term52395, term52395.getClass(), "numArtificialVariables", 941650513);
        setDoubleField(term52395, term52395.getClass(), "epsilon", 0.07901636960861558);
        setIntField(term52395, term52395.getClass(), "maxUlps", 444029505);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNumArtificialVariables", argTypes, term15331, args);
        assertTrue(recursiveEquals(term15331, term52395));
        assertTrue(recursiveEquals(retValue, 941650513));
    }

};


