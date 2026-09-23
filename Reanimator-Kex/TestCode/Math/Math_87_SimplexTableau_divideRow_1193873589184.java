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

public class SimplexTableau_divideRow_1193873589184 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112225;
     Object term112336;

    public SimplexTableau_divideRow_1193873589184() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112225 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term112321 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        setField(term112225, term112225.getClass(), "tableau", term112321);
        term112336 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term112337 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        setField(term112336, term112336.getClass(), "f", null);
        setField(term112336, term112336.getClass(), "constraints", null);
        setBooleanField(term112336, term112336.getClass(), "restrictToNonNegative", false);
        setField(term112337, term112337.getClass(), "data", null);
        setField(term112337, term112337.getClass(), "lu", null);
        setField(term112336, term112336.getClass(), "tableau", term112337);
        setIntField(term112336, term112336.getClass(), "numDecisionVariables", 0);
        setIntField(term112336, term112336.getClass(), "numSlackVariables", 0);
        setIntField(term112336, term112336.getClass(), "numArtificialVariables", 0);
        setDoubleField(term112336, term112336.getClass(), "epsilon", 0.0);
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
        callMethod(klass, "divideRow", argTypes, term112225, args);
        assertTrue(recursiveEquals(term112225, term112336));
    }

};


