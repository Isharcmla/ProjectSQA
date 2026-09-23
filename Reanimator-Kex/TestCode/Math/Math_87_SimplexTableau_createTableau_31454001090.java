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

public class SimplexTableau_createTableau_31454001090 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65476;

    public SimplexTableau_createTableau_31454001090() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term67184 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term67183 = ((Class) term67184).getDeclaredField((String) "LEQ");
        ((Field) term67183).setAccessible(true);
        Object enum143 = ((Field) term67183).get((Object) null);
        Object term65654 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setDoubleField(term65654, term65654.getClass(), "value", 0.0);
        setField(term65654, term65654.getClass(), "coefficients", null);
        setField(term65654, term65654.getClass(), "relationship", enum143);
        Class<? extends Object> term67480 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term67479 = ((Class) term67480).getDeclaredField((String) "GEQ");
        ((Field) term67479).setAccessible(true);
        Object enum144 = ((Field) term67479).get((Object) null);
        Object term65936 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setDoubleField(term65936, term65936.getClass(), "value", 5.36870912E8);
        setField(term65936, term65936.getClass(), "coefficients", null);
        setField(term65936, term65936.getClass(), "relationship", enum144);
        Object term66218 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setDoubleField(term66218, term66218.getClass(), "value", -9.2233632407617536E18);
        ArrayList term65528 = new ArrayList();
        ((ArrayList) term65528).add(term65654);
        ((ArrayList) term65528).add(term65936);
        ((ArrayList) term65528).add(term66218);
        ((ArrayList) term65528).add((Object)null);
        term65476 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term65476, term65476.getClass(), "constraints", term65528);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = false;
        try {
            callMethod(klass, "createTableau", argTypes, term65476, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


