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
     Object term69798;

    public SimplexTableau_createTableau_314540010100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term70980 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term70979 = ((Class) term70980).getDeclaredField((String) "EQ");
        ((Field) term70979).setAccessible(true);
        Object enum148 = ((Field) term70979).get((Object) null);
        Object term69976 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        Object term70078 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        setDoubleField(term69976, term69976.getClass(), "value", 0.0);
        setField(term69976, term69976.getClass(), "coefficients", term70078);
        setField(term69976, term69976.getClass(), "relationship", enum148);
        Object term70360 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setDoubleField(term70360, term70360.getClass(), "value", -9.2233720196749066E18);
        ArrayList term69850 = new ArrayList();
        ((ArrayList) term69850).add(term69976);
        ((ArrayList) term69850).add(term70360);
        term69798 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term69798, term69798.getClass(), "constraints", term69850);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = false;
        try {
            callMethod(klass, "createTableau", argTypes, term69798, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


