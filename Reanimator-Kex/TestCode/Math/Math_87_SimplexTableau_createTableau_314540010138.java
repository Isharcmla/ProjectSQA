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

public class SimplexTableau_createTableau_314540010138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84700;

    public SimplexTableau_createTableau_314540010138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term86412 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term86411 = ((Class) term86412).getDeclaredField((String) "LEQ");
        ((Field) term86411).setAccessible(true);
        Object enum160 = ((Field) term86411).get((Object) null);
        Object term84878 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        Object term84974 = newInstance(Class.forName("org.apache.commons.math.linear.RealVectorImpl"));
        setDoubleField(term84878, term84878.getClass(), "value", 9.009398277996544E15);
        setField(term84878, term84878.getClass(), "coefficients", term84974);
        setField(term84878, term84878.getClass(), "relationship", enum160);
        Object term85256 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        Object term85358 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        setDoubleField(term85256, term85256.getClass(), "value", 2.305843009213694E18);
        setField(term85256, term85256.getClass(), "coefficients", term85358);
        setField(term85256, term85256.getClass(), "relationship", enum160);
        Object term85484 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        Object term85586 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        setDoubleField(term85484, term85484.getClass(), "value", -9.2233720368547594E18);
        setField(term85484, term85484.getClass(), "coefficients", term85586);
        Object term85712 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setDoubleField(term85712, term85712.getClass(), "value", 0.0);
        setField(term85712, term85712.getClass(), "coefficients", null);
        setField(term85712, term85712.getClass(), "relationship", null);
        ArrayList term84752 = new ArrayList();
        ((ArrayList) term84752).add(term84878);
        ((ArrayList) term84752).add(term85256);
        ((ArrayList) term84752).add(term85484);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        ((ArrayList) term84752).add(term85712);
        term84700 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term84700, term84700.getClass(), "constraints", term84752);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = false;
        try {
            callMethod(klass, "createTableau", argTypes, term84700, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


