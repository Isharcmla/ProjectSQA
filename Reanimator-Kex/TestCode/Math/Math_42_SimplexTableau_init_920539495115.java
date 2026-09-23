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
import java.lang.Object;
import java.util.ArrayList;

public class SimplexTableau_init_920539495115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74817;
     Object term74967;

    public SimplexTableau_init_920539495115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term74537 = new ArrayList();
        Object term74485 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term74677 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term74485, term74485.getClass(), "columnLabels", term74537);
        setField(term74485, term74485.getClass(), "f", term74677);
        setField(term74485, term74485.getClass(), "constraints", null);
        setBooleanField(term74485, term74485.getClass(), "restrictToNonNegative", false);
        setDoubleField(term74485, term74485.getClass(), "epsilon", 0.0);
        setIntField(term74485, term74485.getClass(), "maxUlps", 0);
        term74817 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        Object term74915 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        setField(term74817, term74817.getClass(), "coefficients", term74915);
        term74967 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction");
        argTypes[1] = Class.forName("java.util.Collection");
        argTypes[2] = Class.forName("org.apache.commons.math.optimization.GoalType");
        argTypes[3] = boolean.class;
        argTypes[4] = double.class;
        Object[] args = new Object[5];
        args[0] = term74817;
        args[1] = term74967;
        args[2] = null;
        args[3] = true;
        args[4] = 0.0;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


