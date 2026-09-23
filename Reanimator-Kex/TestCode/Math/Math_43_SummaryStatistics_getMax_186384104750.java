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

public class SummaryStatistics_getMax_186384104750 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term293;
     Object term2739;

    public SummaryStatistics_getMax_186384104750() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term293 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term295 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term301 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term304 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term307 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term310 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term313 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term316 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term317 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term319 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term293, term293.getClass(), "n", -2813493605142626659L);
        setDoubleField(term295, term295.getClass(), "m2", Double.NaN);
        setLongField(term295, term295.getClass(), "n", 0L);
        setDoubleField(term295, term295.getClass(), "m1", Double.NaN);
        setDoubleField(term295, term295.getClass(), "dev", Double.NaN);
        setDoubleField(term295, term295.getClass(), "nDev", Double.NaN);
        setField(term295, term295.getClass(), "storedData", null);
        setField(term293, term293.getClass(), "secondMoment", term295);
        setLongField(term301, term301.getClass(), "n", 0L);
        setDoubleField(term301, term301.getClass(), "value", 0.0);
        setField(term301, term301.getClass(), "storedData", null);
        setField(term293, term293.getClass(), "sum", term301);
        setLongField(term304, term304.getClass(), "n", 0L);
        setDoubleField(term304, term304.getClass(), "value", 0.0);
        setField(term304, term304.getClass(), "storedData", null);
        setField(term293, term293.getClass(), "sumsq", term304);
        setLongField(term307, term307.getClass(), "n", 0L);
        setDoubleField(term307, term307.getClass(), "value", Double.NaN);
        setField(term307, term307.getClass(), "storedData", null);
        setField(term293, term293.getClass(), "min", term307);
        setLongField(term310, term310.getClass(), "n", 0L);
        setDoubleField(term310, term310.getClass(), "value", Double.NaN);
        setField(term310, term310.getClass(), "storedData", null);
        setField(term293, term293.getClass(), "max", term310);
        setIntField(term313, term313.getClass(), "n", 0);
        setDoubleField(term313, term313.getClass(), "value", 0.0);
        setField(term313, term313.getClass(), "storedData", null);
        setField(term293, term293.getClass(), "sumLog", term313);
        setField(term316, term316.getClass(), "sumOfLogs", term313);
        setField(term316, term316.getClass(), "storedData", null);
        setField(term293, term293.getClass(), "geoMean", term316);
        setField(term317, term317.getClass(), "moment", term295);
        setBooleanField(term317, term317.getClass(), "incMoment", false);
        setField(term317, term317.getClass(), "storedData", null);
        setField(term293, term293.getClass(), "mean", term317);
        setField(term319, term319.getClass(), "moment", term295);
        setBooleanField(term319, term319.getClass(), "incMoment", false);
        setBooleanField(term319, term319.getClass(), "isBiasCorrected", true);
        setField(term319, term319.getClass(), "storedData", null);
        setField(term293, term293.getClass(), "variance", term319);
        setField(term293, term293.getClass(), "sumImpl", term301);
        setField(term293, term293.getClass(), "sumsqImpl", term304);
        setField(term293, term293.getClass(), "minImpl", term307);
        setField(term293, term293.getClass(), "maxImpl", term310);
        setField(term293, term293.getClass(), "sumLogImpl", term313);
        setField(term293, term293.getClass(), "geoMeanImpl", term316);
        setField(term293, term293.getClass(), "meanImpl", term317);
        setField(term293, term293.getClass(), "varianceImpl", term319);
        term2739 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term2740 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term2741 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term2742 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term2743 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term2744 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term2745 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term2746 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term2747 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term2748 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term2739, term2739.getClass(), "n", -2813493605142626659L);
        setDoubleField(term2740, term2740.getClass(), "m2", Double.NaN);
        setLongField(term2740, term2740.getClass(), "n", 0L);
        setDoubleField(term2740, term2740.getClass(), "m1", Double.NaN);
        setDoubleField(term2740, term2740.getClass(), "dev", Double.NaN);
        setDoubleField(term2740, term2740.getClass(), "nDev", Double.NaN);
        setField(term2740, term2740.getClass(), "storedData", null);
        setField(term2739, term2739.getClass(), "secondMoment", term2740);
        setLongField(term2741, term2741.getClass(), "n", 0L);
        setDoubleField(term2741, term2741.getClass(), "value", 0.0);
        setField(term2741, term2741.getClass(), "storedData", null);
        setField(term2739, term2739.getClass(), "sum", term2741);
        setLongField(term2742, term2742.getClass(), "n", 0L);
        setDoubleField(term2742, term2742.getClass(), "value", 0.0);
        setField(term2742, term2742.getClass(), "storedData", null);
        setField(term2739, term2739.getClass(), "sumsq", term2742);
        setLongField(term2743, term2743.getClass(), "n", 0L);
        setDoubleField(term2743, term2743.getClass(), "value", Double.NaN);
        setField(term2743, term2743.getClass(), "storedData", null);
        setField(term2739, term2739.getClass(), "min", term2743);
        setLongField(term2744, term2744.getClass(), "n", 0L);
        setDoubleField(term2744, term2744.getClass(), "value", Double.NaN);
        setField(term2744, term2744.getClass(), "storedData", null);
        setField(term2739, term2739.getClass(), "max", term2744);
        setIntField(term2745, term2745.getClass(), "n", 0);
        setDoubleField(term2745, term2745.getClass(), "value", 0.0);
        setField(term2745, term2745.getClass(), "storedData", null);
        setField(term2739, term2739.getClass(), "sumLog", term2745);
        setField(term2746, term2746.getClass(), "sumOfLogs", term2745);
        setField(term2746, term2746.getClass(), "storedData", null);
        setField(term2739, term2739.getClass(), "geoMean", term2746);
        setField(term2747, term2747.getClass(), "moment", term2740);
        setBooleanField(term2747, term2747.getClass(), "incMoment", false);
        setField(term2747, term2747.getClass(), "storedData", null);
        setField(term2739, term2739.getClass(), "mean", term2747);
        setField(term2748, term2748.getClass(), "moment", term2740);
        setBooleanField(term2748, term2748.getClass(), "incMoment", false);
        setBooleanField(term2748, term2748.getClass(), "isBiasCorrected", true);
        setField(term2748, term2748.getClass(), "storedData", null);
        setField(term2739, term2739.getClass(), "variance", term2748);
        setField(term2739, term2739.getClass(), "sumImpl", term2741);
        setField(term2739, term2739.getClass(), "sumsqImpl", term2742);
        setField(term2739, term2739.getClass(), "minImpl", term2743);
        setField(term2739, term2739.getClass(), "maxImpl", term2744);
        setField(term2739, term2739.getClass(), "sumLogImpl", term2745);
        setField(term2739, term2739.getClass(), "geoMeanImpl", term2746);
        setField(term2739, term2739.getClass(), "meanImpl", term2747);
        setField(term2739, term2739.getClass(), "varianceImpl", term2748);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getMax", argTypes, term293, args);
        assertTrue(recursiveEquals(term293, term2739));
        assertTrue(recursiveEquals(retValue, Double.NaN));
    }

};


