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

public class SimplexTableau_equals_1450061279154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97372;
     Object term97494;
     Object term97511;
     Object term97512;

    public SimplexTableau_equals_1450061279154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97372 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setBooleanField(term97372, term97372.getClass(), "restrictToNonNegative", false);
        term97494 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setBooleanField(term97494, term97494.getClass(), "restrictToNonNegative", true);
        term97511 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term97511, term97511.getClass(), "f", null);
        setField(term97511, term97511.getClass(), "constraints", null);
        setBooleanField(term97511, term97511.getClass(), "restrictToNonNegative", false);
        setField(term97511, term97511.getClass(), "tableau", null);
        setIntField(term97511, term97511.getClass(), "numDecisionVariables", 0);
        setIntField(term97511, term97511.getClass(), "numSlackVariables", 0);
        setIntField(term97511, term97511.getClass(), "numArtificialVariables", 0);
        setDoubleField(term97511, term97511.getClass(), "epsilon", 0.0);
        term97512 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term97512, term97512.getClass(), "f", null);
        setField(term97512, term97512.getClass(), "constraints", null);
        setBooleanField(term97512, term97512.getClass(), "restrictToNonNegative", true);
        setField(term97512, term97512.getClass(), "tableau", null);
        setIntField(term97512, term97512.getClass(), "numDecisionVariables", 0);
        setIntField(term97512, term97512.getClass(), "numSlackVariables", 0);
        setIntField(term97512, term97512.getClass(), "numArtificialVariables", 0);
        setDoubleField(term97512, term97512.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term97494;
        Object retValue = callMethod(klass, "equals", argTypes, term97372, args);
        assertTrue(recursiveEquals(term97372, term97511));
        assertTrue(recursiveEquals(term97494, term97512));
        assertTrue(recursiveEquals(retValue, false));
    }

};


