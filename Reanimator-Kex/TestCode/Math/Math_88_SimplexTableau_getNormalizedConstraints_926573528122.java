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

public class SimplexTableau_getNormalizedConstraints_926573528122 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85441;

    public SimplexTableau_getNormalizedConstraints_926573528122() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term87362 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term87361 = ((Class) term87362).getDeclaredField((String) "GEQ");
        ((Field) term87361).setAccessible(true);
        Object enum170 = ((Field) term87361).get((Object) null);
        Object term85619 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setDoubleField(term85619, term85619.getClass(), "value", 1.44115188075855872E17);
        setField(term85619, term85619.getClass(), "coefficients", null);
        setField(term85619, term85619.getClass(), "relationship", enum170);
        Class<? extends Object> term87658 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term87657 = ((Class) term87658).getDeclaredField((String) "LEQ");
        ((Field) term87657).setAccessible(true);
        Object enum171 = ((Field) term87657).get((Object) null);
        Object term85901 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        Object term86003 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        setDoubleField(term85901, term85901.getClass(), "value", 3.6028797018963968E16);
        setField(term85901, term85901.getClass(), "coefficients", term86003);
        setField(term85901, term85901.getClass(), "relationship", enum171);
        Object term86285 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        Object term86381 = newInstance(Class.forName("org.apache.commons.math.linear.RealVectorImpl"));
        setDoubleField(term86285, term86285.getClass(), "value", -9.0792567800594432E18);
        setField(term86285, term86285.getClass(), "coefficients", term86381);
        ArrayList term85493 = new ArrayList();
        ((ArrayList) term85493).add(term85619);
        ((ArrayList) term85493).add(term85901);
        ((ArrayList) term85493).add(term86285);
        term85441 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term85441, term85441.getClass(), "constraints", term85493);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getNormalizedConstraints", argTypes, term85441, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


