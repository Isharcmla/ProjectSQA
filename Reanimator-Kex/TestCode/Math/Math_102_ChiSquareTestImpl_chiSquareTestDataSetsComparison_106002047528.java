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
import java.lang.Double;

public class ChiSquareTestImpl_chiSquareTestDataSetsComparison_106002047528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term208;
     Object term213;
     Object term215;
     Object term225;

    public ChiSquareTestImpl_chiSquareTestDataSetsComparison_106002047528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term208 = newInstance(Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        Object term209 = newInstance(Class.forName("org.apache.commons.math.distribution.ChiSquaredDistributionImpl"));
        Object term210 = newInstance(Class.forName("org.apache.commons.math.distribution.GammaDistributionImpl"));
        setDoubleField(term210, term210.getClass(), "alpha", 0.5);
        setDoubleField(term210, term210.getClass(), "beta", 2.0);
        setField(term209, term209.getClass(), "gamma", term210);
        setField(term208, term208.getClass(), "distribution", term209);
        term213 = (long[]) newLongArray(1);
        setLongElement(term213, 0, 2443640364875054177L);
        term215 = (long[]) newLongArray(9);
        setLongElement(term215, 0, -1610676979013636850L);
        setLongElement(term215, 1, 2062173786000223358L);
        setLongElement(term215, 2, -8658027316505137504L);
        setLongElement(term215, 3, 414749984815662075L);
        setLongElement(term215, 4, 463622836963501975L);
        setLongElement(term215, 5, 305759998609888272L);
        setLongElement(term215, 6, -8654565919063661957L);
        setLongElement(term215, 7, -5248475803419977214L);
        setLongElement(term215, 8, -6723783499250797216L);
        term225 = new Double(0.5183269973490326);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(long.class, 0).getClass();
        argTypes[1] = Array.newInstance(long.class, 0).getClass();
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = term213;
        args[1] = term215;
        args[2] = term225;
        try {
            callMethod(klass, "chiSquareTestDataSetsComparison", argTypes, term208, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


