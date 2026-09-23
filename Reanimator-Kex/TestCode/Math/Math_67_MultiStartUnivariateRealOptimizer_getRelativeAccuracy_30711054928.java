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
import java.lang.NullPointerException;
import static org.apache.commons.math.optimization.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class MultiStartUnivariateRealOptimizer_getRelativeAccuracy_30711054928 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term173;

    public MultiStartUnivariateRealOptimizer_getRelativeAccuracy_30711054928() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term173 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        double[] term179 = (double[]) newDoubleArray(3);
        double[] term183 = (double[]) newDoubleArray(1);
        setField(term173, term173.getClass(), "optimizer", null);
        setIntField(term173, term173.getClass(), "maxIterations", -1530420153);
        setIntField(term173, term173.getClass(), "maxEvaluations", -469968304);
        setIntField(term173, term173.getClass(), "totalIterations", -1145578966);
        setIntField(term173, term173.getClass(), "totalEvaluations", 679763016);
        setIntField(term173, term173.getClass(), "starts", 1962444399);
        setField(term173, term173.getClass(), "generator", null);
        setDoubleElement(term179, 0, 0.20737514139742264);
        setDoubleElement(term179, 1, 0.7919370314903882);
        setDoubleElement(term179, 2, 0.2109867221632754);
        setField(term173, term173.getClass(), "optima", term179);
        setDoubleElement(term183, 0, 0.3227335400819148);
        setField(term173, term173.getClass(), "optimaValues", term183);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getRelativeAccuracy", argTypes, term173, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


