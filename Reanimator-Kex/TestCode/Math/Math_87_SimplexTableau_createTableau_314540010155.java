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

public class SimplexTableau_createTableau_314540010155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term94277;

    public SimplexTableau_createTableau_314540010155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term95478 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term95477 = ((Class) term95478).getDeclaredField((String) "GEQ");
        ((Field) term95477).setAccessible(true);
        Object enum169 = ((Field) term95477).get((Object) null);
        Object term94455 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setDoubleField(term94455, term94455.getClass(), "value", 0.0);
        setField(term94455, term94455.getClass(), "coefficients", null);
        setField(term94455, term94455.getClass(), "relationship", enum169);
        ArrayList term94329 = new ArrayList();
        ((ArrayList) term94329).add(term94455);
        term94277 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term94277, term94277.getClass(), "constraints", term94329);
        setIntField(term94277, term94277.getClass(), "numDecisionVariables", 126);
        setIntField(term94277, term94277.getClass(), "numSlackVariables", 0);
        setIntField(term94277, term94277.getClass(), "numArtificialVariables", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = true;
        try {
            callMethod(klass, "createTableau", argTypes, term94277, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


