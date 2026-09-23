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
import java.lang.Integer;

public class MultiStartUnivariateRealOptimizer_setMaximalIterationCount_125954303833 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term285;
     Object term304;
     Object term3260;

    public MultiStartUnivariateRealOptimizer_setMaximalIterationCount_125954303833() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term285 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        double[] term291 = (double[]) newDoubleArray(5);
        double[] term297 = (double[]) newDoubleArray(6);
        setField(term285, term285.getClass(), "optimizer", null);
        setIntField(term285, term285.getClass(), "maxIterations", 97029295);
        setIntField(term285, term285.getClass(), "maxEvaluations", -1371869594);
        setIntField(term285, term285.getClass(), "totalIterations", -2095575670);
        setIntField(term285, term285.getClass(), "totalEvaluations", 1225272962);
        setIntField(term285, term285.getClass(), "starts", 1324040357);
        setField(term285, term285.getClass(), "generator", null);
        setDoubleElement(term291, 0, 0.5412182593116958);
        setDoubleElement(term291, 1, 0.16988691727397487);
        setDoubleElement(term291, 2, 0.39286935532362843);
        setDoubleElement(term291, 3, 0.11577948268926874);
        setDoubleElement(term291, 4, 0.5617009352394552);
        setField(term285, term285.getClass(), "optima", term291);
        setDoubleElement(term297, 0, 0.09067063848644474);
        setDoubleElement(term297, 1, 0.268304014379393);
        setDoubleElement(term297, 2, 0.7171972879282721);
        setDoubleElement(term297, 3, 0.9006361024877096);
        setDoubleElement(term297, 4, 0.5644914462415626);
        setDoubleElement(term297, 5, 0.509895859167191);
        setField(term285, term285.getClass(), "optimaValues", term297);
        term304 = new Integer(-1588772968);
        term3260 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        double[] term3261 = (double[]) newDoubleArray(5);
        double[] term3262 = (double[]) newDoubleArray(6);
        setField(term3260, term3260.getClass(), "optimizer", null);
        setIntField(term3260, term3260.getClass(), "maxIterations", -1588772968);
        setIntField(term3260, term3260.getClass(), "maxEvaluations", -1371869594);
        setIntField(term3260, term3260.getClass(), "totalIterations", -2095575670);
        setIntField(term3260, term3260.getClass(), "totalEvaluations", 1225272962);
        setIntField(term3260, term3260.getClass(), "starts", 1324040357);
        setField(term3260, term3260.getClass(), "generator", null);
        setDoubleElement(term3261, 0, 0.5412182593116958);
        setDoubleElement(term3261, 1, 0.16988691727397487);
        setDoubleElement(term3261, 2, 0.39286935532362843);
        setDoubleElement(term3261, 3, 0.11577948268926874);
        setDoubleElement(term3261, 4, 0.5617009352394552);
        setField(term3260, term3260.getClass(), "optima", term3261);
        setDoubleElement(term3262, 0, 0.09067063848644474);
        setDoubleElement(term3262, 1, 0.268304014379393);
        setDoubleElement(term3262, 2, 0.7171972879282721);
        setDoubleElement(term3262, 3, 0.9006361024877096);
        setDoubleElement(term3262, 4, 0.5644914462415626);
        setDoubleElement(term3262, 5, 0.509895859167191);
        setField(term3260, term3260.getClass(), "optimaValues", term3262);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term304;
        callMethod(klass, "setMaximalIterationCount", argTypes, term285, args);
        assertTrue(recursiveEquals(term285, term3260));
        assertTrue(recursiveEquals(term304, -1588772968));
    }

};


