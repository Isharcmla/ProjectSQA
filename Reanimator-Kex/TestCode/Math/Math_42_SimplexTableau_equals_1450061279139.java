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
import java.lang.Object;

public class SimplexTableau_equals_1450061279139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83231;
     Object term83493;
     Object term83526;
     Object term83528;

    public SimplexTableau_equals_1450061279139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83231 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term83371 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setBooleanField(term83231, term83231.getClass(), "restrictToNonNegative", true);
        setIntField(term83231, term83231.getClass(), "numDecisionVariables", 0);
        setIntField(term83231, term83231.getClass(), "numSlackVariables", 0);
        setIntField(term83231, term83231.getClass(), "numArtificialVariables", 0);
        setDoubleField(term83231, term83231.getClass(), "epsilon", -9.2166166374137201E18);
        setIntField(term83231, term83231.getClass(), "maxUlps", 0);
        setField(term83231, term83231.getClass(), "f", term83371);
        term83493 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setBooleanField(term83493, term83493.getClass(), "restrictToNonNegative", true);
        setIntField(term83493, term83493.getClass(), "numDecisionVariables", 0);
        setIntField(term83493, term83493.getClass(), "numSlackVariables", 0);
        setIntField(term83493, term83493.getClass(), "numArtificialVariables", 0);
        setDoubleField(term83493, term83493.getClass(), "epsilon", -9.2166166374137201E18);
        setIntField(term83493, term83493.getClass(), "maxUlps", 0);
        setField(term83493, term83493.getClass(), "f", null);
        term83526 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term83527 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term83527, term83527.getClass(), "coefficients", null);
        setDoubleField(term83527, term83527.getClass(), "constantTerm", 0.0);
        setField(term83526, term83526.getClass(), "f", term83527);
        setField(term83526, term83526.getClass(), "constraints", null);
        setBooleanField(term83526, term83526.getClass(), "restrictToNonNegative", true);
        setField(term83526, term83526.getClass(), "columnLabels", null);
        setField(term83526, term83526.getClass(), "tableau", null);
        setIntField(term83526, term83526.getClass(), "numDecisionVariables", 0);
        setIntField(term83526, term83526.getClass(), "numSlackVariables", 0);
        setIntField(term83526, term83526.getClass(), "numArtificialVariables", 0);
        setDoubleField(term83526, term83526.getClass(), "epsilon", -9.2166166374137201E18);
        setIntField(term83526, term83526.getClass(), "maxUlps", 0);
        term83528 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term83528, term83528.getClass(), "f", null);
        setField(term83528, term83528.getClass(), "constraints", null);
        setBooleanField(term83528, term83528.getClass(), "restrictToNonNegative", true);
        setField(term83528, term83528.getClass(), "columnLabels", null);
        setField(term83528, term83528.getClass(), "tableau", null);
        setIntField(term83528, term83528.getClass(), "numDecisionVariables", 0);
        setIntField(term83528, term83528.getClass(), "numSlackVariables", 0);
        setIntField(term83528, term83528.getClass(), "numArtificialVariables", 0);
        setDoubleField(term83528, term83528.getClass(), "epsilon", -9.2166166374137201E18);
        setIntField(term83528, term83528.getClass(), "maxUlps", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term83493;
        Object retValue = callMethod(klass, "equals", argTypes, term83231, args);
        assertTrue(recursiveEquals(term83231, term83526));
        assertTrue(recursiveEquals(term83493, term83528));
        assertTrue(recursiveEquals(retValue, false));
    }

};


