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
import java.lang.NullPointerException;
import static org.apache.commons.math3.optimization.fitting.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class HarmonicFitter_fit_210215446839 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30812;

    public HarmonicFitter_fit_210215446839() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term31004 = newInstance(Class.forName("org.apache.commons.math3.optimization.fitting.WeightedObservedPoint"));
        setDoubleField(term31004, term31004.getClass(), "y", 0.0);
        setDoubleField(term31004, term31004.getClass(), "weight", 0.0);
        ArrayList term30864 = new ArrayList();
        ((ArrayList) term30864).add(term31004);
        term30812 = newInstance(Class.forName("org.apache.commons.math3.optimization.fitting.HarmonicFitter"));
        Object term31188 = newInstance(Class.forName("org.apache.commons.math3.optimization.DifferentiableMultivariateVectorMultiStartOptimizer"));
        Object term31340 = newInstance(Class.forName("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        setField(term30812, term30812.getClass(), "observations", term30864);
        setIntField(term31188, term31188.getClass(), "maxEvaluations", 0);
        setIntField(term31188, term31188.getClass(), "starts", 512);
        setField(term31188, term31188.getClass(), "optima", null);
        setIntField(term31188, term31188.getClass(), "totalEvaluations", 0);
        setField(term31188, term31188.getClass(), "optimizer", term31340);
        setField(term30812, term30812.getClass(), "optimizer", term31188);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.fitting.HarmonicFitter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "fit", argTypes, term30812, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


