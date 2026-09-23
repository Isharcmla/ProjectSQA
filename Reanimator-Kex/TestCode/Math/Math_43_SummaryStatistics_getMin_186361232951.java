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

public class SummaryStatistics_getMin_186361232951 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term322;
     Object term2783;

    public SummaryStatistics_getMin_186361232951() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term322 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term324 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term330 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term333 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term336 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term339 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term342 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term345 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term346 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term348 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term322, term322.getClass(), "n", -8885298608300233488L);
        setDoubleField(term324, term324.getClass(), "m2", Double.NaN);
        setLongField(term324, term324.getClass(), "n", 0L);
        setDoubleField(term324, term324.getClass(), "m1", Double.NaN);
        setDoubleField(term324, term324.getClass(), "dev", Double.NaN);
        setDoubleField(term324, term324.getClass(), "nDev", Double.NaN);
        setField(term324, term324.getClass(), "storedData", null);
        setField(term322, term322.getClass(), "secondMoment", term324);
        setLongField(term330, term330.getClass(), "n", 0L);
        setDoubleField(term330, term330.getClass(), "value", 0.0);
        setField(term330, term330.getClass(), "storedData", null);
        setField(term322, term322.getClass(), "sum", term330);
        setLongField(term333, term333.getClass(), "n", 0L);
        setDoubleField(term333, term333.getClass(), "value", 0.0);
        setField(term333, term333.getClass(), "storedData", null);
        setField(term322, term322.getClass(), "sumsq", term333);
        setLongField(term336, term336.getClass(), "n", 0L);
        setDoubleField(term336, term336.getClass(), "value", Double.NaN);
        setField(term336, term336.getClass(), "storedData", null);
        setField(term322, term322.getClass(), "min", term336);
        setLongField(term339, term339.getClass(), "n", 0L);
        setDoubleField(term339, term339.getClass(), "value", Double.NaN);
        setField(term339, term339.getClass(), "storedData", null);
        setField(term322, term322.getClass(), "max", term339);
        setIntField(term342, term342.getClass(), "n", 0);
        setDoubleField(term342, term342.getClass(), "value", 0.0);
        setField(term342, term342.getClass(), "storedData", null);
        setField(term322, term322.getClass(), "sumLog", term342);
        setField(term345, term345.getClass(), "sumOfLogs", term342);
        setField(term345, term345.getClass(), "storedData", null);
        setField(term322, term322.getClass(), "geoMean", term345);
        setField(term346, term346.getClass(), "moment", term324);
        setBooleanField(term346, term346.getClass(), "incMoment", false);
        setField(term346, term346.getClass(), "storedData", null);
        setField(term322, term322.getClass(), "mean", term346);
        setField(term348, term348.getClass(), "moment", term324);
        setBooleanField(term348, term348.getClass(), "incMoment", false);
        setBooleanField(term348, term348.getClass(), "isBiasCorrected", true);
        setField(term348, term348.getClass(), "storedData", null);
        setField(term322, term322.getClass(), "variance", term348);
        setField(term322, term322.getClass(), "sumImpl", term330);
        setField(term322, term322.getClass(), "sumsqImpl", term333);
        setField(term322, term322.getClass(), "minImpl", term336);
        setField(term322, term322.getClass(), "maxImpl", term339);
        setField(term322, term322.getClass(), "sumLogImpl", term342);
        setField(term322, term322.getClass(), "geoMeanImpl", term345);
        setField(term322, term322.getClass(), "meanImpl", term346);
        setField(term322, term322.getClass(), "varianceImpl", term348);
        term2783 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term2784 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term2785 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term2786 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term2787 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term2788 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term2789 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term2790 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term2791 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term2792 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term2783, term2783.getClass(), "n", -8885298608300233488L);
        setDoubleField(term2784, term2784.getClass(), "m2", Double.NaN);
        setLongField(term2784, term2784.getClass(), "n", 0L);
        setDoubleField(term2784, term2784.getClass(), "m1", Double.NaN);
        setDoubleField(term2784, term2784.getClass(), "dev", Double.NaN);
        setDoubleField(term2784, term2784.getClass(), "nDev", Double.NaN);
        setField(term2784, term2784.getClass(), "storedData", null);
        setField(term2783, term2783.getClass(), "secondMoment", term2784);
        setLongField(term2785, term2785.getClass(), "n", 0L);
        setDoubleField(term2785, term2785.getClass(), "value", 0.0);
        setField(term2785, term2785.getClass(), "storedData", null);
        setField(term2783, term2783.getClass(), "sum", term2785);
        setLongField(term2786, term2786.getClass(), "n", 0L);
        setDoubleField(term2786, term2786.getClass(), "value", 0.0);
        setField(term2786, term2786.getClass(), "storedData", null);
        setField(term2783, term2783.getClass(), "sumsq", term2786);
        setLongField(term2787, term2787.getClass(), "n", 0L);
        setDoubleField(term2787, term2787.getClass(), "value", Double.NaN);
        setField(term2787, term2787.getClass(), "storedData", null);
        setField(term2783, term2783.getClass(), "min", term2787);
        setLongField(term2788, term2788.getClass(), "n", 0L);
        setDoubleField(term2788, term2788.getClass(), "value", Double.NaN);
        setField(term2788, term2788.getClass(), "storedData", null);
        setField(term2783, term2783.getClass(), "max", term2788);
        setIntField(term2789, term2789.getClass(), "n", 0);
        setDoubleField(term2789, term2789.getClass(), "value", 0.0);
        setField(term2789, term2789.getClass(), "storedData", null);
        setField(term2783, term2783.getClass(), "sumLog", term2789);
        setField(term2790, term2790.getClass(), "sumOfLogs", term2789);
        setField(term2790, term2790.getClass(), "storedData", null);
        setField(term2783, term2783.getClass(), "geoMean", term2790);
        setField(term2791, term2791.getClass(), "moment", term2784);
        setBooleanField(term2791, term2791.getClass(), "incMoment", false);
        setField(term2791, term2791.getClass(), "storedData", null);
        setField(term2783, term2783.getClass(), "mean", term2791);
        setField(term2792, term2792.getClass(), "moment", term2784);
        setBooleanField(term2792, term2792.getClass(), "incMoment", false);
        setBooleanField(term2792, term2792.getClass(), "isBiasCorrected", true);
        setField(term2792, term2792.getClass(), "storedData", null);
        setField(term2783, term2783.getClass(), "variance", term2792);
        setField(term2783, term2783.getClass(), "sumImpl", term2785);
        setField(term2783, term2783.getClass(), "sumsqImpl", term2786);
        setField(term2783, term2783.getClass(), "minImpl", term2787);
        setField(term2783, term2783.getClass(), "maxImpl", term2788);
        setField(term2783, term2783.getClass(), "sumLogImpl", term2789);
        setField(term2783, term2783.getClass(), "geoMeanImpl", term2790);
        setField(term2783, term2783.getClass(), "meanImpl", term2791);
        setField(term2783, term2783.getClass(), "varianceImpl", term2792);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getMin", argTypes, term322, args);
        assertTrue(recursiveEquals(term322, term2783));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};


