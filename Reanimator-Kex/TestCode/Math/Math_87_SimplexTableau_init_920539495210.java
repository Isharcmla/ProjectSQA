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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.math.optimization.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;

public class SimplexTableau_init_920539495210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term120235;
     Object term120383;
     Object enum184;

    public SimplexTableau_init_920539495210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term120095 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        setField(term120095, term120095.getClass(), "f", null);
        setField(term120095, term120095.getClass(), "constraints", null);
        setBooleanField(term120095, term120095.getClass(), "restrictToNonNegative", false);
        setDoubleField(term120095, term120095.getClass(), "epsilon", 0.0);
        setIntField(term120095, term120095.getClass(), "numDecisionVariables", 0);
        setIntField(term120095, term120095.getClass(), "numSlackVariables", 0);
        setIntField(term120095, term120095.getClass(), "numArtificialVariables", 0);
        term120235 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        Object term120331 = newInstance(Class.forName("org.apache.commons.math.linear.RealVectorImpl"));
        double[] term119840 = (double[]) newDoubleArray(0);
        setField(term120331, term120331.getClass(), "data", term119840);
        setField(term120235, term120235.getClass(), "coefficients", term120331);
        term120383 = new ArrayList();
        Class<? extends Object> term121316 = Class.forName((String) "org.apache.commons.math.optimization.GoalType");
        Field term121315 = ((Class) term121316).getDeclaredField((String) "MAXIMIZE");
        ((Field) term121315).setAccessible(true);
        enum184 = ((Field) term121315).get((Object) null);
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
        args[0] = term120235;
        args[1] = term120383;
        args[2] = enum184;
        args[3] = true;
        args[4] = 0.0;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


