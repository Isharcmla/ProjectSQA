package org.apache.commons.math3.ode;

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
import static org.apache.commons.math3.ode.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;

public class AbstractIntegrator_integrate_214669561235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term147;
     Object term149;
     Object term155;
     Object term157;

    public AbstractIntegrator_integrate_214669561235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term147 = new Double(0.8454723071922143);
        term149 = (double[]) newDoubleArray(5);
        setDoubleElement(term149, 0, 0.8566567697571895);
        setDoubleElement(term149, 1, 0.9203805380592256);
        setDoubleElement(term149, 2, 0.5804948995371725);
        setDoubleElement(term149, 3, 0.20737514139742264);
        setDoubleElement(term149, 4, 0.7919370314903882);
        term155 = new Double(0.2109867221632754);
        term157 = (double[]) newDoubleArray(2);
        setDoubleElement(term157, 0, 0.3227335400819148);
        setDoubleElement(term157, 1, 0.43337207054070237);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.ode.AbstractIntegrator");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("org.apache.commons.math3.ode.FirstOrderDifferentialEquations");
        argTypes[1] = double.class;
        argTypes[2] = Array.newInstance(double.class, 0).getClass();
        argTypes[3] = double.class;
        argTypes[4] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = term147;
        args[2] = term149;
        args[3] = term155;
        args[4] = term157;
        try {
            callMethod(klass, "integrate", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


