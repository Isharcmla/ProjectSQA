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

public class AbstractIntegrator_integrate_168631536435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term114;
     Object term116;
     Object term118;
     Object term120;

    public AbstractIntegrator_integrate_168631536435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term114 = new Double(0.22651340641904605);
        term116 = (double[]) newDoubleArray(1);
        setDoubleElement(term116, 0, 0.8878841294187743);
        term118 = new Double(0.6588948704887806);
        term120 = (double[]) newDoubleArray(6);
        setDoubleElement(term120, 0, 0.6397214730945112);
        setDoubleElement(term120, 1, 0.25937345430928016);
        setDoubleElement(term120, 2, 0.5873228247510078);
        setDoubleElement(term120, 3, 0.8823181080774973);
        setDoubleElement(term120, 4, 0.2192450926212024);
        setDoubleElement(term120, 5, 0.7591353014991907);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.ode.AbstractIntegrator");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("org.apache.commons.math.ode.FirstOrderDifferentialEquations");
        argTypes[1] = double.class;
        argTypes[2] = Array.newInstance(double.class, 0).getClass();
        argTypes[3] = double.class;
        argTypes[4] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = term114;
        args[2] = term116;
        args[3] = term118;
        args[4] = term120;
        try {
            callMethod(klass, "integrate", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


