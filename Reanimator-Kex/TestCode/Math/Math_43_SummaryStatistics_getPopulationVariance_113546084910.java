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
import java.lang.Object;
import java.lang.Double;

public class SummaryStatistics_getPopulationVariance_113546084910 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term264;

    public SummaryStatistics_getPopulationVariance_113546084910() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term264 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term266 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term272 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term275 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term278 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term281 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term284 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term287 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term288 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term290 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term264, term264.getClass(), "n", 6967924379644551255L);
        setDoubleField(term266, term266.getClass(), "m2", Double.NaN);
        setLongField(term266, term266.getClass(), "n", 0L);
        setDoubleField(term266, term266.getClass(), "m1", Double.NaN);
        setDoubleField(term266, term266.getClass(), "dev", Double.NaN);
        setDoubleField(term266, term266.getClass(), "nDev", Double.NaN);
        setField(term266, term266.getClass(), "storedData", null);
        setField(term264, term264.getClass(), "secondMoment", term266);
        setLongField(term272, term272.getClass(), "n", 0L);
        setDoubleField(term272, term272.getClass(), "value", 0.0);
        setField(term272, term272.getClass(), "storedData", null);
        setField(term264, term264.getClass(), "sum", term272);
        setLongField(term275, term275.getClass(), "n", 0L);
        setDoubleField(term275, term275.getClass(), "value", 0.0);
        setField(term275, term275.getClass(), "storedData", null);
        setField(term264, term264.getClass(), "sumsq", term275);
        setLongField(term278, term278.getClass(), "n", 0L);
        setDoubleField(term278, term278.getClass(), "value", Double.NaN);
        setField(term278, term278.getClass(), "storedData", null);
        setField(term264, term264.getClass(), "min", term278);
        setLongField(term281, term281.getClass(), "n", 0L);
        setDoubleField(term281, term281.getClass(), "value", Double.NaN);
        setField(term281, term281.getClass(), "storedData", null);
        setField(term264, term264.getClass(), "max", term281);
        setIntField(term284, term284.getClass(), "n", 0);
        setDoubleField(term284, term284.getClass(), "value", 0.0);
        setField(term284, term284.getClass(), "storedData", null);
        setField(term264, term264.getClass(), "sumLog", term284);
        setField(term287, term287.getClass(), "sumOfLogs", term284);
        setField(term287, term287.getClass(), "storedData", null);
        setField(term264, term264.getClass(), "geoMean", term287);
        setField(term288, term288.getClass(), "moment", term266);
        setBooleanField(term288, term288.getClass(), "incMoment", false);
        setField(term288, term288.getClass(), "storedData", null);
        setField(term264, term264.getClass(), "mean", term288);
        setField(term290, term290.getClass(), "moment", term266);
        setBooleanField(term290, term290.getClass(), "incMoment", false);
        setBooleanField(term290, term290.getClass(), "isBiasCorrected", true);
        setField(term290, term290.getClass(), "storedData", null);
        setField(term264, term264.getClass(), "variance", term290);
        setField(term264, term264.getClass(), "sumImpl", term272);
        setField(term264, term264.getClass(), "sumsqImpl", term275);
        setField(term264, term264.getClass(), "minImpl", term278);
        setField(term264, term264.getClass(), "maxImpl", term281);
        setField(term264, term264.getClass(), "sumLogImpl", term284);
        setField(term264, term264.getClass(), "geoMeanImpl", term287);
        setField(term264, term264.getClass(), "meanImpl", term288);
        setField(term264, term264.getClass(), "varianceImpl", term290);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPopulationVariance", argTypes, term264, args);
    }

};


