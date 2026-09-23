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

public class SimplexTableau_createTableau_314540010106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76278;

    public SimplexTableau_createTableau_314540010106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term77354 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term77353 = ((Class) term77354).getDeclaredField((String) "EQ");
        ((Field) term77353).setAccessible(true);
        Object enum160 = ((Field) term77353).get((Object) null);
        Object term76456 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        Object term76558 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        setDoubleField(term76456, term76456.getClass(), "value", 0.0);
        setField(term76456, term76456.getClass(), "coefficients", term76558);
        setField(term76456, term76456.getClass(), "relationship", enum160);
        ArrayList term76330 = new ArrayList();
        ((ArrayList) term76330).add(term76456);
        term76278 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term76278, term76278.getClass(), "constraints", term76330);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = false;
        try {
            callMethod(klass, "createTableau", argTypes, term76278, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


