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
import java.lang.NullPointerException;
import static org.apache.commons.math3.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class SimplexTableau_normalizeConstraints_12340687536 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1995;

    public SimplexTableau_normalizeConstraints_12340687536() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1995 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        setField(term1995, term1995.getClass(), "f", null);
        setField(term1995, term1995.getClass(), "constraints", null);
        setBooleanField(term1995, term1995.getClass(), "restrictToNonNegative", false);
        setField(term1995, term1995.getClass(), "columnLabels", null);
        setField(term1995, term1995.getClass(), "tableau", null);
        setIntField(term1995, term1995.getClass(), "numDecisionVariables", 0);
        setIntField(term1995, term1995.getClass(), "numSlackVariables", 0);
        setIntField(term1995, term1995.getClass(), "numArtificialVariables", 0);
        setDoubleField(term1995, term1995.getClass(), "epsilon", 0.0);
        setIntField(term1995, term1995.getClass(), "maxUlps", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "normalizeConstraints", argTypes, term1995, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


