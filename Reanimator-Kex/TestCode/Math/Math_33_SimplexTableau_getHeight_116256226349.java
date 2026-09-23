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

public class SimplexTableau_getHeight_116256226349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9486;

    public SimplexTableau_getHeight_116256226349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term43906 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term43905 = ((Class) term43906).getDeclaredField((String) "LEQ");
        ((Field) term43905).setAccessible(true);
        Object enum95 = ((Field) term43905).get((Object) null);
        Object term9491 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term9491, term9491.getClass(), "coefficients", null);
        setField(term9491, term9491.getClass(), "relationship", enum95);
        setDoubleField(term9491, term9491.getClass(), "value", 0.9006361024877096);
        Class<? extends Object> term44207 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term44206 = ((Class) term44207).getDeclaredField((String) "GEQ");
        ((Field) term44206).setAccessible(true);
        Object enum96 = ((Field) term44206).get((Object) null);
        Object term9495 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term9495, term9495.getClass(), "coefficients", null);
        setField(term9495, term9495.getClass(), "relationship", enum96);
        setDoubleField(term9495, term9495.getClass(), "value", 0.5644914462415626);
        Object term9499 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term9499, term9499.getClass(), "coefficients", null);
        setField(term9499, term9499.getClass(), "relationship", enum95);
        setDoubleField(term9499, term9499.getClass(), "value", 0.509895859167191);
        Object term9501 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term9501, term9501.getClass(), "coefficients", null);
        setField(term9501, term9501.getClass(), "relationship", enum96);
        setDoubleField(term9501, term9501.getClass(), "value", 0.07417792024383196);
        Object term9503 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setField(term9503, term9503.getClass(), "coefficients", null);
        setField(term9503, term9503.getClass(), "relationship", enum95);
        setDoubleField(term9503, term9503.getClass(), "value", 0.686293604788188);
        ArrayList term9489 = new ArrayList();
        ((ArrayList) term9489).add(term9491);
        ((ArrayList) term9489).add(term9495);
        ((ArrayList) term9489).add(term9499);
        ((ArrayList) term9489).add(term9501);
        ((ArrayList) term9489).add(term9503);
        ArrayList term9508 = new ArrayList();
        ((ArrayList) term9508).add("xLbjWUgOIL");
        ((ArrayList) term9508).add("jDtqGUpnZN");
        ((ArrayList) term9508).add("nGKItKLYNC");
        ((ArrayList) term9508).add("UiUYnPrcCi");
        term9486 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term9487 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        setField(term9487, term9487.getClass(), "coefficients", null);
        setDoubleField(term9487, term9487.getClass(), "constantTerm", 0.7171972879282721);
        setField(term9486, term9486.getClass(), "f", term9487);
        setField(term9486, term9486.getClass(), "constraints", term9489);
        setBooleanField(term9486, term9486.getClass(), "restrictToNonNegative", false);
        setField(term9486, term9486.getClass(), "columnLabels", term9508);
        setField(term9486, term9486.getClass(), "tableau", null);
        setIntField(term9486, term9486.getClass(), "numDecisionVariables", -1786399638);
        setIntField(term9486, term9486.getClass(), "numSlackVariables", 2055867847);
        setIntField(term9486, term9486.getClass(), "numArtificialVariables", -1048298087);
        setDoubleField(term9486, term9486.getClass(), "epsilon", 0.12764449157430724);
        setIntField(term9486, term9486.getClass(), "maxUlps", 292681826);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getHeight", argTypes, term9486, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


