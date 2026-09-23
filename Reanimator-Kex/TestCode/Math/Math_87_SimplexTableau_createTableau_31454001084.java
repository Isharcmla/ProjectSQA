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

public class SimplexTableau_createTableau_31454001084 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62708;

    public SimplexTableau_createTableau_31454001084() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term64156 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term64155 = ((Class) term64156).getDeclaredField((String) "EQ");
        ((Field) term64155).setAccessible(true);
        Object enum139 = ((Field) term64155).get((Object) null);
        Object term62886 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        Object term62988 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        setDoubleField(term62886, term62886.getClass(), "value", 0.0);
        setField(term62886, term62886.getClass(), "coefficients", term62988);
        setField(term62886, term62886.getClass(), "relationship", enum139);
        ArrayList term62760 = new ArrayList();
        ((ArrayList) term62760).add(term62886);
        term62708 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term62708, term62708.getClass(), "constraints", term62760);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = false;
        try {
            callMethod(klass, "createTableau", argTypes, term62708, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


