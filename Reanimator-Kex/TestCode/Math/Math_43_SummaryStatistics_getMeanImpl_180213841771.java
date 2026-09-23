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

public class SummaryStatistics_getMeanImpl_180213841771 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term903;
     Object term7999;
     Object term7970;

    public SummaryStatistics_getMeanImpl_180213841771() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term903 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term905 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term911 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term914 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term917 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term920 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term923 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term926 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term927 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term929 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term903, term903.getClass(), "n", -5892135042702373494L);
        setDoubleField(term905, term905.getClass(), "m2", Double.NaN);
        setLongField(term905, term905.getClass(), "n", 0L);
        setDoubleField(term905, term905.getClass(), "m1", Double.NaN);
        setDoubleField(term905, term905.getClass(), "dev", Double.NaN);
        setDoubleField(term905, term905.getClass(), "nDev", Double.NaN);
        setField(term905, term905.getClass(), "storedData", null);
        setField(term903, term903.getClass(), "secondMoment", term905);
        setLongField(term911, term911.getClass(), "n", 0L);
        setDoubleField(term911, term911.getClass(), "value", 0.0);
        setField(term911, term911.getClass(), "storedData", null);
        setField(term903, term903.getClass(), "sum", term911);
        setLongField(term914, term914.getClass(), "n", 0L);
        setDoubleField(term914, term914.getClass(), "value", 0.0);
        setField(term914, term914.getClass(), "storedData", null);
        setField(term903, term903.getClass(), "sumsq", term914);
        setLongField(term917, term917.getClass(), "n", 0L);
        setDoubleField(term917, term917.getClass(), "value", Double.NaN);
        setField(term917, term917.getClass(), "storedData", null);
        setField(term903, term903.getClass(), "min", term917);
        setLongField(term920, term920.getClass(), "n", 0L);
        setDoubleField(term920, term920.getClass(), "value", Double.NaN);
        setField(term920, term920.getClass(), "storedData", null);
        setField(term903, term903.getClass(), "max", term920);
        setIntField(term923, term923.getClass(), "n", 0);
        setDoubleField(term923, term923.getClass(), "value", 0.0);
        setField(term923, term923.getClass(), "storedData", null);
        setField(term903, term903.getClass(), "sumLog", term923);
        setField(term926, term926.getClass(), "sumOfLogs", term923);
        setField(term926, term926.getClass(), "storedData", null);
        setField(term903, term903.getClass(), "geoMean", term926);
        setField(term927, term927.getClass(), "moment", term905);
        setBooleanField(term927, term927.getClass(), "incMoment", false);
        setField(term927, term927.getClass(), "storedData", null);
        setField(term903, term903.getClass(), "mean", term927);
        setField(term929, term929.getClass(), "moment", term905);
        setBooleanField(term929, term929.getClass(), "incMoment", false);
        setBooleanField(term929, term929.getClass(), "isBiasCorrected", true);
        setField(term929, term929.getClass(), "storedData", null);
        setField(term903, term903.getClass(), "variance", term929);
        setField(term903, term903.getClass(), "sumImpl", term911);
        setField(term903, term903.getClass(), "sumsqImpl", term914);
        setField(term903, term903.getClass(), "minImpl", term917);
        setField(term903, term903.getClass(), "maxImpl", term920);
        setField(term903, term903.getClass(), "sumLogImpl", term923);
        setField(term903, term903.getClass(), "geoMeanImpl", term926);
        setField(term903, term903.getClass(), "meanImpl", term927);
        setField(term903, term903.getClass(), "varianceImpl", term929);
        term7999 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term8000 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term8001 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term8002 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term8003 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term8004 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term8005 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term8006 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term8007 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term8008 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term7999, term7999.getClass(), "n", -5892135042702373494L);
        setDoubleField(term8000, term8000.getClass(), "m2", Double.NaN);
        setLongField(term8000, term8000.getClass(), "n", 0L);
        setDoubleField(term8000, term8000.getClass(), "m1", Double.NaN);
        setDoubleField(term8000, term8000.getClass(), "dev", Double.NaN);
        setDoubleField(term8000, term8000.getClass(), "nDev", Double.NaN);
        setField(term8000, term8000.getClass(), "storedData", null);
        setField(term7999, term7999.getClass(), "secondMoment", term8000);
        setLongField(term8001, term8001.getClass(), "n", 0L);
        setDoubleField(term8001, term8001.getClass(), "value", 0.0);
        setField(term8001, term8001.getClass(), "storedData", null);
        setField(term7999, term7999.getClass(), "sum", term8001);
        setLongField(term8002, term8002.getClass(), "n", 0L);
        setDoubleField(term8002, term8002.getClass(), "value", 0.0);
        setField(term8002, term8002.getClass(), "storedData", null);
        setField(term7999, term7999.getClass(), "sumsq", term8002);
        setLongField(term8003, term8003.getClass(), "n", 0L);
        setDoubleField(term8003, term8003.getClass(), "value", Double.NaN);
        setField(term8003, term8003.getClass(), "storedData", null);
        setField(term7999, term7999.getClass(), "min", term8003);
        setLongField(term8004, term8004.getClass(), "n", 0L);
        setDoubleField(term8004, term8004.getClass(), "value", Double.NaN);
        setField(term8004, term8004.getClass(), "storedData", null);
        setField(term7999, term7999.getClass(), "max", term8004);
        setIntField(term8005, term8005.getClass(), "n", 0);
        setDoubleField(term8005, term8005.getClass(), "value", 0.0);
        setField(term8005, term8005.getClass(), "storedData", null);
        setField(term7999, term7999.getClass(), "sumLog", term8005);
        setField(term8006, term8006.getClass(), "sumOfLogs", term8005);
        setField(term8006, term8006.getClass(), "storedData", null);
        setField(term7999, term7999.getClass(), "geoMean", term8006);
        setField(term8007, term8007.getClass(), "moment", term8000);
        setBooleanField(term8007, term8007.getClass(), "incMoment", false);
        setField(term8007, term8007.getClass(), "storedData", null);
        setField(term7999, term7999.getClass(), "mean", term8007);
        setField(term8008, term8008.getClass(), "moment", term8000);
        setBooleanField(term8008, term8008.getClass(), "incMoment", false);
        setBooleanField(term8008, term8008.getClass(), "isBiasCorrected", true);
        setField(term8008, term8008.getClass(), "storedData", null);
        setField(term7999, term7999.getClass(), "variance", term8008);
        setField(term7999, term7999.getClass(), "sumImpl", term8001);
        setField(term7999, term7999.getClass(), "sumsqImpl", term8002);
        setField(term7999, term7999.getClass(), "minImpl", term8003);
        setField(term7999, term7999.getClass(), "maxImpl", term8004);
        setField(term7999, term7999.getClass(), "sumLogImpl", term8005);
        setField(term7999, term7999.getClass(), "geoMeanImpl", term8006);
        setField(term7999, term7999.getClass(), "meanImpl", term8007);
        setField(term7999, term7999.getClass(), "varianceImpl", term8008);
        term7970 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term7971 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        setDoubleField(term7971, term7971.getClass(), "m2", Double.NaN);
        setLongField(term7971, term7971.getClass(), "n", 0L);
        setDoubleField(term7971, term7971.getClass(), "m1", Double.NaN);
        setDoubleField(term7971, term7971.getClass(), "dev", Double.NaN);
        setDoubleField(term7971, term7971.getClass(), "nDev", Double.NaN);
        setField(term7971, term7971.getClass(), "storedData", null);
        setField(term7970, term7970.getClass(), "moment", term7971);
        setBooleanField(term7970, term7970.getClass(), "incMoment", false);
        setField(term7970, term7970.getClass(), "storedData", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getMeanImpl", argTypes, term903, args);
        assertTrue(recursiveEquals(term903, term7999));
        assertTrue(recursiveEquals(retValue, term7970));
    }

};


