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

public class SimplexTableau_getHeight_199333147049 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9351;

    public SimplexTableau_getHeight_199333147049() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term42133 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term42132 = ((Class) term42133).getDeclaredField((String) "LEQ");
        ((Field) term42132).setAccessible(true);
        Object enum97 = ((Field) term42132).get((Object) null);
        Object term9356 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term9356, term9356.getClass(), "coefficients", null);
        setField(term9356, term9356.getClass(), "relationship", enum97);
        setDoubleField(term9356, term9356.getClass(), "value", 0.9006361024877096);
        Class<? extends Object> term42429 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term42428 = ((Class) term42429).getDeclaredField((String) "GEQ");
        ((Field) term42428).setAccessible(true);
        Object enum98 = ((Field) term42428).get((Object) null);
        Object term9360 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term9360, term9360.getClass(), "coefficients", null);
        setField(term9360, term9360.getClass(), "relationship", enum98);
        setDoubleField(term9360, term9360.getClass(), "value", 0.5644914462415626);
        Object term9364 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term9364, term9364.getClass(), "coefficients", null);
        setField(term9364, term9364.getClass(), "relationship", enum97);
        setDoubleField(term9364, term9364.getClass(), "value", 0.509895859167191);
        Object term9366 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term9366, term9366.getClass(), "coefficients", null);
        setField(term9366, term9366.getClass(), "relationship", enum98);
        setDoubleField(term9366, term9366.getClass(), "value", 0.07417792024383196);
        Object term9368 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term9368, term9368.getClass(), "coefficients", null);
        setField(term9368, term9368.getClass(), "relationship", enum97);
        setDoubleField(term9368, term9368.getClass(), "value", 0.686293604788188);
        ArrayList term9354 = new ArrayList();
        ((ArrayList) term9354).add(term9356);
        ((ArrayList) term9354).add(term9360);
        ((ArrayList) term9354).add(term9364);
        ((ArrayList) term9354).add(term9366);
        ((ArrayList) term9354).add(term9368);
        ArrayList term9373 = new ArrayList();
        ((ArrayList) term9373).add("xLbjWUgOIL");
        ((ArrayList) term9373).add("jDtqGUpnZN");
        ((ArrayList) term9373).add("nGKItKLYNC");
        ((ArrayList) term9373).add("UiUYnPrcCi");
        term9351 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term9352 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term9352, term9352.getClass(), "coefficients", null);
        setDoubleField(term9352, term9352.getClass(), "constantTerm", 0.7171972879282721);
        setField(term9351, term9351.getClass(), "f", term9352);
        setField(term9351, term9351.getClass(), "constraints", term9354);
        setBooleanField(term9351, term9351.getClass(), "restrictToNonNegative", false);
        setField(term9351, term9351.getClass(), "columnLabels", term9373);
        setField(term9351, term9351.getClass(), "tableau", null);
        setIntField(term9351, term9351.getClass(), "numDecisionVariables", -1786399638);
        setIntField(term9351, term9351.getClass(), "numSlackVariables", 2055867847);
        setIntField(term9351, term9351.getClass(), "numArtificialVariables", -1048298087);
        setDoubleField(term9351, term9351.getClass(), "epsilon", 0.12764449157430724);
        setIntField(term9351, term9351.getClass(), "maxUlps", 292681826);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getHeight", argTypes, term9351, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


