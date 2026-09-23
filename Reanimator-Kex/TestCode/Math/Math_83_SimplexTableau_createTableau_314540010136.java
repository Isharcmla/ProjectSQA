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

public class SimplexTableau_createTableau_314540010136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87741;

    public SimplexTableau_createTableau_314540010136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term88928 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term88927 = ((Class) term88928).getDeclaredField((String) "EQ");
        ((Field) term88927).setAccessible(true);
        Object enum176 = ((Field) term88927).get((Object) null);
        Object term87919 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setDoubleField(term87919, term87919.getClass(), "value", 1.7592186044416E13);
        setField(term87919, term87919.getClass(), "coefficients", null);
        setField(term87919, term87919.getClass(), "relationship", enum176);
        Object term88201 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        Object term88303 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        setDoubleField(term88201, term88201.getClass(), "value", -9.223370937343148E18);
        setField(term88201, term88201.getClass(), "coefficients", term88303);
        ArrayList term87793 = new ArrayList();
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term88201);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        ((ArrayList) term87793).add(term87919);
        term87741 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term87741, term87741.getClass(), "constraints", term87793);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = false;
        try {
            callMethod(klass, "createTableau", argTypes, term87741, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


