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

public class SimplexTableau_equals_145006127985 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68371;
     Object term68512;
     Object term68513;

    public SimplexTableau_equals_145006127985() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68371 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        term68512 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term68512, term68512.getClass(), "f", null);
        setField(term68512, term68512.getClass(), "constraints", null);
        setBooleanField(term68512, term68512.getClass(), "restrictToNonNegative", false);
        setField(term68512, term68512.getClass(), "tableau", null);
        setIntField(term68512, term68512.getClass(), "numDecisionVariables", 0);
        setIntField(term68512, term68512.getClass(), "numSlackVariables", 0);
        setIntField(term68512, term68512.getClass(), "numArtificialVariables", 0);
        setDoubleField(term68512, term68512.getClass(), "epsilon", 0.0);
        term68513 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term68513, term68513.getClass(), "f", null);
        setField(term68513, term68513.getClass(), "constraints", null);
        setBooleanField(term68513, term68513.getClass(), "restrictToNonNegative", false);
        setField(term68513, term68513.getClass(), "tableau", null);
        setIntField(term68513, term68513.getClass(), "numDecisionVariables", 0);
        setIntField(term68513, term68513.getClass(), "numSlackVariables", 0);
        setIntField(term68513, term68513.getClass(), "numArtificialVariables", 0);
        setDoubleField(term68513, term68513.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term68371;
        Object retValue = callMethod(klass, "equals", argTypes, term68371, args);
        assertTrue(recursiveEquals(term68371, term68512));
        assertTrue(recursiveEquals(term68371, term68513));
        assertTrue(recursiveEquals(retValue, true));
    }

};


