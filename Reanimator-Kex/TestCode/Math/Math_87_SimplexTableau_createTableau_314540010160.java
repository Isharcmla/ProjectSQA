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

public class SimplexTableau_createTableau_314540010160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96821;

    public SimplexTableau_createTableau_314540010160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term98263 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term98262 = ((Class) term98263).getDeclaredField((String) "EQ");
        ((Field) term98262).setAccessible(true);
        Object enum172 = ((Field) term98262).get((Object) null);
        Object term96999 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setDoubleField(term96999, term96999.getClass(), "value", 1.7592186044416E13);
        setField(term96999, term96999.getClass(), "coefficients", null);
        setField(term96999, term96999.getClass(), "relationship", enum172);
        Object term97281 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        Object term97377 = newInstance(Class.forName("org.apache.commons.math.linear.RealVectorImpl"));
        setDoubleField(term97281, term97281.getClass(), "value", -9.223370937343148E18);
        setField(term97281, term97281.getClass(), "coefficients", term97377);
        ArrayList term96873 = new ArrayList();
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term97281);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        ((ArrayList) term96873).add(term96999);
        term96821 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term96821, term96821.getClass(), "constraints", term96873);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = false;
        try {
            callMethod(klass, "createTableau", argTypes, term96821, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


