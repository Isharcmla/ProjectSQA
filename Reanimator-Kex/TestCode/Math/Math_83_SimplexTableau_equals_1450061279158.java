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

public class SimplexTableau_equals_1450061279158 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97959;
     Object term98081;
     Object term98101;
     Object term98102;

    public SimplexTableau_equals_1450061279158() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97959 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setBooleanField(term97959, term97959.getClass(), "restrictToNonNegative", false);
        setIntField(term97959, term97959.getClass(), "numDecisionVariables", 0);
        setIntField(term97959, term97959.getClass(), "numSlackVariables", 0);
        setIntField(term97959, term97959.getClass(), "numArtificialVariables", -1);
        term98081 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setBooleanField(term98081, term98081.getClass(), "restrictToNonNegative", false);
        setIntField(term98081, term98081.getClass(), "numDecisionVariables", 0);
        setIntField(term98081, term98081.getClass(), "numSlackVariables", 0);
        setIntField(term98081, term98081.getClass(), "numArtificialVariables", 0);
        term98101 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term98101, term98101.getClass(), "f", null);
        setField(term98101, term98101.getClass(), "constraints", null);
        setBooleanField(term98101, term98101.getClass(), "restrictToNonNegative", false);
        setField(term98101, term98101.getClass(), "tableau", null);
        setIntField(term98101, term98101.getClass(), "numDecisionVariables", 0);
        setIntField(term98101, term98101.getClass(), "numSlackVariables", 0);
        setIntField(term98101, term98101.getClass(), "numArtificialVariables", -1);
        setDoubleField(term98101, term98101.getClass(), "epsilon", 0.0);
        term98102 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term98102, term98102.getClass(), "f", null);
        setField(term98102, term98102.getClass(), "constraints", null);
        setBooleanField(term98102, term98102.getClass(), "restrictToNonNegative", false);
        setField(term98102, term98102.getClass(), "tableau", null);
        setIntField(term98102, term98102.getClass(), "numDecisionVariables", 0);
        setIntField(term98102, term98102.getClass(), "numSlackVariables", 0);
        setIntField(term98102, term98102.getClass(), "numArtificialVariables", 0);
        setDoubleField(term98102, term98102.getClass(), "epsilon", 0.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term98081;
        Object retValue = callMethod(klass, "equals", argTypes, term97959, args);
        assertTrue(recursiveEquals(term97959, term98101));
        assertTrue(recursiveEquals(term98081, term98102));
        assertTrue(recursiveEquals(retValue, false));
    }

};


