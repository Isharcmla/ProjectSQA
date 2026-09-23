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

public class SimplexTableau_createTableau_314540010164 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101772;

    public SimplexTableau_createTableau_314540010164() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term102739 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term102738 = ((Class) term102739).getDeclaredField((String) "GEQ");
        ((Field) term102738).setAccessible(true);
        Object enum191 = ((Field) term102738).get((Object) null);
        Object term101950 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setDoubleField(term101950, term101950.getClass(), "value", 0.0);
        setField(term101950, term101950.getClass(), "coefficients", null);
        setField(term101950, term101950.getClass(), "relationship", enum191);
        ArrayList term101824 = new ArrayList();
        ((ArrayList) term101824).add(term101950);
        term101772 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term101772, term101772.getClass(), "constraints", term101824);
        setIntField(term101772, term101772.getClass(), "numDecisionVariables", 6);
        setIntField(term101772, term101772.getClass(), "numSlackVariables", 0);
        setIntField(term101772, term101772.getClass(), "numArtificialVariables", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = true;
        try {
            callMethod(klass, "createTableau", argTypes, term101772, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


