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

public class ChiSquareTestImpl_chiSquareTestDataSetsComparison_211370512577 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31077;
     Object term30930;

    public ChiSquareTestImpl_chiSquareTestDataSetsComparison_211370512577() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31077 = newInstance(Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        Object term31209 = newInstance(Class.forName("org.apache.commons.math.distribution.ChiSquaredDistributionImpl"));
        Object term31331 = newInstance(Class.forName("org.apache.commons.math.distribution.GammaDistributionImpl"));
        setField(term31209, term31209.getClass(), "gamma", term31331);
        setField(term31077, term31077.getClass(), "distribution", term31209);
        term30930 = (long[]) newLongArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(long.class, 0).getClass();
        argTypes[1] = Array.newInstance(long.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term30930;
        args[1] = null;
        callMethod(klass, "chiSquareTestDataSetsComparison", argTypes, term31077, args);
    }

};


