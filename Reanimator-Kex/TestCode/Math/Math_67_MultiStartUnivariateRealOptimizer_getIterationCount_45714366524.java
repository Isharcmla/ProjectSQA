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

public class MultiStartUnivariateRealOptimizer_getIterationCount_45714366524 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73;
     Object term1832;

    public MultiStartUnivariateRealOptimizer_getIterationCount_45714366524() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        double[] term79 = (double[]) newDoubleArray(2);
        double[] term82 = (double[]) newDoubleArray(6);
        setField(term73, term73.getClass(), "optimizer", null);
        setIntField(term73, term73.getClass(), "maxIterations", -1685132342);
        setIntField(term73, term73.getClass(), "maxEvaluations", -1456670397);
        setIntField(term73, term73.getClass(), "totalIterations", 1622346318);
        setIntField(term73, term73.getClass(), "totalEvaluations", 1048535127);
        setIntField(term73, term73.getClass(), "starts", -655067527);
        setField(term73, term73.getClass(), "generator", null);
        setDoubleElement(term79, 0, 0.7633268466829064);
        setDoubleElement(term79, 1, 0.13481025392611334);
        setField(term73, term73.getClass(), "optima", term79);
        setDoubleElement(term82, 0, 0.3800088629986428);
        setDoubleElement(term82, 1, 0.5840714198152577);
        setDoubleElement(term82, 2, 0.7559240768573477);
        setDoubleElement(term82, 3, 0.10667076642995188);
        setDoubleElement(term82, 4, 0.11493000848982304);
        setDoubleElement(term82, 5, 0.37161417339133307);
        setField(term73, term73.getClass(), "optimaValues", term82);
        term1832 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        double[] term1833 = (double[]) newDoubleArray(2);
        double[] term1834 = (double[]) newDoubleArray(6);
        setField(term1832, term1832.getClass(), "optimizer", null);
        setIntField(term1832, term1832.getClass(), "maxIterations", -1685132342);
        setIntField(term1832, term1832.getClass(), "maxEvaluations", -1456670397);
        setIntField(term1832, term1832.getClass(), "totalIterations", 1622346318);
        setIntField(term1832, term1832.getClass(), "totalEvaluations", 1048535127);
        setIntField(term1832, term1832.getClass(), "starts", -655067527);
        setField(term1832, term1832.getClass(), "generator", null);
        setDoubleElement(term1833, 0, 0.7633268466829064);
        setDoubleElement(term1833, 1, 0.13481025392611334);
        setField(term1832, term1832.getClass(), "optima", term1833);
        setDoubleElement(term1834, 0, 0.3800088629986428);
        setDoubleElement(term1834, 1, 0.5840714198152577);
        setDoubleElement(term1834, 2, 0.7559240768573477);
        setDoubleElement(term1834, 3, 0.10667076642995188);
        setDoubleElement(term1834, 4, 0.11493000848982304);
        setDoubleElement(term1834, 5, 0.37161417339133307);
        setField(term1832, term1832.getClass(), "optimaValues", term1834);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getIterationCount", argTypes, term73, args);
        assertTrue(recursiveEquals(term73, term1832));
        assertTrue(recursiveEquals(retValue, 1622346318));
    }

};


