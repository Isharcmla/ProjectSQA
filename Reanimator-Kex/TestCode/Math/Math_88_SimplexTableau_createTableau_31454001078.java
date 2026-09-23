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

public class SimplexTableau_createTableau_31454001078 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59183;

    public SimplexTableau_createTableau_31454001078() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term60891 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term60890 = ((Class) term60891).getDeclaredField((String) "LEQ");
        ((Field) term60890).setAccessible(true);
        Object enum140 = ((Field) term60890).get((Object) null);
        Object term59361 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setDoubleField(term59361, term59361.getClass(), "value", 0.0);
        setField(term59361, term59361.getClass(), "coefficients", null);
        setField(term59361, term59361.getClass(), "relationship", enum140);
        Class<? extends Object> term61187 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term61186 = ((Class) term61187).getDeclaredField((String) "GEQ");
        ((Field) term61186).setAccessible(true);
        Object enum141 = ((Field) term61186).get((Object) null);
        Object term59643 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setDoubleField(term59643, term59643.getClass(), "value", 5.36870912E8);
        setField(term59643, term59643.getClass(), "coefficients", null);
        setField(term59643, term59643.getClass(), "relationship", enum141);
        Object term59925 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setDoubleField(term59925, term59925.getClass(), "value", -9.2233632407617536E18);
        ArrayList term59235 = new ArrayList();
        ((ArrayList) term59235).add(term59361);
        ((ArrayList) term59235).add(term59643);
        ((ArrayList) term59235).add(term59925);
        ((ArrayList) term59235).add((Object)null);
        term59183 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term59183, term59183.getClass(), "constraints", term59235);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = false;
        try {
            callMethod(klass, "createTableau", argTypes, term59183, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


