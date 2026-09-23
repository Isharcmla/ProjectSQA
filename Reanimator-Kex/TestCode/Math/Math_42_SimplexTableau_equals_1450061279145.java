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

public class SimplexTableau_equals_1450061279145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84301;
     Object term84423;
     Object term84445;
     Object term84446;

    public SimplexTableau_equals_1450061279145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84301 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setBooleanField(term84301, term84301.getClass(), "restrictToNonNegative", false);
        setIntField(term84301, term84301.getClass(), "numDecisionVariables", 0);
        setIntField(term84301, term84301.getClass(), "numSlackVariables", 0);
        setIntField(term84301, term84301.getClass(), "numArtificialVariables", -1);
        term84423 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setBooleanField(term84423, term84423.getClass(), "restrictToNonNegative", false);
        setIntField(term84423, term84423.getClass(), "numDecisionVariables", 0);
        setIntField(term84423, term84423.getClass(), "numSlackVariables", 0);
        setIntField(term84423, term84423.getClass(), "numArtificialVariables", 0);
        term84445 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term84445, term84445.getClass(), "f", null);
        setField(term84445, term84445.getClass(), "constraints", null);
        setBooleanField(term84445, term84445.getClass(), "restrictToNonNegative", false);
        setField(term84445, term84445.getClass(), "columnLabels", null);
        setField(term84445, term84445.getClass(), "tableau", null);
        setIntField(term84445, term84445.getClass(), "numDecisionVariables", 0);
        setIntField(term84445, term84445.getClass(), "numSlackVariables", 0);
        setIntField(term84445, term84445.getClass(), "numArtificialVariables", -1);
        setDoubleField(term84445, term84445.getClass(), "epsilon", 0.0);
        setIntField(term84445, term84445.getClass(), "maxUlps", 0);
        term84446 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term84446, term84446.getClass(), "f", null);
        setField(term84446, term84446.getClass(), "constraints", null);
        setBooleanField(term84446, term84446.getClass(), "restrictToNonNegative", false);
        setField(term84446, term84446.getClass(), "columnLabels", null);
        setField(term84446, term84446.getClass(), "tableau", null);
        setIntField(term84446, term84446.getClass(), "numDecisionVariables", 0);
        setIntField(term84446, term84446.getClass(), "numSlackVariables", 0);
        setIntField(term84446, term84446.getClass(), "numArtificialVariables", 0);
        setDoubleField(term84446, term84446.getClass(), "epsilon", 0.0);
        setIntField(term84446, term84446.getClass(), "maxUlps", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term84423;
        Object retValue = callMethod(klass, "equals", argTypes, term84301, args);
        assertTrue(recursiveEquals(term84301, term84445));
        assertTrue(recursiveEquals(term84423, term84446));
        assertTrue(recursiveEquals(retValue, false));
    }

};


