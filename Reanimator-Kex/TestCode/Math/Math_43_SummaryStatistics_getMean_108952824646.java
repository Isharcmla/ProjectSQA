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

public class SummaryStatistics_getMean_108952824646 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term177;
     Object term2547;

    public SummaryStatistics_getMean_108952824646() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term177 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term179 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term185 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term188 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term191 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term194 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term197 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term200 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term201 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term203 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term177, term177.getClass(), "n", 4872422362414183754L);
        setDoubleField(term179, term179.getClass(), "m2", Double.NaN);
        setLongField(term179, term179.getClass(), "n", 0L);
        setDoubleField(term179, term179.getClass(), "m1", Double.NaN);
        setDoubleField(term179, term179.getClass(), "dev", Double.NaN);
        setDoubleField(term179, term179.getClass(), "nDev", Double.NaN);
        setField(term179, term179.getClass(), "storedData", null);
        setField(term177, term177.getClass(), "secondMoment", term179);
        setLongField(term185, term185.getClass(), "n", 0L);
        setDoubleField(term185, term185.getClass(), "value", 0.0);
        setField(term185, term185.getClass(), "storedData", null);
        setField(term177, term177.getClass(), "sum", term185);
        setLongField(term188, term188.getClass(), "n", 0L);
        setDoubleField(term188, term188.getClass(), "value", 0.0);
        setField(term188, term188.getClass(), "storedData", null);
        setField(term177, term177.getClass(), "sumsq", term188);
        setLongField(term191, term191.getClass(), "n", 0L);
        setDoubleField(term191, term191.getClass(), "value", Double.NaN);
        setField(term191, term191.getClass(), "storedData", null);
        setField(term177, term177.getClass(), "min", term191);
        setLongField(term194, term194.getClass(), "n", 0L);
        setDoubleField(term194, term194.getClass(), "value", Double.NaN);
        setField(term194, term194.getClass(), "storedData", null);
        setField(term177, term177.getClass(), "max", term194);
        setIntField(term197, term197.getClass(), "n", 0);
        setDoubleField(term197, term197.getClass(), "value", 0.0);
        setField(term197, term197.getClass(), "storedData", null);
        setField(term177, term177.getClass(), "sumLog", term197);
        setField(term200, term200.getClass(), "sumOfLogs", term197);
        setField(term200, term200.getClass(), "storedData", null);
        setField(term177, term177.getClass(), "geoMean", term200);
        setField(term201, term201.getClass(), "moment", term179);
        setBooleanField(term201, term201.getClass(), "incMoment", false);
        setField(term201, term201.getClass(), "storedData", null);
        setField(term177, term177.getClass(), "mean", term201);
        setField(term203, term203.getClass(), "moment", term179);
        setBooleanField(term203, term203.getClass(), "incMoment", false);
        setBooleanField(term203, term203.getClass(), "isBiasCorrected", true);
        setField(term203, term203.getClass(), "storedData", null);
        setField(term177, term177.getClass(), "variance", term203);
        setField(term177, term177.getClass(), "sumImpl", term185);
        setField(term177, term177.getClass(), "sumsqImpl", term188);
        setField(term177, term177.getClass(), "minImpl", term191);
        setField(term177, term177.getClass(), "maxImpl", term194);
        setField(term177, term177.getClass(), "sumLogImpl", term197);
        setField(term177, term177.getClass(), "geoMeanImpl", term200);
        setField(term177, term177.getClass(), "meanImpl", term201);
        setField(term177, term177.getClass(), "varianceImpl", term203);
        term2547 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term2548 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term2549 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term2550 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term2551 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term2552 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term2553 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term2554 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term2555 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term2556 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term2547, term2547.getClass(), "n", 4872422362414183754L);
        setDoubleField(term2548, term2548.getClass(), "m2", Double.NaN);
        setLongField(term2548, term2548.getClass(), "n", 0L);
        setDoubleField(term2548, term2548.getClass(), "m1", Double.NaN);
        setDoubleField(term2548, term2548.getClass(), "dev", Double.NaN);
        setDoubleField(term2548, term2548.getClass(), "nDev", Double.NaN);
        setField(term2548, term2548.getClass(), "storedData", null);
        setField(term2547, term2547.getClass(), "secondMoment", term2548);
        setLongField(term2549, term2549.getClass(), "n", 0L);
        setDoubleField(term2549, term2549.getClass(), "value", 0.0);
        setField(term2549, term2549.getClass(), "storedData", null);
        setField(term2547, term2547.getClass(), "sum", term2549);
        setLongField(term2550, term2550.getClass(), "n", 0L);
        setDoubleField(term2550, term2550.getClass(), "value", 0.0);
        setField(term2550, term2550.getClass(), "storedData", null);
        setField(term2547, term2547.getClass(), "sumsq", term2550);
        setLongField(term2551, term2551.getClass(), "n", 0L);
        setDoubleField(term2551, term2551.getClass(), "value", Double.NaN);
        setField(term2551, term2551.getClass(), "storedData", null);
        setField(term2547, term2547.getClass(), "min", term2551);
        setLongField(term2552, term2552.getClass(), "n", 0L);
        setDoubleField(term2552, term2552.getClass(), "value", Double.NaN);
        setField(term2552, term2552.getClass(), "storedData", null);
        setField(term2547, term2547.getClass(), "max", term2552);
        setIntField(term2553, term2553.getClass(), "n", 0);
        setDoubleField(term2553, term2553.getClass(), "value", 0.0);
        setField(term2553, term2553.getClass(), "storedData", null);
        setField(term2547, term2547.getClass(), "sumLog", term2553);
        setField(term2554, term2554.getClass(), "sumOfLogs", term2553);
        setField(term2554, term2554.getClass(), "storedData", null);
        setField(term2547, term2547.getClass(), "geoMean", term2554);
        setField(term2555, term2555.getClass(), "moment", term2548);
        setBooleanField(term2555, term2555.getClass(), "incMoment", false);
        setField(term2555, term2555.getClass(), "storedData", null);
        setField(term2547, term2547.getClass(), "mean", term2555);
        setField(term2556, term2556.getClass(), "moment", term2548);
        setBooleanField(term2556, term2556.getClass(), "incMoment", false);
        setBooleanField(term2556, term2556.getClass(), "isBiasCorrected", true);
        setField(term2556, term2556.getClass(), "storedData", null);
        setField(term2547, term2547.getClass(), "variance", term2556);
        setField(term2547, term2547.getClass(), "sumImpl", term2549);
        setField(term2547, term2547.getClass(), "sumsqImpl", term2550);
        setField(term2547, term2547.getClass(), "minImpl", term2551);
        setField(term2547, term2547.getClass(), "maxImpl", term2552);
        setField(term2547, term2547.getClass(), "sumLogImpl", term2553);
        setField(term2547, term2547.getClass(), "geoMeanImpl", term2554);
        setField(term2547, term2547.getClass(), "meanImpl", term2555);
        setField(term2547, term2547.getClass(), "varianceImpl", term2556);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getMean", argTypes, term177, args);
        assertTrue(recursiveEquals(term177, term2547));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};


