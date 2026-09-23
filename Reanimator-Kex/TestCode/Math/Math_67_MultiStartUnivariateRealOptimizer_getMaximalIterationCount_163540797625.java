package org.apache.commons.math.optimization;

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
import static org.apache.commons.math.optimization.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.optimization.EqualityUtils.*;

public class MultiStartUnivariateRealOptimizer_getMaximalIterationCount_163540797625 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97;
     Object term1868;

    public MultiStartUnivariateRealOptimizer_getMaximalIterationCount_163540797625() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        double[] term103 = (double[]) newDoubleArray(7);
        double[] term111 = (double[]) newDoubleArray(1);
        setField(term97, term97.getClass(), "optimizer", null);
        setIntField(term97, term97.getClass(), "maxIterations", -6029667);
        setIntField(term97, term97.getClass(), "maxEvaluations", -2068769794);
        setIntField(term97, term97.getClass(), "totalIterations", -117576464);
        setIntField(term97, term97.getClass(), "totalEvaluations", -1007160944);
        setIntField(term97, term97.getClass(), "starts", 1135664017);
        setField(term97, term97.getClass(), "generator", null);
        setDoubleElement(term103, 0, 0.6805867182029153);
        setDoubleElement(term103, 1, 0.2852810965221698);
        setDoubleElement(term103, 2, 0.6300849762307866);
        setDoubleElement(term103, 3, 0.9737083944266686);
        setDoubleElement(term103, 4, 0.0668892744806211);
        setDoubleElement(term103, 5, 0.3587267442738795);
        setDoubleElement(term103, 6, 0.07802449704920456);
        setField(term97, term97.getClass(), "optima", term103);
        setDoubleElement(term111, 0, 0.5279279537140873);
        setField(term97, term97.getClass(), "optimaValues", term111);
        term1868 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        double[] term1869 = (double[]) newDoubleArray(7);
        double[] term1870 = (double[]) newDoubleArray(1);
        setField(term1868, term1868.getClass(), "optimizer", null);
        setIntField(term1868, term1868.getClass(), "maxIterations", -6029667);
        setIntField(term1868, term1868.getClass(), "maxEvaluations", -2068769794);
        setIntField(term1868, term1868.getClass(), "totalIterations", -117576464);
        setIntField(term1868, term1868.getClass(), "totalEvaluations", -1007160944);
        setIntField(term1868, term1868.getClass(), "starts", 1135664017);
        setField(term1868, term1868.getClass(), "generator", null);
        setDoubleElement(term1869, 0, 0.6805867182029153);
        setDoubleElement(term1869, 1, 0.2852810965221698);
        setDoubleElement(term1869, 2, 0.6300849762307866);
        setDoubleElement(term1869, 3, 0.9737083944266686);
        setDoubleElement(term1869, 4, 0.0668892744806211);
        setDoubleElement(term1869, 5, 0.3587267442738795);
        setDoubleElement(term1869, 6, 0.07802449704920456);
        setField(term1868, term1868.getClass(), "optima", term1869);
        setDoubleElement(term1870, 0, 0.5279279537140873);
        setField(term1868, term1868.getClass(), "optimaValues", term1870);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getMaximalIterationCount", argTypes, term97, args);
        assertTrue(recursiveEquals(term97, term1868));
        assertTrue(recursiveEquals(retValue, -6029667));
    }

};


