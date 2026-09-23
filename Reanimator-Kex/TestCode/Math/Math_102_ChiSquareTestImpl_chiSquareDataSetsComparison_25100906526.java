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

public class ChiSquareTestImpl_chiSquareDataSetsComparison_25100906526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158;
     Object term163;
     Object term166;

    public ChiSquareTestImpl_chiSquareDataSetsComparison_25100906526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term158 = newInstance(Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        Object term159 = newInstance(Class.forName("org.apache.commons.math.distribution.ChiSquaredDistributionImpl"));
        Object term160 = newInstance(Class.forName("org.apache.commons.math.distribution.GammaDistributionImpl"));
        setDoubleField(term160, term160.getClass(), "alpha", 0.5);
        setDoubleField(term160, term160.getClass(), "beta", 2.0);
        setField(term159, term159.getClass(), "gamma", term160);
        setField(term158, term158.getClass(), "distribution", term159);
        term163 = (long[]) newLongArray(2);
        setLongElement(term163, 0, 4784595517102746672L);
        setLongElement(term163, 1, -7612550318181586304L);
        term166 = (long[]) newLongArray(8);
        setLongElement(term166, 0, -2170847986967241072L);
        setLongElement(term166, 1, 4044358158040652353L);
        setLongElement(term166, 2, -4443169559037975007L);
        setLongElement(term166, 3, -3842548265506930260L);
        setLongElement(term166, 4, -5788180182343976541L);
        setLongElement(term166, 5, 2936323121573284007L);
        setLongElement(term166, 6, -1154553077993834885L);
        setLongElement(term166, 7, -2850532706972744550L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(long.class, 0).getClass();
        argTypes[1] = Array.newInstance(long.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term163;
        args[1] = term166;
        try {
            callMethod(klass, "chiSquareDataSetsComparison", argTypes, term158, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


