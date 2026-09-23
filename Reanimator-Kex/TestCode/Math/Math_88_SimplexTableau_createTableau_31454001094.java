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

public class SimplexTableau_createTableau_31454001094 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66946;

    public SimplexTableau_createTableau_31454001094() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term70199 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term70198 = ((Class) term70199).getDeclaredField((String) "GEQ");
        ((Field) term70198).setAccessible(true);
        Object enum152 = ((Field) term70198).get((Object) null);
        Object term67124 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setDoubleField(term67124, term67124.getClass(), "value", 0.0);
        setField(term67124, term67124.getClass(), "coefficients", null);
        setField(term67124, term67124.getClass(), "relationship", enum152);
        Class<? extends Object> term70495 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term70494 = ((Class) term70495).getDeclaredField((String) "LEQ");
        ((Field) term70494).setAccessible(true);
        Object enum153 = ((Field) term70494).get((Object) null);
        Object term67406 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setDoubleField(term67406, term67406.getClass(), "value", 0.0);
        setField(term67406, term67406.getClass(), "coefficients", null);
        setField(term67406, term67406.getClass(), "relationship", enum153);
        Object term67688 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setDoubleField(term67688, term67688.getClass(), "value", 0.0);
        setField(term67688, term67688.getClass(), "coefficients", null);
        setField(term67688, term67688.getClass(), "relationship", null);
        Object term67814 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setDoubleField(term67814, term67814.getClass(), "value", 0.0);
        setField(term67814, term67814.getClass(), "coefficients", null);
        setField(term67814, term67814.getClass(), "relationship", null);
        ArrayList term66998 = new ArrayList();
        ((ArrayList) term66998).add(term67124);
        ((ArrayList) term66998).add(term67406);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67814);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        ((ArrayList) term66998).add(term67688);
        term66946 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term66946, term66946.getClass(), "constraints", term66998);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = false;
        try {
            callMethod(klass, "createTableau", argTypes, term66946, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


