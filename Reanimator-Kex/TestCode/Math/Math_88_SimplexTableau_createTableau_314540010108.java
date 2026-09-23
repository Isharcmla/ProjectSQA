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

public class SimplexTableau_createTableau_314540010108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78487;

    public SimplexTableau_createTableau_314540010108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term80523 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term80522 = ((Class) term80523).getDeclaredField((String) "LEQ");
        ((Field) term80522).setAccessible(true);
        Object enum164 = ((Field) term80522).get((Object) null);
        Object term78665 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        Object term78767 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        setDoubleField(term78665, term78665.getClass(), "value", 0.0);
        setField(term78665, term78665.getClass(), "coefficients", term78767);
        setField(term78665, term78665.getClass(), "relationship", enum164);
        Class<? extends Object> term80819 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term80818 = ((Class) term80819).getDeclaredField((String) "GEQ");
        ((Field) term80818).setAccessible(true);
        Object enum165 = ((Field) term80818).get((Object) null);
        Object term79049 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        Object term79151 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        setDoubleField(term79049, term79049.getClass(), "value", 1.15292150460684698E18);
        setField(term79049, term79049.getClass(), "coefficients", term79151);
        setField(term79049, term79049.getClass(), "relationship", enum165);
        Object term79433 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        Object term79529 = newInstance(Class.forName("org.apache.commons.math.linear.RealVectorImpl"));
        setDoubleField(term79433, term79433.getClass(), "value", -9.223372036854776E18);
        setField(term79433, term79433.getClass(), "coefficients", term79529);
        ArrayList term78539 = new ArrayList();
        ((ArrayList) term78539).add(term78665);
        ((ArrayList) term78539).add(term79049);
        ((ArrayList) term78539).add(term79433);
        ((ArrayList) term78539).add(term79049);
        ((ArrayList) term78539).add(term79049);
        ((ArrayList) term78539).add(term79049);
        ((ArrayList) term78539).add(term79049);
        ((ArrayList) term78539).add(term79049);
        ((ArrayList) term78539).add(term79049);
        ((ArrayList) term78539).add(term79049);
        ((ArrayList) term78539).add(term79049);
        ((ArrayList) term78539).add(term79049);
        ((ArrayList) term78539).add(term79049);
        ((ArrayList) term78539).add(term79049);
        ((ArrayList) term78539).add(term79049);
        ((ArrayList) term78539).add(term79049);
        ((ArrayList) term78539).add(term79049);
        ((ArrayList) term78539).add(term79049);
        ((ArrayList) term78539).add(term79049);
        ((ArrayList) term78539).add(term79049);
        term78487 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term78487, term78487.getClass(), "constraints", term78539);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = false;
        try {
            callMethod(klass, "createTableau", argTypes, term78487, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


