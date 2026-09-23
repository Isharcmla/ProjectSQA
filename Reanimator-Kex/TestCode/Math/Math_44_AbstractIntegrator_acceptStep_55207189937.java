package org.apache.commons.math.ode;

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
import static org.apache.commons.math.ode.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;

public class AbstractIntegrator_acceptStep_55207189937 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term160;
     Object term163;
     Object term167;

    public AbstractIntegrator_acceptStep_55207189937() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term160 = (double[]) newDoubleArray(2);
        setDoubleElement(term160, 0, 0.3227335400819148);
        setDoubleElement(term160, 1, 0.43337207054070237);
        term163 = (double[]) newDoubleArray(3);
        setDoubleElement(term163, 0, 0.13246999699526574);
        setDoubleElement(term163, 1, 0.9126850255993704);
        setDoubleElement(term163, 2, 0.11179067076100713);
        term167 = new Double(0.5306473989087822);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.ode.AbstractIntegrator");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.apache.commons.math.ode.sampling.AbstractStepInterpolator");
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        argTypes[2] = Array.newInstance(double.class, 0).getClass();
        argTypes[3] = double.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term160;
        args[2] = term163;
        args[3] = term167;
        try {
            callMethod(klass, "acceptStep", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


