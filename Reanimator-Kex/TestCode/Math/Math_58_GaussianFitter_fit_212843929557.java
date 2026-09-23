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
import static org.apache.commons.math.optimization.fitting.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class GaussianFitter_fit_212843929557 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26071;
     Object term25807;

    public GaussianFitter_fit_212843929557() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term26261 = newInstance(Class.forName("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setDoubleField(term26261, term26261.getClass(), "y", 0.0);
        setDoubleField(term26261, term26261.getClass(), "weight", 0.0);
        Object term26399 = newInstance(Class.forName("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setDoubleField(term26399, term26399.getClass(), "y", 0.0);
        setDoubleField(term26399, term26399.getClass(), "weight", 0.0);
        ArrayList term26123 = new ArrayList();
        ((ArrayList) term26123).add(term26261);
        ((ArrayList) term26123).add(term26399);
        term26071 = newInstance(Class.forName("org.apache.commons.math.optimization.fitting.GaussianFitter"));
        Object term26549 = newInstance(Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        double[] term25858 = (double[]) newDoubleArray(0);
        setField(term26071, term26071.getClass(), "observations", term26123);
        setIntField(term26549, term26549.getClass(), "jacobianEvaluations", 0);
        setField(term26549, term26549.getClass(), "jF", null);
        setField(term26549, term26549.getClass(), "residuals", term25858);
        setField(term26071, term26071.getClass(), "optimizer", term26549);
        term25807 = (double[]) newDoubleArray(10);
        setDoubleElement(term25807, 0, 2.8823037615171174E17);
        setDoubleElement(term25807, 1, 2.8823037615171174E17);
        setDoubleElement(term25807, 2, 2.8823037615171174E17);
        setDoubleElement(term25807, 3, 2.8823037615171174E17);
        setDoubleElement(term25807, 4, 2.8823037615171174E17);
        setDoubleElement(term25807, 5, 2.8823037615171174E17);
        setDoubleElement(term25807, 6, 2.8823037615171174E17);
        setDoubleElement(term25807, 7, 2.8823037615171174E17);
        setDoubleElement(term25807, 8, 2.8823037615171174E17);
        setDoubleElement(term25807, 9, 2.8823037615171174E17);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.fitting.GaussianFitter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term25807;
        callMethod(klass, "fit", argTypes, term26071, args);
    }

};


