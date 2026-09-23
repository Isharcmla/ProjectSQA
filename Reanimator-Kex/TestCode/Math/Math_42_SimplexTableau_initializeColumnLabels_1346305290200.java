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
import java.util.ArrayList;
import java.lang.Object;

public class SimplexTableau_initializeColumnLabels_1346305290200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113080;
     Object term113637;

    public SimplexTableau_initializeColumnLabels_1346305290200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term113132 = new ArrayList();
        term113080 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term113272 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        Object term113374 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        setIntField(term113080, term113080.getClass(), "numArtificialVariables", 0);
        setField(term113080, term113080.getClass(), "columnLabels", term113132);
        setField(term113272, term113272.getClass(), "coefficients", term113374);
        setField(term113080, term113080.getClass(), "f", term113272);
        ArrayList term113640 = new ArrayList();
        ((ArrayList) term113640).add("Z");
        ((ArrayList) term113640).add("x-");
        ((ArrayList) term113640).add("RHS");
        term113637 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term113638 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        Object term113639 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        setField(term113639, term113639.getClass(), "entries", null);
        setIntField(term113639, term113639.getClass(), "virtualSize", 0);
        setDoubleField(term113639, term113639.getClass(), "epsilon", 0.0);
        setField(term113638, term113638.getClass(), "coefficients", term113639);
        setDoubleField(term113638, term113638.getClass(), "constantTerm", 0.0);
        setField(term113637, term113637.getClass(), "f", term113638);
        setField(term113637, term113637.getClass(), "constraints", null);
        setBooleanField(term113637, term113637.getClass(), "restrictToNonNegative", false);
        setField(term113637, term113637.getClass(), "columnLabels", term113640);
        setField(term113637, term113637.getClass(), "tableau", null);
        setIntField(term113637, term113637.getClass(), "numDecisionVariables", 0);
        setIntField(term113637, term113637.getClass(), "numSlackVariables", 0);
        setIntField(term113637, term113637.getClass(), "numArtificialVariables", 0);
        setDoubleField(term113637, term113637.getClass(), "epsilon", 0.0);
        setIntField(term113637, term113637.getClass(), "maxUlps", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "initializeColumnLabels", argTypes, term113080, args);
        assertTrue(recursiveEquals(term113080, term113637));
    }

};


