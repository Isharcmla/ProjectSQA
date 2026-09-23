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

public class GaussianFitter_fit_212843929561 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28430;
     Object term28173;

    public GaussianFitter_fit_212843929561() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28620 = newInstance(Class.forName("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setDoubleField(term28620, term28620.getClass(), "y", 0.0);
        setDoubleField(term28620, term28620.getClass(), "weight", 0.0);
        Object term28758 = newInstance(Class.forName("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setDoubleField(term28758, term28758.getClass(), "y", 0.0);
        setDoubleField(term28758, term28758.getClass(), "weight", 0.0);
        ArrayList term28482 = new ArrayList();
        ((ArrayList) term28482).add(term28620);
        ((ArrayList) term28482).add(term28758);
        term28430 = newInstance(Class.forName("org.apache.commons.math.optimization.fitting.GaussianFitter"));
        Object term28894 = newInstance(Class.forName("org.apache.commons.math.optimization.general.GaussNewtonOptimizer"));
        Object term29068 = newInstance(Class.forName("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1"));
        double[] term28215 = (double[]) newDoubleArray(0);
        setField(term28430, term28430.getClass(), "observations", term28482);
        setIntField(term28894, term28894.getClass(), "jacobianEvaluations", 0);
        setField(term28894, term28894.getClass(), "jF", term29068);
        setField(term28894, term28894.getClass(), "residuals", term28215);
        setField(term28430, term28430.getClass(), "optimizer", term28894);
        term28173 = (double[]) newDoubleArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.fitting.GaussianFitter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term28173;
        callMethod(klass, "fit", argTypes, term28430, args);
    }

};


