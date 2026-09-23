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

public class SimplexTableau_initializeColumnLabels_515536083159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84375;
     Object term84736;

    public SimplexTableau_initializeColumnLabels_515536083159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term84427 = new ArrayList();
        term84375 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term84569 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        Object term84673 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        setIntField(term84375, term84375.getClass(), "numArtificialVariables", 1);
        setField(term84375, term84375.getClass(), "columnLabels", term84427);
        setIntField(term84673, term84673.getClass(), "virtualSize", 0);
        setField(term84569, term84569.getClass(), "coefficients", term84673);
        setField(term84375, term84375.getClass(), "f", term84569);
        setBooleanField(term84375, term84375.getClass(), "restrictToNonNegative", false);
        setIntField(term84375, term84375.getClass(), "numSlackVariables", 1);
        ArrayList term84739 = new ArrayList();
        ((ArrayList) term84739).add("W");
        ((ArrayList) term84739).add("Z");
        ((ArrayList) term84739).add("x-");
        ((ArrayList) term84739).add("s0");
        ((ArrayList) term84739).add("a0");
        ((ArrayList) term84739).add("RHS");
        term84736 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term84737 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        Object term84738 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(term84738, term84738.getClass(), "entries", null);
        setIntField(term84738, term84738.getClass(), "virtualSize", 0);
        setDoubleField(term84738, term84738.getClass(), "epsilon", 0.0);
        setField(term84737, term84737.getClass(), "coefficients", term84738);
        setDoubleField(term84737, term84737.getClass(), "constantTerm", 0.0);
        setField(term84736, term84736.getClass(), "f", term84737);
        setField(term84736, term84736.getClass(), "constraints", null);
        setBooleanField(term84736, term84736.getClass(), "restrictToNonNegative", false);
        setField(term84736, term84736.getClass(), "columnLabels", term84739);
        setField(term84736, term84736.getClass(), "tableau", null);
        setIntField(term84736, term84736.getClass(), "numDecisionVariables", 0);
        setIntField(term84736, term84736.getClass(), "numSlackVariables", 1);
        setIntField(term84736, term84736.getClass(), "numArtificialVariables", 1);
        setDoubleField(term84736, term84736.getClass(), "epsilon", 0.0);
        setIntField(term84736, term84736.getClass(), "maxUlps", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "initializeColumnLabels", argTypes, term84375, args);
        assertTrue(recursiveEquals(term84375, term84736));
    }

};


