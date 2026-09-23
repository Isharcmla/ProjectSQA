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
import java.lang.Double;

public class MultiStartUnivariateRealOptimizer_setRelativeAccuracy_172290773335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term343;
     Object term360;

    public MultiStartUnivariateRealOptimizer_setRelativeAccuracy_172290773335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term343 = newInstance(Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer"));
        double[] term349 = (double[]) newDoubleArray(7);
        double[] term357 = (double[]) newDoubleArray(2);
        setField(term343, term343.getClass(), "optimizer", null);
        setIntField(term343, term343.getClass(), "maxIterations", 1265463001);
        setIntField(term343, term343.getClass(), "maxEvaluations", 335112684);
        setIntField(term343, term343.getClass(), "totalIterations", 1551099402);
        setIntField(term343, term343.getClass(), "totalEvaluations", -2027534003);
        setIntField(term343, term343.getClass(), "starts", 1063420942);
        setField(term343, term343.getClass(), "generator", null);
        setDoubleElement(term349, 0, 0.623231822150205);
        setDoubleElement(term349, 1, 0.09037487793444521);
        setDoubleElement(term349, 2, 0.6561919196821765);
        setDoubleElement(term349, 3, 0.7330178886612495);
        setDoubleElement(term349, 4, 0.7618164754425794);
        setDoubleElement(term349, 5, 0.7385589312559342);
        setDoubleElement(term349, 6, 0.7080134263823477);
        setField(term343, term343.getClass(), "optima", term349);
        setDoubleElement(term357, 0, 0.6059734092898602);
        setDoubleElement(term357, 1, 0.3074693824288357);
        setField(term343, term343.getClass(), "optimaValues", term357);
        term360 = new Double(0.1245258965512791);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = double.class;
        Object[] args = new Object[1];
        args[0] = term360;
        try {
            callMethod(klass, "setRelativeAccuracy", argTypes, term343, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


