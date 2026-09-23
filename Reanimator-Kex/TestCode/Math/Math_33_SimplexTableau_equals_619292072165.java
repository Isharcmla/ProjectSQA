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

public class SimplexTableau_equals_619292072165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87203;
     Object term87327;
     Object term87346;
     Object term87347;

    public SimplexTableau_equals_619292072165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87203 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        setBooleanField(term87203, term87203.getClass(), "restrictToNonNegative", true);
        term87327 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        setBooleanField(term87327, term87327.getClass(), "restrictToNonNegative", false);
        term87346 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        setField(term87346, term87346.getClass(), "f", null);
        setField(term87346, term87346.getClass(), "constraints", null);
        setBooleanField(term87346, term87346.getClass(), "restrictToNonNegative", true);
        setField(term87346, term87346.getClass(), "columnLabels", null);
        setField(term87346, term87346.getClass(), "tableau", null);
        setIntField(term87346, term87346.getClass(), "numDecisionVariables", 0);
        setIntField(term87346, term87346.getClass(), "numSlackVariables", 0);
        setIntField(term87346, term87346.getClass(), "numArtificialVariables", 0);
        setDoubleField(term87346, term87346.getClass(), "epsilon", 0.0);
        setIntField(term87346, term87346.getClass(), "maxUlps", 0);
        term87347 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        setField(term87347, term87347.getClass(), "f", null);
        setField(term87347, term87347.getClass(), "constraints", null);
        setBooleanField(term87347, term87347.getClass(), "restrictToNonNegative", false);
        setField(term87347, term87347.getClass(), "columnLabels", null);
        setField(term87347, term87347.getClass(), "tableau", null);
        setIntField(term87347, term87347.getClass(), "numDecisionVariables", 0);
        setIntField(term87347, term87347.getClass(), "numSlackVariables", 0);
        setIntField(term87347, term87347.getClass(), "numArtificialVariables", 0);
        setDoubleField(term87347, term87347.getClass(), "epsilon", 0.0);
        setIntField(term87347, term87347.getClass(), "maxUlps", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term87327;
        Object retValue = callMethod(klass, "equals", argTypes, term87203, args);
        assertTrue(recursiveEquals(term87203, term87346));
        assertTrue(recursiveEquals(term87327, term87347));
        assertTrue(recursiveEquals(retValue, false));
    }

};


