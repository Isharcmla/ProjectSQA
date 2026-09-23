package org.apache.commons.math3.optim.nonlinear.vector.jacobian;

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
import org.apache.commons.math3.exception.MathUnsupportedOperationException;
import static org.apache.commons.math3.optim.nonlinear.vector.jacobian.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class GaussNewtonOptimizer_doOptimize_15844706716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;

    public GaussNewtonOptimizer_doOptimize_15844706716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3 = newInstance(Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer"));
        double[] term6 = (double[]) newDoubleArray(5);
        double[] term12 = (double[]) newDoubleArray(4);
        double[] term17 = (double[]) newDoubleArray(3);
        double[] term21 = (double[]) newDoubleArray(4);
        Object term26 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term29 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor$1"));
        Object term30 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor"));
        Object term33 = newInstance(Class.forName("org.apache.commons.math3.util.Incrementor$1"));
        setBooleanField(term3, term3.getClass(), "useLU", false);
        setField(term3, term3.getClass(), "weightMatrixSqrt", null);
        setDoubleField(term3, term3.getClass(), "cost", 0.13238746331190498);
        setField(term3, term3.getClass(), "jacobian", null);
        setDoubleElement(term6, 0, 0.3455959125047594);
        setDoubleElement(term6, 1, 0.5523635872663106);
        setDoubleElement(term6, 2, 0.544608645520025);
        setDoubleElement(term6, 3, 0.28570734989730284);
        setDoubleElement(term6, 4, 0.40176586625454525);
        setField(term3, term3.getClass(), "target", term6);
        setField(term3, term3.getClass(), "weightMatrix", null);
        setField(term3, term3.getClass(), "model", null);
        setDoubleElement(term12, 0, 0.2641345529914265);
        setDoubleElement(term12, 1, 0.36923381893433327);
        setDoubleElement(term12, 2, 0.6076495596892013);
        setDoubleElement(term12, 3, 0.37773193782763337);
        setField(term3, term3.getClass(), "start", term12);
        setDoubleElement(term17, 0, 0.8474802076607362);
        setDoubleElement(term17, 1, 0.5183269973490326);
        setDoubleElement(term17, 2, 0.7655020693602768);
        setField(term3, term3.getClass(), "lowerBound", term17);
        setDoubleElement(term21, 0, 0.1374549299694151);
        setDoubleElement(term21, 1, 0.7031006357544823);
        setDoubleElement(term21, 2, 0.9527281779865117);
        setDoubleElement(term21, 3, 0.9828442029246764);
        setField(term3, term3.getClass(), "upperBound", term21);
        setIntField(term26, term26.getClass(), "maximalCount", 568599855);
        setIntField(term26, term26.getClass(), "count", 1162663216);
        setField(term26, term26.getClass(), "maxCountCallback", term29);
        setField(term3, term3.getClass(), "evaluations", term26);
        setIntField(term30, term30.getClass(), "maximalCount", 1484323161);
        setIntField(term30, term30.getClass(), "count", 391863371);
        setField(term30, term30.getClass(), "maxCountCallback", term33);
        setField(term3, term3.getClass(), "iterations", term30);
        setField(term3, term3.getClass(), "checker", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.optim.nonlinear.vector.jacobian.GaussNewtonOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "doOptimize", argTypes, term3, args);
            assertTrue(false);
        }
        catch (MathUnsupportedOperationException e) {
        }

    }

};


