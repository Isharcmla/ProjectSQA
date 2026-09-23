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

public class MultiStartUnivariateRealOptimizer_getOptima_27505533436 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term371;
     Object term3606;
     Object term3579;

    public MultiStartUnivariateRealOptimizer_getOptima_27505533436() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term371 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        double[] term377 = (double[]) newDoubleArray(6);
        double[] term384 = (double[]) newDoubleArray(6);
        setField(term371, term371.getClass(), "optimizer", null);
        setIntField(term371, term371.getClass(), "maxIterations", 1375330971);
        setIntField(term371, term371.getClass(), "maxEvaluations", -478195677);
        setIntField(term371, term371.getClass(), "totalIterations", 972867650);
        setIntField(term371, term371.getClass(), "totalEvaluations", 1655935355);
        setIntField(term371, term371.getClass(), "starts", -481533957);
        setField(term371, term371.getClass(), "generator", null);
        setDoubleElement(term377, 0, 0.9511861072660375);
        setDoubleElement(term377, 1, 0.05880719443135807);
        setDoubleElement(term377, 2, 0.34010089048558567);
        setDoubleElement(term377, 3, 0.19625398866403143);
        setDoubleElement(term377, 4, 0.45069204793711093);
        setDoubleElement(term377, 5, 0.9341364461850963);
        setField(term371, term371.getClass(), "optima", term377);
        setDoubleElement(term384, 0, 0.9022041121474429);
        setDoubleElement(term384, 1, 0.6512870939318848);
        setDoubleElement(term384, 2, 0.8777038609128434);
        setDoubleElement(term384, 3, 0.008025683154629148);
        setDoubleElement(term384, 4, 0.40598298281353484);
        setDoubleElement(term384, 5, 0.3710067290060264);
        setField(term371, term371.getClass(), "optimaValues", term384);
        term3606 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        double[] term3607 = (double[]) newDoubleArray(6);
        double[] term3608 = (double[]) newDoubleArray(6);
        setField(term3606, term3606.getClass(), "optimizer", null);
        setIntField(term3606, term3606.getClass(), "maxIterations", 1375330971);
        setIntField(term3606, term3606.getClass(), "maxEvaluations", -478195677);
        setIntField(term3606, term3606.getClass(), "totalIterations", 972867650);
        setIntField(term3606, term3606.getClass(), "totalEvaluations", 1655935355);
        setIntField(term3606, term3606.getClass(), "starts", -481533957);
        setField(term3606, term3606.getClass(), "generator", null);
        setDoubleElement(term3607, 0, 0.9511861072660375);
        setDoubleElement(term3607, 1, 0.05880719443135807);
        setDoubleElement(term3607, 2, 0.34010089048558567);
        setDoubleElement(term3607, 3, 0.19625398866403143);
        setDoubleElement(term3607, 4, 0.45069204793711093);
        setDoubleElement(term3607, 5, 0.9341364461850963);
        setField(term3606, term3606.getClass(), "optima", term3607);
        setDoubleElement(term3608, 0, 0.9022041121474429);
        setDoubleElement(term3608, 1, 0.6512870939318848);
        setDoubleElement(term3608, 2, 0.8777038609128434);
        setDoubleElement(term3608, 3, 0.008025683154629148);
        setDoubleElement(term3608, 4, 0.40598298281353484);
        setDoubleElement(term3608, 5, 0.3710067290060264);
        setField(term3606, term3606.getClass(), "optimaValues", term3608);
        term3579 = (double[]) newDoubleArray(6);
        setDoubleElement(term3579, 0, 0.9511861072660375);
        setDoubleElement(term3579, 1, 0.05880719443135807);
        setDoubleElement(term3579, 2, 0.34010089048558567);
        setDoubleElement(term3579, 3, 0.19625398866403143);
        setDoubleElement(term3579, 4, 0.45069204793711093);
        setDoubleElement(term3579, 5, 0.9341364461850963);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getOptima", argTypes, term371, args);
        assertTrue(recursiveEquals(term371, term3606));
        assertTrue(recursiveEquals(retValue, term3579));
    }

};


