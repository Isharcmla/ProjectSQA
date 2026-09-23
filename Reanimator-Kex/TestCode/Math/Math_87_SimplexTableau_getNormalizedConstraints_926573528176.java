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

public class SimplexTableau_getNormalizedConstraints_926573528176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106727;

    public SimplexTableau_getNormalizedConstraints_926573528176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term108664 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term108663 = ((Class) term108664).getDeclaredField((String) "GEQ");
        ((Field) term108663).setAccessible(true);
        Object enum179 = ((Field) term108663).get((Object) null);
        Object term106905 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setDoubleField(term106905, term106905.getClass(), "value", 1.44115188075855872E17);
        setField(term106905, term106905.getClass(), "coefficients", null);
        setField(term106905, term106905.getClass(), "relationship", enum179);
        Class<? extends Object> term108960 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term108959 = ((Class) term108960).getDeclaredField((String) "LEQ");
        ((Field) term108959).setAccessible(true);
        Object enum180 = ((Field) term108959).get((Object) null);
        Object term107187 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        Object term107289 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        setDoubleField(term107187, term107187.getClass(), "value", 3.6028797018963968E16);
        setField(term107187, term107187.getClass(), "coefficients", term107289);
        setField(term107187, term107187.getClass(), "relationship", enum180);
        Object term107571 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        Object term107673 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        setDoubleField(term107571, term107571.getClass(), "value", -9.0792567800594432E18);
        setField(term107571, term107571.getClass(), "coefficients", term107673);
        ArrayList term106779 = new ArrayList();
        ((ArrayList) term106779).add(term106905);
        ((ArrayList) term106779).add(term107187);
        ((ArrayList) term106779).add(term107571);
        term106727 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term106727, term106727.getClass(), "constraints", term106779);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getNormalizedConstraints", argTypes, term106727, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


