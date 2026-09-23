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

public class SimplexTableau_init_581770788189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98845;

    public SimplexTableau_init_581770788189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term98793 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        setField(term98793, term98793.getClass(), "columnLabels", null);
        setField(term98793, term98793.getClass(), "f", null);
        Class<? extends Object> term100377 = Class.forName((String) "org.apache.commons.math3.optimization.linear.Relationship");
        Field term100376 = ((Class) term100377).getDeclaredField((String) "LEQ");
        ((Field) term100376).setAccessible(true);
        Object enum130 = ((Field) term100376).get((Object) null);
        Object term98973 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        Object term99077 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        setDoubleField(term98973, term98973.getClass(), "value", 4.503599627403264E15);
        setField(term98973, term98973.getClass(), "coefficients", term99077);
        setField(term98973, term98973.getClass(), "relationship", enum130);
        Object term99363 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        Object term99491 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearConstraint"));
        setDoubleField(term99491, term99491.getClass(), "value", 0.0);
        setField(term99491, term99491.getClass(), "coefficients", null);
        setField(term99491, term99491.getClass(), "relationship", null);
        term98845 = new ArrayList();
        ((ArrayList) term98845).add(term98973);
        ((ArrayList) term98845).add(term99363);
        ((ArrayList) term98845).add(term99491);
        ((ArrayList) term98845).add(term99491);
        ((ArrayList) term98845).add(term99491);
        ((ArrayList) term98845).add(term99491);
        ((ArrayList) term98845).add(term99491);
        ((ArrayList) term98845).add(term99491);
        ((ArrayList) term98845).add(term99491);
        ((ArrayList) term98845).add(term99491);
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
        args[1] = term98845;
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


