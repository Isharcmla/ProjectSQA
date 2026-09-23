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

public class SimplexTableau_getHeight_1993331470122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84338;
     Object term84458;

    public SimplexTableau_getHeight_1993331470122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84338 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term84446 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(term84338, term84338.getClass(), "tableau", term84446);
        term84458 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term84459 = newInstance(Class.forName("org.apache.commons.math.linear.Array2DRowRealMatrix"));
        setField(term84458, term84458.getClass(), "f", null);
        setField(term84458, term84458.getClass(), "constraints", null);
        setBooleanField(term84458, term84458.getClass(), "restrictToNonNegative", false);
        setField(term84459, term84459.getClass(), "data", null);
        setField(term84459, term84459.getClass(), "lu", null);
        setField(term84458, term84458.getClass(), "tableau", term84459);
        setIntField(term84458, term84458.getClass(), "numDecisionVariables", 0);
        setIntField(term84458, term84458.getClass(), "numSlackVariables", 0);
        setIntField(term84458, term84458.getClass(), "numArtificialVariables", 0);
        setDoubleField(term84458, term84458.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getHeight", argTypes, term84338, args);
        assertTrue(recursiveEquals(term84338, term84458));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


