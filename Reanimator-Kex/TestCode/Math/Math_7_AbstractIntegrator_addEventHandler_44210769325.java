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
import java.lang.Integer;

public class AbstractIntegrator_addEventHandler_44210769325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7;
     Object term9;
     Object term11;

    public AbstractIntegrator_addEventHandler_44210769325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7 = new Double(0.5523635872663106);
        term9 = new Double(0.544608645520025);
        term11 = new Integer(1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.ode.AbstractIntegrator");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("org.apache.commons.math3.ode.events.EventHandler");
        argTypes[1] = double.class;
        argTypes[2] = double.class;
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("org.apache.commons.math3.analysis.solvers.UnivariateSolver");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = term7;
        args[2] = term9;
        args[3] = term11;
        args[4] = null;
        try {
            callMethod(klass, "addEventHandler", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


