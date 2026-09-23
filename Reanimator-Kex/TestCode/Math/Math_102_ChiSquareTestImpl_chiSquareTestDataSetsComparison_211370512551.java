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
import java.lang.Object;

public class ChiSquareTestImpl_chiSquareTestDataSetsComparison_211370512551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16732;
     Object term16311;
     Object term16444;

    public ChiSquareTestImpl_chiSquareTestDataSetsComparison_211370512551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16732 = newInstance(Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        Object term16864 = newInstance(Class.forName("org.apache.commons.math.distribution.ChiSquaredDistributionImpl"));
        Object term16986 = newInstance(Class.forName("org.apache.commons.math.distribution.GammaDistributionImpl"));
        setDoubleField(term16986, term16986.getClass(), "alpha", 0.0);
        setField(term16864, term16864.getClass(), "gamma", term16986);
        setField(term16732, term16732.getClass(), "distribution", term16864);
        term16311 = (long[]) newLongArray(132);
        term16444 = (long[]) newLongArray(132);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(long.class, 0).getClass();
        argTypes[1] = Array.newInstance(long.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term16311;
        args[1] = term16444;
        callMethod(klass, "chiSquareTestDataSetsComparison", argTypes, term16732, args);
    }

};


