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

public class SimplexTableau_initializeColumnLabels_515536083171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89776;
     Object term90127;

    public SimplexTableau_initializeColumnLabels_515536083171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term89828 = new ArrayList();
        term89776 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term89970 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        Object term90074 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        setIntField(term89776, term89776.getClass(), "numArtificialVariables", 1);
        setField(term89776, term89776.getClass(), "columnLabels", term89828);
        setIntField(term90074, term90074.getClass(), "virtualSize", 0);
        setField(term89970, term89970.getClass(), "coefficients", term90074);
        setField(term89776, term89776.getClass(), "f", term89970);
        setBooleanField(term89776, term89776.getClass(), "restrictToNonNegative", true);
        ArrayList term90130 = new ArrayList();
        ((ArrayList) term90130).add("W");
        ((ArrayList) term90130).add("Z");
        ((ArrayList) term90130).add("a0");
        ((ArrayList) term90130).add("RHS");
        term90127 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term90128 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        Object term90129 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        setField(term90129, term90129.getClass(), "entries", null);
        setIntField(term90129, term90129.getClass(), "virtualSize", 0);
        setDoubleField(term90129, term90129.getClass(), "epsilon", 0.0);
        setField(term90128, term90128.getClass(), "coefficients", term90129);
        setDoubleField(term90128, term90128.getClass(), "constantTerm", 0.0);
        setField(term90127, term90127.getClass(), "f", term90128);
        setField(term90127, term90127.getClass(), "constraints", null);
        setBooleanField(term90127, term90127.getClass(), "restrictToNonNegative", true);
        setField(term90127, term90127.getClass(), "columnLabels", term90130);
        setField(term90127, term90127.getClass(), "tableau", null);
        setIntField(term90127, term90127.getClass(), "numDecisionVariables", 0);
        setIntField(term90127, term90127.getClass(), "numSlackVariables", 0);
        setIntField(term90127, term90127.getClass(), "numArtificialVariables", 1);
        setDoubleField(term90127, term90127.getClass(), "epsilon", 0.0);
        setIntField(term90127, term90127.getClass(), "maxUlps", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "initializeColumnLabels", argTypes, term89776, args);
        assertTrue(recursiveEquals(term89776, term90127));
    }

};


