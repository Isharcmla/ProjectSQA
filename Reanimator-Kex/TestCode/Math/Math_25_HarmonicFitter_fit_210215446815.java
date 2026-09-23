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
import java.lang.ClassCastException;
import static org.apache.commons.math3.optimization.fitting.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class HarmonicFitter_fit_210215446815 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13359;

    public HarmonicFitter_fit_210215446815() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term13551 = newInstance(Class.forName("org.apache.commons.math3.optimization.fitting.WeightedObservedPoint"));
        setDoubleField(term13551, term13551.getClass(), "y", 0.0);
        setDoubleField(term13551, term13551.getClass(), "weight", 0.0);
        Object term13691 = newInstance(Class.forName("org.apache.commons.math3.optimization.fitting.WeightedObservedPoint"));
        setDoubleField(term13691, term13691.getClass(), "y", 0.0);
        setDoubleField(term13691, term13691.getClass(), "weight", 0.0);
        Object term13817 = newInstance(Class.forName("org.apache.commons.math3.optimization.fitting.HarmonicFitter"));
        ArrayList term13411 = new ArrayList();
        ((ArrayList) term13411).add(term13551);
        ((ArrayList) term13411).add(term13691);
        ((ArrayList) term13411).add(term13817);
        ((ArrayList) term13411).add(term13817);
        ((ArrayList) term13411).add(term13817);
        ((ArrayList) term13411).add(term13817);
        ((ArrayList) term13411).add(term13817);
        ((ArrayList) term13411).add(term13817);
        ((ArrayList) term13411).add((Object)null);
        ((ArrayList) term13411).add(term13817);
        ((ArrayList) term13411).add(term13817);
        ((ArrayList) term13411).add(term13817);
        ((ArrayList) term13411).add(term13817);
        ((ArrayList) term13411).add(term13817);
        ((ArrayList) term13411).add(term13817);
        ((ArrayList) term13411).add(term13817);
        ((ArrayList) term13411).add(term13817);
        term13359 = newInstance(Class.forName("org.apache.commons.math3.optimization.fitting.HarmonicFitter"));
        setField(term13359, term13359.getClass(), "observations", term13411);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.fitting.HarmonicFitter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "fit", argTypes, term13359, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


