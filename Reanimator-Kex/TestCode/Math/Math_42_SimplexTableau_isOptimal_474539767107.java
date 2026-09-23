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

public class SimplexTableau_isOptimal_474539767107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71455;
     Object term71601;

    public SimplexTableau_isOptimal_474539767107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71455 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term71563 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setIntField(term71455, term71455.getClass(), "numArtificialVariables", 0);
        setField(term71455, term71455.getClass(), "tableau", term71563);
        term71601 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term71602 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(term71601, term71601.getClass(), "f", null);
        setField(term71601, term71601.getClass(), "constraints", null);
        setBooleanField(term71601, term71601.getClass(), "restrictToNonNegative", false);
        setField(term71601, term71601.getClass(), "columnLabels", null);
        setField(term71602, term71602.getClass(), "data", null);
        setField(term71601, term71601.getClass(), "tableau", term71602);
        setIntField(term71601, term71601.getClass(), "numDecisionVariables", 0);
        setIntField(term71601, term71601.getClass(), "numSlackVariables", 0);
        setIntField(term71601, term71601.getClass(), "numArtificialVariables", 0);
        setDoubleField(term71601, term71601.getClass(), "epsilon", 0.0);
        setIntField(term71601, term71601.getClass(), "maxUlps", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isOptimal", argTypes, term71455, args);
        assertTrue(recursiveEquals(term71455, term71601));
        assertTrue(recursiveEquals(retValue, true));
    }

};


