package org.apache.commons.math.optimization.fitting;

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
import static org.apache.commons.math.optimization.fitting.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class GaussianFitter_fit_212843929528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11494;

    public GaussianFitter_fit_212843929528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term11546 = new ArrayList();
        term11494 = newInstance(Class.forName("org.apache.commons.math.optimization.fitting.GaussianFitter"));
        Object term11682 = newInstance(Class.forName("org.apache.commons.math.optimization.general.GaussNewtonOptimizer"));
        setField(term11494, term11494.getClass(), "observations", term11546);
        setField(term11494, term11494.getClass(), "optimizer", term11682);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.fitting.GaussianFitter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "fit", argTypes, term11494, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


