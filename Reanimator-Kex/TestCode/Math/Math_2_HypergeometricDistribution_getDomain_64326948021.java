package org.apache.commons.math3.distribution;

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
import static org.apache.commons.math3.distribution.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.distribution.EqualityUtils.*;
import java.lang.Object;
import java.lang.Integer;

public class HypergeometricDistribution_getDomain_64326948021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;
     Object term31;
     Object term33;
     Object term35;
     Object term959;
     Object term956;

    public HypergeometricDistribution_getDomain_64326948021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23 = newInstance(Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        Object term29 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataImpl"));
        Object term30 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataGenerator"));
        setIntField(term23, term23.getClass(), "numberOfSuccesses", 1725571209);
        setIntField(term23, term23.getClass(), "populationSize", -522618178);
        setIntField(term23, term23.getClass(), "sampleSize", 1134449235);
        setDoubleField(term23, term23.getClass(), "numericalVariance", 0.3455959125047594);
        setBooleanField(term23, term23.getClass(), "numericalVarianceIsCalculated", false);
        setField(term30, term30.getClass(), "rand", null);
        setField(term30, term30.getClass(), "secRand", null);
        setField(term29, term29.getClass(), "delegate", term30);
        setField(term23, term23.getClass(), "randomData", term29);
        setField(term23, term23.getClass(), "random", null);
        term31 = new Integer(-883034806);
        term33 = new Integer(1585847225);
        term35 = new Integer(597278769);
        term959 = newInstance(Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        Object term960 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataImpl"));
        Object term961 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataGenerator"));
        setIntField(term959, term959.getClass(), "numberOfSuccesses", 1725571209);
        setIntField(term959, term959.getClass(), "populationSize", -522618178);
        setIntField(term959, term959.getClass(), "sampleSize", 1134449235);
        setDoubleField(term959, term959.getClass(), "numericalVariance", 0.3455959125047594);
        setBooleanField(term959, term959.getClass(), "numericalVarianceIsCalculated", false);
        setField(term961, term961.getClass(), "rand", null);
        setField(term961, term961.getClass(), "secRand", null);
        setField(term960, term960.getClass(), "delegate", term961);
        setField(term959, term959.getClass(), "randomData", term960);
        setField(term959, term959.getClass(), "random", null);
        term956 = (int[]) newIntArray(2);
        setIntElement(term956, 1, 597278769);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term31;
        args[1] = term33;
        args[2] = term35;
        Object retValue = callMethod(klass, "getDomain", argTypes, term23, args);
        assertTrue(recursiveEquals(term23, term959));
        assertTrue(recursiveEquals(term31, -883034806));
        assertTrue(recursiveEquals(term33, 1585847225));
        assertTrue(recursiveEquals(term35, 597278769));
        assertTrue(recursiveEquals(retValue, term956));
    }

};


