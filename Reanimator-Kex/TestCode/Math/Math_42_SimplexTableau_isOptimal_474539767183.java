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

public class SimplexTableau_isOptimal_474539767183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term100500;
     Object term101516;

    public SimplexTableau_isOptimal_474539767183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term100500 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term100608 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setIntField(term100500, term100500.getClass(), "numArtificialVariables", 1);
        setField(term100500, term100500.getClass(), "tableau", term100608);
        term101516 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term101517 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(term101516, term101516.getClass(), "f", null);
        setField(term101516, term101516.getClass(), "constraints", null);
        setBooleanField(term101516, term101516.getClass(), "restrictToNonNegative", false);
        setField(term101516, term101516.getClass(), "columnLabels", null);
        setField(term101517, term101517.getClass(), "data", null);
        setField(term101516, term101516.getClass(), "tableau", term101517);
        setIntField(term101516, term101516.getClass(), "numDecisionVariables", 0);
        setIntField(term101516, term101516.getClass(), "numSlackVariables", 0);
        setIntField(term101516, term101516.getClass(), "numArtificialVariables", 1);
        setDoubleField(term101516, term101516.getClass(), "epsilon", 0.0);
        setIntField(term101516, term101516.getClass(), "maxUlps", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isOptimal", argTypes, term100500, args);
        assertTrue(recursiveEquals(term100500, term101516));
        assertTrue(recursiveEquals(retValue, true));
    }

};


