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

public class SimplexTableau_equals_145006127990 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66580;
     Object term66627;
     Object term66628;

    public SimplexTableau_equals_145006127990() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66580 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        term66627 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term66627, term66627.getClass(), "f", null);
        setField(term66627, term66627.getClass(), "constraints", null);
        setBooleanField(term66627, term66627.getClass(), "restrictToNonNegative", false);
        setField(term66627, term66627.getClass(), "tableau", null);
        setIntField(term66627, term66627.getClass(), "numDecisionVariables", 0);
        setIntField(term66627, term66627.getClass(), "numSlackVariables", 0);
        setIntField(term66627, term66627.getClass(), "numArtificialVariables", 0);
        setDoubleField(term66627, term66627.getClass(), "epsilon", 0.0);
        term66628 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term66628, term66628.getClass(), "f", null);
        setField(term66628, term66628.getClass(), "constraints", null);
        setBooleanField(term66628, term66628.getClass(), "restrictToNonNegative", false);
        setField(term66628, term66628.getClass(), "tableau", null);
        setIntField(term66628, term66628.getClass(), "numDecisionVariables", 0);
        setIntField(term66628, term66628.getClass(), "numSlackVariables", 0);
        setIntField(term66628, term66628.getClass(), "numArtificialVariables", 0);
        setDoubleField(term66628, term66628.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term66580;
        Object retValue = callMethod(klass, "equals", argTypes, term66580, args);
        assertTrue(recursiveEquals(term66580, term66627));
        assertTrue(recursiveEquals(term66580, term66628));
        assertTrue(recursiveEquals(retValue, true));
    }

};


