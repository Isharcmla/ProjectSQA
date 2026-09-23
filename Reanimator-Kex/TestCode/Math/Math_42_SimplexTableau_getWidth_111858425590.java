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
import java.lang.Object;

public class SimplexTableau_getWidth_111858425590 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66012;
     Object term68367;

    public SimplexTableau_getWidth_111858425590() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66012 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term66114 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(term66012, term66012.getClass(), "tableau", term66114);
        term68367 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term68368 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(term68367, term68367.getClass(), "f", null);
        setField(term68367, term68367.getClass(), "constraints", null);
        setBooleanField(term68367, term68367.getClass(), "restrictToNonNegative", false);
        setField(term68367, term68367.getClass(), "columnLabels", null);
        setIntField(term68368, term68368.getClass(), "rows", 0);
        setIntField(term68368, term68368.getClass(), "columns", 0);
        setField(term68368, term68368.getClass(), "entries", null);
        setField(term68367, term68367.getClass(), "tableau", term68368);
        setIntField(term68367, term68367.getClass(), "numDecisionVariables", 0);
        setIntField(term68367, term68367.getClass(), "numSlackVariables", 0);
        setIntField(term68367, term68367.getClass(), "numArtificialVariables", 0);
        setDoubleField(term68367, term68367.getClass(), "epsilon", 0.0);
        setIntField(term68367, term68367.getClass(), "maxUlps", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getWidth", argTypes, term66012, args);
        assertTrue(recursiveEquals(term66012, term68367));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


