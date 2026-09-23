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

public class SummaryStatistics_getSumImpl_149445320759 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term555;
     Object term3744;
     Object term3715;

    public SummaryStatistics_getSumImpl_149445320759() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term555 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term557 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term563 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term566 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term569 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term572 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term575 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term578 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term579 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term581 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term555, term555.getClass(), "n", -4920224193275732920L);
        setDoubleField(term557, term557.getClass(), "m2", Double.NaN);
        setLongField(term557, term557.getClass(), "n", 0L);
        setDoubleField(term557, term557.getClass(), "m1", Double.NaN);
        setDoubleField(term557, term557.getClass(), "dev", Double.NaN);
        setDoubleField(term557, term557.getClass(), "nDev", Double.NaN);
        setField(term557, term557.getClass(), "storedData", null);
        setField(term555, term555.getClass(), "secondMoment", term557);
        setLongField(term563, term563.getClass(), "n", 0L);
        setDoubleField(term563, term563.getClass(), "value", 0.0);
        setField(term563, term563.getClass(), "storedData", null);
        setField(term555, term555.getClass(), "sum", term563);
        setLongField(term566, term566.getClass(), "n", 0L);
        setDoubleField(term566, term566.getClass(), "value", 0.0);
        setField(term566, term566.getClass(), "storedData", null);
        setField(term555, term555.getClass(), "sumsq", term566);
        setLongField(term569, term569.getClass(), "n", 0L);
        setDoubleField(term569, term569.getClass(), "value", Double.NaN);
        setField(term569, term569.getClass(), "storedData", null);
        setField(term555, term555.getClass(), "min", term569);
        setLongField(term572, term572.getClass(), "n", 0L);
        setDoubleField(term572, term572.getClass(), "value", Double.NaN);
        setField(term572, term572.getClass(), "storedData", null);
        setField(term555, term555.getClass(), "max", term572);
        setIntField(term575, term575.getClass(), "n", 0);
        setDoubleField(term575, term575.getClass(), "value", 0.0);
        setField(term575, term575.getClass(), "storedData", null);
        setField(term555, term555.getClass(), "sumLog", term575);
        setField(term578, term578.getClass(), "sumOfLogs", term575);
        setField(term578, term578.getClass(), "storedData", null);
        setField(term555, term555.getClass(), "geoMean", term578);
        setField(term579, term579.getClass(), "moment", term557);
        setBooleanField(term579, term579.getClass(), "incMoment", false);
        setField(term579, term579.getClass(), "storedData", null);
        setField(term555, term555.getClass(), "mean", term579);
        setField(term581, term581.getClass(), "moment", term557);
        setBooleanField(term581, term581.getClass(), "incMoment", false);
        setBooleanField(term581, term581.getClass(), "isBiasCorrected", true);
        setField(term581, term581.getClass(), "storedData", null);
        setField(term555, term555.getClass(), "variance", term581);
        setField(term555, term555.getClass(), "sumImpl", term563);
        setField(term555, term555.getClass(), "sumsqImpl", term566);
        setField(term555, term555.getClass(), "minImpl", term569);
        setField(term555, term555.getClass(), "maxImpl", term572);
        setField(term555, term555.getClass(), "sumLogImpl", term575);
        setField(term555, term555.getClass(), "geoMeanImpl", term578);
        setField(term555, term555.getClass(), "meanImpl", term579);
        setField(term555, term555.getClass(), "varianceImpl", term581);
        term3744 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term3745 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term3746 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term3747 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term3748 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term3749 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term3750 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term3751 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term3752 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term3753 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term3744, term3744.getClass(), "n", -4920224193275732920L);
        setDoubleField(term3745, term3745.getClass(), "m2", Double.NaN);
        setLongField(term3745, term3745.getClass(), "n", 0L);
        setDoubleField(term3745, term3745.getClass(), "m1", Double.NaN);
        setDoubleField(term3745, term3745.getClass(), "dev", Double.NaN);
        setDoubleField(term3745, term3745.getClass(), "nDev", Double.NaN);
        setField(term3745, term3745.getClass(), "storedData", null);
        setField(term3744, term3744.getClass(), "secondMoment", term3745);
        setLongField(term3746, term3746.getClass(), "n", 0L);
        setDoubleField(term3746, term3746.getClass(), "value", 0.0);
        setField(term3746, term3746.getClass(), "storedData", null);
        setField(term3744, term3744.getClass(), "sum", term3746);
        setLongField(term3747, term3747.getClass(), "n", 0L);
        setDoubleField(term3747, term3747.getClass(), "value", 0.0);
        setField(term3747, term3747.getClass(), "storedData", null);
        setField(term3744, term3744.getClass(), "sumsq", term3747);
        setLongField(term3748, term3748.getClass(), "n", 0L);
        setDoubleField(term3748, term3748.getClass(), "value", Double.NaN);
        setField(term3748, term3748.getClass(), "storedData", null);
        setField(term3744, term3744.getClass(), "min", term3748);
        setLongField(term3749, term3749.getClass(), "n", 0L);
        setDoubleField(term3749, term3749.getClass(), "value", Double.NaN);
        setField(term3749, term3749.getClass(), "storedData", null);
        setField(term3744, term3744.getClass(), "max", term3749);
        setIntField(term3750, term3750.getClass(), "n", 0);
        setDoubleField(term3750, term3750.getClass(), "value", 0.0);
        setField(term3750, term3750.getClass(), "storedData", null);
        setField(term3744, term3744.getClass(), "sumLog", term3750);
        setField(term3751, term3751.getClass(), "sumOfLogs", term3750);
        setField(term3751, term3751.getClass(), "storedData", null);
        setField(term3744, term3744.getClass(), "geoMean", term3751);
        setField(term3752, term3752.getClass(), "moment", term3745);
        setBooleanField(term3752, term3752.getClass(), "incMoment", false);
        setField(term3752, term3752.getClass(), "storedData", null);
        setField(term3744, term3744.getClass(), "mean", term3752);
        setField(term3753, term3753.getClass(), "moment", term3745);
        setBooleanField(term3753, term3753.getClass(), "incMoment", false);
        setBooleanField(term3753, term3753.getClass(), "isBiasCorrected", true);
        setField(term3753, term3753.getClass(), "storedData", null);
        setField(term3744, term3744.getClass(), "variance", term3753);
        setField(term3744, term3744.getClass(), "sumImpl", term3746);
        setField(term3744, term3744.getClass(), "sumsqImpl", term3747);
        setField(term3744, term3744.getClass(), "minImpl", term3748);
        setField(term3744, term3744.getClass(), "maxImpl", term3749);
        setField(term3744, term3744.getClass(), "sumLogImpl", term3750);
        setField(term3744, term3744.getClass(), "geoMeanImpl", term3751);
        setField(term3744, term3744.getClass(), "meanImpl", term3752);
        setField(term3744, term3744.getClass(), "varianceImpl", term3753);
        term3715 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        setLongField(term3715, term3715.getClass(), "n", 0L);
        setDoubleField(term3715, term3715.getClass(), "value", 0.0);
        setField(term3715, term3715.getClass(), "storedData", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getSumImpl", argTypes, term555, args);
        assertTrue(recursiveEquals(term555, term3744));
        assertTrue(recursiveEquals(retValue, term3715));
    }

};


