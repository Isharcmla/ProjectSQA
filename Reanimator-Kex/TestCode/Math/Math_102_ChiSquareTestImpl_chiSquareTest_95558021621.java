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
import java.lang.IllegalArgumentException;
import static org.apache.commons.math.stat.inference.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ChiSquareTestImpl_chiSquareTest_95558021621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26;
     Object term31;
     Object term35;

    public ChiSquareTestImpl_chiSquareTest_95558021621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26 = newInstance(Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        Object term27 = newInstance(Class.forName("org.apache.commons.math.distribution.ChiSquaredDistributionImpl"));
        Object term28 = newInstance(Class.forName("org.apache.commons.math.distribution.GammaDistributionImpl"));
        setDoubleField(term28, term28.getClass(), "alpha", 0.5);
        setDoubleField(term28, term28.getClass(), "beta", 2.0);
        setField(term27, term27.getClass(), "gamma", term28);
        setField(term26, term26.getClass(), "distribution", term27);
        term31 = (double[]) newDoubleArray(3);
        setDoubleElement(term31, 0, 0.40176586625454525);
        setDoubleElement(term31, 1, 0.2641345529914265);
        setDoubleElement(term31, 2, 0.36923381893433327);
        term35 = (long[]) newLongArray(4);
        setLongElement(term35, 0, 5270370404989704783L);
        setLongElement(term35, 1, 7411271909051562686L);
        setLongElement(term35, 2, 4872422362414183754L);
        setLongElement(term35, 3, 6811161968424632369L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(long.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term31;
        args[1] = term35;
        try {
            callMethod(klass, "chiSquareTest", argTypes, term26, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


