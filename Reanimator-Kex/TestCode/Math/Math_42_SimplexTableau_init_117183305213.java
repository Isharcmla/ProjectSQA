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
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class SimplexTableau_init_117183305213 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118761;

    public SimplexTableau_init_117183305213() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term118709 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term118709, term118709.getClass(), "columnLabels", null);
        setField(term118709, term118709.getClass(), "f", null);
        Class<? extends Object> term119779 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term119778 = ((Class) term119779).getDeclaredField((String) "GEQ");
        ((Field) term119778).setAccessible(true);
        Object enum142 = ((Field) term119778).get((Object) null);
        Object term118887 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setDoubleField(term118887, term118887.getClass(), "value", 0.0);
        setField(term118887, term118887.getClass(), "coefficients", null);
        setField(term118887, term118887.getClass(), "relationship", enum142);
        term118761 = new ArrayList();
        ((ArrayList) term118761).add(term118887);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction");
        argTypes[1] = Class.forName("java.util.Collection");
        argTypes[2] = Class.forName("org.apache.commons.math.optimization.GoalType");
        argTypes[3] = boolean.class;
        argTypes[4] = double.class;
        argTypes[5] = int.class;
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = term118761;
        args[2] = null;
        args[3] = false;
        args[4] = 0.0;
        args[5] = 0;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


