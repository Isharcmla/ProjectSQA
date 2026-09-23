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
     Object term89172;

    public SimplexTableau_createTableau_314540010144() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term91267 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term91266 = ((Class) term91267).getDeclaredField((String) "LEQ");
        ((Field) term91266).setAccessible(true);
        Object enum164 = ((Field) term91266).get((Object) null);
        Object term89350 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setDoubleField(term89350, term89350.getClass(), "value", 0.0);
        setField(term89350, term89350.getClass(), "coefficients", null);
        setField(term89350, term89350.getClass(), "relationship", enum164);
        Class<? extends Object> term91563 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term91562 = ((Class) term91563).getDeclaredField((String) "GEQ");
        ((Field) term91562).setAccessible(true);
        Object enum165 = ((Field) term91562).get((Object) null);
        Object term89632 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        Object term89728 = newInstance(Class.forName("org.apache.commons.math.linear.RealVectorImpl"));
        setDoubleField(term89632, term89632.getClass(), "value", 8388608.0);
        setField(term89632, term89632.getClass(), "coefficients", term89728);
        setField(term89632, term89632.getClass(), "relationship", enum165);
        Object term90010 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        Object term90112 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        setDoubleField(term90010, term90010.getClass(), "value", 3.6028797018968064E16);
        setField(term90010, term90010.getClass(), "coefficients", term90112);
        setField(term90010, term90010.getClass(), "relationship", enum165);
        Object term90238 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setDoubleField(term90238, term90238.getClass(), "value", -9.2233720368547717E18);
        ArrayList term89224 = new ArrayList();
        ((ArrayList) term89224).add(term89350);
        ((ArrayList) term89224).add(term89632);
        ((ArrayList) term89224).add(term90010);
        ((ArrayList) term89224).add(term90238);
        term89172 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term89172, term89172.getClass(), "constraints", term89224);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = false;
        try {
            callMethod(klass, "createTableau", argTypes, term89172, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


