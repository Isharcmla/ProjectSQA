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

public class SimplexTableau_equals_1450061279124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84601;
     Object term84611;

    public SimplexTableau_equals_1450061279124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84601 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        term84611 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term84611, term84611.getClass(), "f", null);
        setField(term84611, term84611.getClass(), "constraints", null);
        setBooleanField(term84611, term84611.getClass(), "restrictToNonNegative", false);
        setField(term84611, term84611.getClass(), "tableau", null);
        setIntField(term84611, term84611.getClass(), "numDecisionVariables", 0);
        setIntField(term84611, term84611.getClass(), "numSlackVariables", 0);
        setIntField(term84611, term84611.getClass(), "numArtificialVariables", 0);
        setDoubleField(term84611, term84611.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "equals", argTypes, term84601, args);
        assertTrue(recursiveEquals(term84601, term84611));
        assertTrue(recursiveEquals(retValue, false));
    }

};


