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

public class SimplexTableau_createTableau_31454001096 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75147;

    public SimplexTableau_createTableau_31454001096() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term77029 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term77028 = ((Class) term77029).getDeclaredField((String) "GEQ");
        ((Field) term77028).setAccessible(true);
        Object enum168 = ((Field) term77028).get((Object) null);
        Object term75325 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setDoubleField(term75325, term75325.getClass(), "value", 0.0);
        setField(term75325, term75325.getClass(), "coefficients", null);
        setField(term75325, term75325.getClass(), "relationship", enum168);
        Object term75607 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setDoubleField(term75607, term75607.getClass(), "value", 1.44115188075872256E17);
        setField(term75607, term75607.getClass(), "coefficients", null);
        setField(term75607, term75607.getClass(), "relationship", enum168);
        Class<? extends Object> term77325 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term77324 = ((Class) term77325).getDeclaredField((String) "LEQ");
        ((Field) term77324).setAccessible(true);
        Object enum169 = ((Field) term77324).get((Object) null);
        Object term75733 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setDoubleField(term75733, term75733.getClass(), "value", 2.3058430092220826E18);
        setField(term75733, term75733.getClass(), "coefficients", null);
        setField(term75733, term75733.getClass(), "relationship", enum169);
        Object term76015 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setDoubleField(term76015, term76015.getClass(), "value", -9.2233720368547594E18);
        ArrayList term75199 = new ArrayList();
        ((ArrayList) term75199).add(term75325);
        ((ArrayList) term75199).add(term75607);
        ((ArrayList) term75199).add(term75733);
        ((ArrayList) term75199).add(term76015);
        ((ArrayList) term75199).add(term76015);
        ((ArrayList) term75199).add(term76015);
        ((ArrayList) term75199).add(term76015);
        ((ArrayList) term75199).add(term76015);
        ((ArrayList) term75199).add(term76015);
        ((ArrayList) term75199).add(term76015);
        ((ArrayList) term75199).add(term76015);
        ((ArrayList) term75199).add(term76015);
        ((ArrayList) term75199).add(term76015);
        ((ArrayList) term75199).add(term76015);
        ((ArrayList) term75199).add(term76015);
        ((ArrayList) term75199).add(term76015);
        term75147 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term75147, term75147.getClass(), "constraints", term75199);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = false;
        try {
            callMethod(klass, "createTableau", argTypes, term75147, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


