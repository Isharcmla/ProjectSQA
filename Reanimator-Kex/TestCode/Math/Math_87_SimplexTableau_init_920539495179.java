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

public class SimplexTableau_init_920539495179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term110352;
     Object term110500;

    public SimplexTableau_init_920539495179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term110212 = new ArrayList();
        Object term110020 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.SimplexTableau"));
        Object term110160 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        setField(term110020, term110020.getClass(), "f", term110160);
        setField(term110020, term110020.getClass(), "constraints", term110212);
        setBooleanField(term110020, term110020.getClass(), "restrictToNonNegative", false);
        setDoubleField(term110020, term110020.getClass(), "epsilon", 0.0);
        term110352 = newInstance(Class.forName("org.apache.commons.math.optimization.linear.LinearObjectiveFunction"));
        Object term110448 = newInstance(Class.forName("org.apache.commons.math.linear.RealVectorImpl"));
        double[] term109877 = (double[]) newDoubleArray(0);
        setField(term110448, term110448.getClass(), "data", term109877);
        setField(term110352, term110352.getClass(), "coefficients", term110448);
        term110500 = new ArrayList();
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
        args[0] = term110352;
        args[1] = term110500;
        args[2] = null;
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


