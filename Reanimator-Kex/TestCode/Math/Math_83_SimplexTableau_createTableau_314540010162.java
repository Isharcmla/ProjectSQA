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

public class SimplexTableau_createTableau_314540010162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98725;

    public SimplexTableau_createTableau_314540010162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term100329 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term100328 = ((Class) term100329).getDeclaredField((String) "EQ");
        ((Field) term100328).setAccessible(true);
        Object enum186 = ((Field) term100328).get((Object) null);
        Object term98903 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setDoubleField(term98903, term98903.getClass(), "value", 0.0);
        setField(term98903, term98903.getClass(), "coefficients", null);
        setField(term98903, term98903.getClass(), "relationship", enum186);
        Class<? extends Object> term100622 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term100621 = ((Class) term100622).getDeclaredField((String) "GEQ");
        ((Field) term100621).setAccessible(true);
        Object enum187 = ((Field) term100621).get((Object) null);
        Object term99185 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setDoubleField(term99185, term99185.getClass(), "value", 0.0);
        setField(term99185, term99185.getClass(), "coefficients", null);
        setField(term99185, term99185.getClass(), "relationship", enum187);
        ArrayList term98777 = new ArrayList();
        ((ArrayList) term98777).add(term98903);
        ((ArrayList) term98777).add(term99185);
        term98725 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term98725, term98725.getClass(), "constraints", term98777);
        setIntField(term98725, term98725.getClass(), "numDecisionVariables", 86);
        setIntField(term98725, term98725.getClass(), "numSlackVariables", 0);
        setIntField(term98725, term98725.getClass(), "numArtificialVariables", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = true;
        try {
            callMethod(klass, "createTableau", argTypes, term98725, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


