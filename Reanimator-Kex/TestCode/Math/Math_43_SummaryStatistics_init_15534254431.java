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

public class SummaryStatistics_init_15534254431 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public SummaryStatistics_init_15534254431() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics"));
        Object term3 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.SecondMoment"));
        Object term9 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.Sum"));
        Object term12 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfSquares"));
        Object term15 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Min"));
        Object term18 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.rank.Max"));
        Object term21 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.summary.SumOfLogs"));
        Object term24 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.GeometricMean"));
        Object term25 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Mean"));
        Object term27 = newInstance(Class.forName("org.apache.commons.math.stat.descriptive.moment.Variance"));
        setLongField(term1, term1.getClass(), "n", 2442117782898005296L);
        setDoubleField(term3, term3.getClass(), "m2", Double.NaN);
        setLongField(term3, term3.getClass(), "n", 0L);
        setDoubleField(term3, term3.getClass(), "m1", Double.NaN);
        setDoubleField(term3, term3.getClass(), "dev", Double.NaN);
        setDoubleField(term3, term3.getClass(), "nDev", Double.NaN);
        setField(term3, term3.getClass(), "storedData", null);
        setField(term1, term1.getClass(), "secondMoment", term3);
        setLongField(term9, term9.getClass(), "n", 0L);
        setDoubleField(term9, term9.getClass(), "value", 0.0);
        setField(term9, term9.getClass(), "storedData", null);
        setField(term1, term1.getClass(), "sum", term9);
        setLongField(term12, term12.getClass(), "n", 0L);
        setDoubleField(term12, term12.getClass(), "value", 0.0);
        setField(term12, term12.getClass(), "storedData", null);
        setField(term1, term1.getClass(), "sumsq", term12);
        setLongField(term15, term15.getClass(), "n", 0L);
        setDoubleField(term15, term15.getClass(), "value", Double.NaN);
        setField(term15, term15.getClass(), "storedData", null);
        setField(term1, term1.getClass(), "min", term15);
        setLongField(term18, term18.getClass(), "n", 0L);
        setDoubleField(term18, term18.getClass(), "value", Double.NaN);
        setField(term18, term18.getClass(), "storedData", null);
        setField(term1, term1.getClass(), "max", term18);
        setIntField(term21, term21.getClass(), "n", 0);
        setDoubleField(term21, term21.getClass(), "value", 0.0);
        setField(term21, term21.getClass(), "storedData", null);
        setField(term1, term1.getClass(), "sumLog", term21);
        setField(term24, term24.getClass(), "sumOfLogs", term21);
        setField(term24, term24.getClass(), "storedData", null);
        setField(term1, term1.getClass(), "geoMean", term24);
        setField(term25, term25.getClass(), "moment", term3);
        setBooleanField(term25, term25.getClass(), "incMoment", false);
        setField(term25, term25.getClass(), "storedData", null);
        setField(term1, term1.getClass(), "mean", term25);
        setField(term27, term27.getClass(), "moment", term3);
        setBooleanField(term27, term27.getClass(), "incMoment", false);
        setBooleanField(term27, term27.getClass(), "isBiasCorrected", true);
        setField(term27, term27.getClass(), "storedData", null);
        setField(term1, term1.getClass(), "variance", term27);
        setField(term1, term1.getClass(), "sumImpl", term9);
        setField(term1, term1.getClass(), "sumsqImpl", term12);
        setField(term1, term1.getClass(), "minImpl", term15);
        setField(term1, term1.getClass(), "maxImpl", term18);
        setField(term1, term1.getClass(), "sumLogImpl", term21);
        setField(term1, term1.getClass(), "geoMeanImpl", term24);
        setField(term1, term1.getClass(), "meanImpl", term25);
        setField(term1, term1.getClass(), "varianceImpl", term27);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.stat.descriptive.SummaryStatistics");
        Object[] args = new Object[1];
        args[0] = term1;
        Object instance = callConstructor(klass, argTypes, args);
    }

};


