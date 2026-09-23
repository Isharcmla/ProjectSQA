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
import static org.apache.commons.math.stat.descriptive.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.stat.descriptive.EqualityUtils.*;
import java.lang.Object;
import java.lang.Double;

public class SummaryStatistics_getSecondMoment_19298412354 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term409;
     Object term2917;

    public SummaryStatistics_getSecondMoment_19298412354() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term409 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term411 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term417 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term420 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term423 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term426 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term429 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term432 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term433 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term435 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term409, term409.getClass(), "n", -5476826692763582090L);
        setDoubleField(term411, term411.getClass(), "m2", Double.NaN);
        setLongField(term411, term411.getClass(), "n", 0L);
        setDoubleField(term411, term411.getClass(), "m1", Double.NaN);
        setDoubleField(term411, term411.getClass(), "dev", Double.NaN);
        setDoubleField(term411, term411.getClass(), "nDev", Double.NaN);
        setField(term411, term411.getClass(), "storedData", null);
        setField(term409, term409.getClass(), "secondMoment", term411);
        setLongField(term417, term417.getClass(), "n", 0L);
        setDoubleField(term417, term417.getClass(), "value", 0.0);
        setField(term417, term417.getClass(), "storedData", null);
        setField(term409, term409.getClass(), "sum", term417);
        setLongField(term420, term420.getClass(), "n", 0L);
        setDoubleField(term420, term420.getClass(), "value", 0.0);
        setField(term420, term420.getClass(), "storedData", null);
        setField(term409, term409.getClass(), "sumsq", term420);
        setLongField(term423, term423.getClass(), "n", 0L);
        setDoubleField(term423, term423.getClass(), "value", Double.NaN);
        setField(term423, term423.getClass(), "storedData", null);
        setField(term409, term409.getClass(), "min", term423);
        setLongField(term426, term426.getClass(), "n", 0L);
        setDoubleField(term426, term426.getClass(), "value", Double.NaN);
        setField(term426, term426.getClass(), "storedData", null);
        setField(term409, term409.getClass(), "max", term426);
        setIntField(term429, term429.getClass(), "n", 0);
        setDoubleField(term429, term429.getClass(), "value", 0.0);
        setField(term429, term429.getClass(), "storedData", null);
        setField(term409, term409.getClass(), "sumLog", term429);
        setField(term432, term432.getClass(), "sumOfLogs", term429);
        setField(term432, term432.getClass(), "storedData", null);
        setField(term409, term409.getClass(), "geoMean", term432);
        setField(term433, term433.getClass(), "moment", term411);
        setBooleanField(term433, term433.getClass(), "incMoment", false);
        setField(term433, term433.getClass(), "storedData", null);
        setField(term409, term409.getClass(), "mean", term433);
        setField(term435, term435.getClass(), "moment", term411);
        setBooleanField(term435, term435.getClass(), "incMoment", false);
        setBooleanField(term435, term435.getClass(), "isBiasCorrected", true);
        setField(term435, term435.getClass(), "storedData", null);
        setField(term409, term409.getClass(), "variance", term435);
        setField(term409, term409.getClass(), "sumImpl", term417);
        setField(term409, term409.getClass(), "sumsqImpl", term420);
        setField(term409, term409.getClass(), "minImpl", term423);
        setField(term409, term409.getClass(), "maxImpl", term426);
        setField(term409, term409.getClass(), "sumLogImpl", term429);
        setField(term409, term409.getClass(), "geoMeanImpl", term432);
        setField(term409, term409.getClass(), "meanImpl", term433);
        setField(term409, term409.getClass(), "varianceImpl", term435);
        term2917 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term2918 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term2919 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term2920 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term2921 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term2922 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term2923 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term2924 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term2925 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term2926 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term2917, term2917.getClass(), "n", -5476826692763582090L);
        setDoubleField(term2918, term2918.getClass(), "m2", Double.NaN);
        setLongField(term2918, term2918.getClass(), "n", 0L);
        setDoubleField(term2918, term2918.getClass(), "m1", Double.NaN);
        setDoubleField(term2918, term2918.getClass(), "dev", Double.NaN);
        setDoubleField(term2918, term2918.getClass(), "nDev", Double.NaN);
        setField(term2918, term2918.getClass(), "storedData", null);
        setField(term2917, term2917.getClass(), "secondMoment", term2918);
        setLongField(term2919, term2919.getClass(), "n", 0L);
        setDoubleField(term2919, term2919.getClass(), "value", 0.0);
        setField(term2919, term2919.getClass(), "storedData", null);
        setField(term2917, term2917.getClass(), "sum", term2919);
        setLongField(term2920, term2920.getClass(), "n", 0L);
        setDoubleField(term2920, term2920.getClass(), "value", 0.0);
        setField(term2920, term2920.getClass(), "storedData", null);
        setField(term2917, term2917.getClass(), "sumsq", term2920);
        setLongField(term2921, term2921.getClass(), "n", 0L);
        setDoubleField(term2921, term2921.getClass(), "value", Double.NaN);
        setField(term2921, term2921.getClass(), "storedData", null);
        setField(term2917, term2917.getClass(), "min", term2921);
        setLongField(term2922, term2922.getClass(), "n", 0L);
        setDoubleField(term2922, term2922.getClass(), "value", Double.NaN);
        setField(term2922, term2922.getClass(), "storedData", null);
        setField(term2917, term2917.getClass(), "max", term2922);
        setIntField(term2923, term2923.getClass(), "n", 0);
        setDoubleField(term2923, term2923.getClass(), "value", 0.0);
        setField(term2923, term2923.getClass(), "storedData", null);
        setField(term2917, term2917.getClass(), "sumLog", term2923);
        setField(term2924, term2924.getClass(), "sumOfLogs", term2923);
        setField(term2924, term2924.getClass(), "storedData", null);
        setField(term2917, term2917.getClass(), "geoMean", term2924);
        setField(term2925, term2925.getClass(), "moment", term2918);
        setBooleanField(term2925, term2925.getClass(), "incMoment", false);
        setField(term2925, term2925.getClass(), "storedData", null);
        setField(term2917, term2917.getClass(), "mean", term2925);
        setField(term2926, term2926.getClass(), "moment", term2918);
        setBooleanField(term2926, term2926.getClass(), "incMoment", false);
        setBooleanField(term2926, term2926.getClass(), "isBiasCorrected", true);
        setField(term2926, term2926.getClass(), "storedData", null);
        setField(term2917, term2917.getClass(), "variance", term2926);
        setField(term2917, term2917.getClass(), "sumImpl", term2919);
        setField(term2917, term2917.getClass(), "sumsqImpl", term2920);
        setField(term2917, term2917.getClass(), "minImpl", term2921);
        setField(term2917, term2917.getClass(), "maxImpl", term2922);
        setField(term2917, term2917.getClass(), "sumLogImpl", term2923);
        setField(term2917, term2917.getClass(), "geoMeanImpl", term2924);
        setField(term2917, term2917.getClass(), "meanImpl", term2925);
        setField(term2917, term2917.getClass(), "varianceImpl", term2926);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getSecondMoment", argTypes, term409, args);
        assertTrue(recursiveEquals(term409, term2917));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};


