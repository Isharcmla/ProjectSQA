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

public class SimplexTableau_getNormalizedConstraints_926573528136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81520;

    public SimplexTableau_getNormalizedConstraints_926573528136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term83228 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term83227 = ((Class) term83228).getDeclaredField((String) "GEQ");
        ((Field) term83227).setAccessible(true);
        Object enum155 = ((Field) term83227).get((Object) null);
        Object term81698 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setDoubleField(term81698, term81698.getClass(), "value", 0.0);
        setField(term81698, term81698.getClass(), "coefficients", null);
        setField(term81698, term81698.getClass(), "relationship", enum155);
        Class<? extends Object> term83524 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term83523 = ((Class) term83524).getDeclaredField((String) "LEQ");
        ((Field) term83523).setAccessible(true);
        Object enum156 = ((Field) term83523).get((Object) null);
        Object term81980 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setDoubleField(term81980, term81980.getClass(), "value", 0.0);
        setField(term81980, term81980.getClass(), "coefficients", null);
        setField(term81980, term81980.getClass(), "relationship", enum156);
        Object term82262 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setDoubleField(term82262, term82262.getClass(), "value", -9.1513143740973711E18);
        ArrayList term81572 = new ArrayList();
        ((ArrayList) term81572).add(term81698);
        ((ArrayList) term81572).add(term81980);
        ((ArrayList) term81572).add(term82262);
        ((ArrayList) term81572).add((Object)null);
        ((ArrayList) term81572).add((Object)null);
        ((ArrayList) term81572).add((Object)null);
        ((ArrayList) term81572).add((Object)null);
        ((ArrayList) term81572).add((Object)null);
        ((ArrayList) term81572).add((Object)null);
        ((ArrayList) term81572).add((Object)null);
        ((ArrayList) term81572).add((Object)null);
        ((ArrayList) term81572).add((Object)null);
        ((ArrayList) term81572).add((Object)null);
        ((ArrayList) term81572).add((Object)null);
        ((ArrayList) term81572).add((Object)null);
        ((ArrayList) term81572).add((Object)null);
        term81520 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term81520, term81520.getClass(), "constraints", term81572);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getNormalizedConstraints", argTypes, term81520, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


