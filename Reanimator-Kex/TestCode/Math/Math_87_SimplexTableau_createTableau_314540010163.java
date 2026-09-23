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

public class SimplexTableau_createTableau_314540010163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99147;

    public SimplexTableau_createTableau_314540010163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term100665 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term100664 = ((Class) term100665).getDeclaredField((String) "GEQ");
        ((Field) term100664).setAccessible(true);
        Object enum175 = ((Field) term100664).get((Object) null);
        Object term99325 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        Object term99427 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        setDoubleField(term99325, term99325.getClass(), "value", 0.0);
        setField(term99325, term99325.getClass(), "coefficients", term99427);
        setField(term99325, term99325.getClass(), "relationship", enum175);
        Object term99709 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        Object term99811 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        setDoubleField(term99709, term99709.getClass(), "value", 0.0);
        setField(term99709, term99709.getClass(), "coefficients", term99811);
        setField(term99709, term99709.getClass(), "relationship", enum175);
        ArrayList term99199 = new ArrayList();
        ((ArrayList) term99199).add(term99325);
        ((ArrayList) term99199).add(term99709);
        term99147 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term99147, term99147.getClass(), "constraints", term99199);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = false;
        try {
            callMethod(klass, "createTableau", argTypes, term99147, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


