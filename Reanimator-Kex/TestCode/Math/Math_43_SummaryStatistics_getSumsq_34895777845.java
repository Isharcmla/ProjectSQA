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

public class SummaryStatistics_getSumsq_34895777845 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148;
     Object term2498;

    public SummaryStatistics_getSumsq_34895777845() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term150 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term156 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term159 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term162 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term165 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term168 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term171 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term172 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term174 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term148, term148.getClass(), "n", 7411271909051562686L);
        setDoubleField(term150, term150.getClass(), "m2", Double.NaN);
        setLongField(term150, term150.getClass(), "n", 0L);
        setDoubleField(term150, term150.getClass(), "m1", Double.NaN);
        setDoubleField(term150, term150.getClass(), "dev", Double.NaN);
        setDoubleField(term150, term150.getClass(), "nDev", Double.NaN);
        setField(term150, term150.getClass(), "storedData", null);
        setField(term148, term148.getClass(), "secondMoment", term150);
        setLongField(term156, term156.getClass(), "n", 0L);
        setDoubleField(term156, term156.getClass(), "value", 0.0);
        setField(term156, term156.getClass(), "storedData", null);
        setField(term148, term148.getClass(), "sum", term156);
        setLongField(term159, term159.getClass(), "n", 0L);
        setDoubleField(term159, term159.getClass(), "value", 0.0);
        setField(term159, term159.getClass(), "storedData", null);
        setField(term148, term148.getClass(), "sumsq", term159);
        setLongField(term162, term162.getClass(), "n", 0L);
        setDoubleField(term162, term162.getClass(), "value", Double.NaN);
        setField(term162, term162.getClass(), "storedData", null);
        setField(term148, term148.getClass(), "min", term162);
        setLongField(term165, term165.getClass(), "n", 0L);
        setDoubleField(term165, term165.getClass(), "value", Double.NaN);
        setField(term165, term165.getClass(), "storedData", null);
        setField(term148, term148.getClass(), "max", term165);
        setIntField(term168, term168.getClass(), "n", 0);
        setDoubleField(term168, term168.getClass(), "value", 0.0);
        setField(term168, term168.getClass(), "storedData", null);
        setField(term148, term148.getClass(), "sumLog", term168);
        setField(term171, term171.getClass(), "sumOfLogs", term168);
        setField(term171, term171.getClass(), "storedData", null);
        setField(term148, term148.getClass(), "geoMean", term171);
        setField(term172, term172.getClass(), "moment", term150);
        setBooleanField(term172, term172.getClass(), "incMoment", false);
        setField(term172, term172.getClass(), "storedData", null);
        setField(term148, term148.getClass(), "mean", term172);
        setField(term174, term174.getClass(), "moment", term150);
        setBooleanField(term174, term174.getClass(), "incMoment", false);
        setBooleanField(term174, term174.getClass(), "isBiasCorrected", true);
        setField(term174, term174.getClass(), "storedData", null);
        setField(term148, term148.getClass(), "variance", term174);
        setField(term148, term148.getClass(), "sumImpl", term156);
        setField(term148, term148.getClass(), "sumsqImpl", term159);
        setField(term148, term148.getClass(), "minImpl", term162);
        setField(term148, term148.getClass(), "maxImpl", term165);
        setField(term148, term148.getClass(), "sumLogImpl", term168);
        setField(term148, term148.getClass(), "geoMeanImpl", term171);
        setField(term148, term148.getClass(), "meanImpl", term172);
        setField(term148, term148.getClass(), "varianceImpl", term174);
        term2498 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term2499 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term2500 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term2501 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term2502 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term2503 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term2504 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term2505 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term2506 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term2507 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term2498, term2498.getClass(), "n", 7411271909051562686L);
        setDoubleField(term2499, term2499.getClass(), "m2", Double.NaN);
        setLongField(term2499, term2499.getClass(), "n", 0L);
        setDoubleField(term2499, term2499.getClass(), "m1", Double.NaN);
        setDoubleField(term2499, term2499.getClass(), "dev", Double.NaN);
        setDoubleField(term2499, term2499.getClass(), "nDev", Double.NaN);
        setField(term2499, term2499.getClass(), "storedData", null);
        setField(term2498, term2498.getClass(), "secondMoment", term2499);
        setLongField(term2500, term2500.getClass(), "n", 0L);
        setDoubleField(term2500, term2500.getClass(), "value", 0.0);
        setField(term2500, term2500.getClass(), "storedData", null);
        setField(term2498, term2498.getClass(), "sum", term2500);
        setLongField(term2501, term2501.getClass(), "n", 0L);
        setDoubleField(term2501, term2501.getClass(), "value", 0.0);
        setField(term2501, term2501.getClass(), "storedData", null);
        setField(term2498, term2498.getClass(), "sumsq", term2501);
        setLongField(term2502, term2502.getClass(), "n", 0L);
        setDoubleField(term2502, term2502.getClass(), "value", Double.NaN);
        setField(term2502, term2502.getClass(), "storedData", null);
        setField(term2498, term2498.getClass(), "min", term2502);
        setLongField(term2503, term2503.getClass(), "n", 0L);
        setDoubleField(term2503, term2503.getClass(), "value", Double.NaN);
        setField(term2503, term2503.getClass(), "storedData", null);
        setField(term2498, term2498.getClass(), "max", term2503);
        setIntField(term2504, term2504.getClass(), "n", 0);
        setDoubleField(term2504, term2504.getClass(), "value", 0.0);
        setField(term2504, term2504.getClass(), "storedData", null);
        setField(term2498, term2498.getClass(), "sumLog", term2504);
        setField(term2505, term2505.getClass(), "sumOfLogs", term2504);
        setField(term2505, term2505.getClass(), "storedData", null);
        setField(term2498, term2498.getClass(), "geoMean", term2505);
        setField(term2506, term2506.getClass(), "moment", term2499);
        setBooleanField(term2506, term2506.getClass(), "incMoment", false);
        setField(term2506, term2506.getClass(), "storedData", null);
        setField(term2498, term2498.getClass(), "mean", term2506);
        setField(term2507, term2507.getClass(), "moment", term2499);
        setBooleanField(term2507, term2507.getClass(), "incMoment", false);
        setBooleanField(term2507, term2507.getClass(), "isBiasCorrected", true);
        setField(term2507, term2507.getClass(), "storedData", null);
        setField(term2498, term2498.getClass(), "variance", term2507);
        setField(term2498, term2498.getClass(), "sumImpl", term2500);
        setField(term2498, term2498.getClass(), "sumsqImpl", term2501);
        setField(term2498, term2498.getClass(), "minImpl", term2502);
        setField(term2498, term2498.getClass(), "maxImpl", term2503);
        setField(term2498, term2498.getClass(), "sumLogImpl", term2504);
        setField(term2498, term2498.getClass(), "geoMeanImpl", term2505);
        setField(term2498, term2498.getClass(), "meanImpl", term2506);
        setField(term2498, term2498.getClass(), "varianceImpl", term2507);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getSumsq", argTypes, term148, args);
        assertTrue(recursiveEquals(term148, term2498));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


