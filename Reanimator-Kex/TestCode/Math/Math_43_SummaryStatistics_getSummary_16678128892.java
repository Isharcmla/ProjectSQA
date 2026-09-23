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

public class SummaryStatistics_getSummary_16678128892 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30;

    public SummaryStatistics_getSummary_16678128892() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term30 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term32 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term38 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term41 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term44 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term47 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term50 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term53 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term54 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term56 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term30, term30.getClass(), "n", 6375119433582206027L);
        setDoubleField(term32, term32.getClass(), "m2", Double.NaN);
        setLongField(term32, term32.getClass(), "n", 0L);
        setDoubleField(term32, term32.getClass(), "m1", Double.NaN);
        setDoubleField(term32, term32.getClass(), "dev", Double.NaN);
        setDoubleField(term32, term32.getClass(), "nDev", Double.NaN);
        setField(term32, term32.getClass(), "storedData", null);
        setField(term30, term30.getClass(), "secondMoment", term32);
        setLongField(term38, term38.getClass(), "n", 0L);
        setDoubleField(term38, term38.getClass(), "value", 0.0);
        setField(term38, term38.getClass(), "storedData", null);
        setField(term30, term30.getClass(), "sum", term38);
        setLongField(term41, term41.getClass(), "n", 0L);
        setDoubleField(term41, term41.getClass(), "value", 0.0);
        setField(term41, term41.getClass(), "storedData", null);
        setField(term30, term30.getClass(), "sumsq", term41);
        setLongField(term44, term44.getClass(), "n", 0L);
        setDoubleField(term44, term44.getClass(), "value", Double.NaN);
        setField(term44, term44.getClass(), "storedData", null);
        setField(term30, term30.getClass(), "min", term44);
        setLongField(term47, term47.getClass(), "n", 0L);
        setDoubleField(term47, term47.getClass(), "value", Double.NaN);
        setField(term47, term47.getClass(), "storedData", null);
        setField(term30, term30.getClass(), "max", term47);
        setIntField(term50, term50.getClass(), "n", 0);
        setDoubleField(term50, term50.getClass(), "value", 0.0);
        setField(term50, term50.getClass(), "storedData", null);
        setField(term30, term30.getClass(), "sumLog", term50);
        setField(term53, term53.getClass(), "sumOfLogs", term50);
        setField(term53, term53.getClass(), "storedData", null);
        setField(term30, term30.getClass(), "geoMean", term53);
        setField(term54, term54.getClass(), "moment", term32);
        setBooleanField(term54, term54.getClass(), "incMoment", false);
        setField(term54, term54.getClass(), "storedData", null);
        setField(term30, term30.getClass(), "mean", term54);
        setField(term56, term56.getClass(), "moment", term32);
        setBooleanField(term56, term56.getClass(), "incMoment", false);
        setBooleanField(term56, term56.getClass(), "isBiasCorrected", true);
        setField(term56, term56.getClass(), "storedData", null);
        setField(term30, term30.getClass(), "variance", term56);
        setField(term30, term30.getClass(), "sumImpl", term38);
        setField(term30, term30.getClass(), "sumsqImpl", term41);
        setField(term30, term30.getClass(), "minImpl", term44);
        setField(term30, term30.getClass(), "maxImpl", term47);
        setField(term30, term30.getClass(), "sumLogImpl", term50);
        setField(term30, term30.getClass(), "geoMeanImpl", term53);
        setField(term30, term30.getClass(), "meanImpl", term54);
        setField(term30, term30.getClass(), "varianceImpl", term56);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getSummary", argTypes, term30, args);
    }

};


