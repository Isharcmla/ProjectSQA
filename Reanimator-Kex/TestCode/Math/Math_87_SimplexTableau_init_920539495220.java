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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.math.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class SimplexTableau_init_920539495220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term132678;
     Object term132826;
     Object enum195;

    public SimplexTableau_init_920539495220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term132538 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term132538, term132538.getClass(), "f", null);
        setField(term132538, term132538.getClass(), "constraints", null);
        setBooleanField(term132538, term132538.getClass(), "restrictToNonNegative", false);
        setDoubleField(term132538, term132538.getClass(), "epsilon", 0.0);
        setIntField(term132538, term132538.getClass(), "numDecisionVariables", 0);
        setIntField(term132538, term132538.getClass(), "numSlackVariables", 0);
        setIntField(term132538, term132538.getClass(), "numArtificialVariables", 0);
        term132678 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        Object term132774 = newInstance(Class.forName("org.apache.commons.math.linear.RealVectorImpl"));
        double[] term132283 = (double[]) newDoubleArray(0);
        setField(term132774, term132774.getClass(), "data", term132283);
        setField(term132678, term132678.getClass(), "coefficients", term132774);
        term132826 = new ArrayList();
        Class<? extends Object> term133735 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term133734 = ((Class) term133735).getDeclaredField((String) "MAXIMIZE");
        ((Field) term133734).setAccessible(true);
        enum195 = ((Field) term133734).get((Object) null);
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
        args[0] = term132678;
        args[1] = term132826;
        args[2] = enum195;
        args[3] = false;
        args[4] = 0.0;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


