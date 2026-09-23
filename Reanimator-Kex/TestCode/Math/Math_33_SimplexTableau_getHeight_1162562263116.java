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

public class SimplexTableau_getHeight_1162562263116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70051;
     Object term70365;

    public SimplexTableau_getHeight_1162562263116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70051 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term70161 = newInstance(Class.forName("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        setField(term70051, term70051.getClass(), "tableau", term70161);
        term70365 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term70366 = newInstance(Class.forName("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        setField(term70365, term70365.getClass(), "f", null);
        setField(term70365, term70365.getClass(), "constraints", null);
        setBooleanField(term70365, term70365.getClass(), "restrictToNonNegative", false);
        setField(term70365, term70365.getClass(), "columnLabels", null);
        setField(term70366, term70366.getClass(), "data", null);
        setField(term70365, term70365.getClass(), "tableau", term70366);
        setIntField(term70365, term70365.getClass(), "numDecisionVariables", 0);
        setIntField(term70365, term70365.getClass(), "numSlackVariables", 0);
        setIntField(term70365, term70365.getClass(), "numArtificialVariables", 0);
        setDoubleField(term70365, term70365.getClass(), "epsilon", 0.0);
        setIntField(term70365, term70365.getClass(), "maxUlps", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getHeight", argTypes, term70051, args);
        assertTrue(recursiveEquals(term70051, term70365));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


