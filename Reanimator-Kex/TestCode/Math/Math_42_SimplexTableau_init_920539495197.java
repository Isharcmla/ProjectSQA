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

public class SimplexTableau_init_920539495197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110011;

    public SimplexTableau_init_920539495197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term109959 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term109959, term109959.getClass(), "columnLabels", null);
        setField(term109959, term109959.getClass(), "f", null);
        Class<? extends Object> term111510 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term111509 = ((Class) term111510).getDeclaredField((String) "LEQ");
        ((Field) term111509).setAccessible(true);
        Object enum136 = ((Field) term111509).get((Object) null);
        Object term110137 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        Object term110229 = newInstance(Class.forName("org.apache.commons.math.linear.RealVector$2"));
        setDoubleField(term110137, term110137.getClass(), "value", 4.503599627403264E15);
        setField(term110137, term110137.getClass(), "coefficients", term110229);
        setField(term110137, term110137.getClass(), "relationship", enum136);
        Object term110511 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        Object term110637 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setDoubleField(term110637, term110637.getClass(), "value", 0.0);
        setField(term110637, term110637.getClass(), "coefficients", null);
        setField(term110637, term110637.getClass(), "relationship", null);
        term110011 = new ArrayList();
        ((ArrayList) term110011).add(term110137);
        ((ArrayList) term110011).add(term110511);
        ((ArrayList) term110011).add(term110637);
        ((ArrayList) term110011).add(term110637);
        ((ArrayList) term110011).add(term110637);
        ((ArrayList) term110011).add(term110637);
        ((ArrayList) term110011).add(term110637);
        ((ArrayList) term110011).add(term110637);
        ((ArrayList) term110011).add(term110637);
        ((ArrayList) term110011).add(term110637);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction");
        argTypes[1] = Class.forName("java.util.Collection");
        argTypes[2] = Class.forName("org.apache.commons.math.optimization.GoalType");
        argTypes[3] = boolean.class;
        argTypes[4] = double.class;
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = term110011;
        args[2] = null;
        args[3] = false;
        args[4] = 0.0;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


