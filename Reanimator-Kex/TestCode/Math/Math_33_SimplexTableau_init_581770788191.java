package org.apache.commons.math3.optimization.linear;

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
import static org.apache.commons.math3.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class SimplexTableau_init_581770788191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101273;

    public SimplexTableau_init_581770788191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term101221 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        setField(term101221, term101221.getClass(), "columnLabels", null);
        setField(term101221, term101221.getClass(), "f", null);
        Class<? extends Object> term102300 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term102299 = ((Class) term102300).getDeclaredField((String) "GEQ");
        ((Field) term102299).setAccessible(true);
        Object enum133 = ((Field) term102299).get((Object) null);
        Object term101401 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setDoubleField(term101401, term101401.getClass(), "value", 0.0);
        setField(term101401, term101401.getClass(), "coefficients", null);
        setField(term101401, term101401.getClass(), "relationship", enum133);
        term101273 = new ArrayList();
        ((ArrayList) term101273).add(term101401);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction");
        argTypes[1] = Class.forName("java.util.Collection");
        argTypes[2] = Class.forName("org.apache.commons.math3.optimization.GoalType");
        argTypes[3] = boolean.class;
        argTypes[4] = double.class;
        argTypes[5] = int.class;
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = term101273;
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


