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

public class SimplexTableau_getNormalizedConstraints_926573528146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93305;

    public SimplexTableau_getNormalizedConstraints_926573528146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term94919 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term94918 = ((Class) term94919).getDeclaredField((String) "GEQ");
        ((Field) term94918).setAccessible(true);
        Object enum182 = ((Field) term94918).get((Object) null);
        Object term93483 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        Object term93585 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        setDoubleField(term93483, term93483.getClass(), "value", 0.0);
        setField(term93483, term93483.getClass(), "coefficients", term93585);
        setField(term93483, term93483.getClass(), "relationship", enum182);
        Object term93867 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setDoubleField(term93867, term93867.getClass(), "value", 1.9140298416324608E16);
        setField(term93867, term93867.getClass(), "coefficients", null);
        setField(term93867, term93867.getClass(), "relationship", enum182);
        Object term93993 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        Object term94095 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        setDoubleField(term93993, term93993.getClass(), "value", -8.6469112845513441E18);
        setField(term93993, term93993.getClass(), "coefficients", term94095);
        Object term94221 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setDoubleField(term94221, term94221.getClass(), "value", 0.0);
        setField(term94221, term94221.getClass(), "coefficients", null);
        setField(term94221, term94221.getClass(), "relationship", null);
        ArrayList term93357 = new ArrayList();
        ((ArrayList) term93357).add(term93483);
        ((ArrayList) term93357).add(term93867);
        ((ArrayList) term93357).add(term93993);
        ((ArrayList) term93357).add(term94221);
        ((ArrayList) term93357).add(term94221);
        ((ArrayList) term93357).add(term94221);
        ((ArrayList) term93357).add(term94221);
        ((ArrayList) term93357).add(term94221);
        term93305 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term93305, term93305.getClass(), "constraints", term93357);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getNormalizedConstraints", argTypes, term93305, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


