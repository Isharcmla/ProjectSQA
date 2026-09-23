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
import static org.apache.commons.math.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class SimplexTableau_init_117183305216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122820;

    public SimplexTableau_init_117183305216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term122768 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term122768, term122768.getClass(), "columnLabels", null);
        setField(term122768, term122768.getClass(), "f", null);
        Class<? extends Object> term123448 = Class.forName((String) "org.apache.commons.math.optimization.linear.Relationship");
        Field term123447 = ((Class) term123448).getDeclaredField((String) "LEQ");
        ((Field) term123447).setAccessible(true);
        Object enum144 = ((Field) term123447).get((Object) null);
        Object term122946 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        Object term123038 = newInstance(Class.forName("org.apache.commons.math.linear.RealVector$2"));
        setDoubleField(term122946, term122946.getClass(), "value", 4.503599627403264E15);
        setField(term122946, term122946.getClass(), "coefficients", term123038);
        setField(term122946, term122946.getClass(), "relationship", enum144);
        Object term123320 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        Object term123446 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearConstraint"));
        setDoubleField(term123446, term123446.getClass(), "value", 0.0);
        setField(term123446, term123446.getClass(), "coefficients", null);
        setField(term123446, term123446.getClass(), "relationship", null);
        term122820 = new ArrayList();
        ((ArrayList) term122820).add(term122946);
        ((ArrayList) term122820).add(term123320);
        ((ArrayList) term122820).add(term123446);
        ((ArrayList) term122820).add(term123446);
        ((ArrayList) term122820).add(term123446);
        ((ArrayList) term122820).add(term123446);
        ((ArrayList) term122820).add(term123446);
        ((ArrayList) term122820).add(term123446);
        ((ArrayList) term122820).add(term123446);
        ((ArrayList) term122820).add(term123446);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction");
        argTypes[1] = Class.forName("java.util.Collection");
        argTypes[2] = Class.forName("org.apache.commons.math.optimization.GoalType");
        argTypes[3] = boolean.class;
        argTypes[4] = double.class;
        argTypes[5] = int.class;
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = term122820;
        args[2] = null;
        args[3] = false;
        args[4] = 0.0;
        args[5] = 0;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


