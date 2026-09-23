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

public class SimplexTableau_equals_1450061279140 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87160;
     Object term87282;
     Object term87302;
     Object term87303;

    public SimplexTableau_equals_1450061279140() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87160 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setBooleanField(term87160, term87160.getClass(), "restrictToNonNegative", false);
        setIntField(term87160, term87160.getClass(), "numDecisionVariables", 0);
        setIntField(term87160, term87160.getClass(), "numSlackVariables", 0);
        setIntField(term87160, term87160.getClass(), "numArtificialVariables", -1);
        term87282 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setBooleanField(term87282, term87282.getClass(), "restrictToNonNegative", false);
        setIntField(term87282, term87282.getClass(), "numDecisionVariables", 0);
        setIntField(term87282, term87282.getClass(), "numSlackVariables", 0);
        setIntField(term87282, term87282.getClass(), "numArtificialVariables", 0);
        term87302 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term87302, term87302.getClass(), "f", null);
        setField(term87302, term87302.getClass(), "constraints", null);
        setBooleanField(term87302, term87302.getClass(), "restrictToNonNegative", false);
        setField(term87302, term87302.getClass(), "tableau", null);
        setIntField(term87302, term87302.getClass(), "numDecisionVariables", 0);
        setIntField(term87302, term87302.getClass(), "numSlackVariables", 0);
        setIntField(term87302, term87302.getClass(), "numArtificialVariables", -1);
        setDoubleField(term87302, term87302.getClass(), "epsilon", 0.0);
        term87303 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term87303, term87303.getClass(), "f", null);
        setField(term87303, term87303.getClass(), "constraints", null);
        setBooleanField(term87303, term87303.getClass(), "restrictToNonNegative", false);
        setField(term87303, term87303.getClass(), "tableau", null);
        setIntField(term87303, term87303.getClass(), "numDecisionVariables", 0);
        setIntField(term87303, term87303.getClass(), "numSlackVariables", 0);
        setIntField(term87303, term87303.getClass(), "numArtificialVariables", 0);
        setDoubleField(term87303, term87303.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term87282;
        Object retValue = callMethod(klass, "equals", argTypes, term87160, args);
        assertTrue(recursiveEquals(term87160, term87302));
        assertTrue(recursiveEquals(term87282, term87303));
        assertTrue(recursiveEquals(retValue, false));
    }

};


