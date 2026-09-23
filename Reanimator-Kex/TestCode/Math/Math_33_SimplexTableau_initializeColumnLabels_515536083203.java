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
import java.util.ArrayList;
import java.lang.Object;

public class SimplexTableau_initializeColumnLabels_515536083203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118778;
     Object term119124;

    public SimplexTableau_initializeColumnLabels_515536083203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term118830 = new ArrayList();
        term118778 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term118972 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        Object term119076 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        setIntField(term118778, term118778.getClass(), "numArtificialVariables", 0);
        setField(term118778, term118778.getClass(), "columnLabels", term118830);
        setField(term118972, term118972.getClass(), "coefficients", term119076);
        setField(term118778, term118778.getClass(), "f", term118972);
        ArrayList term119127 = new ArrayList();
        ((ArrayList) term119127).add("Z");
        ((ArrayList) term119127).add("x-");
        ((ArrayList) term119127).add("RHS");
        term119124 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term119125 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        Object term119126 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(term119126, term119126.getClass(), "entries", null);
        setIntField(term119126, term119126.getClass(), "virtualSize", 0);
        setDoubleField(term119126, term119126.getClass(), "epsilon", 0.0);
        setField(term119125, term119125.getClass(), "coefficients", term119126);
        setDoubleField(term119125, term119125.getClass(), "constantTerm", 0.0);
        setField(term119124, term119124.getClass(), "f", term119125);
        setField(term119124, term119124.getClass(), "constraints", null);
        setBooleanField(term119124, term119124.getClass(), "restrictToNonNegative", false);
        setField(term119124, term119124.getClass(), "columnLabels", term119127);
        setField(term119124, term119124.getClass(), "tableau", null);
        setIntField(term119124, term119124.getClass(), "numDecisionVariables", 0);
        setIntField(term119124, term119124.getClass(), "numSlackVariables", 0);
        setIntField(term119124, term119124.getClass(), "numArtificialVariables", 0);
        setDoubleField(term119124, term119124.getClass(), "epsilon", 0.0);
        setIntField(term119124, term119124.getClass(), "maxUlps", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "initializeColumnLabels", argTypes, term118778, args);
        assertTrue(recursiveEquals(term118778, term119124));
    }

};


