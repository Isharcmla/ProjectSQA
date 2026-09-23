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

public class SimplexTableau_equals_145006127971 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63510;
     Object term63796;
     Object term63797;

    public SimplexTableau_equals_145006127971() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63510 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        term63796 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term63796, term63796.getClass(), "f", null);
        setField(term63796, term63796.getClass(), "constraints", null);
        setBooleanField(term63796, term63796.getClass(), "restrictToNonNegative", false);
        setField(term63796, term63796.getClass(), "columnLabels", null);
        setField(term63796, term63796.getClass(), "tableau", null);
        setIntField(term63796, term63796.getClass(), "numDecisionVariables", 0);
        setIntField(term63796, term63796.getClass(), "numSlackVariables", 0);
        setIntField(term63796, term63796.getClass(), "numArtificialVariables", 0);
        setDoubleField(term63796, term63796.getClass(), "epsilon", 0.0);
        setIntField(term63796, term63796.getClass(), "maxUlps", 0);
        term63797 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term63797, term63797.getClass(), "f", null);
        setField(term63797, term63797.getClass(), "constraints", null);
        setBooleanField(term63797, term63797.getClass(), "restrictToNonNegative", false);
        setField(term63797, term63797.getClass(), "columnLabels", null);
        setField(term63797, term63797.getClass(), "tableau", null);
        setIntField(term63797, term63797.getClass(), "numDecisionVariables", 0);
        setIntField(term63797, term63797.getClass(), "numSlackVariables", 0);
        setIntField(term63797, term63797.getClass(), "numArtificialVariables", 0);
        setDoubleField(term63797, term63797.getClass(), "epsilon", 0.0);
        setIntField(term63797, term63797.getClass(), "maxUlps", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term63510;
        Object retValue = callMethod(klass, "equals", argTypes, term63510, args);
        assertTrue(recursiveEquals(term63510, term63796));
        assertTrue(recursiveEquals(term63510, term63797));
        assertTrue(recursiveEquals(retValue, true));
    }

};


