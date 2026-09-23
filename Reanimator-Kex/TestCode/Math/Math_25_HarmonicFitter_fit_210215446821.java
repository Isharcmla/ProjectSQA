package org.apache.commons.math3.optimization.fitting;

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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.math3.optimization.fitting.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class HarmonicFitter_fit_210215446821 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20434;

    public HarmonicFitter_fit_210215446821() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term20626 = newInstance(Class.forName("org.apache.commons.math3.optimization.fitting.WeightedObservedPoint"));
        setDoubleField(term20626, term20626.getClass(), "y", 0.0);
        setDoubleField(term20626, term20626.getClass(), "weight", 0.0);
        ArrayList term20486 = new ArrayList();
        ((ArrayList) term20486).add(term20626);
        term20434 = newInstance(Class.forName("org.apache.commons.math3.optimization.fitting.HarmonicFitter"));
        Object term20810 = newInstance(Class.forName("org.apache.commons.math3.optimization.DifferentiableMultivariateVectorMultiStartOptimizer"));
        setField(term20434, term20434.getClass(), "observations", term20486);
        setField(term20434, term20434.getClass(), "optimizer", term20810);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.fitting.HarmonicFitter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "fit", argTypes, term20434, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


