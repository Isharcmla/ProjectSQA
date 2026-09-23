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

public class MultiStartUnivariateRealOptimizer_resetMaximalIterationCount_189597210930 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201;

    public MultiStartUnivariateRealOptimizer_resetMaximalIterationCount_189597210930() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term201 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        double[] term207 = (double[]) newDoubleArray(8);
        double[] term216 = (double[]) newDoubleArray(6);
        setField(term201, term201.getClass(), "optimizer", null);
        setIntField(term201, term201.getClass(), "maxIterations", -1016503459);
        setIntField(term201, term201.getClass(), "maxEvaluations", -1968847291);
        setIntField(term201, term201.getClass(), "totalIterations", 579005622);
        setIntField(term201, term201.getClass(), "totalEvaluations", -14890619);
        setIntField(term201, term201.getClass(), "starts", 1632125673);
        setField(term201, term201.getClass(), "generator", null);
        setDoubleElement(term207, 0, 0.9126850255993704);
        setDoubleElement(term207, 1, 0.11179067076100713);
        setDoubleElement(term207, 2, 0.5306473989087822);
        setDoubleElement(term207, 3, 0.022483645678509023);
        setDoubleElement(term207, 4, 0.025133051616627267);
        setDoubleElement(term207, 5, 0.016575281023182953);
        setDoubleElement(term207, 6, 0.5308350402051779);
        setDoubleElement(term207, 7, 0.7154795600170818);
        setField(term201, term201.getClass(), "optima", term207);
        setDoubleElement(term216, 0, 0.6355029654528058);
        setDoubleElement(term216, 1, 0.0022646783892913414);
        setDoubleElement(term216, 2, 0.36226058076369927);
        setDoubleElement(term216, 3, 0.03699061125289671);
        setDoubleElement(term216, 4, 0.6047137830113202);
        setDoubleElement(term216, 5, 0.6767213143579776);
        setField(term201, term201.getClass(), "optimaValues", term216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "resetMaximalIterationCount", argTypes, term201, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


