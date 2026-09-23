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

public class SimplexTableau_createTableau_314540010172 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104821;

    public SimplexTableau_createTableau_314540010172() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term105788 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term105787 = ((Class) term105788).getDeclaredField((String) "LEQ");
        ((Field) term105787).setAccessible(true);
        Object enum194 = ((Field) term105787).get((Object) null);
        Object term104999 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setDoubleField(term104999, term104999.getClass(), "value", 0.0);
        setField(term104999, term104999.getClass(), "coefficients", null);
        setField(term104999, term104999.getClass(), "relationship", enum194);
        ArrayList term104873 = new ArrayList();
        ((ArrayList) term104873).add(term104999);
        term104821 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term104821, term104821.getClass(), "constraints", term104873);
        setIntField(term104821, term104821.getClass(), "numDecisionVariables", 0);
        setIntField(term104821, term104821.getClass(), "numSlackVariables", 0);
        setIntField(term104821, term104821.getClass(), "numArtificialVariables", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = false;
        try {
            callMethod(klass, "createTableau", argTypes, term104821, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


