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
import java.util.ArrayList;

public class SimplexTableau_normalizeConstraints_70736233299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69898;
     Object term69950;
     Object term70238;
     Object term70239;
     Object term70223;

    public SimplexTableau_normalizeConstraints_70736233299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69898 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        term69950 = new ArrayList();
        term70238 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term70238, term70238.getClass(), "f", null);
        setField(term70238, term70238.getClass(), "constraints", null);
        setBooleanField(term70238, term70238.getClass(), "restrictToNonNegative", false);
        setField(term70238, term70238.getClass(), "columnLabels", null);
        setField(term70238, term70238.getClass(), "tableau", null);
        setIntField(term70238, term70238.getClass(), "numDecisionVariables", 0);
        setIntField(term70238, term70238.getClass(), "numSlackVariables", 0);
        setIntField(term70238, term70238.getClass(), "numArtificialVariables", 0);
        setDoubleField(term70238, term70238.getClass(), "epsilon", 0.0);
        setIntField(term70238, term70238.getClass(), "maxUlps", 0);
        term70239 = new ArrayList();
        term70223 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = term69950;
        Object retValue = callMethod(klass, "normalizeConstraints", argTypes, term69898, args);
        assertTrue(recursiveEquals(term69898, term70238));
        assertTrue(recursiveEquals(term69950, term70239));
        assertTrue(recursiveEquals(retValue, term70223));
    }

};


