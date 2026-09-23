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
import java.lang.Object;
import java.lang.Integer;

public class HypergeometricDistribution_innerCumulativeProbability_103825597311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107;
     Object term115;
     Object term117;
     Object term119;

    public HypergeometricDistribution_innerCumulativeProbability_103825597311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107 = newInstance(Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution"));
        Object term113 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataImpl"));
        Object term114 = newInstance(Class.forName("org.apache.commons.math3.random.RandomDataGenerator"));
        setIntField(term107, term107.getClass(), "numberOfSuccesses", 1876565163);
        setIntField(term107, term107.getClass(), "populationSize", -817164822);
        setIntField(term107, term107.getClass(), "sampleSize", -1016503459);
        setDoubleField(term107, term107.getClass(), "numericalVariance", 0.37773193782763337);
        setBooleanField(term107, term107.getClass(), "numericalVarianceIsCalculated", true);
        setField(term114, term114.getClass(), "rand", null);
        setField(term114, term114.getClass(), "secRand", null);
        setField(term113, term113.getClass(), "delegate", term114);
        setField(term107, term107.getClass(), "randomData", term113);
        setField(term107, term107.getClass(), "random", null);
        term115 = new Integer(-1968847291);
        term117 = new Integer(579005622);
        term119 = new Integer(-14890619);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.distribution.HypergeometricDistribution");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term115;
        args[1] = term117;
        args[2] = term119;
        callMethod(klass, "innerCumulativeProbability", argTypes, term107, args);
    }

};


