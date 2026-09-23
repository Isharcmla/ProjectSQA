package org.apache.commons.math3.optimization.linear;

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
import java.lang.ClassCastException;
import static org.apache.commons.math3.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class SimplexTableau_init_1669559330161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85224;
     Object term85276;

    public SimplexTableau_init_1669559330161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term84940 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term85082 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        setField(term84940, term84940.getClass(), "columnLabels", null);
        setField(term84940, term84940.getClass(), "f", term85082);
        term85224 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        Object term85314 = newInstance(Class.forName("java.lang.Object"));
        term85276 = new ArrayList();
        ((ArrayList) term85276).add(term85314);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction");
        argTypes[1] = Class.forName("java.util.Collection");
        argTypes[2] = Class.forName("org.apache.commons.math3.optimization.GoalType");
        argTypes[3] = boolean.class;
        argTypes[4] = double.class;
        Object[] args = new Object[5];
        args[0] = term85224;
        args[1] = term85276;
        args[2] = null;
        args[3] = false;
        args[4] = 0.0;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


