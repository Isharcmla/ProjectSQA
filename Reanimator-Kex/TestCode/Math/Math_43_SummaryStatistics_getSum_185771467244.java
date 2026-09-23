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

public class SummaryStatistics_getSum_185771467244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119;
     Object term2454;

    public SummaryStatistics_getSum_185771467244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term119 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term121 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term127 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term130 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term133 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term136 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term139 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term142 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term143 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term145 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term119, term119.getClass(), "n", 5270370404989704783L);
        setDoubleField(term121, term121.getClass(), "m2", Double.NaN);
        setLongField(term121, term121.getClass(), "n", 0L);
        setDoubleField(term121, term121.getClass(), "m1", Double.NaN);
        setDoubleField(term121, term121.getClass(), "dev", Double.NaN);
        setDoubleField(term121, term121.getClass(), "nDev", Double.NaN);
        setField(term121, term121.getClass(), "storedData", null);
        setField(term119, term119.getClass(), "secondMoment", term121);
        setLongField(term127, term127.getClass(), "n", 0L);
        setDoubleField(term127, term127.getClass(), "value", 0.0);
        setField(term127, term127.getClass(), "storedData", null);
        setField(term119, term119.getClass(), "sum", term127);
        setLongField(term130, term130.getClass(), "n", 0L);
        setDoubleField(term130, term130.getClass(), "value", 0.0);
        setField(term130, term130.getClass(), "storedData", null);
        setField(term119, term119.getClass(), "sumsq", term130);
        setLongField(term133, term133.getClass(), "n", 0L);
        setDoubleField(term133, term133.getClass(), "value", Double.NaN);
        setField(term133, term133.getClass(), "storedData", null);
        setField(term119, term119.getClass(), "min", term133);
        setLongField(term136, term136.getClass(), "n", 0L);
        setDoubleField(term136, term136.getClass(), "value", Double.NaN);
        setField(term136, term136.getClass(), "storedData", null);
        setField(term119, term119.getClass(), "max", term136);
        setIntField(term139, term139.getClass(), "n", 0);
        setDoubleField(term139, term139.getClass(), "value", 0.0);
        setField(term139, term139.getClass(), "storedData", null);
        setField(term119, term119.getClass(), "sumLog", term139);
        setField(term142, term142.getClass(), "sumOfLogs", term139);
        setField(term142, term142.getClass(), "storedData", null);
        setField(term119, term119.getClass(), "geoMean", term142);
        setField(term143, term143.getClass(), "moment", term121);
        setBooleanField(term143, term143.getClass(), "incMoment", false);
        setField(term143, term143.getClass(), "storedData", null);
        setField(term119, term119.getClass(), "mean", term143);
        setField(term145, term145.getClass(), "moment", term121);
        setBooleanField(term145, term145.getClass(), "incMoment", false);
        setBooleanField(term145, term145.getClass(), "isBiasCorrected", true);
        setField(term145, term145.getClass(), "storedData", null);
        setField(term119, term119.getClass(), "variance", term145);
        setField(term119, term119.getClass(), "sumImpl", term127);
        setField(term119, term119.getClass(), "sumsqImpl", term130);
        setField(term119, term119.getClass(), "minImpl", term133);
        setField(term119, term119.getClass(), "maxImpl", term136);
        setField(term119, term119.getClass(), "sumLogImpl", term139);
        setField(term119, term119.getClass(), "geoMeanImpl", term142);
        setField(term119, term119.getClass(), "meanImpl", term143);
        setField(term119, term119.getClass(), "varianceImpl", term145);
        term2454 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term2455 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term2456 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term2457 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term2458 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term2459 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term2460 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term2461 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term2462 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term2463 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term2454, term2454.getClass(), "n", 5270370404989704783L);
        setDoubleField(term2455, term2455.getClass(), "m2", Double.NaN);
        setLongField(term2455, term2455.getClass(), "n", 0L);
        setDoubleField(term2455, term2455.getClass(), "m1", Double.NaN);
        setDoubleField(term2455, term2455.getClass(), "dev", Double.NaN);
        setDoubleField(term2455, term2455.getClass(), "nDev", Double.NaN);
        setField(term2455, term2455.getClass(), "storedData", null);
        setField(term2454, term2454.getClass(), "secondMoment", term2455);
        setLongField(term2456, term2456.getClass(), "n", 0L);
        setDoubleField(term2456, term2456.getClass(), "value", 0.0);
        setField(term2456, term2456.getClass(), "storedData", null);
        setField(term2454, term2454.getClass(), "sum", term2456);
        setLongField(term2457, term2457.getClass(), "n", 0L);
        setDoubleField(term2457, term2457.getClass(), "value", 0.0);
        setField(term2457, term2457.getClass(), "storedData", null);
        setField(term2454, term2454.getClass(), "sumsq", term2457);
        setLongField(term2458, term2458.getClass(), "n", 0L);
        setDoubleField(term2458, term2458.getClass(), "value", Double.NaN);
        setField(term2458, term2458.getClass(), "storedData", null);
        setField(term2454, term2454.getClass(), "min", term2458);
        setLongField(term2459, term2459.getClass(), "n", 0L);
        setDoubleField(term2459, term2459.getClass(), "value", Double.NaN);
        setField(term2459, term2459.getClass(), "storedData", null);
        setField(term2454, term2454.getClass(), "max", term2459);
        setIntField(term2460, term2460.getClass(), "n", 0);
        setDoubleField(term2460, term2460.getClass(), "value", 0.0);
        setField(term2460, term2460.getClass(), "storedData", null);
        setField(term2454, term2454.getClass(), "sumLog", term2460);
        setField(term2461, term2461.getClass(), "sumOfLogs", term2460);
        setField(term2461, term2461.getClass(), "storedData", null);
        setField(term2454, term2454.getClass(), "geoMean", term2461);
        setField(term2462, term2462.getClass(), "moment", term2455);
        setBooleanField(term2462, term2462.getClass(), "incMoment", false);
        setField(term2462, term2462.getClass(), "storedData", null);
        setField(term2454, term2454.getClass(), "mean", term2462);
        setField(term2463, term2463.getClass(), "moment", term2455);
        setBooleanField(term2463, term2463.getClass(), "incMoment", false);
        setBooleanField(term2463, term2463.getClass(), "isBiasCorrected", true);
        setField(term2463, term2463.getClass(), "storedData", null);
        setField(term2454, term2454.getClass(), "variance", term2463);
        setField(term2454, term2454.getClass(), "sumImpl", term2456);
        setField(term2454, term2454.getClass(), "sumsqImpl", term2457);
        setField(term2454, term2454.getClass(), "minImpl", term2458);
        setField(term2454, term2454.getClass(), "maxImpl", term2459);
        setField(term2454, term2454.getClass(), "sumLogImpl", term2460);
        setField(term2454, term2454.getClass(), "geoMeanImpl", term2461);
        setField(term2454, term2454.getClass(), "meanImpl", term2462);
        setField(term2454, term2454.getClass(), "varianceImpl", term2463);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getSum", argTypes, term119, args);
        assertTrue(recursiveEquals(term119, term2454));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


