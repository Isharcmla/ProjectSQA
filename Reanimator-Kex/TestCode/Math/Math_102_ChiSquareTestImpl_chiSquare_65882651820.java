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

public class ChiSquareTestImpl_chiSquare_65882651820 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term6;
     Object term12;

    public ChiSquareTestImpl_chiSquare_65882651820() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        Object term2 = newInstance(Class.forName("org.apache.commons.math.distribution.ChiSquaredDistributionImpl"));
        Object term3 = newInstance(Class.forName("org.apache.commons.math.distribution.GammaDistributionImpl"));
        setDoubleField(term3, term3.getClass(), "alpha", 0.5);
        setDoubleField(term3, term3.getClass(), "beta", 2.0);
        setField(term2, term2.getClass(), "gamma", term3);
        setField(term1, term1.getClass(), "distribution", term2);
        term6 = (double[]) newDoubleArray(5);
        setDoubleElement(term6, 0, 0.13238746331190498);
        setDoubleElement(term6, 1, 0.3455959125047594);
        setDoubleElement(term6, 2, 0.5523635872663106);
        setDoubleElement(term6, 3, 0.544608645520025);
        setDoubleElement(term6, 4, 0.28570734989730284);
        term12 = (long[]) newLongArray(4);
        setLongElement(term12, 0, 2442117782898005296L);
        setLongElement(term12, 1, 6375119433582206027L);
        setLongElement(term12, 2, -8257434502486459194L);
        setLongElement(term12, 3, -8400487765614892086L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        argTypes[1] = Array.newInstance(long.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term6;
        args[1] = term12;
        try {
            callMethod(klass, "chiSquare", argTypes, term1, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


