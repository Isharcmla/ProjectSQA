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

public class SimplexTableau_init_920539495208 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118883;
     Object term119031;

    public SimplexTableau_init_920539495208() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term118743 = new ArrayList();
        Object term118551 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term118691 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term118551, term118551.getClass(), "f", term118691);
        setField(term118551, term118551.getClass(), "constraints", term118743);
        setBooleanField(term118551, term118551.getClass(), "restrictToNonNegative", false);
        setDoubleField(term118551, term118551.getClass(), "epsilon", 0.0);
        term118883 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        Object term118979 = newInstance(Class.forName("org.apache.commons.math.linear.RealVectorImpl"));
        double[] term118406 = (double[]) newDoubleArray(0);
        setField(term118979, term118979.getClass(), "data", term118406);
        setField(term118883, term118883.getClass(), "coefficients", term118979);
        term119031 = new ArrayList();
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
        args[0] = term118883;
        args[1] = term119031;
        args[2] = null;
        args[3] = false;
        args[4] = 0.0;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


