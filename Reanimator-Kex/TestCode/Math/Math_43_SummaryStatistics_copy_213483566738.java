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

public class SummaryStatistics_copy_213483566738 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1077;
     Object term1106;

    public SummaryStatistics_copy_213483566738() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1077 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term1079 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term1085 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term1088 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term1091 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term1094 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term1097 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term1100 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term1101 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term1103 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term1077, term1077.getClass(), "n", 1439298019805881866L);
        setDoubleField(term1079, term1079.getClass(), "m2", Double.NaN);
        setLongField(term1079, term1079.getClass(), "n", 0L);
        setDoubleField(term1079, term1079.getClass(), "m1", Double.NaN);
        setDoubleField(term1079, term1079.getClass(), "dev", Double.NaN);
        setDoubleField(term1079, term1079.getClass(), "nDev", Double.NaN);
        setField(term1079, term1079.getClass(), "storedData", null);
        setField(term1077, term1077.getClass(), "secondMoment", term1079);
        setLongField(term1085, term1085.getClass(), "n", 0L);
        setDoubleField(term1085, term1085.getClass(), "value", 0.0);
        setField(term1085, term1085.getClass(), "storedData", null);
        setField(term1077, term1077.getClass(), "sum", term1085);
        setLongField(term1088, term1088.getClass(), "n", 0L);
        setDoubleField(term1088, term1088.getClass(), "value", 0.0);
        setField(term1088, term1088.getClass(), "storedData", null);
        setField(term1077, term1077.getClass(), "sumsq", term1088);
        setLongField(term1091, term1091.getClass(), "n", 0L);
        setDoubleField(term1091, term1091.getClass(), "value", Double.NaN);
        setField(term1091, term1091.getClass(), "storedData", null);
        setField(term1077, term1077.getClass(), "min", term1091);
        setLongField(term1094, term1094.getClass(), "n", 0L);
        setDoubleField(term1094, term1094.getClass(), "value", Double.NaN);
        setField(term1094, term1094.getClass(), "storedData", null);
        setField(term1077, term1077.getClass(), "max", term1094);
        setIntField(term1097, term1097.getClass(), "n", 0);
        setDoubleField(term1097, term1097.getClass(), "value", 0.0);
        setField(term1097, term1097.getClass(), "storedData", null);
        setField(term1077, term1077.getClass(), "sumLog", term1097);
        setField(term1100, term1100.getClass(), "sumOfLogs", term1097);
        setField(term1100, term1100.getClass(), "storedData", null);
        setField(term1077, term1077.getClass(), "geoMean", term1100);
        setField(term1101, term1101.getClass(), "moment", term1079);
        setBooleanField(term1101, term1101.getClass(), "incMoment", false);
        setField(term1101, term1101.getClass(), "storedData", null);
        setField(term1077, term1077.getClass(), "mean", term1101);
        setField(term1103, term1103.getClass(), "moment", term1079);
        setBooleanField(term1103, term1103.getClass(), "incMoment", false);
        setBooleanField(term1103, term1103.getClass(), "isBiasCorrected", true);
        setField(term1103, term1103.getClass(), "storedData", null);
        setField(term1077, term1077.getClass(), "variance", term1103);
        setField(term1077, term1077.getClass(), "sumImpl", term1085);
        setField(term1077, term1077.getClass(), "sumsqImpl", term1088);
        setField(term1077, term1077.getClass(), "minImpl", term1091);
        setField(term1077, term1077.getClass(), "maxImpl", term1094);
        setField(term1077, term1077.getClass(), "sumLogImpl", term1097);
        setField(term1077, term1077.getClass(), "geoMeanImpl", term1100);
        setField(term1077, term1077.getClass(), "meanImpl", term1101);
        setField(term1077, term1077.getClass(), "varianceImpl", term1103);
        term1106 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term1108 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term1114 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term1117 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term1120 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term1123 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term1126 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term1129 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term1130 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term1132 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term1106, term1106.getClass(), "n", -8708192233349544946L);
        setDoubleField(term1108, term1108.getClass(), "m2", Double.NaN);
        setLongField(term1108, term1108.getClass(), "n", 0L);
        setDoubleField(term1108, term1108.getClass(), "m1", Double.NaN);
        setDoubleField(term1108, term1108.getClass(), "dev", Double.NaN);
        setDoubleField(term1108, term1108.getClass(), "nDev", Double.NaN);
        setField(term1108, term1108.getClass(), "storedData", null);
        setField(term1106, term1106.getClass(), "secondMoment", term1108);
        setLongField(term1114, term1114.getClass(), "n", 0L);
        setDoubleField(term1114, term1114.getClass(), "value", 0.0);
        setField(term1114, term1114.getClass(), "storedData", null);
        setField(term1106, term1106.getClass(), "sum", term1114);
        setLongField(term1117, term1117.getClass(), "n", 0L);
        setDoubleField(term1117, term1117.getClass(), "value", 0.0);
        setField(term1117, term1117.getClass(), "storedData", null);
        setField(term1106, term1106.getClass(), "sumsq", term1117);
        setLongField(term1120, term1120.getClass(), "n", 0L);
        setDoubleField(term1120, term1120.getClass(), "value", Double.NaN);
        setField(term1120, term1120.getClass(), "storedData", null);
        setField(term1106, term1106.getClass(), "min", term1120);
        setLongField(term1123, term1123.getClass(), "n", 0L);
        setDoubleField(term1123, term1123.getClass(), "value", Double.NaN);
        setField(term1123, term1123.getClass(), "storedData", null);
        setField(term1106, term1106.getClass(), "max", term1123);
        setIntField(term1126, term1126.getClass(), "n", 0);
        setDoubleField(term1126, term1126.getClass(), "value", 0.0);
        setField(term1126, term1126.getClass(), "storedData", null);
        setField(term1106, term1106.getClass(), "sumLog", term1126);
        setField(term1129, term1129.getClass(), "sumOfLogs", term1126);
        setField(term1129, term1129.getClass(), "storedData", null);
        setField(term1106, term1106.getClass(), "geoMean", term1129);
        setField(term1130, term1130.getClass(), "moment", term1108);
        setBooleanField(term1130, term1130.getClass(), "incMoment", false);
        setField(term1130, term1130.getClass(), "storedData", null);
        setField(term1106, term1106.getClass(), "mean", term1130);
        setField(term1132, term1132.getClass(), "moment", term1108);
        setBooleanField(term1132, term1132.getClass(), "incMoment", false);
        setBooleanField(term1132, term1132.getClass(), "isBiasCorrected", true);
        setField(term1132, term1132.getClass(), "storedData", null);
        setField(term1106, term1106.getClass(), "variance", term1132);
        setField(term1106, term1106.getClass(), "sumImpl", term1114);
        setField(term1106, term1106.getClass(), "sumsqImpl", term1117);
        setField(term1106, term1106.getClass(), "minImpl", term1120);
        setField(term1106, term1106.getClass(), "maxImpl", term1123);
        setField(term1106, term1106.getClass(), "sumLogImpl", term1126);
        setField(term1106, term1106.getClass(), "geoMeanImpl", term1129);
        setField(term1106, term1106.getClass(), "meanImpl", term1130);
        setField(term1106, term1106.getClass(), "varianceImpl", term1132);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        argTypes[1] = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Object[] args = new Object[2];
        args[0] = term1077;
        args[1] = term1106;
        callMethod(klass, "copy", argTypes, null, args);
    }

};


