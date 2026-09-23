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
import org.apache.commons.math.exception.MathIllegalStateException;
import static org.apache.commons.math.stat.descriptive.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Double;

public class SummaryStatistics_setSumImpl_157180652960 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term584;

    public SummaryStatistics_setSumImpl_157180652960() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term584 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term586 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term592 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term595 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term598 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term601 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term604 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term607 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term608 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term610 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term584, term584.getClass(), "n", 8428634514691209827L);
        setDoubleField(term586, term586.getClass(), "m2", Double.NaN);
        setLongField(term586, term586.getClass(), "n", 0L);
        setDoubleField(term586, term586.getClass(), "m1", Double.NaN);
        setDoubleField(term586, term586.getClass(), "dev", Double.NaN);
        setDoubleField(term586, term586.getClass(), "nDev", Double.NaN);
        setField(term586, term586.getClass(), "storedData", null);
        setField(term584, term584.getClass(), "secondMoment", term586);
        setLongField(term592, term592.getClass(), "n", 0L);
        setDoubleField(term592, term592.getClass(), "value", 0.0);
        setField(term592, term592.getClass(), "storedData", null);
        setField(term584, term584.getClass(), "sum", term592);
        setLongField(term595, term595.getClass(), "n", 0L);
        setDoubleField(term595, term595.getClass(), "value", 0.0);
        setField(term595, term595.getClass(), "storedData", null);
        setField(term584, term584.getClass(), "sumsq", term595);
        setLongField(term598, term598.getClass(), "n", 0L);
        setDoubleField(term598, term598.getClass(), "value", Double.NaN);
        setField(term598, term598.getClass(), "storedData", null);
        setField(term584, term584.getClass(), "min", term598);
        setLongField(term601, term601.getClass(), "n", 0L);
        setDoubleField(term601, term601.getClass(), "value", Double.NaN);
        setField(term601, term601.getClass(), "storedData", null);
        setField(term584, term584.getClass(), "max", term601);
        setIntField(term604, term604.getClass(), "n", 0);
        setDoubleField(term604, term604.getClass(), "value", 0.0);
        setField(term604, term604.getClass(), "storedData", null);
        setField(term584, term584.getClass(), "sumLog", term604);
        setField(term607, term607.getClass(), "sumOfLogs", term604);
        setField(term607, term607.getClass(), "storedData", null);
        setField(term584, term584.getClass(), "geoMean", term607);
        setField(term608, term608.getClass(), "moment", term586);
        setBooleanField(term608, term608.getClass(), "incMoment", false);
        setField(term608, term608.getClass(), "storedData", null);
        setField(term584, term584.getClass(), "mean", term608);
        setField(term610, term610.getClass(), "moment", term586);
        setBooleanField(term610, term610.getClass(), "incMoment", false);
        setBooleanField(term610, term610.getClass(), "isBiasCorrected", true);
        setField(term610, term610.getClass(), "storedData", null);
        setField(term584, term584.getClass(), "variance", term610);
        setField(term584, term584.getClass(), "sumImpl", term592);
        setField(term584, term584.getClass(), "sumsqImpl", term595);
        setField(term584, term584.getClass(), "minImpl", term598);
        setField(term584, term584.getClass(), "maxImpl", term601);
        setField(term584, term584.getClass(), "sumLogImpl", term604);
        setField(term584, term584.getClass(), "geoMeanImpl", term607);
        setField(term584, term584.getClass(), "meanImpl", term608);
        setField(term584, term584.getClass(), "varianceImpl", term610);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "setSumImpl", argTypes, term584, args);
            assertTrue(false);
        }
        catch (MathIllegalStateException e) {
        }

    }

};


