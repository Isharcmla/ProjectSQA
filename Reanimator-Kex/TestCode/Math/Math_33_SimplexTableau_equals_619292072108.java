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

public class SimplexTableau_equals_619292072108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67622;
     Object term68509;
     Object term68510;

    public SimplexTableau_equals_619292072108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67622 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        term68509 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        setField(term68509, term68509.getClass(), "f", null);
        setField(term68509, term68509.getClass(), "constraints", null);
        setBooleanField(term68509, term68509.getClass(), "restrictToNonNegative", false);
        setField(term68509, term68509.getClass(), "columnLabels", null);
        setField(term68509, term68509.getClass(), "tableau", null);
        setIntField(term68509, term68509.getClass(), "numDecisionVariables", 0);
        setIntField(term68509, term68509.getClass(), "numSlackVariables", 0);
        setIntField(term68509, term68509.getClass(), "numArtificialVariables", 0);
        setDoubleField(term68509, term68509.getClass(), "epsilon", 0.0);
        setIntField(term68509, term68509.getClass(), "maxUlps", 0);
        term68510 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        setField(term68510, term68510.getClass(), "f", null);
        setField(term68510, term68510.getClass(), "constraints", null);
        setBooleanField(term68510, term68510.getClass(), "restrictToNonNegative", false);
        setField(term68510, term68510.getClass(), "columnLabels", null);
        setField(term68510, term68510.getClass(), "tableau", null);
        setIntField(term68510, term68510.getClass(), "numDecisionVariables", 0);
        setIntField(term68510, term68510.getClass(), "numSlackVariables", 0);
        setIntField(term68510, term68510.getClass(), "numArtificialVariables", 0);
        setDoubleField(term68510, term68510.getClass(), "epsilon", 0.0);
        setIntField(term68510, term68510.getClass(), "maxUlps", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term67622;
        Object retValue = callMethod(klass, "equals", argTypes, term67622, args);
        assertTrue(recursiveEquals(term67622, term68509));
        assertTrue(recursiveEquals(term67622, term68510));
        assertTrue(recursiveEquals(retValue, true));
    }

};


