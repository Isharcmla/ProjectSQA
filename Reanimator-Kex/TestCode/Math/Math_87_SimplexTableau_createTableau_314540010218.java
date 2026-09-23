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

public class SimplexTableau_createTableau_314540010218 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129355;

    public SimplexTableau_createTableau_314540010218() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term130950 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term130949 = ((Class) term130950).getDeclaredField((String) "EQ");
        ((Field) term130949).setAccessible(true);
        Object enum190 = ((Field) term130949).get((Object) null);
        Object term129533 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setDoubleField(term129533, term129533.getClass(), "value", 0.0);
        setField(term129533, term129533.getClass(), "coefficients", null);
        setField(term129533, term129533.getClass(), "relationship", enum190);
        Class<? extends Object> term131243 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term131242 = ((Class) term131243).getDeclaredField((String) "GEQ");
        ((Field) term131242).setAccessible(true);
        Object enum191 = ((Field) term131242).get((Object) null);
        Object term129815 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setDoubleField(term129815, term129815.getClass(), "value", 0.0);
        setField(term129815, term129815.getClass(), "coefficients", null);
        setField(term129815, term129815.getClass(), "relationship", enum191);
        ArrayList term129407 = new ArrayList();
        ((ArrayList) term129407).add(term129533);
        ((ArrayList) term129407).add(term129815);
        term129355 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term129355, term129355.getClass(), "constraints", term129407);
        setIntField(term129355, term129355.getClass(), "numDecisionVariables", 86);
        setIntField(term129355, term129355.getClass(), "numSlackVariables", 0);
        setIntField(term129355, term129355.getClass(), "numArtificialVariables", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = true;
        try {
            callMethod(klass, "createTableau", argTypes, term129355, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


