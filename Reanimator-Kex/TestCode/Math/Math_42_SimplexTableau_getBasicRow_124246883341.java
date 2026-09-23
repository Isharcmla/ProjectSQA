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
import java.lang.Integer;

public class SimplexTableau_getBasicRow_124246883341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3124;
     Object term3171;

    public SimplexTableau_getBasicRow_124246883341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term33053 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term33052 = ((Class) term33053).getDeclaredField((String) "LEQ");
        ((Field) term33052).setAccessible(true);
        Object enum74 = ((Field) term33052).get((Object) null);
        Object term3129 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term3129, term3129.getClass(), "coefficients", null);
        setField(term3129, term3129.getClass(), "relationship", enum74);
        setDoubleField(term3129, term3129.getClass(), "value", 0.6300849762307866);
        Object term3133 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term3133, term3133.getClass(), "coefficients", null);
        setField(term3133, term3133.getClass(), "relationship", enum74);
        setDoubleField(term3133, term3133.getClass(), "value", 0.9737083944266686);
        Class<? extends Object> term33349 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term33348 = ((Class) term33349).getDeclaredField((String) "LEQ");
        ((Field) term33348).setAccessible(true);
        Object enum75 = ((Field) term33348).get((Object) null);
        Object term3135 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term3135, term3135.getClass(), "coefficients", null);
        setField(term3135, term3135.getClass(), "relationship", enum75);
        setDoubleField(term3135, term3135.getClass(), "value", 0.0668892744806211);
        Object term3139 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term3139, term3139.getClass(), "coefficients", null);
        setField(term3139, term3139.getClass(), "relationship", enum75);
        setDoubleField(term3139, term3139.getClass(), "value", 0.3587267442738795);
        Object term3141 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term3141, term3141.getClass(), "coefficients", null);
        setField(term3141, term3141.getClass(), "relationship", enum74);
        setDoubleField(term3141, term3141.getClass(), "value", 0.07802449704920456);
        Object term3143 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term3143, term3143.getClass(), "coefficients", null);
        setField(term3143, term3143.getClass(), "relationship", enum74);
        setDoubleField(term3143, term3143.getClass(), "value", 0.5279279537140873);
        Object term3145 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setField(term3145, term3145.getClass(), "coefficients", null);
        setField(term3145, term3145.getClass(), "relationship", enum75);
        setDoubleField(term3145, term3145.getClass(), "value", 0.3202192021706908);
        ArrayList term3127 = new ArrayList();
        ((ArrayList) term3127).add(term3129);
        ((ArrayList) term3127).add(term3133);
        ((ArrayList) term3127).add(term3135);
        ((ArrayList) term3127).add(term3139);
        ((ArrayList) term3127).add(term3141);
        ((ArrayList) term3127).add(term3143);
        ((ArrayList) term3127).add(term3145);
        ArrayList term3150 = new ArrayList();
        ((ArrayList) term3150).add("hNxWaHcfhY");
        term3124 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term3125 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term3125, term3125.getClass(), "coefficients", null);
        setDoubleField(term3125, term3125.getClass(), "constantTerm", 0.2852810965221698);
        setField(term3124, term3124.getClass(), "f", term3125);
        setField(term3124, term3124.getClass(), "constraints", term3127);
        setBooleanField(term3124, term3124.getClass(), "restrictToNonNegative", true);
        setField(term3124, term3124.getClass(), "columnLabels", term3150);
        setField(term3124, term3124.getClass(), "tableau", null);
        setIntField(term3124, term3124.getClass(), "numDecisionVariables", -1007160944);
        setIntField(term3124, term3124.getClass(), "numSlackVariables", 1135664017);
        setIntField(term3124, term3124.getClass(), "numArtificialVariables", 590364439);
        setDoubleField(term3124, term3124.getClass(), "epsilon", 0.22651340641904605);
        setIntField(term3124, term3124.getClass(), "maxUlps", 865208305);
        term3171 = new Integer(-1275173084);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term3171;
        try {
            callMethod(klass, "getBasicRow", argTypes, term3124, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


