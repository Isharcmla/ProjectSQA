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

public class SimplexTableau_initializeColumnLabels_51553608394 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64422;
     Object term65059;

    public SimplexTableau_initializeColumnLabels_51553608394() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term64474 = new ArrayList();
        term64422 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term64616 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        Object term64720 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        setIntField(term64422, term64422.getClass(), "numArtificialVariables", 1);
        setField(term64422, term64422.getClass(), "columnLabels", term64474);
        setField(term64616, term64616.getClass(), "coefficients", term64720);
        setField(term64422, term64422.getClass(), "f", term64616);
        ArrayList term65062 = new ArrayList();
        ((ArrayList) term65062).add("W");
        ((ArrayList) term65062).add("Z");
        ((ArrayList) term65062).add("x-");
        ((ArrayList) term65062).add("a0");
        ((ArrayList) term65062).add("RHS");
        term65059 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term65060 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        Object term65061 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(term65061, term65061.getClass(), "entries", null);
        setIntField(term65061, term65061.getClass(), "virtualSize", 0);
        setDoubleField(term65061, term65061.getClass(), "epsilon", 0.0);
        setField(term65060, term65060.getClass(), "coefficients", term65061);
        setDoubleField(term65060, term65060.getClass(), "constantTerm", 0.0);
        setField(term65059, term65059.getClass(), "f", term65060);
        setField(term65059, term65059.getClass(), "constraints", null);
        setBooleanField(term65059, term65059.getClass(), "restrictToNonNegative", false);
        setField(term65059, term65059.getClass(), "columnLabels", term65062);
        setField(term65059, term65059.getClass(), "tableau", null);
        setIntField(term65059, term65059.getClass(), "numDecisionVariables", 0);
        setIntField(term65059, term65059.getClass(), "numSlackVariables", 0);
        setIntField(term65059, term65059.getClass(), "numArtificialVariables", 1);
        setDoubleField(term65059, term65059.getClass(), "epsilon", 0.0);
        setIntField(term65059, term65059.getClass(), "maxUlps", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "initializeColumnLabels", argTypes, term64422, args);
        assertTrue(recursiveEquals(term64422, term65059));
    }

};


