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

public class SimplexTableau_init_920539495224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136388;
     Object term136536;

    public SimplexTableau_init_920539495224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term136248 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term136248, term136248.getClass(), "f", null);
        setField(term136248, term136248.getClass(), "constraints", null);
        setBooleanField(term136248, term136248.getClass(), "restrictToNonNegative", false);
        setDoubleField(term136248, term136248.getClass(), "epsilon", 0.0);
        setIntField(term136248, term136248.getClass(), "numDecisionVariables", 0);
        term136388 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        Object term136484 = newInstance(Class.forName("org.apache.commons.math.linear.RealVectorImpl"));
        double[] term136058 = (double[]) newDoubleArray(0);
        setField(term136484, term136484.getClass(), "data", term136058);
        setField(term136388, term136388.getClass(), "coefficients", term136484);
        term136536 = new ArrayList();
        ((ArrayList) term136536).add((Object)null);
        ((ArrayList) term136536).add((Object)null);
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
        args[0] = term136388;
        args[1] = term136536;
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


