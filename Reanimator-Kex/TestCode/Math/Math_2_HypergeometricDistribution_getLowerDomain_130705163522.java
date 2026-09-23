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

public class HypergeometricDistribution_getLowerDomain_130705163522 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37;
     Object term45;
     Object term47;
     Object term49;
     Object term978;

    public HypergeometricDistribution_getLowerDomain_130705163522() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37 = newInstance(Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        Object term43 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataImpl"));
        Object term44 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataGenerator"));
        setIntField(term37, term37.getClass(), "numberOfSuccesses", -1685132342);
        setIntField(term37, term37.getClass(), "populationSize", -1456670397);
        setIntField(term37, term37.getClass(), "sampleSize", 1622346318);
        setDoubleField(term37, term37.getClass(), "numericalVariance", 0.5523635872663106);
        setBooleanField(term37, term37.getClass(), "numericalVarianceIsCalculated", false);
        setField(term44, term44.getClass(), "rand", null);
        setField(term44, term44.getClass(), "secRand", null);
        setField(term43, term43.getClass(), "delegate", term44);
        setField(term37, term37.getClass(), "randomData", term43);
        setField(term37, term37.getClass(), "random", null);
        term45 = new Integer(1048535127);
        term47 = new Integer(-655067527);
        term49 = new Integer(-6029667);
        term978 = newInstance(Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        Object term979 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataImpl"));
        Object term980 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataGenerator"));
        setIntField(term978, term978.getClass(), "numberOfSuccesses", -1685132342);
        setIntField(term978, term978.getClass(), "populationSize", -1456670397);
        setIntField(term978, term978.getClass(), "sampleSize", 1622346318);
        setDoubleField(term978, term978.getClass(), "numericalVariance", 0.5523635872663106);
        setBooleanField(term978, term978.getClass(), "numericalVarianceIsCalculated", false);
        setField(term980, term980.getClass(), "rand", null);
        setField(term980, term980.getClass(), "secRand", null);
        setField(term979, term979.getClass(), "delegate", term980);
        setField(term978, term978.getClass(), "randomData", term979);
        setField(term978, term978.getClass(), "random", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term45;
        args[1] = term47;
        args[2] = term49;
        Object retValue = callMethod(klass, "getLowerDomain", argTypes, term37, args);
        assertTrue(recursiveEquals(term37, term978));
        assertTrue(recursiveEquals(term45, 1048535127));
        assertTrue(recursiveEquals(term47, -655067527));
        assertTrue(recursiveEquals(term49, -6029667));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


