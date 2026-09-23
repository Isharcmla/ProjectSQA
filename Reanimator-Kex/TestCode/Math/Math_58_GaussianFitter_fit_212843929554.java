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

public class GaussianFitter_fit_212843929554 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24572;
     Object term24267;

    public GaussianFitter_fit_212843929554() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term24624 = new ArrayList();
        term24572 = newInstance(Class.forName("org.apache.commons.math.optimization.fitting.GaussianFitter"));
        Object term24760 = newInstance(Class.forName("org.apache.commons.math.optimization.general.GaussNewtonOptimizer"));
        Object term24934 = newInstance(Class.forName("org.apache.commons.math.optimization.fitting.CurveFitter$TheoreticalValuesFunction$1"));
        setField(term24572, term24572.getClass(), "observations", term24624);
        setIntField(term24760, term24760.getClass(), "jacobianEvaluations", 0);
        setField(term24760, term24760.getClass(), "jF", term24934);
        setField(term24760, term24760.getClass(), "residuals", null);
        setField(term24572, term24572.getClass(), "optimizer", term24760);
        term24267 = (double[]) newDoubleArray(106);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.fitting.GaussianFitter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term24267;
        callMethod(klass, "fit", argTypes, term24572, args);
    }

};


