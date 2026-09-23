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

public class SimplexTableau_getNormalizedConstraints_92657352882 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62517;

    public SimplexTableau_getNormalizedConstraints_92657352882() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term64225 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term64224 = ((Class) term64225).getDeclaredField((String) "GEQ");
        ((Field) term64224).setAccessible(true);
        Object enum146 = ((Field) term64224).get((Object) null);
        Object term62695 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setDoubleField(term62695, term62695.getClass(), "value", 0.0);
        setField(term62695, term62695.getClass(), "coefficients", null);
        setField(term62695, term62695.getClass(), "relationship", enum146);
        Class<? extends Object> term64521 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term64520 = ((Class) term64521).getDeclaredField((String) "LEQ");
        ((Field) term64520).setAccessible(true);
        Object enum147 = ((Field) term64520).get((Object) null);
        Object term62977 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setDoubleField(term62977, term62977.getClass(), "value", 0.0);
        setField(term62977, term62977.getClass(), "coefficients", null);
        setField(term62977, term62977.getClass(), "relationship", enum147);
        Object term63259 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setDoubleField(term63259, term63259.getClass(), "value", -9.1513143740973711E18);
        ArrayList term62569 = new ArrayList();
        ((ArrayList) term62569).add(term62695);
        ((ArrayList) term62569).add(term62977);
        ((ArrayList) term62569).add(term63259);
        ((ArrayList) term62569).add((Object)null);
        ((ArrayList) term62569).add((Object)null);
        ((ArrayList) term62569).add((Object)null);
        ((ArrayList) term62569).add((Object)null);
        ((ArrayList) term62569).add((Object)null);
        ((ArrayList) term62569).add((Object)null);
        ((ArrayList) term62569).add((Object)null);
        ((ArrayList) term62569).add((Object)null);
        ((ArrayList) term62569).add((Object)null);
        ((ArrayList) term62569).add((Object)null);
        ((ArrayList) term62569).add((Object)null);
        ((ArrayList) term62569).add((Object)null);
        ((ArrayList) term62569).add((Object)null);
        term62517 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term62517, term62517.getClass(), "constraints", term62569);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getNormalizedConstraints", argTypes, term62517, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


