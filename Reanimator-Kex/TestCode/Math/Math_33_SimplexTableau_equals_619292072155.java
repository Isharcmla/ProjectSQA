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

public class SimplexTableau_equals_619292072155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83697;
     Object term83821;
     Object term83841;
     Object term83842;

    public SimplexTableau_equals_619292072155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83697 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        setBooleanField(term83697, term83697.getClass(), "restrictToNonNegative", false);
        setIntField(term83697, term83697.getClass(), "numDecisionVariables", -1);
        term83821 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        setBooleanField(term83821, term83821.getClass(), "restrictToNonNegative", false);
        setIntField(term83821, term83821.getClass(), "numDecisionVariables", 0);
        term83841 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        setField(term83841, term83841.getClass(), "f", null);
        setField(term83841, term83841.getClass(), "constraints", null);
        setBooleanField(term83841, term83841.getClass(), "restrictToNonNegative", false);
        setField(term83841, term83841.getClass(), "columnLabels", null);
        setField(term83841, term83841.getClass(), "tableau", null);
        setIntField(term83841, term83841.getClass(), "numDecisionVariables", -1);
        setIntField(term83841, term83841.getClass(), "numSlackVariables", 0);
        setIntField(term83841, term83841.getClass(), "numArtificialVariables", 0);
        setDoubleField(term83841, term83841.getClass(), "epsilon", 0.0);
        setIntField(term83841, term83841.getClass(), "maxUlps", 0);
        term83842 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        setField(term83842, term83842.getClass(), "f", null);
        setField(term83842, term83842.getClass(), "constraints", null);
        setBooleanField(term83842, term83842.getClass(), "restrictToNonNegative", false);
        setField(term83842, term83842.getClass(), "columnLabels", null);
        setField(term83842, term83842.getClass(), "tableau", null);
        setIntField(term83842, term83842.getClass(), "numDecisionVariables", 0);
        setIntField(term83842, term83842.getClass(), "numSlackVariables", 0);
        setIntField(term83842, term83842.getClass(), "numArtificialVariables", 0);
        setDoubleField(term83842, term83842.getClass(), "epsilon", 0.0);
        setIntField(term83842, term83842.getClass(), "maxUlps", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term83821;
        Object retValue = callMethod(klass, "equals", argTypes, term83697, args);
        assertTrue(recursiveEquals(term83697, term83841));
        assertTrue(recursiveEquals(term83821, term83842));
        assertTrue(recursiveEquals(retValue, false));
    }

};


