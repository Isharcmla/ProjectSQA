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

public class GaussianFitter_fit_21284392958 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1675;

    public GaussianFitter_fit_21284392958() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term1865 = newInstance(Class.forName("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setDoubleField(term1865, term1865.getClass(), "y", 0.0);
        setDoubleField(term1865, term1865.getClass(), "weight", 0.0);
        ArrayList term1727 = new ArrayList();
        ((ArrayList) term1727).add(term1865);
        term1675 = newInstance(Class.forName("org.apache.commons.math.optimization.fitting.GaussianFitter"));
        setField(term1675, term1675.getClass(), "observations", term1727);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.fitting.GaussianFitter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "fit", argTypes, term1675, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


