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

public class SimplexTableau_equals_1450061279135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82550;
     Object term82672;
     Object term82693;
     Object term82694;

    public SimplexTableau_equals_1450061279135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82550 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setBooleanField(term82550, term82550.getClass(), "restrictToNonNegative", false);
        setIntField(term82550, term82550.getClass(), "numDecisionVariables", 0);
        setIntField(term82550, term82550.getClass(), "numSlackVariables", 497361705);
        term82672 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setBooleanField(term82672, term82672.getClass(), "restrictToNonNegative", false);
        setIntField(term82672, term82672.getClass(), "numDecisionVariables", 0);
        setIntField(term82672, term82672.getClass(), "numSlackVariables", -2147483518);
        term82693 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term82693, term82693.getClass(), "f", null);
        setField(term82693, term82693.getClass(), "constraints", null);
        setBooleanField(term82693, term82693.getClass(), "restrictToNonNegative", false);
        setField(term82693, term82693.getClass(), "columnLabels", null);
        setField(term82693, term82693.getClass(), "tableau", null);
        setIntField(term82693, term82693.getClass(), "numDecisionVariables", 0);
        setIntField(term82693, term82693.getClass(), "numSlackVariables", 497361705);
        setIntField(term82693, term82693.getClass(), "numArtificialVariables", 0);
        setDoubleField(term82693, term82693.getClass(), "epsilon", 0.0);
        setIntField(term82693, term82693.getClass(), "maxUlps", 0);
        term82694 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term82694, term82694.getClass(), "f", null);
        setField(term82694, term82694.getClass(), "constraints", null);
        setBooleanField(term82694, term82694.getClass(), "restrictToNonNegative", false);
        setField(term82694, term82694.getClass(), "columnLabels", null);
        setField(term82694, term82694.getClass(), "tableau", null);
        setIntField(term82694, term82694.getClass(), "numDecisionVariables", 0);
        setIntField(term82694, term82694.getClass(), "numSlackVariables", -2147483518);
        setIntField(term82694, term82694.getClass(), "numArtificialVariables", 0);
        setDoubleField(term82694, term82694.getClass(), "epsilon", 0.0);
        setIntField(term82694, term82694.getClass(), "maxUlps", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term82672;
        Object retValue = callMethod(klass, "equals", argTypes, term82550, args);
        assertTrue(recursiveEquals(term82550, term82693));
        assertTrue(recursiveEquals(term82672, term82694));
        assertTrue(recursiveEquals(retValue, false));
    }

};


