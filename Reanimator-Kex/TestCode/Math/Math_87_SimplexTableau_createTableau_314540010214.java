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

public class SimplexTableau_createTableau_314540010214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122026;

    public SimplexTableau_createTableau_314540010214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term123389 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term123388 = ((Class) term123389).getDeclaredField((String) "LEQ");
        ((Field) term123388).setAccessible(true);
        Object enum186 = ((Field) term123388).get((Object) null);
        Object term122204 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        Object term122300 = newInstance(Class.forName("org.apache.commons.math.linear.RealVectorImpl"));
        setDoubleField(term122204, term122204.getClass(), "value", 0.0);
        setField(term122204, term122204.getClass(), "coefficients", term122300);
        setField(term122204, term122204.getClass(), "relationship", enum186);
        Object term122582 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        Object term122684 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        setDoubleField(term122582, term122582.getClass(), "value", 5.7646075659839078E17);
        setField(term122582, term122582.getClass(), "coefficients", term122684);
        setField(term122582, term122582.getClass(), "relationship", enum186);
        ArrayList term122078 = new ArrayList();
        ((ArrayList) term122078).add(term122204);
        ((ArrayList) term122078).add(term122582);
        term122026 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term122026, term122026.getClass(), "constraints", term122078);
        setIntField(term122026, term122026.getClass(), "numDecisionVariables", 0);
        setIntField(term122026, term122026.getClass(), "numSlackVariables", 0);
        setIntField(term122026, term122026.getClass(), "numArtificialVariables", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = false;
        try {
            callMethod(klass, "createTableau", argTypes, term122026, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


