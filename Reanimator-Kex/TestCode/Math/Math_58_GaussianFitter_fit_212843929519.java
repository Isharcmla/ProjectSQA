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

public class GaussianFitter_fit_212843929519 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7429;
     Object term7124;

    public GaussianFitter_fit_212843929519() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7481 = new ArrayList();
        term7429 = newInstance(Class.forName("org.apache.commons.math.optimization.fitting.GaussianFitter"));
        Object term7631 = newInstance(Class.forName("org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer"));
        Object term7805 = newInstance(Class.forName("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1"));
        setField(term7429, term7429.getClass(), "observations", term7481);
        setIntField(term7631, term7631.getClass(), "jacobianEvaluations", 0);
        setField(term7631, term7631.getClass(), "jF", term7805);
        setField(term7631, term7631.getClass(), "residuals", null);
        setField(term7429, term7429.getClass(), "optimizer", term7631);
        term7124 = (double[]) newDoubleArray(106);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.fitting.GaussianFitter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term7124;
        callMethod(klass, "fit", argTypes, term7429, args);
    }

};


