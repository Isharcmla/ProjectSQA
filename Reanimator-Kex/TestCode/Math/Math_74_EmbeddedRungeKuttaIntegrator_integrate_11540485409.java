package org.apache.commons.math.ode.nonstiff;

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
import static org.apache.commons.math.ode.nonstiff.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Double;

public class EmbeddedRungeKuttaIntegrator_integrate_11540485409 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;
     Object term5;
     Object term11;
     Object term13;

    public EmbeddedRungeKuttaIntegrator_integrate_11540485409() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3 = new Double(0.3455959125047594);
        term5 = (double[]) newDoubleArray(5);
        setDoubleElement(term5, 0, 0.5523635872663106);
        setDoubleElement(term5, 1, 0.544608645520025);
        setDoubleElement(term5, 2, 0.28570734989730284);
        setDoubleElement(term5, 3, 0.40176586625454525);
        setDoubleElement(term5, 4, 0.2641345529914265);
        term11 = new Double(0.36923381893433327);
        term13 = (double[]) newDoubleArray(4);
        setDoubleElement(term13, 0, 0.6076495596892013);
        setDoubleElement(term13, 1, 0.37773193782763337);
        setDoubleElement(term13, 2, 0.8474802076607362);
        setDoubleElement(term13, 3, 0.5183269973490326);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.ode.nonstiff.EmbeddedRungeKuttaIntegrator");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("org.apache.commons.math.ode.FirstOrderDifferentialEquations");
        argTypes[1] = double.class;
        argTypes[2] = Array.newInstance(double.class, 0).getClass();
        argTypes[3] = double.class;
        argTypes[4] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = term3;
        args[2] = term5;
        args[3] = term11;
        args[4] = term13;
        try {
            callMethod(klass, "integrate", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


