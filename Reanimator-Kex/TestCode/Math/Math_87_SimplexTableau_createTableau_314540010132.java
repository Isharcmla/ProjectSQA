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
import java.lang.NullPointerException;
import static org.apache.commons.math.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.String;

public class SimplexTableau_createTableau_314540010132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term79382;

    public SimplexTableau_createTableau_314540010132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term80349 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term80348 = ((Class) term80349).getDeclaredField((String) "LEQ");
        ((Field) term80348).setAccessible(true);
        Object enum151 = ((Field) term80348).get((Object) null);
        Object term79560 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setDoubleField(term79560, term79560.getClass(), "value", 0.0);
        setField(term79560, term79560.getClass(), "coefficients", null);
        setField(term79560, term79560.getClass(), "relationship", enum151);
        ArrayList term79434 = new ArrayList();
        ((ArrayList) term79434).add(term79560);
        term79382 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term79382, term79382.getClass(), "constraints", term79434);
        setIntField(term79382, term79382.getClass(), "numDecisionVariables", 0);
        setIntField(term79382, term79382.getClass(), "numSlackVariables", 0);
        setIntField(term79382, term79382.getClass(), "numArtificialVariables", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = false;
        try {
            callMethod(klass, "createTableau", argTypes, term79382, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


