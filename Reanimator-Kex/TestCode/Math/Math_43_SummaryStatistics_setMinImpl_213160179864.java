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

public class SummaryStatistics_setMinImpl_213160179864 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term700;

    public SummaryStatistics_setMinImpl_213160179864() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term700 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term702 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term708 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term711 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term714 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term717 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term720 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term723 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term724 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term726 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term700, term700.getClass(), "n", 2486810210675247493L);
        setDoubleField(term702, term702.getClass(), "m2", Double.NaN);
        setLongField(term702, term702.getClass(), "n", 0L);
        setDoubleField(term702, term702.getClass(), "m1", Double.NaN);
        setDoubleField(term702, term702.getClass(), "dev", Double.NaN);
        setDoubleField(term702, term702.getClass(), "nDev", Double.NaN);
        setField(term702, term702.getClass(), "storedData", null);
        setField(term700, term700.getClass(), "secondMoment", term702);
        setLongField(term708, term708.getClass(), "n", 0L);
        setDoubleField(term708, term708.getClass(), "value", 0.0);
        setField(term708, term708.getClass(), "storedData", null);
        setField(term700, term700.getClass(), "sum", term708);
        setLongField(term711, term711.getClass(), "n", 0L);
        setDoubleField(term711, term711.getClass(), "value", 0.0);
        setField(term711, term711.getClass(), "storedData", null);
        setField(term700, term700.getClass(), "sumsq", term711);
        setLongField(term714, term714.getClass(), "n", 0L);
        setDoubleField(term714, term714.getClass(), "value", Double.NaN);
        setField(term714, term714.getClass(), "storedData", null);
        setField(term700, term700.getClass(), "min", term714);
        setLongField(term717, term717.getClass(), "n", 0L);
        setDoubleField(term717, term717.getClass(), "value", Double.NaN);
        setField(term717, term717.getClass(), "storedData", null);
        setField(term700, term700.getClass(), "max", term717);
        setIntField(term720, term720.getClass(), "n", 0);
        setDoubleField(term720, term720.getClass(), "value", 0.0);
        setField(term720, term720.getClass(), "storedData", null);
        setField(term700, term700.getClass(), "sumLog", term720);
        setField(term723, term723.getClass(), "sumOfLogs", term720);
        setField(term723, term723.getClass(), "storedData", null);
        setField(term700, term700.getClass(), "geoMean", term723);
        setField(term724, term724.getClass(), "moment", term702);
        setBooleanField(term724, term724.getClass(), "incMoment", false);
        setField(term724, term724.getClass(), "storedData", null);
        setField(term700, term700.getClass(), "mean", term724);
        setField(term726, term726.getClass(), "moment", term702);
        setBooleanField(term726, term726.getClass(), "incMoment", false);
        setBooleanField(term726, term726.getClass(), "isBiasCorrected", true);
        setField(term726, term726.getClass(), "storedData", null);
        setField(term700, term700.getClass(), "variance", term726);
        setField(term700, term700.getClass(), "sumImpl", term708);
        setField(term700, term700.getClass(), "sumsqImpl", term711);
        setField(term700, term700.getClass(), "minImpl", term714);
        setField(term700, term700.getClass(), "maxImpl", term717);
        setField(term700, term700.getClass(), "sumLogImpl", term720);
        setField(term700, term700.getClass(), "geoMeanImpl", term723);
        setField(term700, term700.getClass(), "meanImpl", term724);
        setField(term700, term700.getClass(), "varianceImpl", term726);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.stat.descriptive.StorelessUnivariateStatistic");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "setMinImpl", argTypes, term700, args);
            assertTrue(false);
        }
        catch (MathIllegalStateException e) {
        }

    }

};


