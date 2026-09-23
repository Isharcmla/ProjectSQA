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

public class SimplexTableau_createTableau_31454001090 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69193;

    public SimplexTableau_createTableau_31454001090() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term70544 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term70543 = ((Class) term70544).getDeclaredField((String) "GEQ");
        ((Field) term70543).setAccessible(true);
        Object enum158 = ((Field) term70543).get((Object) null);
        Object term69371 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        Object term69469 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        setDoubleField(term69371, term69371.getClass(), "value", 0.0);
        setField(term69371, term69371.getClass(), "coefficients", term69469);
        setField(term69371, term69371.getClass(), "relationship", enum158);
        Object term69751 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        Object term69849 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        setDoubleField(term69751, term69751.getClass(), "value", 0.0);
        setField(term69751, term69751.getClass(), "coefficients", term69849);
        setField(term69751, term69751.getClass(), "relationship", enum158);
        ArrayList term69245 = new ArrayList();
        ((ArrayList) term69245).add(term69371);
        ((ArrayList) term69245).add(term69751);
        term69193 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term69193, term69193.getClass(), "constraints", term69245);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = false;
        try {
            callMethod(klass, "createTableau", argTypes, term69193, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


