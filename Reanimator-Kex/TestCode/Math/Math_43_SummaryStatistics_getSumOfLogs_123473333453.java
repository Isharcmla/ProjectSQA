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

public class SummaryStatistics_getSumOfLogs_123473333453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term380;
     Object term2870;

    public SummaryStatistics_getSumOfLogs_123473333453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term380 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term382 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term388 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term391 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term394 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term397 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term400 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term403 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term404 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term406 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term380, term380.getClass(), "n", 2535595959091595249L);
        setDoubleField(term382, term382.getClass(), "m2", Double.NaN);
        setLongField(term382, term382.getClass(), "n", 0L);
        setDoubleField(term382, term382.getClass(), "m1", Double.NaN);
        setDoubleField(term382, term382.getClass(), "dev", Double.NaN);
        setDoubleField(term382, term382.getClass(), "nDev", Double.NaN);
        setField(term382, term382.getClass(), "storedData", null);
        setField(term380, term380.getClass(), "secondMoment", term382);
        setLongField(term388, term388.getClass(), "n", 0L);
        setDoubleField(term388, term388.getClass(), "value", 0.0);
        setField(term388, term388.getClass(), "storedData", null);
        setField(term380, term380.getClass(), "sum", term388);
        setLongField(term391, term391.getClass(), "n", 0L);
        setDoubleField(term391, term391.getClass(), "value", 0.0);
        setField(term391, term391.getClass(), "storedData", null);
        setField(term380, term380.getClass(), "sumsq", term391);
        setLongField(term394, term394.getClass(), "n", 0L);
        setDoubleField(term394, term394.getClass(), "value", Double.NaN);
        setField(term394, term394.getClass(), "storedData", null);
        setField(term380, term380.getClass(), "min", term394);
        setLongField(term397, term397.getClass(), "n", 0L);
        setDoubleField(term397, term397.getClass(), "value", Double.NaN);
        setField(term397, term397.getClass(), "storedData", null);
        setField(term380, term380.getClass(), "max", term397);
        setIntField(term400, term400.getClass(), "n", 0);
        setDoubleField(term400, term400.getClass(), "value", 0.0);
        setField(term400, term400.getClass(), "storedData", null);
        setField(term380, term380.getClass(), "sumLog", term400);
        setField(term403, term403.getClass(), "sumOfLogs", term400);
        setField(term403, term403.getClass(), "storedData", null);
        setField(term380, term380.getClass(), "geoMean", term403);
        setField(term404, term404.getClass(), "moment", term382);
        setBooleanField(term404, term404.getClass(), "incMoment", false);
        setField(term404, term404.getClass(), "storedData", null);
        setField(term380, term380.getClass(), "mean", term404);
        setField(term406, term406.getClass(), "moment", term382);
        setBooleanField(term406, term406.getClass(), "incMoment", false);
        setBooleanField(term406, term406.getClass(), "isBiasCorrected", true);
        setField(term406, term406.getClass(), "storedData", null);
        setField(term380, term380.getClass(), "variance", term406);
        setField(term380, term380.getClass(), "sumImpl", term388);
        setField(term380, term380.getClass(), "sumsqImpl", term391);
        setField(term380, term380.getClass(), "minImpl", term394);
        setField(term380, term380.getClass(), "maxImpl", term397);
        setField(term380, term380.getClass(), "sumLogImpl", term400);
        setField(term380, term380.getClass(), "geoMeanImpl", term403);
        setField(term380, term380.getClass(), "meanImpl", term404);
        setField(term380, term380.getClass(), "varianceImpl", term406);
        term2870 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term2871 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term2872 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term2873 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term2874 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term2875 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term2876 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term2877 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term2878 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term2879 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term2870, term2870.getClass(), "n", 2535595959091595249L);
        setDoubleField(term2871, term2871.getClass(), "m2", Double.NaN);
        setLongField(term2871, term2871.getClass(), "n", 0L);
        setDoubleField(term2871, term2871.getClass(), "m1", Double.NaN);
        setDoubleField(term2871, term2871.getClass(), "dev", Double.NaN);
        setDoubleField(term2871, term2871.getClass(), "nDev", Double.NaN);
        setField(term2871, term2871.getClass(), "storedData", null);
        setField(term2870, term2870.getClass(), "secondMoment", term2871);
        setLongField(term2872, term2872.getClass(), "n", 0L);
        setDoubleField(term2872, term2872.getClass(), "value", 0.0);
        setField(term2872, term2872.getClass(), "storedData", null);
        setField(term2870, term2870.getClass(), "sum", term2872);
        setLongField(term2873, term2873.getClass(), "n", 0L);
        setDoubleField(term2873, term2873.getClass(), "value", 0.0);
        setField(term2873, term2873.getClass(), "storedData", null);
        setField(term2870, term2870.getClass(), "sumsq", term2873);
        setLongField(term2874, term2874.getClass(), "n", 0L);
        setDoubleField(term2874, term2874.getClass(), "value", Double.NaN);
        setField(term2874, term2874.getClass(), "storedData", null);
        setField(term2870, term2870.getClass(), "min", term2874);
        setLongField(term2875, term2875.getClass(), "n", 0L);
        setDoubleField(term2875, term2875.getClass(), "value", Double.NaN);
        setField(term2875, term2875.getClass(), "storedData", null);
        setField(term2870, term2870.getClass(), "max", term2875);
        setIntField(term2876, term2876.getClass(), "n", 0);
        setDoubleField(term2876, term2876.getClass(), "value", 0.0);
        setField(term2876, term2876.getClass(), "storedData", null);
        setField(term2870, term2870.getClass(), "sumLog", term2876);
        setField(term2877, term2877.getClass(), "sumOfLogs", term2876);
        setField(term2877, term2877.getClass(), "storedData", null);
        setField(term2870, term2870.getClass(), "geoMean", term2877);
        setField(term2878, term2878.getClass(), "moment", term2871);
        setBooleanField(term2878, term2878.getClass(), "incMoment", false);
        setField(term2878, term2878.getClass(), "storedData", null);
        setField(term2870, term2870.getClass(), "mean", term2878);
        setField(term2879, term2879.getClass(), "moment", term2871);
        setBooleanField(term2879, term2879.getClass(), "incMoment", false);
        setBooleanField(term2879, term2879.getClass(), "isBiasCorrected", true);
        setField(term2879, term2879.getClass(), "storedData", null);
        setField(term2870, term2870.getClass(), "variance", term2879);
        setField(term2870, term2870.getClass(), "sumImpl", term2872);
        setField(term2870, term2870.getClass(), "sumsqImpl", term2873);
        setField(term2870, term2870.getClass(), "minImpl", term2874);
        setField(term2870, term2870.getClass(), "maxImpl", term2875);
        setField(term2870, term2870.getClass(), "sumLogImpl", term2876);
        setField(term2870, term2870.getClass(), "geoMeanImpl", term2877);
        setField(term2870, term2870.getClass(), "meanImpl", term2878);
        setField(term2870, term2870.getClass(), "varianceImpl", term2879);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getSumOfLogs", argTypes, term380, args);
        assertTrue(recursiveEquals(term380, term2870));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


