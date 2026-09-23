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
import java.lang.NullPointerException;
import static org.apache.commons.math3.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class SimplexTableau_init_58177078869 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57903;
     Object term57955;

    public SimplexTableau_init_58177078869() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term57619 = new ArrayList();
        Object term57567 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau"));
        Object term57761 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        setField(term57567, term57567.getClass(), "columnLabels", term57619);
        setField(term57567, term57567.getClass(), "f", term57761);
        term57903 = newInstance(Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction"));
        term57955 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.linear.SimplexTableau");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("org.apache.commons.math3.optimization.linear.LinearObjectiveFunction");
        argTypes[1] = Class.forName("java.util.Collection");
        argTypes[2] = Class.forName("org.apache.commons.math3.optimization.GoalType");
        argTypes[3] = boolean.class;
        argTypes[4] = double.class;
        argTypes[5] = int.class;
        Object[] args = new Object[6];
        args[0] = term57903;
        args[1] = term57955;
        args[2] = null;
        args[3] = false;
        args[4] = 0.0;
        args[5] = 0;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


