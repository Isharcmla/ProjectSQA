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

public class SimplexTableau_readObject_213806797865 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56746;

    public SimplexTableau_readObject_213806797865() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56746 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        setField(term56746, term56746.getClass(), "f", null);
        setField(term56746, term56746.getClass(), "constraints", null);
        setBooleanField(term56746, term56746.getClass(), "restrictToNonNegative", false);
        setField(term56746, term56746.getClass(), "columnLabels", null);
        setField(term56746, term56746.getClass(), "tableau", null);
        setIntField(term56746, term56746.getClass(), "numDecisionVariables", 0);
        setIntField(term56746, term56746.getClass(), "numSlackVariables", 0);
        setIntField(term56746, term56746.getClass(), "numArtificialVariables", 0);
        setDoubleField(term56746, term56746.getClass(), "epsilon", 0.0);
        setIntField(term56746, term56746.getClass(), "maxUlps", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.io.ObjectInputStream");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "readObject", argTypes, term56746, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


