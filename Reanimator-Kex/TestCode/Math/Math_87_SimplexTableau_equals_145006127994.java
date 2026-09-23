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

public class SimplexTableau_equals_145006127994 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68740;
     Object term68749;
     Object term68750;

    public SimplexTableau_equals_145006127994() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68740 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        term68749 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term68749, term68749.getClass(), "f", null);
        setField(term68749, term68749.getClass(), "constraints", null);
        setBooleanField(term68749, term68749.getClass(), "restrictToNonNegative", false);
        setField(term68749, term68749.getClass(), "tableau", null);
        setIntField(term68749, term68749.getClass(), "numDecisionVariables", 0);
        setIntField(term68749, term68749.getClass(), "numSlackVariables", 0);
        setIntField(term68749, term68749.getClass(), "numArtificialVariables", 0);
        setDoubleField(term68749, term68749.getClass(), "epsilon", 0.0);
        term68750 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term68750, term68750.getClass(), "f", null);
        setField(term68750, term68750.getClass(), "constraints", null);
        setBooleanField(term68750, term68750.getClass(), "restrictToNonNegative", false);
        setField(term68750, term68750.getClass(), "tableau", null);
        setIntField(term68750, term68750.getClass(), "numDecisionVariables", 0);
        setIntField(term68750, term68750.getClass(), "numSlackVariables", 0);
        setIntField(term68750, term68750.getClass(), "numArtificialVariables", 0);
        setDoubleField(term68750, term68750.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term68740;
        Object retValue = callMethod(klass, "equals", argTypes, term68740, args);
        assertTrue(recursiveEquals(term68740, term68749));
        assertTrue(recursiveEquals(term68740, term68750));
        assertTrue(recursiveEquals(retValue, true));
    }

};


