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
import java.util.ArrayList;

public class SimplexTableau_normalizeConstraints_12340687589 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term63915;
     Object term63967;
     Object term64001;
     Object term64002;
     Object term63986;

    public SimplexTableau_normalizeConstraints_12340687589() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term63915 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        term63967 = new ArrayList();
        term64001 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        setField(term64001, term64001.getClass(), "f", null);
        setField(term64001, term64001.getClass(), "constraints", null);
        setBooleanField(term64001, term64001.getClass(), "restrictToNonNegative", false);
        setField(term64001, term64001.getClass(), "columnLabels", null);
        setField(term64001, term64001.getClass(), "tableau", null);
        setIntField(term64001, term64001.getClass(), "numDecisionVariables", 0);
        setIntField(term64001, term64001.getClass(), "numSlackVariables", 0);
        setIntField(term64001, term64001.getClass(), "numArtificialVariables", 0);
        setDoubleField(term64001, term64001.getClass(), "epsilon", 0.0);
        setIntField(term64001, term64001.getClass(), "maxUlps", 0);
        term64002 = new ArrayList();
        term63986 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = term63967;
        Object retValue = callMethod(klass, "normalizeConstraints", argTypes, term63915, args);
        assertTrue(recursiveEquals(term63915, term64001));
        assertTrue(recursiveEquals(term63967, term64002));
        assertTrue(recursiveEquals(retValue, term63986));
    }

};


