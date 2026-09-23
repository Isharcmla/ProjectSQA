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

public class SimplexTableau_getRhsOffset_111760619169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92561;
     Object term95616;

    public SimplexTableau_getRhsOffset_111760619169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92561 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term92669 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(term92561, term92561.getClass(), "tableau", term92669);
        term95616 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term95617 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(term95616, term95616.getClass(), "f", null);
        setField(term95616, term95616.getClass(), "constraints", null);
        setBooleanField(term95616, term95616.getClass(), "restrictToNonNegative", false);
        setField(term95616, term95616.getClass(), "columnLabels", null);
        setField(term95617, term95617.getClass(), "data", null);
        setField(term95616, term95616.getClass(), "tableau", term95617);
        setIntField(term95616, term95616.getClass(), "numDecisionVariables", 0);
        setIntField(term95616, term95616.getClass(), "numSlackVariables", 0);
        setIntField(term95616, term95616.getClass(), "numArtificialVariables", 0);
        setDoubleField(term95616, term95616.getClass(), "epsilon", 0.0);
        setIntField(term95616, term95616.getClass(), "maxUlps", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getRhsOffset", argTypes, term92561, args);
        assertTrue(recursiveEquals(term92561, term95616));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


