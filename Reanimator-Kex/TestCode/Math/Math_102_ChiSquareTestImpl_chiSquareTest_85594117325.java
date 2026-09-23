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

public class ChiSquareTestImpl_chiSquareTest_85594117325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123;
     Object term128;
     Object term145;

    public ChiSquareTestImpl_chiSquareTest_85594117325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123 = newInstance(Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl"));
        Object term124 = newInstance(Class.forName("org.apache.commons.math.distribution.ChiSquaredDistributionImpl"));
        Object term125 = newInstance(Class.forName("org.apache.commons.math.distribution.GammaDistributionImpl"));
        setDoubleField(term125, term125.getClass(), "alpha", 0.5);
        setDoubleField(term125, term125.getClass(), "beta", 2.0);
        setField(term124, term124.getClass(), "gamma", term125);
        setField(term123, term123.getClass(), "distribution", term124);
        term128 = (Object[]) newArray("[J", 5);
        long[] term129 = (long[]) newLongArray(5);
        long[] term135 = (long[]) newLongArray(2);
        long[] term138 = (long[]) newLongArray(3);
        long[] term142 = (long[]) newLongArray(1);
        long[] term144 = (long[]) newLongArray(0);
        setLongElement(term129, 0, -6823727938421990489L);
        setLongElement(term129, 1, -484994522244390100L);
        setLongElement(term129, 2, 1233889271256172047L);
        setLongElement(term129, 3, 6617340557564669657L);
        setLongElement(term129, 4, 1439298019805881866L);
        setElement(term128, 0, term129);
        setLongElement(term135, 0, -8708192233349544946L);
        setLongElement(term135, 1, 5907001541142728739L);
        setElement(term128, 1, term135);
        setLongElement(term138, 0, 4178434741742309755L);
        setLongElement(term138, 1, -2068172595987555756L);
        setLongElement(term138, 2, -6292278961887936280L);
        setElement(term128, 2, term138);
        setLongElement(term142, 0, -6645965768855543712L);
        setElement(term128, 3, term142);
        setElement(term128, 4, term144);
        term145 = new Double(0.8474802076607362);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.inference.ChiSquareTestImpl");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Array.newInstance(long.class, 0).getClass(), 0).getClass();
        argTypes[1] = double.class;
        Object[] args = new Object[2];
        args[0] = term128;
        args[1] = term145;
        try {
            callMethod(klass, "chiSquareTest", argTypes, term123, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


