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

public class SummaryStatistics_getSumLogImpl_124049037167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term787;
     Object term6329;
     Object term6300;

    public SummaryStatistics_getSumLogImpl_124049037167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term787 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term789 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term795 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term798 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term801 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term804 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term807 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term810 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term811 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term813 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term787, term787.getClass(), "n", -4502405999831680926L);
        setDoubleField(term789, term789.getClass(), "m2", Double.NaN);
        setLongField(term789, term789.getClass(), "n", 0L);
        setDoubleField(term789, term789.getClass(), "m1", Double.NaN);
        setDoubleField(term789, term789.getClass(), "dev", Double.NaN);
        setDoubleField(term789, term789.getClass(), "nDev", Double.NaN);
        setField(term789, term789.getClass(), "storedData", null);
        setField(term787, term787.getClass(), "secondMoment", term789);
        setLongField(term795, term795.getClass(), "n", 0L);
        setDoubleField(term795, term795.getClass(), "value", 0.0);
        setField(term795, term795.getClass(), "storedData", null);
        setField(term787, term787.getClass(), "sum", term795);
        setLongField(term798, term798.getClass(), "n", 0L);
        setDoubleField(term798, term798.getClass(), "value", 0.0);
        setField(term798, term798.getClass(), "storedData", null);
        setField(term787, term787.getClass(), "sumsq", term798);
        setLongField(term801, term801.getClass(), "n", 0L);
        setDoubleField(term801, term801.getClass(), "value", Double.NaN);
        setField(term801, term801.getClass(), "storedData", null);
        setField(term787, term787.getClass(), "min", term801);
        setLongField(term804, term804.getClass(), "n", 0L);
        setDoubleField(term804, term804.getClass(), "value", Double.NaN);
        setField(term804, term804.getClass(), "storedData", null);
        setField(term787, term787.getClass(), "max", term804);
        setIntField(term807, term807.getClass(), "n", 0);
        setDoubleField(term807, term807.getClass(), "value", 0.0);
        setField(term807, term807.getClass(), "storedData", null);
        setField(term787, term787.getClass(), "sumLog", term807);
        setField(term810, term810.getClass(), "sumOfLogs", term807);
        setField(term810, term810.getClass(), "storedData", null);
        setField(term787, term787.getClass(), "geoMean", term810);
        setField(term811, term811.getClass(), "moment", term789);
        setBooleanField(term811, term811.getClass(), "incMoment", false);
        setField(term811, term811.getClass(), "storedData", null);
        setField(term787, term787.getClass(), "mean", term811);
        setField(term813, term813.getClass(), "moment", term789);
        setBooleanField(term813, term813.getClass(), "incMoment", false);
        setBooleanField(term813, term813.getClass(), "isBiasCorrected", true);
        setField(term813, term813.getClass(), "storedData", null);
        setField(term787, term787.getClass(), "variance", term813);
        setField(term787, term787.getClass(), "sumImpl", term795);
        setField(term787, term787.getClass(), "sumsqImpl", term798);
        setField(term787, term787.getClass(), "minImpl", term801);
        setField(term787, term787.getClass(), "maxImpl", term804);
        setField(term787, term787.getClass(), "sumLogImpl", term807);
        setField(term787, term787.getClass(), "geoMeanImpl", term810);
        setField(term787, term787.getClass(), "meanImpl", term811);
        setField(term787, term787.getClass(), "varianceImpl", term813);
        term6329 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term6330 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term6331 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term6332 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term6333 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term6334 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term6335 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term6336 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term6337 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term6338 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term6329, term6329.getClass(), "n", -4502405999831680926L);
        setDoubleField(term6330, term6330.getClass(), "m2", Double.NaN);
        setLongField(term6330, term6330.getClass(), "n", 0L);
        setDoubleField(term6330, term6330.getClass(), "m1", Double.NaN);
        setDoubleField(term6330, term6330.getClass(), "dev", Double.NaN);
        setDoubleField(term6330, term6330.getClass(), "nDev", Double.NaN);
        setField(term6330, term6330.getClass(), "storedData", null);
        setField(term6329, term6329.getClass(), "secondMoment", term6330);
        setLongField(term6331, term6331.getClass(), "n", 0L);
        setDoubleField(term6331, term6331.getClass(), "value", 0.0);
        setField(term6331, term6331.getClass(), "storedData", null);
        setField(term6329, term6329.getClass(), "sum", term6331);
        setLongField(term6332, term6332.getClass(), "n", 0L);
        setDoubleField(term6332, term6332.getClass(), "value", 0.0);
        setField(term6332, term6332.getClass(), "storedData", null);
        setField(term6329, term6329.getClass(), "sumsq", term6332);
        setLongField(term6333, term6333.getClass(), "n", 0L);
        setDoubleField(term6333, term6333.getClass(), "value", Double.NaN);
        setField(term6333, term6333.getClass(), "storedData", null);
        setField(term6329, term6329.getClass(), "min", term6333);
        setLongField(term6334, term6334.getClass(), "n", 0L);
        setDoubleField(term6334, term6334.getClass(), "value", Double.NaN);
        setField(term6334, term6334.getClass(), "storedData", null);
        setField(term6329, term6329.getClass(), "max", term6334);
        setIntField(term6335, term6335.getClass(), "n", 0);
        setDoubleField(term6335, term6335.getClass(), "value", 0.0);
        setField(term6335, term6335.getClass(), "storedData", null);
        setField(term6329, term6329.getClass(), "sumLog", term6335);
        setField(term6336, term6336.getClass(), "sumOfLogs", term6335);
        setField(term6336, term6336.getClass(), "storedData", null);
        setField(term6329, term6329.getClass(), "geoMean", term6336);
        setField(term6337, term6337.getClass(), "moment", term6330);
        setBooleanField(term6337, term6337.getClass(), "incMoment", false);
        setField(term6337, term6337.getClass(), "storedData", null);
        setField(term6329, term6329.getClass(), "mean", term6337);
        setField(term6338, term6338.getClass(), "moment", term6330);
        setBooleanField(term6338, term6338.getClass(), "incMoment", false);
        setBooleanField(term6338, term6338.getClass(), "isBiasCorrected", true);
        setField(term6338, term6338.getClass(), "storedData", null);
        setField(term6329, term6329.getClass(), "variance", term6338);
        setField(term6329, term6329.getClass(), "sumImpl", term6331);
        setField(term6329, term6329.getClass(), "sumsqImpl", term6332);
        setField(term6329, term6329.getClass(), "minImpl", term6333);
        setField(term6329, term6329.getClass(), "maxImpl", term6334);
        setField(term6329, term6329.getClass(), "sumLogImpl", term6335);
        setField(term6329, term6329.getClass(), "geoMeanImpl", term6336);
        setField(term6329, term6329.getClass(), "meanImpl", term6337);
        setField(term6329, term6329.getClass(), "varianceImpl", term6338);
        term6300 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        setIntField(term6300, term6300.getClass(), "n", 0);
        setDoubleField(term6300, term6300.getClass(), "value", 0.0);
        setField(term6300, term6300.getClass(), "storedData", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getSumLogImpl", argTypes, term787, args);
        assertTrue(recursiveEquals(term787, term6329));
        assertTrue(recursiveEquals(retValue, term6300));
    }

};


