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

public class SimplexTableau_createTableau_314540010144 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91062;

    public SimplexTableau_createTableau_314540010144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term92427 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term92426 = ((Class) term92427).getDeclaredField((String) "LEQ");
        ((Field) term92426).setAccessible(true);
        Object enum179 = ((Field) term92426).get((Object) null);
        Object term91240 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        Object term91338 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        setDoubleField(term91240, term91240.getClass(), "value", 0.0);
        setField(term91240, term91240.getClass(), "coefficients", term91338);
        setField(term91240, term91240.getClass(), "relationship", enum179);
        Object term91620 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        Object term91722 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        setDoubleField(term91620, term91620.getClass(), "value", 5.7646075659839078E17);
        setField(term91620, term91620.getClass(), "coefficients", term91722);
        setField(term91620, term91620.getClass(), "relationship", enum179);
        ArrayList term91114 = new ArrayList();
        ((ArrayList) term91114).add(term91240);
        ((ArrayList) term91114).add(term91620);
        term91062 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term91062, term91062.getClass(), "constraints", term91114);
        setIntField(term91062, term91062.getClass(), "numDecisionVariables", 0);
        setIntField(term91062, term91062.getClass(), "numSlackVariables", 0);
        setIntField(term91062, term91062.getClass(), "numArtificialVariables", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = false;
        try {
            callMethod(klass, "createTableau", argTypes, term91062, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


