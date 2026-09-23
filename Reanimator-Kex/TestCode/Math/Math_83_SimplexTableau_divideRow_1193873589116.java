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

public class SimplexTableau_divideRow_1193873589116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83284;
     Object term83407;

    public SimplexTableau_divideRow_1193873589116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83284 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term83392 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(term83284, term83284.getClass(), "tableau", term83392);
        term83407 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term83408 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(term83407, term83407.getClass(), "f", null);
        setField(term83407, term83407.getClass(), "constraints", null);
        setBooleanField(term83407, term83407.getClass(), "restrictToNonNegative", false);
        setField(term83408, term83408.getClass(), "data", null);
        setField(term83408, term83408.getClass(), "lu", null);
        setField(term83407, term83407.getClass(), "tableau", term83408);
        setIntField(term83407, term83407.getClass(), "numDecisionVariables", 0);
        setIntField(term83407, term83407.getClass(), "numSlackVariables", 0);
        setIntField(term83407, term83407.getClass(), "numArtificialVariables", 0);
        setDoubleField(term83407, term83407.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = 0;
        args[1] = 0.0;
        callMethod(klass, "divideRow", argTypes, term83284, args);
        assertTrue(recursiveEquals(term83284, term83407));
    }

};


