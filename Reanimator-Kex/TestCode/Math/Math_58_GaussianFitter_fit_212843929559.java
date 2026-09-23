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

public class GaussianFitter_fit_212843929559 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27268;
     Object term27004;

    public GaussianFitter_fit_212843929559() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term27458 = newInstance(Class.forName("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setDoubleField(term27458, term27458.getClass(), "y", 0.0);
        setDoubleField(term27458, term27458.getClass(), "weight", 0.0);
        Object term27596 = newInstance(Class.forName("org.apache.commons.math.optimization.fitting.WeightedObservedPoint"));
        setDoubleField(term27596, term27596.getClass(), "y", 0.0);
        setDoubleField(term27596, term27596.getClass(), "weight", 0.0);
        ArrayList term27320 = new ArrayList();
        ((ArrayList) term27320).add(term27458);
        ((ArrayList) term27320).add(term27596);
        term27268 = newInstance(Class.forName("org.apache.commons.math.optimization.fitting.GaussianFitter"));
        Object term27732 = newInstance(Class.forName("org.apache.commons.math.optimization.general.GaussNewtonOptimizer"));
        double[] term27055 = (double[]) newDoubleArray(0);
        setField(term27268, term27268.getClass(), "observations", term27320);
        setIntField(term27732, term27732.getClass(), "jacobianEvaluations", 0);
        setField(term27732, term27732.getClass(), "jF", null);
        setField(term27732, term27732.getClass(), "residuals", term27055);
        setField(term27268, term27268.getClass(), "optimizer", term27732);
        term27004 = (double[]) newDoubleArray(10);
        setDoubleElement(term27004, 0, 2.8823037615171174E17);
        setDoubleElement(term27004, 1, 2.8823037615171174E17);
        setDoubleElement(term27004, 2, 2.8823037615171174E17);
        setDoubleElement(term27004, 3, 2.8823037615171174E17);
        setDoubleElement(term27004, 4, 2.8823037615171174E17);
        setDoubleElement(term27004, 5, 2.8823037615171174E17);
        setDoubleElement(term27004, 6, 2.8823037615171174E17);
        setDoubleElement(term27004, 7, 2.8823037615171174E17);
        setDoubleElement(term27004, 8, 2.8823037615171174E17);
        setDoubleElement(term27004, 9, 2.8823037615171174E17);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.fitting.GaussianFitter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term27004;
        callMethod(klass, "fit", argTypes, term27268, args);
    }

};


