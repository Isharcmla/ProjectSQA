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

public class SimplexTableau_getHeight_1993331470112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73521;
     Object term73638;

    public SimplexTableau_getHeight_1993331470112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73521 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term73623 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(term73521, term73521.getClass(), "tableau", term73623);
        term73638 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term73639 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(term73638, term73638.getClass(), "f", null);
        setField(term73638, term73638.getClass(), "constraints", null);
        setBooleanField(term73638, term73638.getClass(), "restrictToNonNegative", false);
        setIntField(term73639, term73639.getClass(), "rowDimension", 0);
        setIntField(term73639, term73639.getClass(), "columnDimension", 0);
        setField(term73639, term73639.getClass(), "entries", null);
        setField(term73639, term73639.getClass(), "lu", null);
        setField(term73638, term73638.getClass(), "tableau", term73639);
        setIntField(term73638, term73638.getClass(), "numDecisionVariables", 0);
        setIntField(term73638, term73638.getClass(), "numSlackVariables", 0);
        setIntField(term73638, term73638.getClass(), "numArtificialVariables", 0);
        setDoubleField(term73638, term73638.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getHeight", argTypes, term73521, args);
        assertTrue(recursiveEquals(term73521, term73638));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


