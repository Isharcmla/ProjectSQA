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

public class AbstractIntegrator_initIntegration_144649115333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15;
     Object term17;
     Object term23;

    public AbstractIntegrator_initIntegration_144649115333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15 = new Double(0.28570734989730284);
        term17 = (double[]) newDoubleArray(5);
        setDoubleElement(term17, 0, 0.40176586625454525);
        setDoubleElement(term17, 1, 0.2641345529914265);
        setDoubleElement(term17, 2, 0.36923381893433327);
        setDoubleElement(term17, 3, 0.6076495596892013);
        setDoubleElement(term17, 4, 0.37773193782763337);
        term23 = new Double(0.8474802076607362);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.ode.AbstractIntegrator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = double.class;
        argTypes[1] = Array.newInstance(double.class, 0).getClass();
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term15;
        args[1] = term17;
        args[2] = term23;
        try {
            callMethod(klass, "initIntegration", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


