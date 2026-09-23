package org.apache.commons.math.stat.inference;

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
import static org.apache.commons.math.stat.inference.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.stat.inference.EqualityUtils.*;
import java.lang.Object;

public class ChiSquareTestImpl_setDistribution_202295583335 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term389;
     Object term3774;

    public ChiSquareTestImpl_setDistribution_202295583335() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term389 = newInstance(Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        Object term390 = newInstance(Class.forName("org.apache.commons.math.distribution.ChiSquaredDistributionImpl"));
        Object term391 = newInstance(Class.forName("org.apache.commons.math.distribution.GammaDistributionImpl"));
        setDoubleField(term391, term391.getClass(), "alpha", 0.5);
        setDoubleField(term391, term391.getClass(), "beta", 2.0);
        setField(term390, term390.getClass(), "gamma", term391);
        setField(term389, term389.getClass(), "distribution", term390);
        term3774 = newInstance(Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        setField(term3774, term3774.getClass(), "distribution", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.distribution.ChiSquaredDistribution");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setDistribution", argTypes, term389, args);
        assertTrue(recursiveEquals(term389, term3774));
    }

};


