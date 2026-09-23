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

public class SimplexTableau_equals_1450061279143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84000;
     Object term84122;
     Object term84142;
     Object term84143;

    public SimplexTableau_equals_1450061279143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84000 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setBooleanField(term84000, term84000.getClass(), "restrictToNonNegative", false);
        setIntField(term84000, term84000.getClass(), "numDecisionVariables", 497361705);
        term84122 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setBooleanField(term84122, term84122.getClass(), "restrictToNonNegative", false);
        setIntField(term84122, term84122.getClass(), "numDecisionVariables", -2147483518);
        term84142 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term84142, term84142.getClass(), "f", null);
        setField(term84142, term84142.getClass(), "constraints", null);
        setBooleanField(term84142, term84142.getClass(), "restrictToNonNegative", false);
        setField(term84142, term84142.getClass(), "columnLabels", null);
        setField(term84142, term84142.getClass(), "tableau", null);
        setIntField(term84142, term84142.getClass(), "numDecisionVariables", 497361705);
        setIntField(term84142, term84142.getClass(), "numSlackVariables", 0);
        setIntField(term84142, term84142.getClass(), "numArtificialVariables", 0);
        setDoubleField(term84142, term84142.getClass(), "epsilon", 0.0);
        setIntField(term84142, term84142.getClass(), "maxUlps", 0);
        term84143 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term84143, term84143.getClass(), "f", null);
        setField(term84143, term84143.getClass(), "constraints", null);
        setBooleanField(term84143, term84143.getClass(), "restrictToNonNegative", false);
        setField(term84143, term84143.getClass(), "columnLabels", null);
        setField(term84143, term84143.getClass(), "tableau", null);
        setIntField(term84143, term84143.getClass(), "numDecisionVariables", -2147483518);
        setIntField(term84143, term84143.getClass(), "numSlackVariables", 0);
        setIntField(term84143, term84143.getClass(), "numArtificialVariables", 0);
        setDoubleField(term84143, term84143.getClass(), "epsilon", 0.0);
        setIntField(term84143, term84143.getClass(), "maxUlps", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term84122;
        Object retValue = callMethod(klass, "equals", argTypes, term84000, args);
        assertTrue(recursiveEquals(term84000, term84142));
        assertTrue(recursiveEquals(term84122, term84143));
        assertTrue(recursiveEquals(retValue, false));
    }

};


