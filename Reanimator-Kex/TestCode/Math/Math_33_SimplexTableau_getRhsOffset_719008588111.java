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
import java.lang.Object;

public class SimplexTableau_getRhsOffset_719008588111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68644;
     Object term69651;

    public SimplexTableau_getRhsOffset_719008588111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68644 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term68748 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(term68644, term68644.getClass(), "tableau", term68748);
        term69651 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term69652 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealMatrix"));
        setField(term69651, term69651.getClass(), "f", null);
        setField(term69651, term69651.getClass(), "constraints", null);
        setBooleanField(term69651, term69651.getClass(), "restrictToNonNegative", false);
        setField(term69651, term69651.getClass(), "columnLabels", null);
        setIntField(term69652, term69652.getClass(), "rows", 0);
        setIntField(term69652, term69652.getClass(), "columns", 0);
        setField(term69652, term69652.getClass(), "entries", null);
        setField(term69651, term69651.getClass(), "tableau", term69652);
        setIntField(term69651, term69651.getClass(), "numDecisionVariables", 0);
        setIntField(term69651, term69651.getClass(), "numSlackVariables", 0);
        setIntField(term69651, term69651.getClass(), "numArtificialVariables", 0);
        setDoubleField(term69651, term69651.getClass(), "epsilon", 0.0);
        setIntField(term69651, term69651.getClass(), "maxUlps", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRhsOffset", argTypes, term68644, args);
        assertTrue(recursiveEquals(term68644, term69651));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


