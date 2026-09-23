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

public class SimplexTableau_initializeColumnLabels_515536083143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81205;
     Object term81575;

    public SimplexTableau_initializeColumnLabels_515536083143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term81257 = new ArrayList();
        term81205 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term81399 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        Object term81503 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        setIntField(term81205, term81205.getClass(), "numArtificialVariables", 1);
        setField(term81205, term81205.getClass(), "columnLabels", term81257);
        setIntField(term81503, term81503.getClass(), "virtualSize", 1);
        setField(term81399, term81399.getClass(), "coefficients", term81503);
        setField(term81205, term81205.getClass(), "f", term81399);
        ArrayList term81578 = new ArrayList();
        ((ArrayList) term81578).add("W");
        ((ArrayList) term81578).add("Z");
        ((ArrayList) term81578).add("x0");
        ((ArrayList) term81578).add("x-");
        ((ArrayList) term81578).add("a0");
        ((ArrayList) term81578).add("RHS");
        term81575 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term81576 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        Object term81577 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(term81577, term81577.getClass(), "entries", null);
        setIntField(term81577, term81577.getClass(), "virtualSize", 1);
        setDoubleField(term81577, term81577.getClass(), "epsilon", 0.0);
        setField(term81576, term81576.getClass(), "coefficients", term81577);
        setDoubleField(term81576, term81576.getClass(), "constantTerm", 0.0);
        setField(term81575, term81575.getClass(), "f", term81576);
        setField(term81575, term81575.getClass(), "constraints", null);
        setBooleanField(term81575, term81575.getClass(), "restrictToNonNegative", false);
        setField(term81575, term81575.getClass(), "columnLabels", term81578);
        setField(term81575, term81575.getClass(), "tableau", null);
        setIntField(term81575, term81575.getClass(), "numDecisionVariables", 0);
        setIntField(term81575, term81575.getClass(), "numSlackVariables", 0);
        setIntField(term81575, term81575.getClass(), "numArtificialVariables", 1);
        setDoubleField(term81575, term81575.getClass(), "epsilon", 0.0);
        setIntField(term81575, term81575.getClass(), "maxUlps", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "initializeColumnLabels", argTypes, term81205, args);
        assertTrue(recursiveEquals(term81205, term81575));
    }

};


