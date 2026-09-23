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

public class SummaryStatistics_getMinImpl_208601217663 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term671;
     Object term5414;
     Object term5385;

    public SummaryStatistics_getMinImpl_208601217663() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term671 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term673 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term679 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term682 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term685 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term688 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term691 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term694 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term695 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term697 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term671, term671.getClass(), "n", -4365849114644724155L);
        setDoubleField(term673, term673.getClass(), "m2", Double.NaN);
        setLongField(term673, term673.getClass(), "n", 0L);
        setDoubleField(term673, term673.getClass(), "m1", Double.NaN);
        setDoubleField(term673, term673.getClass(), "dev", Double.NaN);
        setDoubleField(term673, term673.getClass(), "nDev", Double.NaN);
        setField(term673, term673.getClass(), "storedData", null);
        setField(term671, term671.getClass(), "secondMoment", term673);
        setLongField(term679, term679.getClass(), "n", 0L);
        setDoubleField(term679, term679.getClass(), "value", 0.0);
        setField(term679, term679.getClass(), "storedData", null);
        setField(term671, term671.getClass(), "sum", term679);
        setLongField(term682, term682.getClass(), "n", 0L);
        setDoubleField(term682, term682.getClass(), "value", 0.0);
        setField(term682, term682.getClass(), "storedData", null);
        setField(term671, term671.getClass(), "sumsq", term682);
        setLongField(term685, term685.getClass(), "n", 0L);
        setDoubleField(term685, term685.getClass(), "value", Double.NaN);
        setField(term685, term685.getClass(), "storedData", null);
        setField(term671, term671.getClass(), "min", term685);
        setLongField(term688, term688.getClass(), "n", 0L);
        setDoubleField(term688, term688.getClass(), "value", Double.NaN);
        setField(term688, term688.getClass(), "storedData", null);
        setField(term671, term671.getClass(), "max", term688);
        setIntField(term691, term691.getClass(), "n", 0);
        setDoubleField(term691, term691.getClass(), "value", 0.0);
        setField(term691, term691.getClass(), "storedData", null);
        setField(term671, term671.getClass(), "sumLog", term691);
        setField(term694, term694.getClass(), "sumOfLogs", term691);
        setField(term694, term694.getClass(), "storedData", null);
        setField(term671, term671.getClass(), "geoMean", term694);
        setField(term695, term695.getClass(), "moment", term673);
        setBooleanField(term695, term695.getClass(), "incMoment", false);
        setField(term695, term695.getClass(), "storedData", null);
        setField(term671, term671.getClass(), "mean", term695);
        setField(term697, term697.getClass(), "moment", term673);
        setBooleanField(term697, term697.getClass(), "incMoment", false);
        setBooleanField(term697, term697.getClass(), "isBiasCorrected", true);
        setField(term697, term697.getClass(), "storedData", null);
        setField(term671, term671.getClass(), "variance", term697);
        setField(term671, term671.getClass(), "sumImpl", term679);
        setField(term671, term671.getClass(), "sumsqImpl", term682);
        setField(term671, term671.getClass(), "minImpl", term685);
        setField(term671, term671.getClass(), "maxImpl", term688);
        setField(term671, term671.getClass(), "sumLogImpl", term691);
        setField(term671, term671.getClass(), "geoMeanImpl", term694);
        setField(term671, term671.getClass(), "meanImpl", term695);
        setField(term671, term671.getClass(), "varianceImpl", term697);
        term5414 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term5415 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term5416 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term5417 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term5418 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term5419 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term5420 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term5421 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term5422 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term5423 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term5414, term5414.getClass(), "n", -4365849114644724155L);
        setDoubleField(term5415, term5415.getClass(), "m2", Double.NaN);
        setLongField(term5415, term5415.getClass(), "n", 0L);
        setDoubleField(term5415, term5415.getClass(), "m1", Double.NaN);
        setDoubleField(term5415, term5415.getClass(), "dev", Double.NaN);
        setDoubleField(term5415, term5415.getClass(), "nDev", Double.NaN);
        setField(term5415, term5415.getClass(), "storedData", null);
        setField(term5414, term5414.getClass(), "secondMoment", term5415);
        setLongField(term5416, term5416.getClass(), "n", 0L);
        setDoubleField(term5416, term5416.getClass(), "value", 0.0);
        setField(term5416, term5416.getClass(), "storedData", null);
        setField(term5414, term5414.getClass(), "sum", term5416);
        setLongField(term5417, term5417.getClass(), "n", 0L);
        setDoubleField(term5417, term5417.getClass(), "value", 0.0);
        setField(term5417, term5417.getClass(), "storedData", null);
        setField(term5414, term5414.getClass(), "sumsq", term5417);
        setLongField(term5418, term5418.getClass(), "n", 0L);
        setDoubleField(term5418, term5418.getClass(), "value", Double.NaN);
        setField(term5418, term5418.getClass(), "storedData", null);
        setField(term5414, term5414.getClass(), "min", term5418);
        setLongField(term5419, term5419.getClass(), "n", 0L);
        setDoubleField(term5419, term5419.getClass(), "value", Double.NaN);
        setField(term5419, term5419.getClass(), "storedData", null);
        setField(term5414, term5414.getClass(), "max", term5419);
        setIntField(term5420, term5420.getClass(), "n", 0);
        setDoubleField(term5420, term5420.getClass(), "value", 0.0);
        setField(term5420, term5420.getClass(), "storedData", null);
        setField(term5414, term5414.getClass(), "sumLog", term5420);
        setField(term5421, term5421.getClass(), "sumOfLogs", term5420);
        setField(term5421, term5421.getClass(), "storedData", null);
        setField(term5414, term5414.getClass(), "geoMean", term5421);
        setField(term5422, term5422.getClass(), "moment", term5415);
        setBooleanField(term5422, term5422.getClass(), "incMoment", false);
        setField(term5422, term5422.getClass(), "storedData", null);
        setField(term5414, term5414.getClass(), "mean", term5422);
        setField(term5423, term5423.getClass(), "moment", term5415);
        setBooleanField(term5423, term5423.getClass(), "incMoment", false);
        setBooleanField(term5423, term5423.getClass(), "isBiasCorrected", true);
        setField(term5423, term5423.getClass(), "storedData", null);
        setField(term5414, term5414.getClass(), "variance", term5423);
        setField(term5414, term5414.getClass(), "sumImpl", term5416);
        setField(term5414, term5414.getClass(), "sumsqImpl", term5417);
        setField(term5414, term5414.getClass(), "minImpl", term5418);
        setField(term5414, term5414.getClass(), "maxImpl", term5419);
        setField(term5414, term5414.getClass(), "sumLogImpl", term5420);
        setField(term5414, term5414.getClass(), "geoMeanImpl", term5421);
        setField(term5414, term5414.getClass(), "meanImpl", term5422);
        setField(term5414, term5414.getClass(), "varianceImpl", term5423);
        term5385 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        setLongField(term5385, term5385.getClass(), "n", 0L);
        setDoubleField(term5385, term5385.getClass(), "value", Double.NaN);
        setField(term5385, term5385.getClass(), "storedData", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getMinImpl", argTypes, term671, args);
        assertTrue(recursiveEquals(term671, term5414));
        assertTrue(recursiveEquals(retValue, term5385));
    }

};


