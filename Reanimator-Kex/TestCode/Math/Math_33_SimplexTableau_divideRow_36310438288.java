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

public class SimplexTableau_divideRow_36310438288 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63657;
     Object term63983;

    public SimplexTableau_divideRow_36310438288() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63657 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term63767 = newInstance(Class.forName("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        setField(term63657, term63657.getClass(), "tableau", term63767);
        term63983 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term63984 = newInstance(Class.forName("org.apache.commons.math3.linear.Array2DRowRealMatrix"));
        setField(term63983, term63983.getClass(), "f", null);
        setField(term63983, term63983.getClass(), "constraints", null);
        setBooleanField(term63983, term63983.getClass(), "restrictToNonNegative", false);
        setField(term63983, term63983.getClass(), "columnLabels", null);
        setField(term63984, term63984.getClass(), "data", null);
        setField(term63983, term63983.getClass(), "tableau", term63984);
        setIntField(term63983, term63983.getClass(), "numDecisionVariables", 0);
        setIntField(term63983, term63983.getClass(), "numSlackVariables", 0);
        setIntField(term63983, term63983.getClass(), "numArtificialVariables", 0);
        setDoubleField(term63983, term63983.getClass(), "epsilon", 0.0);
        setIntField(term63983, term63983.getClass(), "maxUlps", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = int.class;
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = 0;
        args[1] = 0.0;
        callMethod(klass, "divideRow", argTypes, term63657, args);
        assertTrue(recursiveEquals(term63657, term63983));
    }

};


