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

public class SimplexTableau_init_920539495211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116856;

    public SimplexTableau_init_920539495211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term116804 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term116804, term116804.getClass(), "columnLabels", null);
        setField(term116804, term116804.getClass(), "f", null);
        Class<? extends Object> term117874 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term117873 = ((Class) term117874).getDeclaredField((String) "GEQ");
        ((Field) term117873).setAccessible(true);
        Object enum139 = ((Field) term117873).get((Object) null);
        Object term116982 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setDoubleField(term116982, term116982.getClass(), "value", 0.0);
        setField(term116982, term116982.getClass(), "coefficients", null);
        setField(term116982, term116982.getClass(), "relationship", enum139);
        term116856 = new ArrayList();
        ((ArrayList) term116856).add(term116982);
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
        args[1] = term116856;
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


