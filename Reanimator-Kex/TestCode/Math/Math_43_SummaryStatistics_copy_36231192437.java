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

public class SummaryStatistics_copy_36231192437 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1048;

    public SummaryStatistics_copy_36231192437() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1048 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term1050 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term1056 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term1059 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term1062 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term1065 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term1068 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term1071 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term1072 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term1074 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term1048, term1048.getClass(), "n", 6617340557564669657L);
        setDoubleField(term1050, term1050.getClass(), "m2", Double.NaN);
        setLongField(term1050, term1050.getClass(), "n", 0L);
        setDoubleField(term1050, term1050.getClass(), "m1", Double.NaN);
        setDoubleField(term1050, term1050.getClass(), "dev", Double.NaN);
        setDoubleField(term1050, term1050.getClass(), "nDev", Double.NaN);
        setField(term1050, term1050.getClass(), "storedData", null);
        setField(term1048, term1048.getClass(), "secondMoment", term1050);
        setLongField(term1056, term1056.getClass(), "n", 0L);
        setDoubleField(term1056, term1056.getClass(), "value", 0.0);
        setField(term1056, term1056.getClass(), "storedData", null);
        setField(term1048, term1048.getClass(), "sum", term1056);
        setLongField(term1059, term1059.getClass(), "n", 0L);
        setDoubleField(term1059, term1059.getClass(), "value", 0.0);
        setField(term1059, term1059.getClass(), "storedData", null);
        setField(term1048, term1048.getClass(), "sumsq", term1059);
        setLongField(term1062, term1062.getClass(), "n", 0L);
        setDoubleField(term1062, term1062.getClass(), "value", Double.NaN);
        setField(term1062, term1062.getClass(), "storedData", null);
        setField(term1048, term1048.getClass(), "min", term1062);
        setLongField(term1065, term1065.getClass(), "n", 0L);
        setDoubleField(term1065, term1065.getClass(), "value", Double.NaN);
        setField(term1065, term1065.getClass(), "storedData", null);
        setField(term1048, term1048.getClass(), "max", term1065);
        setIntField(term1068, term1068.getClass(), "n", 0);
        setDoubleField(term1068, term1068.getClass(), "value", 0.0);
        setField(term1068, term1068.getClass(), "storedData", null);
        setField(term1048, term1048.getClass(), "sumLog", term1068);
        setField(term1071, term1071.getClass(), "sumOfLogs", term1068);
        setField(term1071, term1071.getClass(), "storedData", null);
        setField(term1048, term1048.getClass(), "geoMean", term1071);
        setField(term1072, term1072.getClass(), "moment", term1050);
        setBooleanField(term1072, term1072.getClass(), "incMoment", false);
        setField(term1072, term1072.getClass(), "storedData", null);
        setField(term1048, term1048.getClass(), "mean", term1072);
        setField(term1074, term1074.getClass(), "moment", term1050);
        setBooleanField(term1074, term1074.getClass(), "incMoment", false);
        setBooleanField(term1074, term1074.getClass(), "isBiasCorrected", true);
        setField(term1074, term1074.getClass(), "storedData", null);
        setField(term1048, term1048.getClass(), "variance", term1074);
        setField(term1048, term1048.getClass(), "sumImpl", term1056);
        setField(term1048, term1048.getClass(), "sumsqImpl", term1059);
        setField(term1048, term1048.getClass(), "minImpl", term1062);
        setField(term1048, term1048.getClass(), "maxImpl", term1065);
        setField(term1048, term1048.getClass(), "sumLogImpl", term1068);
        setField(term1048, term1048.getClass(), "geoMeanImpl", term1071);
        setField(term1048, term1048.getClass(), "meanImpl", term1072);
        setField(term1048, term1048.getClass(), "varianceImpl", term1074);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "copy", argTypes, term1048, args);
    }

};


