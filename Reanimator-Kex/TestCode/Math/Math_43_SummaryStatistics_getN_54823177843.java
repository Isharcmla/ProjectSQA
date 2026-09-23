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

public class SummaryStatistics_getN_54823177843 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90;
     Object term2410;

    public SummaryStatistics_getN_54823177843() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term90 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term92 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term98 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term101 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term104 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term107 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term110 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term113 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term114 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term116 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term90, term90.getClass(), "n", -8400487765614892086L);
        setDoubleField(term92, term92.getClass(), "m2", Double.NaN);
        setLongField(term92, term92.getClass(), "n", 0L);
        setDoubleField(term92, term92.getClass(), "m1", Double.NaN);
        setDoubleField(term92, term92.getClass(), "dev", Double.NaN);
        setDoubleField(term92, term92.getClass(), "nDev", Double.NaN);
        setField(term92, term92.getClass(), "storedData", null);
        setField(term90, term90.getClass(), "secondMoment", term92);
        setLongField(term98, term98.getClass(), "n", 0L);
        setDoubleField(term98, term98.getClass(), "value", 0.0);
        setField(term98, term98.getClass(), "storedData", null);
        setField(term90, term90.getClass(), "sum", term98);
        setLongField(term101, term101.getClass(), "n", 0L);
        setDoubleField(term101, term101.getClass(), "value", 0.0);
        setField(term101, term101.getClass(), "storedData", null);
        setField(term90, term90.getClass(), "sumsq", term101);
        setLongField(term104, term104.getClass(), "n", 0L);
        setDoubleField(term104, term104.getClass(), "value", Double.NaN);
        setField(term104, term104.getClass(), "storedData", null);
        setField(term90, term90.getClass(), "min", term104);
        setLongField(term107, term107.getClass(), "n", 0L);
        setDoubleField(term107, term107.getClass(), "value", Double.NaN);
        setField(term107, term107.getClass(), "storedData", null);
        setField(term90, term90.getClass(), "max", term107);
        setIntField(term110, term110.getClass(), "n", 0);
        setDoubleField(term110, term110.getClass(), "value", 0.0);
        setField(term110, term110.getClass(), "storedData", null);
        setField(term90, term90.getClass(), "sumLog", term110);
        setField(term113, term113.getClass(), "sumOfLogs", term110);
        setField(term113, term113.getClass(), "storedData", null);
        setField(term90, term90.getClass(), "geoMean", term113);
        setField(term114, term114.getClass(), "moment", term92);
        setBooleanField(term114, term114.getClass(), "incMoment", false);
        setField(term114, term114.getClass(), "storedData", null);
        setField(term90, term90.getClass(), "mean", term114);
        setField(term116, term116.getClass(), "moment", term92);
        setBooleanField(term116, term116.getClass(), "incMoment", false);
        setBooleanField(term116, term116.getClass(), "isBiasCorrected", true);
        setField(term116, term116.getClass(), "storedData", null);
        setField(term90, term90.getClass(), "variance", term116);
        setField(term90, term90.getClass(), "sumImpl", term98);
        setField(term90, term90.getClass(), "sumsqImpl", term101);
        setField(term90, term90.getClass(), "minImpl", term104);
        setField(term90, term90.getClass(), "maxImpl", term107);
        setField(term90, term90.getClass(), "sumLogImpl", term110);
        setField(term90, term90.getClass(), "geoMeanImpl", term113);
        setField(term90, term90.getClass(), "meanImpl", term114);
        setField(term90, term90.getClass(), "varianceImpl", term116);
        term2410 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term2411 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term2412 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term2413 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term2414 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term2415 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term2416 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term2417 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term2418 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term2419 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term2410, term2410.getClass(), "n", -8400487765614892086L);
        setDoubleField(term2411, term2411.getClass(), "m2", Double.NaN);
        setLongField(term2411, term2411.getClass(), "n", 0L);
        setDoubleField(term2411, term2411.getClass(), "m1", Double.NaN);
        setDoubleField(term2411, term2411.getClass(), "dev", Double.NaN);
        setDoubleField(term2411, term2411.getClass(), "nDev", Double.NaN);
        setField(term2411, term2411.getClass(), "storedData", null);
        setField(term2410, term2410.getClass(), "secondMoment", term2411);
        setLongField(term2412, term2412.getClass(), "n", 0L);
        setDoubleField(term2412, term2412.getClass(), "value", 0.0);
        setField(term2412, term2412.getClass(), "storedData", null);
        setField(term2410, term2410.getClass(), "sum", term2412);
        setLongField(term2413, term2413.getClass(), "n", 0L);
        setDoubleField(term2413, term2413.getClass(), "value", 0.0);
        setField(term2413, term2413.getClass(), "storedData", null);
        setField(term2410, term2410.getClass(), "sumsq", term2413);
        setLongField(term2414, term2414.getClass(), "n", 0L);
        setDoubleField(term2414, term2414.getClass(), "value", Double.NaN);
        setField(term2414, term2414.getClass(), "storedData", null);
        setField(term2410, term2410.getClass(), "min", term2414);
        setLongField(term2415, term2415.getClass(), "n", 0L);
        setDoubleField(term2415, term2415.getClass(), "value", Double.NaN);
        setField(term2415, term2415.getClass(), "storedData", null);
        setField(term2410, term2410.getClass(), "max", term2415);
        setIntField(term2416, term2416.getClass(), "n", 0);
        setDoubleField(term2416, term2416.getClass(), "value", 0.0);
        setField(term2416, term2416.getClass(), "storedData", null);
        setField(term2410, term2410.getClass(), "sumLog", term2416);
        setField(term2417, term2417.getClass(), "sumOfLogs", term2416);
        setField(term2417, term2417.getClass(), "storedData", null);
        setField(term2410, term2410.getClass(), "geoMean", term2417);
        setField(term2418, term2418.getClass(), "moment", term2411);
        setBooleanField(term2418, term2418.getClass(), "incMoment", false);
        setField(term2418, term2418.getClass(), "storedData", null);
        setField(term2410, term2410.getClass(), "mean", term2418);
        setField(term2419, term2419.getClass(), "moment", term2411);
        setBooleanField(term2419, term2419.getClass(), "incMoment", false);
        setBooleanField(term2419, term2419.getClass(), "isBiasCorrected", true);
        setField(term2419, term2419.getClass(), "storedData", null);
        setField(term2410, term2410.getClass(), "variance", term2419);
        setField(term2410, term2410.getClass(), "sumImpl", term2412);
        setField(term2410, term2410.getClass(), "sumsqImpl", term2413);
        setField(term2410, term2410.getClass(), "minImpl", term2414);
        setField(term2410, term2410.getClass(), "maxImpl", term2415);
        setField(term2410, term2410.getClass(), "sumLogImpl", term2416);
        setField(term2410, term2410.getClass(), "geoMeanImpl", term2417);
        setField(term2410, term2410.getClass(), "meanImpl", term2418);
        setField(term2410, term2410.getClass(), "varianceImpl", term2419);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getN", argTypes, term90, args);
        assertTrue(recursiveEquals(term90, term2410));
        assertTrue(recursiveEquals(retValue, -8400487765614892086L));
    }

};


