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

public class SummaryStatistics_setSumLogImpl_52489694568 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term816;

    public SummaryStatistics_setSumLogImpl_52489694568() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term816 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term818 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term824 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term827 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term830 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term833 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term836 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term839 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term840 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term842 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term816, term816.getClass(), "n", 1967728129628047933L);
        setDoubleField(term818, term818.getClass(), "m2", Double.NaN);
        setLongField(term818, term818.getClass(), "n", 0L);
        setDoubleField(term818, term818.getClass(), "m1", Double.NaN);
        setDoubleField(term818, term818.getClass(), "dev", Double.NaN);
        setDoubleField(term818, term818.getClass(), "nDev", Double.NaN);
        setField(term818, term818.getClass(), "storedData", null);
        setField(term816, term816.getClass(), "secondMoment", term818);
        setLongField(term824, term824.getClass(), "n", 0L);
        setDoubleField(term824, term824.getClass(), "value", 0.0);
        setField(term824, term824.getClass(), "storedData", null);
        setField(term816, term816.getClass(), "sum", term824);
        setLongField(term827, term827.getClass(), "n", 0L);
        setDoubleField(term827, term827.getClass(), "value", 0.0);
        setField(term827, term827.getClass(), "storedData", null);
        setField(term816, term816.getClass(), "sumsq", term827);
        setLongField(term830, term830.getClass(), "n", 0L);
        setDoubleField(term830, term830.getClass(), "value", Double.NaN);
        setField(term830, term830.getClass(), "storedData", null);
        setField(term816, term816.getClass(), "min", term830);
        setLongField(term833, term833.getClass(), "n", 0L);
        setDoubleField(term833, term833.getClass(), "value", Double.NaN);
        setField(term833, term833.getClass(), "storedData", null);
        setField(term816, term816.getClass(), "max", term833);
        setIntField(term836, term836.getClass(), "n", 0);
        setDoubleField(term836, term836.getClass(), "value", 0.0);
        setField(term836, term836.getClass(), "storedData", null);
        setField(term816, term816.getClass(), "sumLog", term836);
        setField(term839, term839.getClass(), "sumOfLogs", term836);
        setField(term839, term839.getClass(), "storedData", null);
        setField(term816, term816.getClass(), "geoMean", term839);
        setField(term840, term840.getClass(), "moment", term818);
        setBooleanField(term840, term840.getClass(), "incMoment", false);
        setField(term840, term840.getClass(), "storedData", null);
        setField(term816, term816.getClass(), "mean", term840);
        setField(term842, term842.getClass(), "moment", term818);
        setBooleanField(term842, term842.getClass(), "incMoment", false);
        setBooleanField(term842, term842.getClass(), "isBiasCorrected", true);
        setField(term842, term842.getClass(), "storedData", null);
        setField(term816, term816.getClass(), "variance", term842);
        setField(term816, term816.getClass(), "sumImpl", term824);
        setField(term816, term816.getClass(), "sumsqImpl", term827);
        setField(term816, term816.getClass(), "minImpl", term830);
        setField(term816, term816.getClass(), "maxImpl", term833);
        setField(term816, term816.getClass(), "sumLogImpl", term836);
        setField(term816, term816.getClass(), "geoMeanImpl", term839);
        setField(term816, term816.getClass(), "meanImpl", term840);
        setField(term816, term816.getClass(), "varianceImpl", term842);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "setSumLogImpl", argTypes, term816, args);
            assertTrue(false);
        }
        catch (MathIllegalStateException e) {
        }

    }

};


