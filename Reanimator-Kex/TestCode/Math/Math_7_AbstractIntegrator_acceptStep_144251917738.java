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

public class AbstractIntegrator_acceptStep_144251917738 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term181;
     Object term182;
     Object term185;

    public AbstractIntegrator_acceptStep_144251917738() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term181 = (double[]) newDoubleArray(0);
        term182 = (double[]) newDoubleArray(2);
        setDoubleElement(term182, 0, 0.025133051616627267);
        setDoubleElement(term182, 1, 0.016575281023182953);
        term185 = new Double(0.5308350402051779);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.ode.AbstractIntegrator");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.apache.commons.math3.ode.sampling.AbstractStepInterpolator");
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        argTypes[2] = Array.newInstance(double.class, 0).getClass();
        argTypes[3] = double.class;
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term181;
        args[2] = term182;
        args[3] = term185;
        try {
            callMethod(klass, "acceptStep", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


