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
import java.lang.Object;

public class SimplexTableau_equals_619292072146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81788;
     Object term82054;
     Object term82365;
     Object term82367;

    public SimplexTableau_equals_619292072146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81788 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term81930 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        setBooleanField(term81788, term81788.getClass(), "restrictToNonNegative", true);
        setIntField(term81788, term81788.getClass(), "numDecisionVariables", 0);
        setIntField(term81788, term81788.getClass(), "numSlackVariables", 0);
        setIntField(term81788, term81788.getClass(), "numArtificialVariables", 0);
        setDoubleField(term81788, term81788.getClass(), "epsilon", -9.2166166374137201E18);
        setIntField(term81788, term81788.getClass(), "maxUlps", 0);
        setField(term81788, term81788.getClass(), "f", term81930);
        term82054 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        setBooleanField(term82054, term82054.getClass(), "restrictToNonNegative", true);
        setIntField(term82054, term82054.getClass(), "numDecisionVariables", 0);
        setIntField(term82054, term82054.getClass(), "numSlackVariables", 0);
        setIntField(term82054, term82054.getClass(), "numArtificialVariables", 0);
        setDoubleField(term82054, term82054.getClass(), "epsilon", -9.2166166374137201E18);
        setIntField(term82054, term82054.getClass(), "maxUlps", 0);
        setField(term82054, term82054.getClass(), "f", null);
        term82365 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term82366 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        setField(term82366, term82366.getClass(), "coefficients", null);
        setDoubleField(term82366, term82366.getClass(), "constantTerm", 0.0);
        setField(term82365, term82365.getClass(), "f", term82366);
        setField(term82365, term82365.getClass(), "constraints", null);
        setBooleanField(term82365, term82365.getClass(), "restrictToNonNegative", true);
        setField(term82365, term82365.getClass(), "columnLabels", null);
        setField(term82365, term82365.getClass(), "tableau", null);
        setIntField(term82365, term82365.getClass(), "numDecisionVariables", 0);
        setIntField(term82365, term82365.getClass(), "numSlackVariables", 0);
        setIntField(term82365, term82365.getClass(), "numArtificialVariables", 0);
        setDoubleField(term82365, term82365.getClass(), "epsilon", -9.2166166374137201E18);
        setIntField(term82365, term82365.getClass(), "maxUlps", 0);
        term82367 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        setField(term82367, term82367.getClass(), "f", null);
        setField(term82367, term82367.getClass(), "constraints", null);
        setBooleanField(term82367, term82367.getClass(), "restrictToNonNegative", true);
        setField(term82367, term82367.getClass(), "columnLabels", null);
        setField(term82367, term82367.getClass(), "tableau", null);
        setIntField(term82367, term82367.getClass(), "numDecisionVariables", 0);
        setIntField(term82367, term82367.getClass(), "numSlackVariables", 0);
        setIntField(term82367, term82367.getClass(), "numArtificialVariables", 0);
        setDoubleField(term82367, term82367.getClass(), "epsilon", -9.2166166374137201E18);
        setIntField(term82367, term82367.getClass(), "maxUlps", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term82054;
        Object retValue = callMethod(klass, "equals", argTypes, term81788, args);
        assertTrue(recursiveEquals(term81788, term82365));
        assertTrue(recursiveEquals(term82054, term82367));
        assertTrue(recursiveEquals(retValue, false));
    }

};


