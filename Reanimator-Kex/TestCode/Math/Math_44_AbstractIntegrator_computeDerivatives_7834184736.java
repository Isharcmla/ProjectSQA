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

public class AbstractIntegrator_computeDerivatives_7834184736 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134;
     Object term136;
     Object term142;

    public AbstractIntegrator_computeDerivatives_7834184736() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term134 = new Double(0.791695029600875);
        term136 = (double[]) newDoubleArray(5);
        setDoubleElement(term136, 0, 0.6862221294683138);
        setDoubleElement(term136, 1, 0.15917839663695388);
        setDoubleElement(term136, 2, 0.9374115574082594);
        setDoubleElement(term136, 3, 0.8454723071922143);
        setDoubleElement(term136, 4, 0.8566567697571895);
        term142 = (double[]) newDoubleArray(5);
        setDoubleElement(term142, 0, 0.9203805380592256);
        setDoubleElement(term142, 1, 0.5804948995371725);
        setDoubleElement(term142, 2, 0.20737514139742264);
        setDoubleElement(term142, 3, 0.7919370314903882);
        setDoubleElement(term142, 4, 0.2109867221632754);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.ode.AbstractIntegrator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        argTypes[2] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[3];
        args[0] = term134;
        args[1] = term136;
        args[2] = term142;
        try {
            callMethod(klass, "computeDerivatives", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


