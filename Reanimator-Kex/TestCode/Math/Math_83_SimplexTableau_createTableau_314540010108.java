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
     Object term80069;

    public SimplexTableau_createTableau_314540010108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term81131 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term81130 = ((Class) term81131).getDeclaredField((String) "EQ");
        ((Field) term81130).setAccessible(true);
        Object enum173 = ((Field) term81130).get((Object) null);
        Object term80247 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        Object term80345 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        setDoubleField(term80247, term80247.getClass(), "value", 0.0);
        setField(term80247, term80247.getClass(), "coefficients", term80345);
        setField(term80247, term80247.getClass(), "relationship", enum173);
        ArrayList term80121 = new ArrayList();
        ((ArrayList) term80121).add(term80247);
        term80069 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term80069, term80069.getClass(), "constraints", term80121);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = false;
        try {
            callMethod(klass, "createTableau", argTypes, term80069, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


