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

public class SimplexTableau_createTableau_314540010100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72203;

    public SimplexTableau_createTableau_314540010100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term73999 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term73998 = ((Class) term73999).getDeclaredField((String) "LEQ");
        ((Field) term73998).setAccessible(true);
        Object enum157 = ((Field) term73998).get((Object) null);
        Object term72381 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        Object term72477 = newInstance(Class.forName("org.apache.commons.math.linear.RealVectorImpl"));
        setDoubleField(term72381, term72381.getClass(), "value", 7.205759511166976E16);
        setField(term72381, term72381.getClass(), "coefficients", term72477);
        setField(term72381, term72381.getClass(), "relationship", enum157);
        Object term72759 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        Object term72861 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        setDoubleField(term72759, term72759.getClass(), "value", 0.0);
        setField(term72759, term72759.getClass(), "coefficients", term72861);
        setField(term72759, term72759.getClass(), "relationship", enum157);
        ArrayList term72255 = new ArrayList();
        ((ArrayList) term72255).add(term72381);
        ((ArrayList) term72255).add(term72759);
        term72203 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term72203, term72203.getClass(), "constraints", term72255);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = false;
        try {
            callMethod(klass, "createTableau", argTypes, term72203, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


