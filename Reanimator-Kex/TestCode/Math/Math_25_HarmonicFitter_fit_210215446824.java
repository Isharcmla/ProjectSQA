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
import static org.apache.commons.math3.optimization.fitting.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class HarmonicFitter_fit_210215446824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22525;
     Object term21844;

    public HarmonicFitter_fit_210215446824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term22577 = new ArrayList();
        term22525 = newInstance(Class.forName("org.apache.commons.math3.optimization.fitting.HarmonicFitter"));
        Object term22729 = newInstance(Class.forName("org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer"));
        setField(term22525, term22525.getClass(), "observations", term22577);
        setIntField(term22729, term22729.getClass(), "jacobianEvaluations", 0);
        setField(term22729, term22729.getClass(), "jF", null);
        setField(term22525, term22525.getClass(), "optimizer", term22729);
        term21844 = (double[]) newDoubleArray(490);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optimization.fitting.HarmonicFitter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term21844;
        callMethod(klass, "fit", argTypes, term22525, args);
    }

};


