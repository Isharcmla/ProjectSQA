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

public class SimplexTableau_divideRow_119387358980 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62089;
     Object term62472;

    public SimplexTableau_divideRow_119387358980() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62089 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term62187 = newInstance(Class.forName("org.apache.commons.math.linear.DenseRealMatrix"));
        setField(term62089, term62089.getClass(), "tableau", term62187);
        term62472 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term62473 = newInstance(Class.forName("org.apache.commons.math.linear.DenseRealMatrix"));
        setField(term62472, term62472.getClass(), "f", null);
        setField(term62472, term62472.getClass(), "constraints", null);
        setBooleanField(term62472, term62472.getClass(), "restrictToNonNegative", false);
        setField(term62473, term62473.getClass(), "blocks", null);
        setIntField(term62473, term62473.getClass(), "rows", 0);
        setIntField(term62473, term62473.getClass(), "columns", 0);
        setIntField(term62473, term62473.getClass(), "blockRows", 0);
        setIntField(term62473, term62473.getClass(), "blockColumns", 0);
        setField(term62473, term62473.getClass(), "lu", null);
        setField(term62472, term62472.getClass(), "tableau", term62473);
        setIntField(term62472, term62472.getClass(), "numDecisionVariables", 0);
        setIntField(term62472, term62472.getClass(), "numSlackVariables", 0);
        setIntField(term62472, term62472.getClass(), "numArtificialVariables", 0);
        setDoubleField(term62472, term62472.getClass(), "epsilon", 0.0);
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
        callMethod(klass, "divideRow", argTypes, term62089, args);
        assertTrue(recursiveEquals(term62089, term62472));
    }

};


