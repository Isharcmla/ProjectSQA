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

public class SimplexTableau_getNormalizedConstraints_92657352892 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71422;

    public SimplexTableau_getNormalizedConstraints_92657352892() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term73130 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term73129 = ((Class) term73130).getDeclaredField((String) "GEQ");
        ((Field) term73129).setAccessible(true);
        Object enum162 = ((Field) term73129).get((Object) null);
        Object term71600 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setDoubleField(term71600, term71600.getClass(), "value", 0.0);
        setField(term71600, term71600.getClass(), "coefficients", null);
        setField(term71600, term71600.getClass(), "relationship", enum162);
        Class<? extends Object> term73426 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term73425 = ((Class) term73426).getDeclaredField((String) "LEQ");
        ((Field) term73425).setAccessible(true);
        Object enum163 = ((Field) term73425).get((Object) null);
        Object term71882 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setDoubleField(term71882, term71882.getClass(), "value", 0.0);
        setField(term71882, term71882.getClass(), "coefficients", null);
        setField(term71882, term71882.getClass(), "relationship", enum163);
        Object term72164 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setDoubleField(term72164, term72164.getClass(), "value", -9.1513143740973711E18);
        ArrayList term71474 = new ArrayList();
        ((ArrayList) term71474).add(term71600);
        ((ArrayList) term71474).add(term71882);
        ((ArrayList) term71474).add(term72164);
        ((ArrayList) term71474).add((Object)null);
        ((ArrayList) term71474).add((Object)null);
        ((ArrayList) term71474).add((Object)null);
        ((ArrayList) term71474).add((Object)null);
        ((ArrayList) term71474).add((Object)null);
        ((ArrayList) term71474).add((Object)null);
        ((ArrayList) term71474).add((Object)null);
        ((ArrayList) term71474).add((Object)null);
        ((ArrayList) term71474).add((Object)null);
        ((ArrayList) term71474).add((Object)null);
        ((ArrayList) term71474).add((Object)null);
        ((ArrayList) term71474).add((Object)null);
        ((ArrayList) term71474).add((Object)null);
        term71422 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term71422, term71422.getClass(), "constraints", term71474);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getNormalizedConstraints", argTypes, term71422, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


