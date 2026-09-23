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

public class SimplexTableau_isOptimal_1305308974139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term77889;
     Object term78932;

    public SimplexTableau_isOptimal_1305308974139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term77889 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term77999 = newInstance(Class.forName("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        setIntField(term77889, term77889.getClass(), "numArtificialVariables", 1);
        setField(term77889, term77889.getClass(), "tableau", term77999);
        term78932 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term78933 = newInstance(Class.forName("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        setField(term78932, term78932.getClass(), "f", null);
        setField(term78932, term78932.getClass(), "constraints", null);
        setBooleanField(term78932, term78932.getClass(), "restrictToNonNegative", false);
        setField(term78932, term78932.getClass(), "columnLabels", null);
        setField(term78933, term78933.getClass(), "data", null);
        setField(term78932, term78932.getClass(), "tableau", term78933);
        setIntField(term78932, term78932.getClass(), "numDecisionVariables", 0);
        setIntField(term78932, term78932.getClass(), "numSlackVariables", 0);
        setIntField(term78932, term78932.getClass(), "numArtificialVariables", 1);
        setDoubleField(term78932, term78932.getClass(), "epsilon", 0.0);
        setIntField(term78932, term78932.getClass(), "maxUlps", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isOptimal", argTypes, term77889, args);
        assertTrue(recursiveEquals(term77889, term78932));
        assertTrue(recursiveEquals(retValue, true));
    }

};


