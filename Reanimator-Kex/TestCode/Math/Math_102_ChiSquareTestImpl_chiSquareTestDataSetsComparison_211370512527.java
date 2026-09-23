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

public class ChiSquareTestImpl_chiSquareTestDataSetsComparison_211370512527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term185;
     Object term190;
     Object term197;

    public ChiSquareTestImpl_chiSquareTestDataSetsComparison_211370512527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term185 = newInstance(Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        Object term186 = newInstance(Class.forName("org.apache.commons.math.distribution.ChiSquaredDistributionImpl"));
        Object term187 = newInstance(Class.forName("org.apache.commons.math.distribution.GammaDistributionImpl"));
        setDoubleField(term187, term187.getClass(), "alpha", 0.5);
        setDoubleField(term187, term187.getClass(), "beta", 2.0);
        setField(term186, term186.getClass(), "gamma", term187);
        setField(term185, term185.getClass(), "distribution", term186);
        term190 = (long[]) newLongArray(6);
        setLongElement(term190, 0, -2644215923136513282L);
        setLongElement(term190, 1, -1468719814009985452L);
        setLongElement(term190, 2, -7738503207562305297L);
        setLongElement(term190, 3, 3825396310311739952L);
        setLongElement(term190, 4, -3838084482494604218L);
        setLongElement(term190, 5, 3892018155439224435L);
        term197 = (long[]) newLongArray(2);
        setLongElement(term197, 0, 5953383087795962419L);
        setLongElement(term197, 1, 7994303628307559416L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(long.class, 0).getClass();
        argTypes[1] = Array.newInstance(long.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term190;
        args[1] = term197;
        try {
            callMethod(klass, "chiSquareTestDataSetsComparison", argTypes, term185, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


