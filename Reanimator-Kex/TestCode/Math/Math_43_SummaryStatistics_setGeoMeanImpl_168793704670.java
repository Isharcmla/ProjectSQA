package org.apache.commons.math.stat.descriptive;

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
import org.apache.commons.math.exception.MathIllegalStateException;
import static org.apache.commons.math.stat.descriptive.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class SummaryStatistics_setGeoMeanImpl_168793704670 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term874;

    public SummaryStatistics_setGeoMeanImpl_168793704670() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term874 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term876 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term882 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term885 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term888 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term891 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term894 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term897 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term898 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term900 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term874, term874.getClass(), "n", 6855071767938501807L);
        setDoubleField(term876, term876.getClass(), "m2", Double.NaN);
        setLongField(term876, term876.getClass(), "n", 0L);
        setDoubleField(term876, term876.getClass(), "m1", Double.NaN);
        setDoubleField(term876, term876.getClass(), "dev", Double.NaN);
        setDoubleField(term876, term876.getClass(), "nDev", Double.NaN);
        setField(term876, term876.getClass(), "storedData", null);
        setField(term874, term874.getClass(), "secondMoment", term876);
        setLongField(term882, term882.getClass(), "n", 0L);
        setDoubleField(term882, term882.getClass(), "value", 0.0);
        setField(term882, term882.getClass(), "storedData", null);
        setField(term874, term874.getClass(), "sum", term882);
        setLongField(term885, term885.getClass(), "n", 0L);
        setDoubleField(term885, term885.getClass(), "value", 0.0);
        setField(term885, term885.getClass(), "storedData", null);
        setField(term874, term874.getClass(), "sumsq", term885);
        setLongField(term888, term888.getClass(), "n", 0L);
        setDoubleField(term888, term888.getClass(), "value", Double.NaN);
        setField(term888, term888.getClass(), "storedData", null);
        setField(term874, term874.getClass(), "min", term888);
        setLongField(term891, term891.getClass(), "n", 0L);
        setDoubleField(term891, term891.getClass(), "value", Double.NaN);
        setField(term891, term891.getClass(), "storedData", null);
        setField(term874, term874.getClass(), "max", term891);
        setIntField(term894, term894.getClass(), "n", 0);
        setDoubleField(term894, term894.getClass(), "value", 0.0);
        setField(term894, term894.getClass(), "storedData", null);
        setField(term874, term874.getClass(), "sumLog", term894);
        setField(term897, term897.getClass(), "sumOfLogs", term894);
        setField(term897, term897.getClass(), "storedData", null);
        setField(term874, term874.getClass(), "geoMean", term897);
        setField(term898, term898.getClass(), "moment", term876);
        setBooleanField(term898, term898.getClass(), "incMoment", false);
        setField(term898, term898.getClass(), "storedData", null);
        setField(term874, term874.getClass(), "mean", term898);
        setField(term900, term900.getClass(), "moment", term876);
        setBooleanField(term900, term900.getClass(), "incMoment", false);
        setBooleanField(term900, term900.getClass(), "isBiasCorrected", true);
        setField(term900, term900.getClass(), "storedData", null);
        setField(term874, term874.getClass(), "variance", term900);
        setField(term874, term874.getClass(), "sumImpl", term882);
        setField(term874, term874.getClass(), "sumsqImpl", term885);
        setField(term874, term874.getClass(), "minImpl", term888);
        setField(term874, term874.getClass(), "maxImpl", term891);
        setField(term874, term874.getClass(), "sumLogImpl", term894);
        setField(term874, term874.getClass(), "geoMeanImpl", term897);
        setField(term874, term874.getClass(), "meanImpl", term898);
        setField(term874, term874.getClass(), "varianceImpl", term900);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "setGeoMeanImpl", argTypes, term874, args);
            assertTrue(false);
        }
        catch (MathIllegalStateException e) {
        }

    }

};


