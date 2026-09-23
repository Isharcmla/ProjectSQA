package org.apache.commons.math3.distribution;

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
import static org.apache.commons.math3.distribution.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class HypergeometricDistribution_innerCumulativeProbability_103825597339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2543;
     Object term2549;
     Object term2551;
     Object term2553;

    public HypergeometricDistribution_innerCumulativeProbability_103825597339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2543 = newInstance(Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        setIntField(term2543, term2543.getClass(), "numberOfSuccesses", 0);
        setIntField(term2543, term2543.getClass(), "populationSize", 0);
        setIntField(term2543, term2543.getClass(), "sampleSize", 0);
        setDoubleField(term2543, term2543.getClass(), "numericalVariance", 0.0);
        setBooleanField(term2543, term2543.getClass(), "numericalVarianceIsCalculated", false);
        setField(term2543, term2543.getClass(), "randomData", null);
        setField(term2543, term2543.getClass(), "random", null);
        term2549 = new Integer(0);
        term2551 = new Integer(0);
        term2553 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term2549;
        args[1] = term2551;
        args[2] = term2553;
        callMethod(klass, "innerCumulativeProbability", argTypes, term2543, args);
    }

};


