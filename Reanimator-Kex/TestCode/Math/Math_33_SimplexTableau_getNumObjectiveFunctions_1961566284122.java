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

public class SimplexTableau_getNumObjectiveFunctions_1961566284122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71251;
     Object term71932;

    public SimplexTableau_getNumObjectiveFunctions_1961566284122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71251 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        setIntField(term71251, term71251.getClass(), "numArtificialVariables", 0);
        term71932 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        setField(term71932, term71932.getClass(), "f", null);
        setField(term71932, term71932.getClass(), "constraints", null);
        setBooleanField(term71932, term71932.getClass(), "restrictToNonNegative", false);
        setField(term71932, term71932.getClass(), "columnLabels", null);
        setField(term71932, term71932.getClass(), "tableau", null);
        setIntField(term71932, term71932.getClass(), "numDecisionVariables", 0);
        setIntField(term71932, term71932.getClass(), "numSlackVariables", 0);
        setIntField(term71932, term71932.getClass(), "numArtificialVariables", 0);
        setDoubleField(term71932, term71932.getClass(), "epsilon", 0.0);
        setIntField(term71932, term71932.getClass(), "maxUlps", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNumObjectiveFunctions", argTypes, term71251, args);
        assertTrue(recursiveEquals(term71251, term71932));
        assertTrue(recursiveEquals(retValue, 1));
    }

};


