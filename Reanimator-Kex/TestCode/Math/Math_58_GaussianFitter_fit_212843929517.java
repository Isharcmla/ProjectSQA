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

public class GaussianFitter_fit_212843929517 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6146;
     Object term5841;

    public GaussianFitter_fit_212843929517() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6198 = new ArrayList();
        term6146 = newInstance(Class.forName("org.apache.commons.math.optimization.fitting.GaussianFitter"));
        Object term6348 = newInstance(Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        Object term6522 = newInstance(Class.forName("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1"));
        setField(term6146, term6146.getClass(), "observations", term6198);
        setIntField(term6348, term6348.getClass(), "jacobianEvaluations", 0);
        setField(term6348, term6348.getClass(), "jF", term6522);
        setField(term6348, term6348.getClass(), "residuals", null);
        setField(term6146, term6146.getClass(), "optimizer", term6348);
        term5841 = (double[]) newDoubleArray(106);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.fitting.GaussianFitter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term5841;
        callMethod(klass, "fit", argTypes, term6146, args);
    }

};


