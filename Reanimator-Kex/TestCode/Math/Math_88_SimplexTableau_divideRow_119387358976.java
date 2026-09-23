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

public class SimplexTableau_divideRow_119387358976 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58453;
     Object term58868;

    public SimplexTableau_divideRow_119387358976() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58453 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term58549 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        setField(term58453, term58453.getClass(), "tableau", term58549);
        term58868 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term58869 = newInstance(Class.forName("org.apache.commons.math.linear.RealMatrixImpl"));
        setField(term58868, term58868.getClass(), "f", null);
        setField(term58868, term58868.getClass(), "constraints", null);
        setBooleanField(term58868, term58868.getClass(), "restrictToNonNegative", false);
        setField(term58869, term58869.getClass(), "data", null);
        setField(term58869, term58869.getClass(), "lu", null);
        setField(term58868, term58868.getClass(), "tableau", term58869);
        setIntField(term58868, term58868.getClass(), "numDecisionVariables", 0);
        setIntField(term58868, term58868.getClass(), "numSlackVariables", 0);
        setIntField(term58868, term58868.getClass(), "numArtificialVariables", 0);
        setDoubleField(term58868, term58868.getClass(), "epsilon", 0.0);
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
        callMethod(klass, "divideRow", argTypes, term58453, args);
        assertTrue(recursiveEquals(term58453, term58868));
    }

};


