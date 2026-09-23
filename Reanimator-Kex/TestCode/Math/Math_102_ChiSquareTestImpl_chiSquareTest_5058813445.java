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

public class ChiSquareTestImpl_chiSquareTest_5058813445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8814;
     Object term8532;

    public ChiSquareTestImpl_chiSquareTest_5058813445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8814 = newInstance(Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        Object term8946 = newInstance(Class.forName("org.apache.commons.math.distribution.ChiSquaredDistributionImpl"));
        Object term9068 = newInstance(Class.forName("org.apache.commons.math.distribution.GammaDistributionImpl"));
        setField(term8946, term8946.getClass(), "gamma", term9068);
        setField(term8814, term8814.getClass(), "distribution", term8946);
        term8532 = (double[]) newDoubleArray(128);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(long.class, 0).getClass();
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term8532;
        args[1] = null;
        args[2] = 4.815640271476609E-299;
        callMethod(klass, "chiSquareTest", argTypes, term8814, args);
    }

};


