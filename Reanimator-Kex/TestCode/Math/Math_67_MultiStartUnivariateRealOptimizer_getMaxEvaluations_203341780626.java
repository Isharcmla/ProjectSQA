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

public class MultiStartUnivariateRealOptimizer_getMaxEvaluations_203341780626 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121;
     Object term1907;

    public MultiStartUnivariateRealOptimizer_getMaxEvaluations_203341780626() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        double[] term127 = (double[]) newDoubleArray(6);
        double[] term134 = (double[]) newDoubleArray(5);
        setField(term121, term121.getClass(), "optimizer", null);
        setIntField(term121, term121.getClass(), "maxIterations", 590364439);
        setIntField(term121, term121.getClass(), "maxEvaluations", 865208305);
        setIntField(term121, term121.getClass(), "totalIterations", -1275173084);
        setIntField(term121, term121.getClass(), "totalEvaluations", -244121226);
        setIntField(term121, term121.getClass(), "starts", -203030934);
        setField(term121, term121.getClass(), "generator", null);
        setDoubleElement(term127, 0, 0.3202192021706908);
        setDoubleElement(term127, 1, 0.22651340641904605);
        setDoubleElement(term127, 2, 0.8878841294187743);
        setDoubleElement(term127, 3, 0.6588948704887806);
        setDoubleElement(term127, 4, 0.6397214730945112);
        setDoubleElement(term127, 5, 0.25937345430928016);
        setField(term121, term121.getClass(), "optima", term127);
        setDoubleElement(term134, 0, 0.5873228247510078);
        setDoubleElement(term134, 1, 0.8823181080774973);
        setDoubleElement(term134, 2, 0.2192450926212024);
        setDoubleElement(term134, 3, 0.7591353014991907);
        setDoubleElement(term134, 4, 0.791695029600875);
        setField(term121, term121.getClass(), "optimaValues", term134);
        term1907 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        double[] term1908 = (double[]) newDoubleArray(6);
        double[] term1909 = (double[]) newDoubleArray(5);
        setField(term1907, term1907.getClass(), "optimizer", null);
        setIntField(term1907, term1907.getClass(), "maxIterations", 590364439);
        setIntField(term1907, term1907.getClass(), "maxEvaluations", 865208305);
        setIntField(term1907, term1907.getClass(), "totalIterations", -1275173084);
        setIntField(term1907, term1907.getClass(), "totalEvaluations", -244121226);
        setIntField(term1907, term1907.getClass(), "starts", -203030934);
        setField(term1907, term1907.getClass(), "generator", null);
        setDoubleElement(term1908, 0, 0.3202192021706908);
        setDoubleElement(term1908, 1, 0.22651340641904605);
        setDoubleElement(term1908, 2, 0.8878841294187743);
        setDoubleElement(term1908, 3, 0.6588948704887806);
        setDoubleElement(term1908, 4, 0.6397214730945112);
        setDoubleElement(term1908, 5, 0.25937345430928016);
        setField(term1907, term1907.getClass(), "optima", term1908);
        setDoubleElement(term1909, 0, 0.5873228247510078);
        setDoubleElement(term1909, 1, 0.8823181080774973);
        setDoubleElement(term1909, 2, 0.2192450926212024);
        setDoubleElement(term1909, 3, 0.7591353014991907);
        setDoubleElement(term1909, 4, 0.791695029600875);
        setField(term1907, term1907.getClass(), "optimaValues", term1909);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getMaxEvaluations", argTypes, term121, args);
        assertTrue(recursiveEquals(term121, term1907));
        assertTrue(recursiveEquals(retValue, 865208305));
    }

};


