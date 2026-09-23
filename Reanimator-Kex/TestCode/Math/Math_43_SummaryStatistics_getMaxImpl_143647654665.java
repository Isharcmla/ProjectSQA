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

public class SummaryStatistics_getMaxImpl_143647654665 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term729;
     Object term6249;
     Object term6220;

    public SummaryStatistics_getMaxImpl_143647654665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term729 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term731 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term737 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term740 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term743 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term746 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term749 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term752 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term753 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term755 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term729, term729.getClass(), "n", 7009926388951271268L);
        setDoubleField(term731, term731.getClass(), "m2", Double.NaN);
        setLongField(term731, term731.getClass(), "n", 0L);
        setDoubleField(term731, term731.getClass(), "m1", Double.NaN);
        setDoubleField(term731, term731.getClass(), "dev", Double.NaN);
        setDoubleField(term731, term731.getClass(), "nDev", Double.NaN);
        setField(term731, term731.getClass(), "storedData", null);
        setField(term729, term729.getClass(), "secondMoment", term731);
        setLongField(term737, term737.getClass(), "n", 0L);
        setDoubleField(term737, term737.getClass(), "value", 0.0);
        setField(term737, term737.getClass(), "storedData", null);
        setField(term729, term729.getClass(), "sum", term737);
        setLongField(term740, term740.getClass(), "n", 0L);
        setDoubleField(term740, term740.getClass(), "value", 0.0);
        setField(term740, term740.getClass(), "storedData", null);
        setField(term729, term729.getClass(), "sumsq", term740);
        setLongField(term743, term743.getClass(), "n", 0L);
        setDoubleField(term743, term743.getClass(), "value", Double.NaN);
        setField(term743, term743.getClass(), "storedData", null);
        setField(term729, term729.getClass(), "min", term743);
        setLongField(term746, term746.getClass(), "n", 0L);
        setDoubleField(term746, term746.getClass(), "value", Double.NaN);
        setField(term746, term746.getClass(), "storedData", null);
        setField(term729, term729.getClass(), "max", term746);
        setIntField(term749, term749.getClass(), "n", 0);
        setDoubleField(term749, term749.getClass(), "value", 0.0);
        setField(term749, term749.getClass(), "storedData", null);
        setField(term729, term729.getClass(), "sumLog", term749);
        setField(term752, term752.getClass(), "sumOfLogs", term749);
        setField(term752, term752.getClass(), "storedData", null);
        setField(term729, term729.getClass(), "geoMean", term752);
        setField(term753, term753.getClass(), "moment", term731);
        setBooleanField(term753, term753.getClass(), "incMoment", false);
        setField(term753, term753.getClass(), "storedData", null);
        setField(term729, term729.getClass(), "mean", term753);
        setField(term755, term755.getClass(), "moment", term731);
        setBooleanField(term755, term755.getClass(), "incMoment", false);
        setBooleanField(term755, term755.getClass(), "isBiasCorrected", true);
        setField(term755, term755.getClass(), "storedData", null);
        setField(term729, term729.getClass(), "variance", term755);
        setField(term729, term729.getClass(), "sumImpl", term737);
        setField(term729, term729.getClass(), "sumsqImpl", term740);
        setField(term729, term729.getClass(), "minImpl", term743);
        setField(term729, term729.getClass(), "maxImpl", term746);
        setField(term729, term729.getClass(), "sumLogImpl", term749);
        setField(term729, term729.getClass(), "geoMeanImpl", term752);
        setField(term729, term729.getClass(), "meanImpl", term753);
        setField(term729, term729.getClass(), "varianceImpl", term755);
        term6249 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term6250 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term6251 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term6252 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term6253 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term6254 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term6255 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term6256 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term6257 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term6258 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term6249, term6249.getClass(), "n", 7009926388951271268L);
        setDoubleField(term6250, term6250.getClass(), "m2", Double.NaN);
        setLongField(term6250, term6250.getClass(), "n", 0L);
        setDoubleField(term6250, term6250.getClass(), "m1", Double.NaN);
        setDoubleField(term6250, term6250.getClass(), "dev", Double.NaN);
        setDoubleField(term6250, term6250.getClass(), "nDev", Double.NaN);
        setField(term6250, term6250.getClass(), "storedData", null);
        setField(term6249, term6249.getClass(), "secondMoment", term6250);
        setLongField(term6251, term6251.getClass(), "n", 0L);
        setDoubleField(term6251, term6251.getClass(), "value", 0.0);
        setField(term6251, term6251.getClass(), "storedData", null);
        setField(term6249, term6249.getClass(), "sum", term6251);
        setLongField(term6252, term6252.getClass(), "n", 0L);
        setDoubleField(term6252, term6252.getClass(), "value", 0.0);
        setField(term6252, term6252.getClass(), "storedData", null);
        setField(term6249, term6249.getClass(), "sumsq", term6252);
        setLongField(term6253, term6253.getClass(), "n", 0L);
        setDoubleField(term6253, term6253.getClass(), "value", Double.NaN);
        setField(term6253, term6253.getClass(), "storedData", null);
        setField(term6249, term6249.getClass(), "min", term6253);
        setLongField(term6254, term6254.getClass(), "n", 0L);
        setDoubleField(term6254, term6254.getClass(), "value", Double.NaN);
        setField(term6254, term6254.getClass(), "storedData", null);
        setField(term6249, term6249.getClass(), "max", term6254);
        setIntField(term6255, term6255.getClass(), "n", 0);
        setDoubleField(term6255, term6255.getClass(), "value", 0.0);
        setField(term6255, term6255.getClass(), "storedData", null);
        setField(term6249, term6249.getClass(), "sumLog", term6255);
        setField(term6256, term6256.getClass(), "sumOfLogs", term6255);
        setField(term6256, term6256.getClass(), "storedData", null);
        setField(term6249, term6249.getClass(), "geoMean", term6256);
        setField(term6257, term6257.getClass(), "moment", term6250);
        setBooleanField(term6257, term6257.getClass(), "incMoment", false);
        setField(term6257, term6257.getClass(), "storedData", null);
        setField(term6249, term6249.getClass(), "mean", term6257);
        setField(term6258, term6258.getClass(), "moment", term6250);
        setBooleanField(term6258, term6258.getClass(), "incMoment", false);
        setBooleanField(term6258, term6258.getClass(), "isBiasCorrected", true);
        setField(term6258, term6258.getClass(), "storedData", null);
        setField(term6249, term6249.getClass(), "variance", term6258);
        setField(term6249, term6249.getClass(), "sumImpl", term6251);
        setField(term6249, term6249.getClass(), "sumsqImpl", term6252);
        setField(term6249, term6249.getClass(), "minImpl", term6253);
        setField(term6249, term6249.getClass(), "maxImpl", term6254);
        setField(term6249, term6249.getClass(), "sumLogImpl", term6255);
        setField(term6249, term6249.getClass(), "geoMeanImpl", term6256);
        setField(term6249, term6249.getClass(), "meanImpl", term6257);
        setField(term6249, term6249.getClass(), "varianceImpl", term6258);
        term6220 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        setLongField(term6220, term6220.getClass(), "n", 0L);
        setDoubleField(term6220, term6220.getClass(), "value", Double.NaN);
        setField(term6220, term6220.getClass(), "storedData", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getMaxImpl", argTypes, term729, args);
        assertTrue(recursiveEquals(term729, term6249));
        assertTrue(recursiveEquals(retValue, term6220));
    }

};


