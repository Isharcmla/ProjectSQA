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

public class ChiSquareTestImpl_chiSquareTest_197989288924 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104;
     Object term109;

    public ChiSquareTestImpl_chiSquareTest_197989288924() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104 = newInstance(Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        Object term105 = newInstance(Class.forName("org.apache.commons.math.distribution.ChiSquaredDistributionImpl"));
        Object term106 = newInstance(Class.forName("org.apache.commons.math.distribution.GammaDistributionImpl"));
        setDoubleField(term106, term106.getClass(), "alpha", 0.5);
        setDoubleField(term106, term106.getClass(), "beta", 2.0);
        setField(term105, term105.getClass(), "gamma", term106);
        setField(term104, term104.getClass(), "distribution", term105);
        term109 = (Object[]) newArray("[J", 1);
        long[] term110 = (long[]) newLongArray(6);
        setLongElement(term110, 0, -4502405999831680926L);
        setLongElement(term110, 1, 1967728129628047933L);
        setLongElement(term110, 2, 2120084523938730454L);
        setLongElement(term110, 3, 6855071767938501807L);
        setLongElement(term110, 4, -5892135042702373494L);
        setLongElement(term110, 5, 5262507301787091109L);
        setElement(term109, 0, term110);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Array.newInstance(long.class, 0).getClass(), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term109;
        try {
            callMethod(klass, "chiSquareTest", argTypes, term104, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


