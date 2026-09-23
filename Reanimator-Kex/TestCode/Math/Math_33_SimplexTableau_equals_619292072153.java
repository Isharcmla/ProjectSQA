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

public class SimplexTableau_equals_619292072153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83084;
     Object term83208;
     Object term83546;
     Object term83547;

    public SimplexTableau_equals_619292072153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83084 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        setBooleanField(term83084, term83084.getClass(), "restrictToNonNegative", false);
        setIntField(term83084, term83084.getClass(), "numDecisionVariables", 0);
        setIntField(term83084, term83084.getClass(), "numSlackVariables", 0);
        setIntField(term83084, term83084.getClass(), "numArtificialVariables", -1);
        term83208 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        setBooleanField(term83208, term83208.getClass(), "restrictToNonNegative", false);
        setIntField(term83208, term83208.getClass(), "numDecisionVariables", 0);
        setIntField(term83208, term83208.getClass(), "numSlackVariables", 0);
        setIntField(term83208, term83208.getClass(), "numArtificialVariables", 0);
        term83546 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        setField(term83546, term83546.getClass(), "f", null);
        setField(term83546, term83546.getClass(), "constraints", null);
        setBooleanField(term83546, term83546.getClass(), "restrictToNonNegative", false);
        setField(term83546, term83546.getClass(), "columnLabels", null);
        setField(term83546, term83546.getClass(), "tableau", null);
        setIntField(term83546, term83546.getClass(), "numDecisionVariables", 0);
        setIntField(term83546, term83546.getClass(), "numSlackVariables", 0);
        setIntField(term83546, term83546.getClass(), "numArtificialVariables", -1);
        setDoubleField(term83546, term83546.getClass(), "epsilon", 0.0);
        setIntField(term83546, term83546.getClass(), "maxUlps", 0);
        term83547 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        setField(term83547, term83547.getClass(), "f", null);
        setField(term83547, term83547.getClass(), "constraints", null);
        setBooleanField(term83547, term83547.getClass(), "restrictToNonNegative", false);
        setField(term83547, term83547.getClass(), "columnLabels", null);
        setField(term83547, term83547.getClass(), "tableau", null);
        setIntField(term83547, term83547.getClass(), "numDecisionVariables", 0);
        setIntField(term83547, term83547.getClass(), "numSlackVariables", 0);
        setIntField(term83547, term83547.getClass(), "numArtificialVariables", 0);
        setDoubleField(term83547, term83547.getClass(), "epsilon", 0.0);
        setIntField(term83547, term83547.getClass(), "maxUlps", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term83208;
        Object retValue = callMethod(klass, "equals", argTypes, term83084, args);
        assertTrue(recursiveEquals(term83084, term83546));
        assertTrue(recursiveEquals(term83208, term83547));
        assertTrue(recursiveEquals(retValue, false));
    }

};


