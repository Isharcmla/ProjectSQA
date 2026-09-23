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

public class SimplexTableau_equals_1450061279137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82916;
     Object term83038;
     Object term83057;
     Object term83058;

    public SimplexTableau_equals_1450061279137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82916 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setBooleanField(term82916, term82916.getClass(), "restrictToNonNegative", false);
        term83038 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setBooleanField(term83038, term83038.getClass(), "restrictToNonNegative", true);
        term83057 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term83057, term83057.getClass(), "f", null);
        setField(term83057, term83057.getClass(), "constraints", null);
        setBooleanField(term83057, term83057.getClass(), "restrictToNonNegative", false);
        setField(term83057, term83057.getClass(), "columnLabels", null);
        setField(term83057, term83057.getClass(), "tableau", null);
        setIntField(term83057, term83057.getClass(), "numDecisionVariables", 0);
        setIntField(term83057, term83057.getClass(), "numSlackVariables", 0);
        setIntField(term83057, term83057.getClass(), "numArtificialVariables", 0);
        setDoubleField(term83057, term83057.getClass(), "epsilon", 0.0);
        setIntField(term83057, term83057.getClass(), "maxUlps", 0);
        term83058 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term83058, term83058.getClass(), "f", null);
        setField(term83058, term83058.getClass(), "constraints", null);
        setBooleanField(term83058, term83058.getClass(), "restrictToNonNegative", true);
        setField(term83058, term83058.getClass(), "columnLabels", null);
        setField(term83058, term83058.getClass(), "tableau", null);
        setIntField(term83058, term83058.getClass(), "numDecisionVariables", 0);
        setIntField(term83058, term83058.getClass(), "numSlackVariables", 0);
        setIntField(term83058, term83058.getClass(), "numArtificialVariables", 0);
        setDoubleField(term83058, term83058.getClass(), "epsilon", 0.0);
        setIntField(term83058, term83058.getClass(), "maxUlps", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term83038;
        Object retValue = callMethod(klass, "equals", argTypes, term82916, args);
        assertTrue(recursiveEquals(term82916, term83057));
        assertTrue(recursiveEquals(term83038, term83058));
        assertTrue(recursiveEquals(retValue, false));
    }

};


