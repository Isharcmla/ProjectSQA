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

public class SimplexTableau_divideRow_119387358993 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68503;
     Object term69105;

    public SimplexTableau_divideRow_119387358993() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68503 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term68611 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(term68503, term68503.getClass(), "tableau", term68611);
        term69105 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term69106 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(term69105, term69105.getClass(), "f", null);
        setField(term69105, term69105.getClass(), "constraints", null);
        setBooleanField(term69105, term69105.getClass(), "restrictToNonNegative", false);
        setField(term69105, term69105.getClass(), "columnLabels", null);
        setField(term69106, term69106.getClass(), "data", null);
        setField(term69105, term69105.getClass(), "tableau", term69106);
        setIntField(term69105, term69105.getClass(), "numDecisionVariables", 0);
        setIntField(term69105, term69105.getClass(), "numSlackVariables", 0);
        setIntField(term69105, term69105.getClass(), "numArtificialVariables", 0);
        setDoubleField(term69105, term69105.getClass(), "epsilon", 0.0);
        setIntField(term69105, term69105.getClass(), "maxUlps", 0);
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
        callMethod(klass, "divideRow", argTypes, term68503, args);
        assertTrue(recursiveEquals(term68503, term69105));
    }

};


