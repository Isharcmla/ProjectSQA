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

public class SimplexTableau_createTableau_31454001082 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65775;

    public SimplexTableau_createTableau_31454001082() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term67595 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term67594 = ((Class) term67595).getDeclaredField((String) "EQ");
        ((Field) term67594).setAccessible(true);
        Object enum155 = ((Field) term67594).get((Object) null);
        Object term65953 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        Object term66055 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        setDoubleField(term65953, term65953.getClass(), "value", 0.0);
        setField(term65953, term65953.getClass(), "coefficients", term66055);
        setField(term65953, term65953.getClass(), "relationship", enum155);
        Object term66337 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setDoubleField(term66337, term66337.getClass(), "value", -9.2233720196749066E18);
        ArrayList term65827 = new ArrayList();
        ((ArrayList) term65827).add(term65953);
        ((ArrayList) term65827).add(term66337);
        term65775 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term65775, term65775.getClass(), "constraints", term65827);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = false;
        try {
            callMethod(klass, "createTableau", argTypes, term65775, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


